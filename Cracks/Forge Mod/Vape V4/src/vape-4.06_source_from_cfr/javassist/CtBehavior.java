/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.ClassMap;
import javassist.ClassPool;
import javassist.CodeConverter;
import javassist.CtClass;
import javassist.CtClassType;
import javassist.CtField;
import javassist.CtField$Initializer;
import javassist.CtMember;
import javassist.CtPrimitiveType;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.AccessFlag;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.CodeIterator$Gap;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.ExceptionsAttribute;
import javassist.bytecode.LineNumberAttribute;
import javassist.bytecode.LineNumberAttribute$Pc;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.LocalVariableTypeAttribute;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.ParameterAnnotationsAttribute;
import javassist.bytecode.SignatureAttribute;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMapTable;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.expr.ExprEditor;

public abstract class CtBehavior
extends CtMember {
    protected MethodInfo methodInfo;

    protected CtBehavior(CtClass ctClass, MethodInfo methodInfo) {
        super(ctClass);
        this.methodInfo = methodInfo;
    }

    void copy(CtBehavior ctBehavior, boolean bl, ClassMap classMap) throws CannotCompileException {
        CtClass ctClass = this.b;
        MethodInfo methodInfo = ctBehavior.methodInfo;
        CtClass ctClass2 = ctBehavior.getDeclaringClass();
        ConstPool constPool = ctClass.getClassFile2().getConstPool();
        classMap = new ClassMap(classMap);
        classMap.put(ctClass2.getName(), ctClass.getName());
        try {
            String string;
            boolean bl2 = false;
            CtClass ctClass3 = ctClass2.getSuperclass();
            CtClass ctClass4 = ctClass.getSuperclass();
            String string2 = null;
            if (ctClass3 != null && ctClass4 != null && !(string = ctClass3.getName()).equals(string2 = ctClass4.getName())) {
                if (string.equals("java.lang.Object")) {
                    bl2 = true;
                } else {
                    classMap.putIfNone(string, string2);
                }
            }
            this.methodInfo = new MethodInfo(constPool, methodInfo.getName(), methodInfo, classMap);
            if (bl && bl2) {
                this.methodInfo.setSuperclass(string2);
            }
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }

    @Override
    protected void extendToString(StringBuffer stringBuffer) {
        stringBuffer.append(' ');
        stringBuffer.append(this.getName());
        stringBuffer.append(' ');
        stringBuffer.append(this.methodInfo.getDescriptor());
    }

    public abstract String getLongName();

    public MethodInfo getMethodInfo() {
        this.b.checkModify();
        return this.methodInfo;
    }

    public MethodInfo getMethodInfo2() {
        return this.methodInfo;
    }

    @Override
    public int getModifiers() {
        return AccessFlag.toModifier(this.methodInfo.getAccessFlags());
    }

    @Override
    public void setModifiers(int n6) {
        this.b.checkModify();
        this.methodInfo.setAccessFlags(AccessFlag.of(n6));
    }

    @Override
    public boolean hasAnnotation(String string) {
        MethodInfo methodInfo = this.getMethodInfo2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)methodInfo.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)methodInfo.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.hasAnnotationType(string, this.getDeclaringClass().getClassPool(), annotationsAttribute, annotationsAttribute2);
    }

    @Override
    public Object getAnnotation(Class<?> class_) throws ClassNotFoundException {
        MethodInfo methodInfo = this.getMethodInfo2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)methodInfo.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)methodInfo.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.getAnnotationType(class_, this.getDeclaringClass().getClassPool(), annotationsAttribute, annotationsAttribute2);
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
            throw new RuntimeException("Unexpected exception", classNotFoundException);
        }
    }

    private Object[] getAnnotations(boolean bl) throws ClassNotFoundException {
        MethodInfo methodInfo = this.getMethodInfo2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)methodInfo.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)methodInfo.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.toAnnotationType(bl, this.getDeclaringClass().getClassPool(), annotationsAttribute, annotationsAttribute2);
    }

    public Object[][] getParameterAnnotations() throws ClassNotFoundException {
        return this.getParameterAnnotations(false);
    }

    public Object[][] getAvailableParameterAnnotations() {
        try {
            return this.getParameterAnnotations(true);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("Unexpected exception", classNotFoundException);
        }
    }

    Object[][] getParameterAnnotations(boolean bl) throws ClassNotFoundException {
        MethodInfo methodInfo = this.getMethodInfo2();
        ParameterAnnotationsAttribute parameterAnnotationsAttribute = (ParameterAnnotationsAttribute)methodInfo.getAttribute("RuntimeInvisibleParameterAnnotations");
        ParameterAnnotationsAttribute parameterAnnotationsAttribute2 = (ParameterAnnotationsAttribute)methodInfo.getAttribute("RuntimeVisibleParameterAnnotations");
        return CtClassType.toAnnotationType(bl, this.getDeclaringClass().getClassPool(), parameterAnnotationsAttribute, parameterAnnotationsAttribute2, methodInfo);
    }

    public CtClass[] getParameterTypes() throws NotFoundException {
        return Descriptor.getParameterTypes(this.methodInfo.getDescriptor(), this.b.getClassPool());
    }

    CtClass getReturnType0() throws NotFoundException {
        return Descriptor.getReturnType(this.methodInfo.getDescriptor(), this.b.getClassPool());
    }

    @Override
    public String getSignature() {
        return this.methodInfo.getDescriptor();
    }

    @Override
    public String getGenericSignature() {
        SignatureAttribute signatureAttribute = (SignatureAttribute)this.methodInfo.getAttribute("Signature");
        return signatureAttribute == null ? null : signatureAttribute.getSignature();
    }

    @Override
    public void setGenericSignature(String string) {
        this.b.checkModify();
        this.methodInfo.addAttribute(new SignatureAttribute(this.methodInfo.getConstPool(), string));
    }

    public CtClass[] getExceptionTypes() throws NotFoundException {
        ExceptionsAttribute exceptionsAttribute = this.methodInfo.getExceptionsAttribute();
        String[] arrstring = exceptionsAttribute == null ? null : exceptionsAttribute.getExceptions();
        return this.b.getClassPool().get(arrstring);
    }

    public void setExceptionTypes(CtClass[] arrctClass) throws NotFoundException {
        this.b.checkModify();
        if (arrctClass == null || arrctClass.length == 0) {
            this.methodInfo.removeExceptionsAttribute();
            return;
        }
        String[] arrstring = new String[arrctClass.length];
        for (int k = 0; k < arrctClass.length; ++k) {
            arrstring[k] = arrctClass[k].getName();
        }
        ExceptionsAttribute exceptionsAttribute = this.methodInfo.getExceptionsAttribute();
        if (exceptionsAttribute == null) {
            exceptionsAttribute = new ExceptionsAttribute(this.methodInfo.getConstPool());
            this.methodInfo.setExceptionsAttribute(exceptionsAttribute);
        }
        exceptionsAttribute.setExceptions(arrstring);
    }

    public abstract boolean isEmpty();

    public void setBody(String string) throws CannotCompileException {
        this.setBody(string, null, null);
    }

    public void setBody(String string, String string2, String string3) throws CannotCompileException {
        CtClass ctClass = this.b;
        ctClass.checkModify();
        try {
            Javac javac = new Javac(ctClass);
            if (string3 != null) {
                javac.recordProceed(string2, string3);
            }
            Bytecode bytecode = javac.compileBody(this, string);
            this.methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
            this.methodInfo.setAccessFlags(this.methodInfo.getAccessFlags() & 0xFFFFFBFF);
            this.methodInfo.rebuildStackMapIf6(ctClass.getClassPool(), ctClass.getClassFile2());
            this.b.rebuildClassFile();
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }

    static void setBody0(CtClass ctClass, MethodInfo methodInfo, CtClass ctClass2, MethodInfo methodInfo2, ClassMap classMap) throws CannotCompileException {
        ctClass2.checkModify();
        classMap = new ClassMap(classMap);
        classMap.put(ctClass.getName(), ctClass2.getName());
        try {
            CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
            if (codeAttribute != null) {
                ConstPool constPool = methodInfo2.getConstPool();
                CodeAttribute codeAttribute2 = (CodeAttribute)codeAttribute.copy(constPool, classMap);
                methodInfo2.setCodeAttribute(codeAttribute2);
            }
        }
        catch (CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
            throw new CannotCompileException(codeAttribute$RuntimeCopyException);
        }
        methodInfo2.setAccessFlags(methodInfo2.getAccessFlags() & 0xFFFFFBFF);
        ctClass2.rebuildClassFile();
    }

    @Override
    public byte[] getAttribute(String string) {
        AttributeInfo attributeInfo = this.methodInfo.getAttribute(string);
        if (attributeInfo == null) {
            return null;
        }
        return attributeInfo.get();
    }

    @Override
    public void setAttribute(String string, byte[] arrby) {
        this.b.checkModify();
        this.methodInfo.addAttribute(new AttributeInfo(this.methodInfo.getConstPool(), string, arrby));
    }

    public void useCflow(String string) throws CannotCompileException {
        CtClass ctClass = this.b;
        ctClass.checkModify();
        ClassPool classPool = ctClass.getClassPool();
        int n6 = 0;
        while (true) {
            String string2 = "_cflow$" + n6++;
            try {
                ctClass.getDeclaredField(string2);
            }
            catch (NotFoundException notFoundException) {
                classPool.recordCflow(string, this.b.getName(), string2);
                try {
                    CtClass ctClass2 = classPool.get("a.Bl");
                    CtField ctField = new CtField(ctClass2, string2, ctClass);
                    ctField.setModifiers(9);
                    ctClass.addField(ctField, CtField$Initializer.byNew(ctClass2));
                    this.insertBefore(string2 + ".enter();", false);
                    String string3 = string2 + ".exit();";
                    this.insertAfter(string3, true);
                }
                catch (NotFoundException notFoundException2) {
                    throw new CannotCompileException(notFoundException2);
                }
                return;
            }
        }
    }

    public void addLocalVariable(String string, CtClass ctClass) throws CannotCompileException {
        this.b.checkModify();
        ConstPool constPool = this.methodInfo.getConstPool();
        CodeAttribute codeAttribute = this.methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            throw new CannotCompileException("no method body");
        }
        LocalVariableAttribute localVariableAttribute = (LocalVariableAttribute)codeAttribute.getAttribute("LocalVariableTable");
        if (localVariableAttribute == null) {
            localVariableAttribute = new LocalVariableAttribute(constPool);
            codeAttribute.getAttributes().add(localVariableAttribute);
        }
        int n6 = codeAttribute.getMaxLocals();
        String string2 = Descriptor.of(ctClass);
        localVariableAttribute.addEntry(0, codeAttribute.getCodeLength(), constPool.addUtf8Info(string), constPool.addUtf8Info(string2), n6);
        codeAttribute.setMaxLocals(n6 + Descriptor.dataSize(string2));
    }

    public void insertParameter(CtClass ctClass) throws CannotCompileException {
        this.b.checkModify();
        String string = this.methodInfo.getDescriptor();
        String string2 = Descriptor.insertParameter(ctClass, string);
        try {
            this.addParameter2(Modifier.isStatic(this.getModifiers()) ? 0 : 1, ctClass, string);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
        this.methodInfo.setDescriptor(string2);
    }

    public void addParameter(CtClass ctClass) throws CannotCompileException {
        this.b.checkModify();
        String string = this.methodInfo.getDescriptor();
        String string2 = Descriptor.appendParameter(ctClass, string);
        int n6 = Modifier.isStatic(this.getModifiers()) ? 0 : 1;
        try {
            this.addParameter2(n6 + Descriptor.paramSize(string), ctClass, string);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
        this.methodInfo.setDescriptor(string2);
    }

    private void addParameter2(int n6, CtClass ctClass, String string) throws BadBytecode {
        CodeAttribute codeAttribute = this.methodInfo.getCodeAttribute();
        if (codeAttribute != null) {
            StackMap stackMap;
            StackMapTable stackMapTable;
            LocalVariableTypeAttribute localVariableTypeAttribute;
            Object object;
            int n10 = 1;
            char c3 = 'L';
            int n11 = 0;
            if (ctClass.isPrimitive()) {
                object = (CtPrimitiveType)ctClass;
                n10 = ((CtPrimitiveType)object).getDataSize();
                c3 = ((CtPrimitiveType)object).getDescriptor();
            } else {
                n11 = this.methodInfo.getConstPool().addClassInfo(ctClass);
            }
            codeAttribute.insertLocalVar(n6, n10);
            object = (LocalVariableAttribute)codeAttribute.getAttribute("LocalVariableTable");
            if (object != null) {
                ((LocalVariableAttribute)object).shiftIndex(n6, n10);
            }
            if ((localVariableTypeAttribute = (LocalVariableTypeAttribute)codeAttribute.getAttribute("LocalVariableTypeTable")) != null) {
                localVariableTypeAttribute.shiftIndex(n6, n10);
            }
            if ((stackMapTable = (StackMapTable)codeAttribute.getAttribute("StackMapTable")) != null) {
                stackMapTable.insertLocal(n6, StackMapTable.typeTagOf(c3), n11);
            }
            if ((stackMap = (StackMap)codeAttribute.getAttribute("StackMap")) != null) {
                stackMap.insertLocal(n6, StackMapTable.typeTagOf(c3), n11);
            }
        }
    }

    public void instrument(CodeConverter codeConverter) throws CannotCompileException {
        this.b.checkModify();
        ConstPool constPool = this.methodInfo.getConstPool();
        codeConverter.doit(this.getDeclaringClass(), this.methodInfo, constPool);
    }

    public void instrument(ExprEditor exprEditor) throws CannotCompileException {
        if (this.b.isFrozen()) {
            this.b.checkModify();
        }
        if (exprEditor.doit(this.b, this.methodInfo)) {
            this.b.checkModify();
        }
    }

    public void insertBefore(String string) throws CannotCompileException {
        this.insertBefore(string, true);
    }

    private void insertBefore(String string, boolean bl) throws CannotCompileException {
        CtClass ctClass = this.b;
        ctClass.checkModify();
        CodeAttribute codeAttribute = this.methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            throw new CannotCompileException("no method body");
        }
        CodeIterator codeIterator = codeAttribute.iterator();
        Javac javac = new Javac(ctClass);
        try {
            int n6 = javac.recordParams(this.getParameterTypes(), Modifier.isStatic(this.getModifiers()));
            javac.recordParamNames(codeAttribute, n6);
            javac.recordLocalVariables(codeAttribute, 0);
            javac.recordReturnType(this.getReturnType0(), false);
            javac.compileStmnt(string);
            Bytecode bytecode = javac.getBytecode();
            int n10 = bytecode.getMaxStack();
            int n11 = bytecode.getMaxLocals();
            if (n10 > codeAttribute.getMaxStack()) {
                codeAttribute.setMaxStack(n10);
            }
            if (n11 > codeAttribute.getMaxLocals()) {
                codeAttribute.setMaxLocals(n11);
            }
            int n12 = codeIterator.insertEx(bytecode.get());
            codeIterator.insert(bytecode.getExceptionTable(), n12);
            if (bl) {
                this.methodInfo.rebuildStackMapIf6(ctClass.getClassPool(), ctClass.getClassFile2());
            }
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }

    public void insertAfter(String string) throws CannotCompileException {
        this.insertAfter(string, false, false);
    }

    public void insertAfter(String string, boolean bl) throws CannotCompileException {
        this.insertAfter(string, bl, false);
    }

    public void insertAfter(String string, boolean bl, boolean bl2) throws CannotCompileException {
        CtClass ctClass = this.b;
        ctClass.checkModify();
        ConstPool constPool = this.methodInfo.getConstPool();
        CodeAttribute codeAttribute = this.methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            throw new CannotCompileException("no method body");
        }
        CodeIterator codeIterator = codeAttribute.iterator();
        int n6 = codeAttribute.getMaxLocals();
        Bytecode bytecode = new Bytecode(constPool, 0, n6 + 1);
        bytecode.setStackDepth(codeAttribute.getMaxStack() + 1);
        Javac javac = new Javac(bytecode, ctClass);
        try {
            int n10;
            int n11 = javac.recordParams(this.getParameterTypes(), Modifier.isStatic(this.getModifiers()));
            javac.recordParamNames(codeAttribute, n11);
            CtClass ctClass2 = this.getReturnType0();
            int n12 = javac.recordReturnType(ctClass2, true);
            javac.recordLocalVariables(codeAttribute, 0);
            int n13 = this.insertAfterHandler(bl, bytecode, ctClass2, n12, javac, string);
            int n14 = codeIterator.getCodeLength();
            if (bl) {
                codeAttribute.getExceptionTable().add(this.getStartPosOfBody(codeAttribute), n14, n14, 0);
            }
            int n15 = 0;
            int n16 = 0;
            boolean bl3 = true;
            while (codeIterator.hasNext() && (n10 = codeIterator.next()) < n14) {
                int n17 = codeIterator.byteAt(n10);
                if (n17 != 176 && n17 != 172 && n17 != 174 && n17 != 173 && n17 != 175 && n17 != 177) continue;
                if (bl2) {
                    int n18;
                    int n19;
                    Javac javac2;
                    Bytecode bytecode2;
                    codeIterator.setMark2(n14);
                    if (bl3) {
                        bl3 = false;
                        bytecode2 = bytecode;
                        javac2 = javac;
                        n19 = n12;
                    } else {
                        bytecode2 = new Bytecode(constPool, 0, n6 + 1);
                        bytecode2.setStackDepth(codeAttribute.getMaxStack() + 1);
                        javac2 = new Javac(bytecode2, ctClass);
                        n18 = javac2.recordParams(this.getParameterTypes(), Modifier.isStatic(this.getModifiers()));
                        javac2.recordParamNames(codeAttribute, n18);
                        n19 = javac2.recordReturnType(ctClass2, true);
                        javac2.recordLocalVariables(codeAttribute, 0);
                    }
                    n18 = this.insertAfterAdvice(bytecode2, javac2, string, constPool, ctClass2, n19);
                    int n20 = codeIterator.append(bytecode2.get());
                    codeIterator.append(bytecode2.getExceptionTable(), n20);
                    int n21 = codeIterator.getCodeLength() - n18;
                    this.insertGoto(codeIterator, n21, n10);
                    n14 = codeIterator.getMark2();
                    continue;
                }
                if (bl3) {
                    n15 = this.insertAfterAdvice(bytecode, javac, string, constPool, ctClass2, n12);
                    n14 = codeIterator.append(bytecode.get());
                    codeIterator.append(bytecode.getExceptionTable(), n14);
                    n16 = codeIterator.getCodeLength() - n15;
                    n13 = n16 - n14;
                    bl3 = false;
                }
                this.insertGoto(codeIterator, n16, n10);
                n16 = codeIterator.getCodeLength() - n15;
                n14 = n16 - n13;
            }
            if (bl3) {
                n14 = codeIterator.append(bytecode.get());
                codeIterator.append(bytecode.getExceptionTable(), n14);
            }
            codeAttribute.setMaxStack(bytecode.getMaxStack());
            codeAttribute.setMaxLocals(bytecode.getMaxLocals());
            this.methodInfo.rebuildStackMapIf6(ctClass.getClassPool(), ctClass.getClassFile2());
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }

    private int insertAfterAdvice(Bytecode bytecode, Javac javac, String string, ConstPool constPool, CtClass ctClass, int n6) throws CompileError {
        int n10 = bytecode.currentPc();
        if (ctClass == CtClass.voidType) {
            bytecode.addOpcode(1);
            bytecode.addAstore(n6);
            javac.compileStmnt(string);
            bytecode.addOpcode(177);
            if (bytecode.getMaxLocals() < 1) {
                bytecode.setMaxLocals(1);
            }
        } else {
            bytecode.addStore(n6, ctClass);
            javac.compileStmnt(string);
            bytecode.addLoad(n6, ctClass);
            if (ctClass.isPrimitive()) {
                bytecode.addOpcode(((CtPrimitiveType)ctClass).getReturnOp());
            } else {
                bytecode.addOpcode(176);
            }
        }
        return bytecode.currentPc() - n10;
    }

    private void insertGoto(CodeIterator codeIterator, int n6, int n10) throws BadBytecode {
        codeIterator.setMark(n6);
        codeIterator.writeByte(0, n10);
        boolean bl = n6 + 2 - n10 > 32767;
        int n11 = bl ? 4 : 2;
        CodeIterator$Gap codeIterator$Gap = codeIterator.insertGapAt(n10, n11, false);
        n10 = codeIterator$Gap.position + codeIterator$Gap.length - n11;
        int n12 = codeIterator.getMark() - n10;
        if (bl) {
            codeIterator.writeByte(200, n10);
            codeIterator.write32bit(n12, n10 + 1);
        } else if (n12 <= 32767) {
            codeIterator.writeByte(167, n10);
            codeIterator.write16bit(n12, n10 + 1);
        } else {
            if (codeIterator$Gap.length < 4) {
                CodeIterator$Gap codeIterator$Gap2 = codeIterator.insertGapAt(codeIterator$Gap.position, 2, false);
                n10 = codeIterator$Gap2.position + codeIterator$Gap2.length + codeIterator$Gap.length - 4;
            }
            codeIterator.writeByte(200, n10);
            codeIterator.write32bit(codeIterator.getMark() - n10, n10 + 1);
        }
    }

    private int insertAfterHandler(boolean bl, Bytecode bytecode, CtClass ctClass, int n6, Javac javac, String string) throws CompileError {
        if (!bl) {
            return 0;
        }
        int n10 = bytecode.getMaxLocals();
        bytecode.incMaxLocals(1);
        int n11 = bytecode.currentPc();
        bytecode.addAstore(n10);
        if (ctClass.isPrimitive()) {
            char c3 = ((CtPrimitiveType)ctClass).getDescriptor();
            if (c3 == 'D') {
                bytecode.addDconst(0.0);
                bytecode.addDstore(n6);
            } else if (c3 == 'F') {
                bytecode.addFconst(0.0f);
                bytecode.addFstore(n6);
            } else if (c3 == 'J') {
                bytecode.addLconst(0L);
                bytecode.addLstore(n6);
            } else if (c3 == 'V') {
                bytecode.addOpcode(1);
                bytecode.addAstore(n6);
            } else {
                bytecode.addIconst(0);
                bytecode.addIstore(n6);
            }
        } else {
            bytecode.addOpcode(1);
            bytecode.addAstore(n6);
        }
        javac.compileStmnt(string);
        bytecode.addAload(n10);
        bytecode.addOpcode(191);
        return bytecode.currentPc() - n11;
    }

    public void addCatch(String string, CtClass ctClass) throws CannotCompileException {
        this.addCatch(string, ctClass, "$e");
    }

    public void addCatch(String string, CtClass ctClass, String string2) throws CannotCompileException {
        CtClass ctClass2 = this.b;
        ctClass2.checkModify();
        ConstPool constPool = this.methodInfo.getConstPool();
        CodeAttribute codeAttribute = this.methodInfo.getCodeAttribute();
        CodeIterator codeIterator = codeAttribute.iterator();
        Bytecode bytecode = new Bytecode(constPool, codeAttribute.getMaxStack(), codeAttribute.getMaxLocals());
        bytecode.setStackDepth(1);
        Javac javac = new Javac(bytecode, ctClass2);
        try {
            javac.recordParams(this.getParameterTypes(), Modifier.isStatic(this.getModifiers()));
            int n6 = javac.recordVariable(ctClass, string2);
            bytecode.addAstore(n6);
            javac.compileStmnt(string);
            int n10 = bytecode.getMaxStack();
            int n11 = bytecode.getMaxLocals();
            if (n10 > codeAttribute.getMaxStack()) {
                codeAttribute.setMaxStack(n10);
            }
            if (n11 > codeAttribute.getMaxLocals()) {
                codeAttribute.setMaxLocals(n11);
            }
            int n12 = codeIterator.getCodeLength();
            int n13 = codeIterator.append(bytecode.get());
            codeAttribute.getExceptionTable().add(this.getStartPosOfBody(codeAttribute), n12, n12, constPool.addClassInfo(ctClass));
            codeIterator.append(bytecode.getExceptionTable(), n13);
            this.methodInfo.rebuildStackMapIf6(ctClass2.getClassPool(), ctClass2.getClassFile2());
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }

    int getStartPosOfBody(CodeAttribute codeAttribute) throws CannotCompileException {
        return 0;
    }

    public int insertAt(int n6, String string) throws CannotCompileException {
        return this.insertAt(n6, true, string);
    }

    public int insertAt(int n6, boolean bl, String string) throws CannotCompileException {
        CodeAttribute codeAttribute = this.methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            throw new CannotCompileException("no method body");
        }
        LineNumberAttribute lineNumberAttribute = (LineNumberAttribute)codeAttribute.getAttribute("LineNumberTable");
        if (lineNumberAttribute == null) {
            throw new CannotCompileException("no line number info");
        }
        LineNumberAttribute$Pc lineNumberAttribute$Pc = lineNumberAttribute.toNearPc(n6);
        n6 = lineNumberAttribute$Pc.line;
        int n10 = lineNumberAttribute$Pc.index;
        if (!bl) {
            return n6;
        }
        CtClass ctClass = this.b;
        ctClass.checkModify();
        CodeIterator codeIterator = codeAttribute.iterator();
        Javac javac = new Javac(ctClass);
        try {
            javac.recordLocalVariables(codeAttribute, n10);
            javac.recordParams(this.getParameterTypes(), Modifier.isStatic(this.getModifiers()));
            javac.setMaxLocals(codeAttribute.getMaxLocals());
            javac.compileStmnt(string);
            Bytecode bytecode = javac.getBytecode();
            int n11 = bytecode.getMaxLocals();
            int n12 = bytecode.getMaxStack();
            codeAttribute.setMaxLocals(n11);
            if (n12 > codeAttribute.getMaxStack()) {
                codeAttribute.setMaxStack(n12);
            }
            n10 = codeIterator.insertAt(n10, bytecode.get());
            codeIterator.insert(bytecode.getExceptionTable(), n10);
            this.methodInfo.rebuildStackMapIf6(ctClass.getClassPool(), ctClass.getClassFile2());
            return n6;
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }
}

