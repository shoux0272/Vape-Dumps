/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javassist.CannotCompileException;
import javassist.ClassMap;
import javassist.ClassPool;
import javassist.CodeConverter;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtField$Initializer;
import javassist.CtMember;
import javassist.CtMember$Cache;
import javassist.CtMethod;
import javassist.FieldInitLink;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.AccessFlag;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.ConstantAttribute;
import javassist.bytecode.Descriptor;
import javassist.bytecode.EnclosingMethodAttribute;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.InnerClassesAttribute;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.ParameterAnnotationsAttribute;
import javassist.bytecode.SignatureAttribute;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.AnnotationImpl;
import javassist.compiler.AccessorMaker;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.expr.ExprEditor;

class CtClassType
extends CtClass {
    ClassPool classPool;
    boolean wasChanged;
    private boolean wasFrozen;
    boolean wasPruned;
    boolean gcConstPool;
    ClassFile classfile;
    byte[] rawClassfile;
    private Reference<CtMember$Cache> memberCache;
    private AccessorMaker accessors;
    private FieldInitLink fieldInitializers;
    private Map<CtMethod, String> hiddenMethods;
    private int uniqueNumberSeed;
    private boolean doPruning = ClassPool.doPruning;
    private int getCount;
    private static final int GET_THRESHOLD = 2;

    CtClassType(String string, ClassPool classPool) {
        super(string);
        this.classPool = classPool;
        this.gcConstPool = false;
        this.wasPruned = false;
        this.wasFrozen = false;
        this.wasChanged = false;
        this.classfile = null;
        this.rawClassfile = null;
        this.memberCache = null;
        this.accessors = null;
        this.fieldInitializers = null;
        this.hiddenMethods = null;
        this.uniqueNumberSeed = 0;
        this.getCount = 0;
    }

    CtClassType(InputStream inputStream, ClassPool classPool) throws IOException {
        this((String)null, classPool);
        this.classfile = new ClassFile(new DataInputStream(inputStream));
        this.qualifiedName = this.classfile.getName();
    }

    CtClassType(ClassFile classFile, ClassPool classPool) {
        this((String)null, classPool);
        this.classfile = classFile;
        this.qualifiedName = this.classfile.getName();
    }

    @Override
    protected void extendToString(StringBuffer stringBuffer) {
        Object object;
        if (this.wasChanged) {
            stringBuffer.append("changed ");
        }
        if (this.wasFrozen) {
            stringBuffer.append("frozen ");
        }
        if (this.wasPruned) {
            stringBuffer.append("pruned ");
        }
        stringBuffer.append(Modifier.toString(this.getModifiers()));
        stringBuffer.append(" class ");
        stringBuffer.append(this.getName());
        try {
            String string;
            object = this.getSuperclass();
            if (object != null && !(string = ((CtClass)object).getName()).equals("java.lang.Object")) {
                stringBuffer.append(" extends " + ((CtClass)object).getName());
            }
        }
        catch (NotFoundException notFoundException) {
            stringBuffer.append(" extends ??");
        }
        try {
            object = this.getInterfaces();
            if (((CtClass[])object).length > 0) {
                stringBuffer.append(" implements ");
            }
            for (int k = 0; k < ((CtClass[])object).length; ++k) {
                stringBuffer.append(((CtClass)object[k]).getName());
                stringBuffer.append(", ");
            }
        }
        catch (NotFoundException notFoundException) {
            stringBuffer.append(" extends ??");
        }
        object = this.getMembers();
        this.exToString(stringBuffer, " fields=", ((CtMember$Cache)object).fieldHead(), ((CtMember$Cache)object).lastField());
        this.exToString(stringBuffer, " constructors=", ((CtMember$Cache)object).consHead(), ((CtMember$Cache)object).lastCons());
        this.exToString(stringBuffer, " methods=", ((CtMember$Cache)object).methodHead(), ((CtMember$Cache)object).lastMethod());
    }

    private void exToString(StringBuffer stringBuffer, String string, CtMember ctMember, CtMember ctMember2) {
        stringBuffer.append(string);
        while (ctMember != ctMember2) {
            ctMember = ctMember.f();
            stringBuffer.append(ctMember);
            stringBuffer.append(", ");
        }
    }

    @Override
    public AccessorMaker getAccessorMaker() {
        if (this.accessors == null) {
            this.accessors = new AccessorMaker(this);
        }
        return this.accessors;
    }

    @Override
    public ClassFile getClassFile2() {
        return this.getClassFile3(true);
    }

    public ClassFile getClassFile3(boolean bl) {
        ClassFile classFile = this.classfile;
        if (classFile != null) {
            return classFile;
        }
        if (bl) {
            this.classPool.compress();
        }
        if (this.rawClassfile != null) {
            try {
                ClassFile classFile2 = new ClassFile(new DataInputStream(new ByteArrayInputStream(this.rawClassfile)));
                this.rawClassfile = null;
                this.getCount = 2;
                return this.setClassFile(classFile2);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException.toString(), iOException);
            }
        }
        InputStream inputStream = null;
        try {
            inputStream = this.classPool.openClassfile(this.getName());
            if (inputStream == null) {
                throw new NotFoundException(this.getName());
            }
            ClassFile classFile3 = new ClassFile(new DataInputStream(inputStream = new BufferedInputStream(inputStream)));
            if (!classFile3.getName().equals(this.qualifiedName)) {
                throw new RuntimeException("cannot find " + this.qualifiedName + ": " + classFile3.getName() + " found in " + this.qualifiedName.replace('.', '/') + ".class");
            }
            ClassFile classFile4 = this.setClassFile(classFile3);
            return classFile4;
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException.toString(), notFoundException);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException.toString(), iOException);
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    @Override
    final void incGetCounter() {
        ++this.getCount;
    }

    @Override
    void compress() {
        if (this.getCount < 2) {
            if (!this.isModified() && ClassPool.releaseUnmodifiedClassFile) {
                this.removeClassFile();
            } else if (this.isFrozen() && !this.wasPruned) {
                this.saveClassFile();
            }
        }
        this.getCount = 0;
    }

    private synchronized void saveClassFile() {
        if (this.classfile == null || this.hasMemberCache() != null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            this.classfile.write(dataOutputStream);
            byteArrayOutputStream.close();
            this.rawClassfile = byteArrayOutputStream.toByteArray();
            this.classfile = null;
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private synchronized void removeClassFile() {
        if (this.classfile != null && !this.isModified() && this.hasMemberCache() == null) {
            this.classfile = null;
        }
    }

    private synchronized ClassFile setClassFile(ClassFile classFile) {
        if (this.classfile == null) {
            this.classfile = classFile;
        }
        return this.classfile;
    }

    @Override
    public ClassPool getClassPool() {
        return this.classPool;
    }

    void setClassPool(ClassPool classPool) {
        this.classPool = classPool;
    }

    @Override
    public URL getURL() throws NotFoundException {
        URL uRL = this.classPool.find(this.getName());
        if (uRL == null) {
            throw new NotFoundException(this.getName());
        }
        return uRL;
    }

    @Override
    public boolean isModified() {
        return this.wasChanged;
    }

    @Override
    public boolean isFrozen() {
        return this.wasFrozen;
    }

    @Override
    public void freeze() {
        this.wasFrozen = true;
    }

    @Override
    void checkModify() throws RuntimeException {
        if (this.isFrozen()) {
            String string = this.getName() + " class is frozen";
            if (this.wasPruned) {
                string = string + " and pruned";
            }
            throw new RuntimeException(string);
        }
        this.wasChanged = true;
    }

    @Override
    public void defrost() {
        this.checkPruned("defrost");
        this.wasFrozen = false;
    }

    @Override
    public boolean subtypeOf(CtClass ctClass) throws NotFoundException {
        int n6;
        String string = ctClass.getName();
        if (this == ctClass || this.getName().equals(string)) {
            return true;
        }
        ClassFile classFile = this.getClassFile2();
        String string2 = classFile.getSuperclass();
        if (string2 != null && string2.equals(string)) {
            return true;
        }
        String[] arrstring = classFile.getInterfaces();
        int n10 = arrstring.length;
        for (n6 = 0; n6 < n10; ++n6) {
            if (!arrstring[n6].equals(string)) continue;
            return true;
        }
        if (string2 != null && this.classPool.get(string2).subtypeOf(ctClass)) {
            return true;
        }
        for (n6 = 0; n6 < n10; ++n6) {
            if (!this.classPool.get(arrstring[n6]).subtypeOf(ctClass)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void setName(String string) throws RuntimeException {
        String string2 = this.getName();
        if (string.equals(string2)) {
            return;
        }
        this.classPool.checkNotFrozen(string);
        ClassFile classFile = this.getClassFile2();
        super.setName(string);
        classFile.setName(string);
        this.nameReplaced();
        this.classPool.classNameChanged(string2, this);
    }

    @Override
    public String getGenericSignature() {
        SignatureAttribute signatureAttribute = (SignatureAttribute)this.getClassFile2().getAttribute("Signature");
        return signatureAttribute == null ? null : signatureAttribute.getSignature();
    }

    @Override
    public void setGenericSignature(String string) {
        ClassFile classFile = this.getClassFile();
        SignatureAttribute signatureAttribute = new SignatureAttribute(classFile.getConstPool(), string);
        classFile.addAttribute(signatureAttribute);
    }

    @Override
    public void replaceClassName(ClassMap classMap) throws RuntimeException {
        String string = this.getName();
        String string2 = classMap.get(Descriptor.toJvmName(string));
        if (string2 != null) {
            string2 = Descriptor.toJavaName(string2);
            this.classPool.checkNotFrozen(string2);
        }
        super.replaceClassName(classMap);
        ClassFile classFile = this.getClassFile2();
        classFile.renameClass(classMap);
        this.nameReplaced();
        if (string2 != null) {
            super.setName(string2);
            this.classPool.classNameChanged(string, this);
        }
    }

    @Override
    public void replaceClassName(String string, String string2) throws RuntimeException {
        String string3 = this.getName();
        if (string3.equals(string)) {
            this.setName(string2);
        } else {
            super.replaceClassName(string, string2);
            this.getClassFile2().renameClass(string, string2);
            this.nameReplaced();
        }
    }

    @Override
    public boolean isInterface() {
        return Modifier.isInterface(this.getModifiers());
    }

    @Override
    public boolean isAnnotation() {
        return Modifier.isAnnotation(this.getModifiers());
    }

    @Override
    public boolean isEnum() {
        return Modifier.isEnum(this.getModifiers());
    }

    @Override
    public int getModifiers() {
        ClassFile classFile = this.getClassFile2();
        int n6 = classFile.getAccessFlags();
        n6 = AccessFlag.clear(n6, 32);
        int n10 = classFile.getInnerAccessFlags();
        if (n10 != -1) {
            if ((n10 & 8) != 0) {
                n6 |= 8;
            }
            if ((n10 & 1) != 0) {
                n6 |= 1;
            } else {
                n6 &= 0xFFFFFFFE;
                if ((n10 & 4) != 0) {
                    n6 |= 4;
                } else if ((n10 & 2) != 0) {
                    n6 |= 2;
                }
            }
        }
        return AccessFlag.toModifier(n6);
    }

    @Override
    public CtClass[] getNestedClasses() throws NotFoundException {
        ClassFile classFile = this.getClassFile2();
        InnerClassesAttribute innerClassesAttribute = (InnerClassesAttribute)classFile.getAttribute("InnerClasses");
        if (innerClassesAttribute == null) {
            return new CtClass[0];
        }
        String string = classFile.getName() + "$";
        int n6 = innerClassesAttribute.tableLength();
        ArrayList<CtClass> arrayList = new ArrayList<CtClass>(n6);
        for (int k = 0; k < n6; ++k) {
            String string2 = innerClassesAttribute.innerClass(k);
            if (string2 == null || !string2.startsWith(string) || string2.lastIndexOf(36) >= string.length()) continue;
            arrayList.add(this.classPool.get(string2));
        }
        return arrayList.toArray(new CtClass[arrayList.size()]);
    }

    @Override
    public void setModifiers(int n6) {
        this.checkModify();
        CtClassType.updateInnerEntry(n6, this.getName(), this, true);
        ClassFile classFile = this.getClassFile2();
        classFile.setAccessFlags(AccessFlag.of(n6 & 0xFFFFFFF7));
    }

    private static void updateInnerEntry(int n6, String string, CtClass ctClass, boolean bl) {
        ClassFile classFile = ctClass.getClassFile2();
        InnerClassesAttribute innerClassesAttribute = (InnerClassesAttribute)classFile.getAttribute("InnerClasses");
        if (innerClassesAttribute != null) {
            int n10;
            int n11 = n6 & 0xFFFFFFF7;
            int n12 = innerClassesAttribute.find(string);
            if (!(n12 < 0 || (n10 = innerClassesAttribute.accessFlags(n12) & 8) == 0 && Modifier.isStatic(n6))) {
                ctClass.checkModify();
                innerClassesAttribute.setAccessFlags(n12, AccessFlag.of(n11) | n10);
                String string2 = innerClassesAttribute.outerClass(n12);
                if (string2 != null && bl) {
                    try {
                        CtClass ctClass2 = ctClass.getClassPool().get(string2);
                        CtClassType.updateInnerEntry(n11, string, ctClass2, false);
                    }
                    catch (NotFoundException notFoundException) {
                        throw new RuntimeException("cannot find the declaring class: " + string2);
                    }
                }
                return;
            }
        }
        if (Modifier.isStatic(n6)) {
            throw new RuntimeException("cannot change " + Descriptor.toJavaName(string) + " into a static class");
        }
    }

    @Override
    public boolean hasAnnotation(String string) {
        ClassFile classFile = this.getClassFile2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)classFile.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)classFile.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.hasAnnotationType(string, this.getClassPool(), annotationsAttribute, annotationsAttribute2);
    }

    static boolean hasAnnotationType(Class<?> class_, ClassPool classPool, AnnotationsAttribute annotationsAttribute, AnnotationsAttribute annotationsAttribute2) {
        return CtClassType.hasAnnotationType(class_.getName(), classPool, annotationsAttribute, annotationsAttribute2);
    }

    static boolean hasAnnotationType(String string, ClassPool classPool, AnnotationsAttribute annotationsAttribute, AnnotationsAttribute annotationsAttribute2) {
        int n6;
        Annotation[] arrannotation = annotationsAttribute == null ? null : annotationsAttribute.getAnnotations();
        Annotation[] arrannotation2 = annotationsAttribute2 == null ? null : annotationsAttribute2.getAnnotations();
        if (arrannotation != null) {
            for (n6 = 0; n6 < arrannotation.length; ++n6) {
                if (!arrannotation[n6].getTypeName().equals(string)) continue;
                return true;
            }
        }
        if (arrannotation2 != null) {
            for (n6 = 0; n6 < arrannotation2.length; ++n6) {
                if (!arrannotation2[n6].getTypeName().equals(string)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getAnnotation(Class<?> class_) throws ClassNotFoundException {
        ClassFile classFile = this.getClassFile2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)classFile.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)classFile.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.getAnnotationType(class_, this.getClassPool(), annotationsAttribute, annotationsAttribute2);
    }

    static Object getAnnotationType(Class<?> class_, ClassPool classPool, AnnotationsAttribute annotationsAttribute, AnnotationsAttribute annotationsAttribute2) throws ClassNotFoundException {
        int n6;
        Annotation[] arrannotation = annotationsAttribute == null ? null : annotationsAttribute.getAnnotations();
        Annotation[] arrannotation2 = annotationsAttribute2 == null ? null : annotationsAttribute2.getAnnotations();
        String string = class_.getName();
        if (arrannotation != null) {
            for (n6 = 0; n6 < arrannotation.length; ++n6) {
                if (!arrannotation[n6].getTypeName().equals(string)) continue;
                return CtClassType.toAnnoType(arrannotation[n6], classPool);
            }
        }
        if (arrannotation2 != null) {
            for (n6 = 0; n6 < arrannotation2.length; ++n6) {
                if (!arrannotation2[n6].getTypeName().equals(string)) continue;
                return CtClassType.toAnnoType(arrannotation2[n6], classPool);
            }
        }
        return null;
    }

    @Override
    public Object[] getAnnotations() throws ClassNotFoundException {
        return this.getAnnotations(false);
    }

    @Override
    public Object[] getAvailableAnnotations() {
        try {
            return this.getAnnotations(true);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("Unexpected exception ", classNotFoundException);
        }
    }

    private Object[] getAnnotations(boolean bl) throws ClassNotFoundException {
        ClassFile classFile = this.getClassFile2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)classFile.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)classFile.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.toAnnotationType(bl, this.getClassPool(), annotationsAttribute, annotationsAttribute2);
    }

    static Object[] toAnnotationType(boolean bl, ClassPool classPool, AnnotationsAttribute annotationsAttribute, AnnotationsAttribute annotationsAttribute2) throws ClassNotFoundException {
        int n6;
        int n10;
        Annotation[] arrannotation;
        int n11;
        Annotation[] arrannotation2;
        if (annotationsAttribute == null) {
            arrannotation2 = null;
            n11 = 0;
        } else {
            arrannotation2 = annotationsAttribute.getAnnotations();
            n11 = arrannotation2.length;
        }
        if (annotationsAttribute2 == null) {
            arrannotation = null;
            n10 = 0;
        } else {
            arrannotation = annotationsAttribute2.getAnnotations();
            n10 = arrannotation.length;
        }
        if (!bl) {
            int n12;
            Object[] arrobject = new Object[n11 + n10];
            for (n12 = 0; n12 < n11; ++n12) {
                arrobject[n12] = CtClassType.toAnnoType(arrannotation2[n12], classPool);
            }
            for (n12 = 0; n12 < n10; ++n12) {
                arrobject[n12 + n11] = CtClassType.toAnnoType(arrannotation[n12], classPool);
            }
            return arrobject;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (n6 = 0; n6 < n11; ++n6) {
            try {
                arrayList.add(CtClassType.toAnnoType(arrannotation2[n6], classPool));
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        for (n6 = 0; n6 < n10; ++n6) {
            try {
                arrayList.add(CtClassType.toAnnoType(arrannotation[n6], classPool));
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        return arrayList.toArray();
    }

    static Object[][] toAnnotationType(boolean bl, ClassPool classPool, ParameterAnnotationsAttribute parameterAnnotationsAttribute, ParameterAnnotationsAttribute parameterAnnotationsAttribute2, MethodInfo methodInfo) throws ClassNotFoundException {
        int n6 = 0;
        n6 = parameterAnnotationsAttribute != null ? parameterAnnotationsAttribute.numParameters() : (parameterAnnotationsAttribute2 != null ? parameterAnnotationsAttribute2.numParameters() : Descriptor.numOfParameters(methodInfo.getDescriptor()));
        Object[][] arrobject = new Object[n6][];
        for (int k = 0; k < n6; ++k) {
            int n10;
            int n11;
            Annotation[] arrannotation;
            int n12;
            Annotation[] arrannotation2;
            if (parameterAnnotationsAttribute == null) {
                arrannotation2 = null;
                n12 = 0;
            } else {
                arrannotation2 = parameterAnnotationsAttribute.getAnnotations()[k];
                n12 = arrannotation2.length;
            }
            if (parameterAnnotationsAttribute2 == null) {
                arrannotation = null;
                n11 = 0;
            } else {
                arrannotation = parameterAnnotationsAttribute2.getAnnotations()[k];
                n11 = arrannotation.length;
            }
            if (!bl) {
                int n13;
                arrobject[k] = new Object[n12 + n11];
                for (n13 = 0; n13 < n12; ++n13) {
                    arrobject[k][n13] = CtClassType.toAnnoType(arrannotation2[n13], classPool);
                }
                for (n13 = 0; n13 < n11; ++n13) {
                    arrobject[k][n13 + n12] = CtClassType.toAnnoType(arrannotation[n13], classPool);
                }
                continue;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (n10 = 0; n10 < n12; ++n10) {
                try {
                    arrayList.add(CtClassType.toAnnoType(arrannotation2[n10], classPool));
                    continue;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    // empty catch block
                }
            }
            for (n10 = 0; n10 < n11; ++n10) {
                try {
                    arrayList.add(CtClassType.toAnnoType(arrannotation[n10], classPool));
                    continue;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    // empty catch block
                }
            }
            arrobject[k] = arrayList.toArray();
        }
        return arrobject;
    }

    private static Object toAnnoType(Annotation annotation, ClassPool classPool) throws ClassNotFoundException {
        try {
            ClassLoader classLoader = classPool.getClassLoader();
            return annotation.toAnnotationType(classLoader, classPool);
        }
        catch (ClassNotFoundException classNotFoundException) {
            ClassLoader classLoader = classPool.getClass().getClassLoader();
            try {
                return annotation.toAnnotationType(classLoader, classPool);
            }
            catch (ClassNotFoundException classNotFoundException2) {
                try {
                    Class<?> class_ = classPool.get(annotation.getTypeName()).toClass();
                    return AnnotationImpl.make(class_.getClassLoader(), class_, classPool, annotation);
                }
                catch (Throwable throwable) {
                    throw new ClassNotFoundException(annotation.getTypeName());
                }
            }
        }
    }

    @Override
    public boolean subclassOf(CtClass ctClass) {
        if (ctClass == null) {
            return false;
        }
        String string = ctClass.getName();
        try {
            for (CtClass ctClass2 = this; ctClass2 != null; ctClass2 = ((CtClass)ctClass2).getSuperclass()) {
                if (!ctClass2.getName().equals(string)) continue;
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    @Override
    public CtClass getSuperclass() throws NotFoundException {
        String string = this.getClassFile2().getSuperclass();
        if (string == null) {
            return null;
        }
        return this.classPool.get(string);
    }

    @Override
    public void setSuperclass(CtClass ctClass) throws CannotCompileException {
        this.checkModify();
        if (this.isInterface()) {
            this.addInterface(ctClass);
        } else {
            this.getClassFile2().setSuperclass(ctClass.getName());
        }
    }

    @Override
    public CtClass[] getInterfaces() throws NotFoundException {
        String[] arrstring = this.getClassFile2().getInterfaces();
        int n6 = arrstring.length;
        CtClass[] arrctClass = new CtClass[n6];
        for (int k = 0; k < n6; ++k) {
            arrctClass[k] = this.classPool.get(arrstring[k]);
        }
        return arrctClass;
    }

    @Override
    public void setInterfaces(CtClass[] arrctClass) {
        String[] arrstring;
        this.checkModify();
        if (arrctClass == null) {
            arrstring = new String[]{};
        } else {
            int n6 = arrctClass.length;
            arrstring = new String[n6];
            for (int k = 0; k < n6; ++k) {
                arrstring[k] = arrctClass[k].getName();
            }
        }
        this.getClassFile2().setInterfaces(arrstring);
    }

    @Override
    public void addInterface(CtClass ctClass) {
        this.checkModify();
        if (ctClass != null) {
            this.getClassFile2().addInterface(ctClass.getName());
        }
    }

    @Override
    public CtClass getDeclaringClass() throws NotFoundException {
        ClassFile classFile = this.getClassFile2();
        InnerClassesAttribute innerClassesAttribute = (InnerClassesAttribute)classFile.getAttribute("InnerClasses");
        if (innerClassesAttribute == null) {
            return null;
        }
        String string = this.getName();
        int n6 = innerClassesAttribute.tableLength();
        for (int k = 0; k < n6; ++k) {
            if (!string.equals(innerClassesAttribute.innerClass(k))) continue;
            String string2 = innerClassesAttribute.outerClass(k);
            if (string2 != null) {
                return this.classPool.get(string2);
            }
            EnclosingMethodAttribute enclosingMethodAttribute = (EnclosingMethodAttribute)classFile.getAttribute("EnclosingMethod");
            if (enclosingMethodAttribute == null) continue;
            return this.classPool.get(enclosingMethodAttribute.className());
        }
        return null;
    }

    @Override
    public CtBehavior getEnclosingBehavior() throws NotFoundException {
        ClassFile classFile = this.getClassFile2();
        EnclosingMethodAttribute enclosingMethodAttribute = (EnclosingMethodAttribute)classFile.getAttribute("EnclosingMethod");
        if (enclosingMethodAttribute == null) {
            return null;
        }
        CtClass ctClass = this.classPool.get(enclosingMethodAttribute.className());
        String string = enclosingMethodAttribute.methodName();
        if ("<init>".equals(string)) {
            return ctClass.getConstructor(enclosingMethodAttribute.methodDescriptor());
        }
        if ("<clinit>".equals(string)) {
            return ctClass.getClassInitializer();
        }
        return ctClass.getMethod(string, enclosingMethodAttribute.methodDescriptor());
    }

    @Override
    public CtClass makeNestedClass(String string, boolean bl) {
        if (!bl) {
            throw new RuntimeException("sorry, only nested static class is supported");
        }
        this.checkModify();
        CtClass ctClass = this.classPool.makeNestedClass(this.getName() + "$" + string);
        ClassFile classFile = this.getClassFile2();
        ClassFile classFile2 = ctClass.getClassFile2();
        InnerClassesAttribute innerClassesAttribute = (InnerClassesAttribute)classFile.getAttribute("InnerClasses");
        if (innerClassesAttribute == null) {
            innerClassesAttribute = new InnerClassesAttribute(classFile.getConstPool());
            classFile.addAttribute(innerClassesAttribute);
        }
        innerClassesAttribute.append(ctClass.getName(), this.getName(), string, classFile2.getAccessFlags() & 0xFFFFFFDF | 8);
        classFile2.addAttribute(innerClassesAttribute.copy(classFile2.getConstPool(), null));
        return ctClass;
    }

    private void nameReplaced() {
        CtMember$Cache ctMember$Cache = this.hasMemberCache();
        if (ctMember$Cache != null) {
            CtMember ctMember = ctMember$Cache.lastMethod();
            for (CtMember ctMember2 = ctMember$Cache.methodHead(); ctMember2 != ctMember; ctMember2 = ctMember2.f()) {
                ctMember2.nameReplaced();
            }
        }
    }

    protected CtMember$Cache hasMemberCache() {
        if (this.memberCache != null) {
            return this.memberCache.get();
        }
        return null;
    }

    protected synchronized CtMember$Cache getMembers() {
        CtMember$Cache ctMember$Cache = null;
        if (this.memberCache == null || (ctMember$Cache = this.memberCache.get()) == null) {
            ctMember$Cache = new CtMember$Cache(this);
            this.makeFieldCache(ctMember$Cache);
            this.makeBehaviorCache(ctMember$Cache);
            this.memberCache = new WeakReference<CtMember$Cache>(ctMember$Cache);
        }
        return ctMember$Cache;
    }

    private void makeFieldCache(CtMember$Cache ctMember$Cache) {
        List<FieldInfo> list = this.getClassFile3(false).getFields();
        for (FieldInfo fieldInfo : list) {
            ctMember$Cache.addField(new CtField(fieldInfo, (CtClass)this));
        }
    }

    private void makeBehaviorCache(CtMember$Cache ctMember$Cache) {
        List<MethodInfo> list = this.getClassFile3(false).getMethods();
        for (MethodInfo methodInfo : list) {
            if (methodInfo.isMethod()) {
                ctMember$Cache.addMethod(new CtMethod(methodInfo, this));
                continue;
            }
            ctMember$Cache.addConstructor(new CtConstructor(methodInfo, (CtClass)this));
        }
    }

    @Override
    public CtField[] getFields() {
        ArrayList<CtMember> arrayList = new ArrayList<CtMember>();
        CtClassType.getFields(arrayList, this);
        return arrayList.toArray(new CtField[arrayList.size()]);
    }

    private static void getFields(List<CtMember> list, CtClass ctClass) {
        Object object;
        if (ctClass == null) {
            return;
        }
        try {
            CtClassType.getFields(list, ctClass.getSuperclass());
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        try {
            for (CtClass ctClass2 : object = ctClass.getInterfaces()) {
                CtClassType.getFields(list, ctClass2);
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        object = ((CtClassType)ctClass).getMembers();
        Object object2 = ((CtMember$Cache)object).fieldHead();
        CtMember ctMember = ((CtMember$Cache)object).lastField();
        while (object2 != ctMember) {
            if (Modifier.isPrivate(((CtMember)(object2 = ((CtMember)object2).f())).getModifiers())) continue;
            list.add((CtMember)object2);
        }
    }

    @Override
    public CtField getField(String string, String string2) throws NotFoundException {
        CtField ctField = this.getField2(string, string2);
        return this.checkGetField(ctField, string, string2);
    }

    private CtField checkGetField(CtField ctField, String string, String string2) throws NotFoundException {
        if (ctField == null) {
            String string3 = "field: " + string;
            if (string2 != null) {
                string3 = string3 + " type " + string2;
            }
            throw new NotFoundException(string3 + " in " + this.getName());
        }
        return ctField;
    }

    @Override
    CtField getField2(String string, String string2) {
        CtField ctField = this.getDeclaredField2(string, string2);
        if (ctField != null) {
            return ctField;
        }
        try {
            CtClass[] arrctClass = this.getInterfaces();
            for (CtClass ctClass : arrctClass) {
                CtField ctField2 = ctClass.getField2(string, string2);
                if (ctField2 == null) continue;
                return ctField2;
            }
            CtClass ctClass = this.getSuperclass();
            if (ctClass != null) {
                return ctClass.getField2(string, string2);
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        return null;
    }

    @Override
    public CtField[] getDeclaredFields() {
        CtMember ctMember;
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember2 = ctMember$Cache.lastField();
        int n6 = CtMember$Cache.count(ctMember, ctMember2);
        CtField[] arrctField = new CtField[n6];
        int n10 = 0;
        for (ctMember = ctMember$Cache.fieldHead(); ctMember != ctMember2; ctMember = ctMember.f()) {
            arrctField[n10++] = (CtField)ctMember;
        }
        return arrctField;
    }

    @Override
    public CtField getDeclaredField(String string) throws NotFoundException {
        return this.getDeclaredField(string, null);
    }

    @Override
    public CtField getDeclaredField(String string, String string2) throws NotFoundException {
        CtField ctField = this.getDeclaredField2(string, string2);
        return this.checkGetField(ctField, string, string2);
    }

    private CtField getDeclaredField2(String string, String string2) {
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.fieldHead();
        CtMember ctMember2 = ctMember$Cache.lastField();
        while (ctMember != ctMember2) {
            if (!(ctMember = ctMember.f()).getName().equals(string) || string2 != null && !string2.equals(ctMember.getSignature())) continue;
            return (CtField)ctMember;
        }
        return null;
    }

    @Override
    public CtBehavior[] getDeclaredBehaviors() {
        CtMember ctMember;
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember2 = ctMember$Cache.lastCons();
        int n6 = CtMember$Cache.count(ctMember, ctMember2);
        CtMember ctMember3 = ctMember$Cache.methodHead();
        CtMember ctMember4 = ctMember$Cache.lastMethod();
        int n10 = CtMember$Cache.count(ctMember3, ctMember4);
        CtBehavior[] arrctBehavior = new CtBehavior[n6 + n10];
        int n11 = 0;
        for (ctMember = ctMember$Cache.consHead(); ctMember != ctMember2; ctMember = ctMember.f()) {
            arrctBehavior[n11++] = (CtBehavior)ctMember;
        }
        while (ctMember3 != ctMember4) {
            ctMember3 = ctMember3.f();
            arrctBehavior[n11++] = (CtBehavior)ctMember3;
        }
        return arrctBehavior;
    }

    @Override
    public CtConstructor[] getConstructors() {
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.consHead();
        CtMember ctMember2 = ctMember$Cache.lastCons();
        int n6 = 0;
        CtMember ctMember3 = ctMember;
        while (ctMember3 != ctMember2) {
            if (!CtClassType.isPubCons((CtConstructor)(ctMember3 = ctMember3.f()))) continue;
            ++n6;
        }
        CtConstructor[] arrctConstructor = new CtConstructor[n6];
        int n10 = 0;
        ctMember3 = ctMember;
        while (ctMember3 != ctMember2) {
            CtConstructor ctConstructor = (CtConstructor)(ctMember3 = ctMember3.f());
            if (!CtClassType.isPubCons(ctConstructor)) continue;
            arrctConstructor[n10++] = ctConstructor;
        }
        return arrctConstructor;
    }

    private static boolean isPubCons(CtConstructor ctConstructor) {
        return !Modifier.isPrivate(ctConstructor.getModifiers()) && ctConstructor.isConstructor();
    }

    @Override
    public CtConstructor getConstructor(String string) throws NotFoundException {
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.consHead();
        CtMember ctMember2 = ctMember$Cache.lastCons();
        while (ctMember != ctMember2) {
            CtConstructor ctConstructor = (CtConstructor)(ctMember = ctMember.f());
            if (!ctConstructor.getMethodInfo2().getDescriptor().equals(string) || !ctConstructor.isConstructor()) continue;
            return ctConstructor;
        }
        return super.getConstructor(string);
    }

    @Override
    public CtConstructor[] getDeclaredConstructors() {
        Object object;
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.consHead();
        CtMember ctMember2 = ctMember$Cache.lastCons();
        int n6 = 0;
        CtMember ctMember3 = ctMember;
        while (ctMember3 != ctMember2) {
            object = (CtConstructor)(ctMember3 = ctMember3.f());
            if (!((CtConstructor)object).isConstructor()) continue;
            ++n6;
        }
        object = new CtConstructor[n6];
        int n10 = 0;
        ctMember3 = ctMember;
        while (ctMember3 != ctMember2) {
            CtConstructor ctConstructor = (CtConstructor)(ctMember3 = ctMember3.f());
            if (!ctConstructor.isConstructor()) continue;
            object[n10++] = ctConstructor;
        }
        return object;
    }

    @Override
    public CtConstructor getClassInitializer() {
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.consHead();
        CtMember ctMember2 = ctMember$Cache.lastCons();
        while (ctMember != ctMember2) {
            CtConstructor ctConstructor = (CtConstructor)(ctMember = ctMember.f());
            if (!ctConstructor.isClassInitializer()) continue;
            return ctConstructor;
        }
        return null;
    }

    @Override
    public CtMethod[] getMethods() {
        HashMap<String, CtMember> hashMap = new HashMap<String, CtMember>();
        CtClassType.getMethods0(hashMap, this);
        return hashMap.values().toArray(new CtMethod[hashMap.size()]);
    }

    private static void getMethods0(Map<String, CtMember> map, CtClass ctClass) {
        Object object;
        try {
            for (CtClass ctClass2 : object = ctClass.getInterfaces()) {
                CtClassType.getMethods0(map, ctClass2);
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        try {
            object = ctClass.getSuperclass();
            if (object != null) {
                CtClassType.getMethods0(map, (CtClass)object);
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        if (ctClass instanceof CtClassType) {
            object = ((CtClassType)ctClass).getMembers();
            Object object2 = ((CtMember$Cache)object).methodHead();
            CtMember ctMember = ((CtMember$Cache)object).lastMethod();
            while (object2 != ctMember) {
                if (Modifier.isPrivate(((CtMember)(object2 = ((CtMember)object2).f())).getModifiers())) continue;
                map.put(((CtMethod)object2).getStringRep(), (CtMember)object2);
            }
        }
    }

    @Override
    public CtMethod getMethod(String string, String string2) throws NotFoundException {
        CtMethod ctMethod = CtClassType.getMethod0(this, string, string2);
        if (ctMethod != null) {
            return ctMethod;
        }
        throw new NotFoundException(string + "(..) is not found in " + this.getName());
    }

    private static CtMethod getMethod0(CtClass ctClass, String string, String string2) {
        Object object;
        CtClass[] arrctClass;
        if (ctClass instanceof CtClassType) {
            arrctClass = ((CtClassType)ctClass).getMembers();
            object = arrctClass.methodHead();
            CtMember ctMember = arrctClass.lastMethod();
            while (object != ctMember) {
                if (!((CtMember)(object = ((CtMember)object).f())).getName().equals(string) || !((CtMethod)object).getMethodInfo2().getDescriptor().equals(string2)) continue;
                return (CtMethod)object;
            }
        }
        try {
            arrctClass = ctClass.getSuperclass();
            if (arrctClass != null && (object = CtClassType.getMethod0((CtClass)arrctClass, string, string2)) != null) {
                return object;
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        try {
            arrctClass = ctClass.getInterfaces();
            for (CtClass ctClass2 : arrctClass) {
                CtMethod ctMethod = CtClassType.getMethod0(ctClass2, string, string2);
                if (ctMethod == null) continue;
                return ctMethod;
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        return null;
    }

    @Override
    public CtMethod[] getDeclaredMethods() {
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.lastMethod();
        ArrayList<CtMember> arrayList = new ArrayList<CtMember>();
        for (CtMember ctMember2 = ctMember$Cache.methodHead(); ctMember2 != ctMember; ctMember2 = ctMember2.f()) {
            arrayList.add(ctMember2);
        }
        return arrayList.toArray(new CtMethod[arrayList.size()]);
    }

    @Override
    public CtMethod[] getDeclaredMethods(String string) throws NotFoundException {
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.methodHead();
        CtMember ctMember2 = ctMember$Cache.lastMethod();
        ArrayList<CtMember> arrayList = new ArrayList<CtMember>();
        while (ctMember != ctMember2) {
            if (!(ctMember = ctMember.f()).getName().equals(string)) continue;
            arrayList.add(ctMember);
        }
        return arrayList.toArray(new CtMethod[arrayList.size()]);
    }

    @Override
    public CtMethod getDeclaredMethod(String string) throws NotFoundException {
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.methodHead();
        CtMember ctMember2 = ctMember$Cache.lastMethod();
        while (ctMember != ctMember2) {
            if (!(ctMember = ctMember.f()).getName().equals(string)) continue;
            return (CtMethod)ctMember;
        }
        throw new NotFoundException(string + "(..) is not found in " + this.getName());
    }

    @Override
    public CtMethod getDeclaredMethod(String string, CtClass[] arrctClass) throws NotFoundException {
        String string2 = Descriptor.ofParameters(arrctClass);
        CtMember$Cache ctMember$Cache = this.getMembers();
        CtMember ctMember = ctMember$Cache.methodHead();
        CtMember ctMember2 = ctMember$Cache.lastMethod();
        while (ctMember != ctMember2) {
            if (!(ctMember = ctMember.f()).getName().equals(string) || !((CtMethod)ctMember).getMethodInfo2().getDescriptor().startsWith(string2)) continue;
            return (CtMethod)ctMember;
        }
        throw new NotFoundException(string + "(..) is not found in " + this.getName());
    }

    @Override
    public void addField(CtField ctField, String string) throws CannotCompileException {
        this.addField(ctField, CtField$Initializer.byExpr(string));
    }

    @Override
    public void addField(CtField ctField, CtField$Initializer ctField$Initializer) throws CannotCompileException {
        Object object;
        this.checkModify();
        if (ctField.getDeclaringClass() != this) {
            throw new CannotCompileException("cannot add");
        }
        if (ctField$Initializer == null) {
            ctField$Initializer = ctField.getInit();
        }
        if (ctField$Initializer != null) {
            ctField$Initializer.check(ctField.getSignature());
            int n6 = ctField.getModifiers();
            if (Modifier.isStatic(n6) && Modifier.isFinal(n6)) {
                try {
                    object = this.getClassFile2().getConstPool();
                    int n10 = ctField$Initializer.getConstantValue((ConstPool)object, ctField.getType());
                    if (n10 != 0) {
                        ctField.getFieldInfo2().addAttribute(new ConstantAttribute((ConstPool)object, n10));
                        ctField$Initializer = null;
                    }
                }
                catch (NotFoundException notFoundException) {
                    // empty catch block
                }
            }
        }
        this.getMembers().addField(ctField);
        this.getClassFile2().addField(ctField.getFieldInfo2());
        if (ctField$Initializer != null) {
            FieldInitLink fieldInitLink = new FieldInitLink(ctField, ctField$Initializer);
            object = this.fieldInitializers;
            if (object == null) {
                this.fieldInitializers = fieldInitLink;
            } else {
                while (((FieldInitLink)object).next != null) {
                    object = ((FieldInitLink)object).next;
                }
                ((FieldInitLink)object).next = fieldInitLink;
            }
        }
    }

    @Override
    public void removeField(CtField ctField) throws NotFoundException {
        this.checkModify();
        FieldInfo fieldInfo = ctField.getFieldInfo2();
        ClassFile classFile = this.getClassFile2();
        if (!classFile.getFields().remove(fieldInfo)) {
            throw new NotFoundException(ctField.toString());
        }
        this.getMembers().remove(ctField);
        this.gcConstPool = true;
    }

    @Override
    public CtConstructor makeClassInitializer() throws CannotCompileException {
        CtConstructor ctConstructor = this.getClassInitializer();
        if (ctConstructor != null) {
            return ctConstructor;
        }
        this.checkModify();
        ClassFile classFile = this.getClassFile2();
        Bytecode bytecode = new Bytecode(classFile.getConstPool(), 0, 0);
        this.modifyClassConstructor(classFile, bytecode, 0, 0);
        return this.getClassInitializer();
    }

    @Override
    public void addConstructor(CtConstructor ctConstructor) throws CannotCompileException {
        this.checkModify();
        if (ctConstructor.getDeclaringClass() != this) {
            throw new CannotCompileException("cannot add");
        }
        this.getMembers().addConstructor(ctConstructor);
        this.getClassFile2().addMethod(ctConstructor.getMethodInfo2());
    }

    @Override
    public void removeConstructor(CtConstructor ctConstructor) throws NotFoundException {
        this.checkModify();
        MethodInfo methodInfo = ctConstructor.getMethodInfo2();
        ClassFile classFile = this.getClassFile2();
        if (!classFile.getMethods().remove(methodInfo)) {
            throw new NotFoundException(ctConstructor.toString());
        }
        this.getMembers().remove(ctConstructor);
        this.gcConstPool = true;
    }

    @Override
    public void addMethod(CtMethod ctMethod) throws CannotCompileException {
        this.checkModify();
        if (ctMethod.getDeclaringClass() != this) {
            throw new CannotCompileException("bad declaring class");
        }
        int n6 = ctMethod.getModifiers();
        if ((this.getModifiers() & 0x200) != 0) {
            if (Modifier.isProtected(n6) || Modifier.isPrivate(n6)) {
                throw new CannotCompileException("an interface method must be public: " + ctMethod.toString());
            }
            ctMethod.setModifiers(n6 | 1);
        }
        this.getMembers().addMethod(ctMethod);
        this.getClassFile2().addMethod(ctMethod.getMethodInfo2());
        if ((n6 & 0x400) != 0) {
            this.setModifiers(this.getModifiers() | 0x400);
        }
    }

    @Override
    public void removeMethod(CtMethod ctMethod) throws NotFoundException {
        this.checkModify();
        MethodInfo methodInfo = ctMethod.getMethodInfo2();
        ClassFile classFile = this.getClassFile2();
        if (!classFile.getMethods().remove(methodInfo)) {
            throw new NotFoundException(ctMethod.toString());
        }
        this.getMembers().remove(ctMethod);
        this.gcConstPool = true;
    }

    @Override
    public byte[] getAttribute(String string) {
        AttributeInfo attributeInfo = this.getClassFile2().getAttribute(string);
        if (attributeInfo == null) {
            return null;
        }
        return attributeInfo.get();
    }

    @Override
    public void setAttribute(String string, byte[] arrby) {
        this.checkModify();
        ClassFile classFile = this.getClassFile2();
        classFile.addAttribute(new AttributeInfo(classFile.getConstPool(), string, arrby));
    }

    @Override
    public void instrument(CodeConverter codeConverter) throws CannotCompileException {
        this.checkModify();
        ClassFile classFile = this.getClassFile2();
        ConstPool constPool = classFile.getConstPool();
        List<MethodInfo> list = classFile.getMethods();
        for (MethodInfo methodInfo : list.toArray(new MethodInfo[list.size()])) {
            codeConverter.doit(this, methodInfo, constPool);
        }
    }

    @Override
    public void instrument(ExprEditor exprEditor) throws CannotCompileException {
        this.checkModify();
        ClassFile classFile = this.getClassFile2();
        List<MethodInfo> list = classFile.getMethods();
        for (MethodInfo methodInfo : list.toArray(new MethodInfo[list.size()])) {
            exprEditor.doit(this, methodInfo);
        }
    }

    @Override
    public void prune() {
        if (this.wasPruned) {
            return;
        }
        this.wasFrozen = true;
        this.wasPruned = true;
        this.getClassFile2().prune();
    }

    @Override
    public void rebuildClassFile() {
        this.gcConstPool = true;
    }

    @Override
    public void toBytecode(DataOutputStream dataOutputStream) throws CannotCompileException, IOException {
        try {
            if (this.isModified()) {
                this.checkPruned("toBytecode");
                ClassFile classFile = this.getClassFile2();
                if (this.gcConstPool) {
                    classFile.compact();
                    this.gcConstPool = false;
                }
                this.modifyClassConstructor(classFile);
                this.modifyConstructors(classFile);
                if (debugDump != null) {
                    this.dumpClassFile(classFile);
                }
                classFile.write(dataOutputStream);
                dataOutputStream.flush();
                this.fieldInitializers = null;
                if (this.doPruning) {
                    classFile.prune();
                    this.wasPruned = true;
                }
            } else {
                this.classPool.writeClassfile(this.getName(), dataOutputStream);
            }
            this.getCount = 0;
            this.wasFrozen = true;
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        catch (IOException iOException) {
            throw new CannotCompileException(iOException);
        }
    }

    private void dumpClassFile(ClassFile classFile) throws IOException {
        try (DataOutputStream dataOutputStream = this.makeFileOutput(debugDump);){
            classFile.write(dataOutputStream);
        }
    }

    private void checkPruned(String string) {
        if (this.wasPruned) {
            throw new RuntimeException(string + "(): " + this.getName() + " was pruned.");
        }
    }

    @Override
    public boolean stopPruning(boolean bl) {
        boolean bl2 = !this.doPruning;
        this.doPruning = !bl;
        return bl2;
    }

    private void modifyClassConstructor(ClassFile classFile) throws CannotCompileException, NotFoundException {
        if (this.fieldInitializers == null) {
            return;
        }
        Bytecode bytecode = new Bytecode(classFile.getConstPool(), 0, 0);
        Javac javac = new Javac(bytecode, this);
        int n6 = 0;
        boolean bl = false;
        FieldInitLink fieldInitLink = this.fieldInitializers;
        while (fieldInitLink != null) {
            CtField ctField = fieldInitLink.field;
            if (Modifier.isStatic(ctField.getModifiers())) {
                bl = true;
                int n10 = fieldInitLink.init.compileIfStatic(ctField.getType(), ctField.getName(), bytecode, javac);
                if (n6 < n10) {
                    n6 = n10;
                }
            }
            fieldInitLink = fieldInitLink.next;
        }
        if (bl) {
            this.modifyClassConstructor(classFile, bytecode, n6, 0);
        }
    }

    private void modifyClassConstructor(ClassFile classFile, Bytecode bytecode, int n6, int n10) throws CannotCompileException {
        Object object;
        MethodInfo methodInfo = classFile.getStaticInitializer();
        if (methodInfo == null) {
            bytecode.add(177);
            bytecode.setMaxStack(n6);
            bytecode.setMaxLocals(n10);
            methodInfo = new MethodInfo(classFile.getConstPool(), "<clinit>", "()V");
            methodInfo.setAccessFlags(8);
            methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
            classFile.addMethod(methodInfo);
            object = this.hasMemberCache();
            if (object != null) {
                ((CtMember$Cache)object).addConstructor(new CtConstructor(methodInfo, (CtClass)this));
            }
        } else {
            object = methodInfo.getCodeAttribute();
            if (object == null) {
                throw new CannotCompileException("empty <clinit>");
            }
            try {
                int n11;
                CodeIterator codeIterator = ((CodeAttribute)object).iterator();
                int n12 = codeIterator.insertEx(bytecode.get());
                codeIterator.insert(bytecode.getExceptionTable(), n12);
                int n13 = ((CodeAttribute)object).getMaxStack();
                if (n13 < n6) {
                    ((CodeAttribute)object).setMaxStack(n6);
                }
                if ((n11 = ((CodeAttribute)object).getMaxLocals()) < n10) {
                    ((CodeAttribute)object).setMaxLocals(n10);
                }
            }
            catch (BadBytecode badBytecode) {
                throw new CannotCompileException(badBytecode);
            }
        }
        try {
            methodInfo.rebuildStackMapIf6(this.classPool, classFile);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }

    private void modifyConstructors(ClassFile classFile) throws CannotCompileException, NotFoundException {
        if (this.fieldInitializers == null) {
            return;
        }
        ConstPool constPool = classFile.getConstPool();
        List<MethodInfo> list = classFile.getMethods();
        for (MethodInfo methodInfo : list) {
            CodeAttribute codeAttribute;
            if (!methodInfo.isConstructor() || (codeAttribute = methodInfo.getCodeAttribute()) == null) continue;
            try {
                Bytecode bytecode = new Bytecode(constPool, 0, codeAttribute.getMaxLocals());
                CtClass[] arrctClass = Descriptor.getParameterTypes(methodInfo.getDescriptor(), this.classPool);
                int n6 = this.makeFieldInitializer(bytecode, arrctClass);
                CtClassType.insertAuxInitializer(codeAttribute, bytecode, n6);
                methodInfo.rebuildStackMapIf6(this.classPool, classFile);
            }
            catch (BadBytecode badBytecode) {
                throw new CannotCompileException(badBytecode);
            }
        }
    }

    private static void insertAuxInitializer(CodeAttribute codeAttribute, Bytecode bytecode, int n6) throws BadBytecode {
        CodeIterator codeIterator = codeAttribute.iterator();
        int n10 = codeIterator.skipSuperConstructor();
        if (n10 < 0 && (n10 = codeIterator.skipThisConstructor()) >= 0) {
            return;
        }
        int n11 = codeIterator.insertEx(bytecode.get());
        codeIterator.insert(bytecode.getExceptionTable(), n11);
        int n12 = codeAttribute.getMaxStack();
        if (n12 < n6) {
            codeAttribute.setMaxStack(n6);
        }
    }

    private int makeFieldInitializer(Bytecode bytecode, CtClass[] arrctClass) throws CannotCompileException, NotFoundException {
        int n6 = 0;
        Javac javac = new Javac(bytecode, this);
        try {
            javac.recordParams(arrctClass, false);
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        FieldInitLink fieldInitLink = this.fieldInitializers;
        while (fieldInitLink != null) {
            int n10;
            CtField ctField = fieldInitLink.field;
            if (!Modifier.isStatic(ctField.getModifiers()) && n6 < (n10 = fieldInitLink.init.compile(ctField.getType(), ctField.getName(), bytecode, arrctClass, javac))) {
                n6 = n10;
            }
            fieldInitLink = fieldInitLink.next;
        }
        return n6;
    }

    Map<CtMethod, String> getHiddenMethods() {
        if (this.hiddenMethods == null) {
            this.hiddenMethods = new Hashtable<CtMethod, String>();
        }
        return this.hiddenMethods;
    }

    int getUniqueNumber() {
        return this.uniqueNumberSeed++;
    }

    @Override
    public String makeUniqueName(String string) {
        String string2;
        HashMap<Object, CtClassType> hashMap = new HashMap<Object, CtClassType>();
        this.makeMemberList(hashMap);
        Set set = hashMap.keySet();
        String[] arrstring = new String[set.size()];
        set.toArray(arrstring);
        if (CtClassType.notFindInArray(string, arrstring)) {
            return string;
        }
        int n6 = 100;
        do {
            if (n6 <= 999) continue;
            throw new RuntimeException("too many unique name");
        } while (!CtClassType.notFindInArray(string2 = string + n6++, arrstring));
        return string2;
    }

    private static boolean notFindInArray(String string, String[] arrstring) {
        int n6 = arrstring.length;
        for (int k = 0; k < n6; ++k) {
            if (!arrstring[k].startsWith(string)) continue;
            return false;
        }
        return true;
    }

    private void makeMemberList(Map<Object, CtClassType> map) {
        Object object;
        int n6 = this.getModifiers();
        if (Modifier.isAbstract(n6) || Modifier.isInterface(n6)) {
            try {
                for (Object object2 : object = this.getInterfaces()) {
                    if (object2 == null || !(object2 instanceof CtClassType)) continue;
                    ((CtClassType)object2).makeMemberList(map);
                }
            }
            catch (NotFoundException notFoundException) {
                // empty catch block
            }
        }
        try {
            object = this.getSuperclass();
            if (object != null && object instanceof CtClassType) {
                ((CtClassType)object).makeMemberList(map);
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        object = this.getClassFile2().getMethods();
        Object object3 = object.iterator();
        while (object3.hasNext()) {
            MethodInfo methodInfo = (MethodInfo)object3.next();
            map.put(methodInfo.getName(), this);
        }
        object3 = this.getClassFile2().getFields();
        Iterator iterator = object3.iterator();
        while (iterator.hasNext()) {
            FieldInfo fieldInfo = (FieldInfo)iterator.next();
            map.put(fieldInfo.getName(), this);
        }
    }
}

