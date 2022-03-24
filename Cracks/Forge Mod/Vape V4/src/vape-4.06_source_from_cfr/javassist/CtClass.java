/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Collection;
import javassist.CannotCompileException;
import javassist.ClassMap;
import javassist.ClassPool;
import javassist.CodeConverter;
import javassist.CtBehavior;
import javassist.CtClass$1;
import javassist.CtClass$DelayedFileOutputStream;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtField$Initializer;
import javassist.CtMethod;
import javassist.CtPrimitiveType;
import javassist.NotFoundException;
import javassist.bytecode.ClassFile;
import javassist.bytecode.Descriptor;
import javassist.compiler.AccessorMaker;
import javassist.expr.ExprEditor;

public abstract class CtClass {
    protected String qualifiedName;
    public static String debugDump = null;
    public static final String version = "3.26.0-GA";
    static final String javaLangObject = "java.lang.Object";
    public static CtClass booleanType;
    public static CtClass charType;
    public static CtClass byteType;
    public static CtClass shortType;
    public static CtClass intType;
    public static CtClass longType;
    public static CtClass floatType;
    public static CtClass doubleType;
    public static CtClass voidType;
    static CtClass[] primitiveTypes;

    public static void main(String[] arrstring) {
        System.out.println("Javassist version 3.26.0-GA");
        System.out.println("Copyright (C) 1999-2019 Shigeru Chiba. All Rights Reserved.");
    }

    protected CtClass(String string) {
        this.qualifiedName = string;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(Integer.toHexString(this.hashCode()));
        stringBuffer.append("[");
        this.extendToString(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    protected void extendToString(StringBuffer stringBuffer) {
        stringBuffer.append(this.getName());
    }

    public ClassPool getClassPool() {
        return null;
    }

    public ClassFile getClassFile() {
        this.checkModify();
        return this.getClassFile2();
    }

    public ClassFile getClassFile2() {
        return null;
    }

    public AccessorMaker getAccessorMaker() {
        return null;
    }

    public URL getURL() throws NotFoundException {
        throw new NotFoundException(this.getName());
    }

    public boolean isModified() {
        return false;
    }

    public boolean isFrozen() {
        return true;
    }

    public void freeze() {
    }

    void checkModify() throws RuntimeException {
        if (this.isFrozen()) {
            throw new RuntimeException(this.getName() + " class is frozen");
        }
    }

    public void defrost() {
        throw new RuntimeException("cannot defrost " + this.getName());
    }

    public boolean isPrimitive() {
        return false;
    }

    public boolean isArray() {
        return false;
    }

    public boolean W() {
        return this.hasAnnotation("kotlin.Metadata");
    }

    public CtClass getComponentType() throws NotFoundException {
        return null;
    }

    public boolean subtypeOf(CtClass ctClass) throws NotFoundException {
        return this == ctClass || this.getName().equals(ctClass.getName());
    }

    public String getName() {
        return this.qualifiedName;
    }

    public final String getSimpleName() {
        String string = this.qualifiedName;
        int n6 = string.lastIndexOf(46);
        if (n6 < 0) {
            return string;
        }
        return string.substring(n6 + 1);
    }

    public final String getPackageName() {
        String string = this.qualifiedName;
        int n6 = string.lastIndexOf(46);
        if (n6 < 0) {
            return null;
        }
        return string.substring(0, n6);
    }

    public void setName(String string) {
        this.checkModify();
        if (string != null) {
            this.qualifiedName = string;
        }
    }

    public String getGenericSignature() {
        return null;
    }

    public void setGenericSignature(String string) {
        this.checkModify();
    }

    public void replaceClassName(String string, String string2) {
        this.checkModify();
    }

    public void replaceClassName(ClassMap classMap) {
        this.checkModify();
    }

    public synchronized Collection<String> getRefClasses() {
        ClassFile classFile = this.getClassFile2();
        if (classFile != null) {
            CtClass$1 ctClass$1 = new CtClass$1(this);
            classFile.getRefClasses(ctClass$1);
            return ctClass$1.values();
        }
        return null;
    }

    public boolean isInterface() {
        return false;
    }

    public boolean isAnnotation() {
        return false;
    }

    public boolean isEnum() {
        return false;
    }

    public int getModifiers() {
        return 0;
    }

    public boolean hasAnnotation(Class<?> class_) {
        return this.hasAnnotation(class_.getName());
    }

    public boolean hasAnnotation(String string) {
        return false;
    }

    public Object getAnnotation(Class<?> class_) throws ClassNotFoundException {
        return null;
    }

    public Object[] getAnnotations() throws ClassNotFoundException {
        return new Object[0];
    }

    public Object[] getAvailableAnnotations() {
        return new Object[0];
    }

    public CtClass[] getDeclaredClasses() throws NotFoundException {
        return this.getNestedClasses();
    }

    public CtClass[] getNestedClasses() throws NotFoundException {
        return new CtClass[0];
    }

    public void setModifiers(int n6) {
        this.checkModify();
    }

    public boolean subclassOf(CtClass ctClass) {
        return false;
    }

    public CtClass getSuperclass() throws NotFoundException {
        return null;
    }

    public void setSuperclass(CtClass ctClass) throws CannotCompileException {
        this.checkModify();
    }

    public CtClass[] getInterfaces() throws NotFoundException {
        return new CtClass[0];
    }

    public void setInterfaces(CtClass[] arrctClass) {
        this.checkModify();
    }

    public void addInterface(CtClass ctClass) {
        this.checkModify();
    }

    public CtClass getDeclaringClass() throws NotFoundException {
        return null;
    }

    public final CtMethod getEnclosingMethod() throws NotFoundException {
        CtBehavior ctBehavior = this.getEnclosingBehavior();
        if (ctBehavior == null) {
            return null;
        }
        if (ctBehavior instanceof CtMethod) {
            return (CtMethod)ctBehavior;
        }
        throw new NotFoundException(ctBehavior.getLongName() + " is enclosing " + this.getName());
    }

    public CtBehavior getEnclosingBehavior() throws NotFoundException {
        return null;
    }

    public CtClass makeNestedClass(String string, boolean bl) {
        throw new RuntimeException(this.getName() + " is not a class");
    }

    public CtField[] getFields() {
        return new CtField[0];
    }

    public CtField getField(String string) throws NotFoundException {
        return this.getField(string, null);
    }

    public CtField getField(String string, String string2) throws NotFoundException {
        throw new NotFoundException(string);
    }

    CtField getField2(String string, String string2) {
        return null;
    }

    public CtField[] getDeclaredFields() {
        return new CtField[0];
    }

    public CtField getDeclaredField(String string) throws NotFoundException {
        throw new NotFoundException(string);
    }

    public CtField getDeclaredField(String string, String string2) throws NotFoundException {
        throw new NotFoundException(string);
    }

    public CtBehavior[] getDeclaredBehaviors() {
        return new CtBehavior[0];
    }

    public CtConstructor[] getConstructors() {
        return new CtConstructor[0];
    }

    public CtConstructor getConstructor(String string) throws NotFoundException {
        throw new NotFoundException("no such constructor");
    }

    public CtConstructor[] getDeclaredConstructors() {
        return new CtConstructor[0];
    }

    public CtConstructor getDeclaredConstructor(CtClass[] arrctClass) throws NotFoundException {
        String string = Descriptor.ofConstructor(arrctClass);
        return this.getConstructor(string);
    }

    public CtConstructor getClassInitializer() {
        return null;
    }

    public CtMethod[] getMethods() {
        return new CtMethod[0];
    }

    public CtMethod getMethod(String string, String string2) throws NotFoundException {
        throw new NotFoundException(string);
    }

    public CtMethod[] getDeclaredMethods() {
        return new CtMethod[0];
    }

    public CtMethod getDeclaredMethod(String string, CtClass[] arrctClass) throws NotFoundException {
        throw new NotFoundException(string);
    }

    public CtMethod[] getDeclaredMethods(String string) throws NotFoundException {
        throw new NotFoundException(string);
    }

    public CtMethod getDeclaredMethod(String string) throws NotFoundException {
        throw new NotFoundException(string);
    }

    public CtConstructor makeClassInitializer() throws CannotCompileException {
        throw new CannotCompileException("not a class");
    }

    public void addConstructor(CtConstructor ctConstructor) throws CannotCompileException {
        this.checkModify();
    }

    public void removeConstructor(CtConstructor ctConstructor) throws NotFoundException {
        this.checkModify();
    }

    public void addMethod(CtMethod ctMethod) throws CannotCompileException {
        this.checkModify();
    }

    public void removeMethod(CtMethod ctMethod) throws NotFoundException {
        this.checkModify();
    }

    public void addField(CtField ctField) throws CannotCompileException {
        this.addField(ctField, (CtField$Initializer)null);
    }

    public void addField(CtField ctField, String string) throws CannotCompileException {
        this.checkModify();
    }

    public void addField(CtField ctField, CtField$Initializer ctField$Initializer) throws CannotCompileException {
        this.checkModify();
    }

    public void removeField(CtField ctField) throws NotFoundException {
        this.checkModify();
    }

    public byte[] getAttribute(String string) {
        return null;
    }

    public void setAttribute(String string, byte[] arrby) {
        this.checkModify();
    }

    public void instrument(CodeConverter codeConverter) throws CannotCompileException {
        this.checkModify();
    }

    public void instrument(ExprEditor exprEditor) throws CannotCompileException {
        this.checkModify();
    }

    public Class<?> toClass() throws CannotCompileException {
        return this.getClassPool().toClass(this);
    }

    public Class<?> toClass(Class<?> class_) throws CannotCompileException {
        return this.getClassPool().toClass(this, class_);
    }

    public Class<?> toClass(MethodHandles.Lookup lookup) throws CannotCompileException {
        return this.getClassPool().toClass(this, lookup);
    }

    public Class<?> toClass(ClassLoader classLoader, ProtectionDomain protectionDomain) throws CannotCompileException {
        ClassPool classPool = this.getClassPool();
        if (classLoader == null) {
            classLoader = classPool.getClassLoader();
        }
        return classPool.toClass(this, null, classLoader, protectionDomain);
    }

    public final Class<?> toClass(ClassLoader classLoader) throws CannotCompileException {
        return this.getClassPool().toClass(this, null, classLoader, null);
    }

    public void detach() {
        ClassPool classPool = this.getClassPool();
        CtClass ctClass = classPool.removeCached(this.getName());
        if (ctClass != this) {
            classPool.cacheCtClass(this.getName(), ctClass, false);
        }
    }

    public boolean stopPruning(boolean bl) {
        return true;
    }

    public void prune() {
    }

    void incGetCounter() {
    }

    public void rebuildClassFile() {
    }

    public byte[] toBytecode() throws IOException, CannotCompileException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
            this.toBytecode(dataOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void writeFile() throws NotFoundException, IOException, CannotCompileException {
        this.writeFile(".");
    }

    public void writeFile(String string) throws CannotCompileException, IOException {
        try (DataOutputStream dataOutputStream = this.makeFileOutput(string);){
            this.toBytecode(dataOutputStream);
        }
    }

    protected DataOutputStream makeFileOutput(String string) {
        String string2;
        String string3 = this.getName();
        String string4 = string + File.separatorChar + string3.replace('.', File.separatorChar) + ".class";
        int n6 = string4.lastIndexOf(File.separatorChar);
        if (n6 > 0 && !(string2 = string4.substring(0, n6)).equals(".")) {
            new File(string2).mkdirs();
        }
        return new DataOutputStream(new BufferedOutputStream(new CtClass$DelayedFileOutputStream(string4)));
    }

    public void debugWriteFile() {
        this.debugWriteFile(".");
    }

    public void debugWriteFile(String string) {
        try {
            boolean bl = this.stopPruning(true);
            this.writeFile(string);
            this.defrost();
            this.stopPruning(bl);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void toBytecode(DataOutputStream dataOutputStream) throws CannotCompileException, IOException {
        throw new CannotCompileException("not a class");
    }

    public String makeUniqueName(String string) {
        throw new RuntimeException("not available in " + this.getName());
    }

    void compress() {
    }

    static {
        primitiveTypes = new CtClass[9];
        CtClass.primitiveTypes[0] = booleanType = new CtPrimitiveType("boolean", 'Z', "java.lang.Boolean", "booleanValue", "()Z", 172, 4, 1);
        CtClass.primitiveTypes[1] = charType = new CtPrimitiveType("char", 'C', "java.lang.Character", "charValue", "()C", 172, 5, 1);
        CtClass.primitiveTypes[2] = byteType = new CtPrimitiveType("byte", 'B', "java.lang.Byte", "byteValue", "()B", 172, 8, 1);
        CtClass.primitiveTypes[3] = shortType = new CtPrimitiveType("short", 'S', "java.lang.Short", "shortValue", "()S", 172, 9, 1);
        CtClass.primitiveTypes[4] = intType = new CtPrimitiveType("int", 'I', "java.lang.Integer", "intValue", "()I", 172, 10, 1);
        CtClass.primitiveTypes[5] = longType = new CtPrimitiveType("long", 'J', "java.lang.Long", "longValue", "()J", 173, 11, 2);
        CtClass.primitiveTypes[6] = floatType = new CtPrimitiveType("float", 'F', "java.lang.Float", "floatValue", "()F", 174, 6, 1);
        CtClass.primitiveTypes[7] = doubleType = new CtPrimitiveType("double", 'D', "java.lang.Double", "doubleValue", "()D", 175, 7, 2);
        CtClass.primitiveTypes[8] = voidType = new CtPrimitiveType("void", 'V', "java.lang.Void", null, null, 177, 0, 0);
    }
}

