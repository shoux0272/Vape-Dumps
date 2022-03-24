/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.ClassMap;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.Descriptor$Iterator;
import javassist.bytecode.MethodInfo;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;

public final class CtConstructor
extends CtBehavior {
    protected CtConstructor(MethodInfo methodInfo, CtClass ctClass) {
        super(ctClass, methodInfo);
    }

    public CtConstructor(CtClass[] arrctClass, CtClass ctClass) {
        this((MethodInfo)null, ctClass);
        ConstPool constPool = ctClass.getClassFile2().getConstPool();
        String string = Descriptor.ofConstructor(arrctClass);
        this.methodInfo = new MethodInfo(constPool, "<init>", string);
        this.setModifiers(1);
    }

    public CtConstructor(CtConstructor ctConstructor, CtClass ctClass, ClassMap classMap) throws CannotCompileException {
        this((MethodInfo)null, ctClass);
        this.copy(ctConstructor, true, classMap);
    }

    public boolean isConstructor() {
        return this.methodInfo.isConstructor();
    }

    public boolean isClassInitializer() {
        return this.methodInfo.isStaticInitializer();
    }

    @Override
    public String getLongName() {
        return this.getDeclaringClass().getName() + (this.isConstructor() ? Descriptor.toString(this.getSignature()) : ".<clinit>()");
    }

    @Override
    public String getName() {
        if (this.methodInfo.isStaticInitializer()) {
            return "<clinit>";
        }
        return this.b.getSimpleName();
    }

    @Override
    public boolean isEmpty() {
        CodeAttribute codeAttribute = this.getMethodInfo2().getCodeAttribute();
        if (codeAttribute == null) {
            return false;
        }
        ConstPool constPool = codeAttribute.getConstPool();
        CodeIterator codeIterator = codeAttribute.iterator();
        try {
            int n6;
            int n10;
            int n11 = codeIterator.byteAt(codeIterator.next());
            return n11 == 177 || n11 == 42 && codeIterator.byteAt(n10 = codeIterator.next()) == 183 && (n6 = constPool.isConstructor(this.getSuperclassName(), codeIterator.u16bitAt(n10 + 1))) != 0 && "()V".equals(constPool.getUtf8Info(n6)) && codeIterator.byteAt(codeIterator.next()) == 177 && !codeIterator.hasNext();
        }
        catch (BadBytecode badBytecode) {
            return false;
        }
    }

    private String getSuperclassName() {
        ClassFile classFile = this.b.getClassFile2();
        return classFile.getSuperclass();
    }

    public boolean callsSuper() throws CannotCompileException {
        CodeAttribute codeAttribute = this.methodInfo.getCodeAttribute();
        if (codeAttribute != null) {
            CodeIterator codeIterator = codeAttribute.iterator();
            try {
                int n6 = codeIterator.skipSuperConstructor();
                return n6 >= 0;
            }
            catch (BadBytecode badBytecode) {
                throw new CannotCompileException(badBytecode);
            }
        }
        return false;
    }

    @Override
    public void setBody(String string) throws CannotCompileException {
        if (string == null) {
            string = this.isClassInitializer() ? ";" : "super();";
        }
        super.setBody(string);
    }

    public void setBody(CtConstructor ctConstructor, ClassMap classMap) throws CannotCompileException {
        CtConstructor.setBody0(ctConstructor.b, ctConstructor.methodInfo, this.b, this.methodInfo, classMap);
    }

    public void insertBeforeBody(String string) throws CannotCompileException {
        CtClass ctClass = this.b;
        ctClass.checkModify();
        if (this.isClassInitializer()) {
            throw new CannotCompileException("class initializer");
        }
        CodeAttribute codeAttribute = this.methodInfo.getCodeAttribute();
        CodeIterator codeIterator = codeAttribute.iterator();
        Bytecode bytecode = new Bytecode(this.methodInfo.getConstPool(), codeAttribute.getMaxStack(), codeAttribute.getMaxLocals());
        bytecode.setStackDepth(codeAttribute.getMaxStack());
        Javac javac = new Javac(bytecode, ctClass);
        try {
            javac.recordParams(this.getParameterTypes(), false);
            javac.compileStmnt(string);
            codeAttribute.setMaxStack(bytecode.getMaxStack());
            codeAttribute.setMaxLocals(bytecode.getMaxLocals());
            codeIterator.skipConstructor();
            int n6 = codeIterator.insertEx(bytecode.get());
            codeIterator.insert(bytecode.getExceptionTable(), n6);
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

    @Override
    int getStartPosOfBody(CodeAttribute codeAttribute) throws CannotCompileException {
        CodeIterator codeIterator = codeAttribute.iterator();
        try {
            codeIterator.skipConstructor();
            return codeIterator.next();
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }

    public CtMethod toMethod(String string, CtClass ctClass) throws CannotCompileException {
        return this.toMethod(string, ctClass, null);
    }

    public CtMethod toMethod(String string, CtClass ctClass, ClassMap classMap) throws CannotCompileException {
        MethodInfo methodInfo;
        CodeAttribute codeAttribute;
        CtMethod ctMethod = new CtMethod(null, ctClass);
        ctMethod.copy(this, false, classMap);
        if (this.isConstructor() && (codeAttribute = (methodInfo = ctMethod.getMethodInfo2()).getCodeAttribute()) != null) {
            CtConstructor.removeConsCall(codeAttribute);
            try {
                this.methodInfo.rebuildStackMapIf6(ctClass.getClassPool(), ctClass.getClassFile2());
            }
            catch (BadBytecode badBytecode) {
                throw new CannotCompileException(badBytecode);
            }
        }
        ctMethod.setName(string);
        return ctMethod;
    }

    private static void removeConsCall(CodeAttribute codeAttribute) throws CannotCompileException {
        CodeIterator codeIterator = codeAttribute.iterator();
        try {
            int n6 = codeIterator.skipConstructor();
            if (n6 >= 0) {
                int n10 = codeIterator.u16bitAt(n6 + 1);
                String string = codeAttribute.getConstPool().getMethodrefType(n10);
                int n11 = Descriptor.numOfParameters(string) + 1;
                if (n11 > 3) {
                    n6 = codeIterator.insertGapAt((int)n6, (int)(n11 - 3), (boolean)false).position;
                }
                codeIterator.writeByte(87, n6++);
                codeIterator.writeByte(0, n6);
                codeIterator.writeByte(0, n6 + 1);
                Descriptor$Iterator descriptor$Iterator = new Descriptor$Iterator(string);
                while (true) {
                    descriptor$Iterator.next();
                    if (descriptor$Iterator.isParameter()) {
                        codeIterator.writeByte(descriptor$Iterator.is2byte() ? 88 : 87, n6++);
                        continue;
                    }
                    break;
                }
            }
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }
}

