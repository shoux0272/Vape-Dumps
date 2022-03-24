/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.ClassMap;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtMethod$ConstParameter;
import javassist.CtNewMethod;
import javassist.CtNewWrappedMethod;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.MethodInfo;

public final class CtMethod
extends CtBehavior {
    protected String cachedStringRep = null;

    CtMethod(MethodInfo methodInfo, CtClass ctClass) {
        super(ctClass, methodInfo);
    }

    public CtMethod(CtClass ctClass, String string, CtClass[] arrctClass, CtClass ctClass2) {
        this(null, ctClass2);
        ConstPool constPool = ctClass2.getClassFile2().getConstPool();
        String string2 = Descriptor.ofMethod(ctClass, arrctClass);
        this.methodInfo = new MethodInfo(constPool, string, string2);
        this.setModifiers(1025);
    }

    public CtMethod(CtMethod ctMethod, CtClass ctClass, ClassMap classMap) throws CannotCompileException {
        this(null, ctClass);
        this.copy(ctMethod, false, classMap);
    }

    public static CtMethod make(String string, CtClass ctClass) throws CannotCompileException {
        return CtNewMethod.make(string, ctClass);
    }

    public static CtMethod make(MethodInfo methodInfo, CtClass ctClass) throws CannotCompileException {
        if (ctClass.getClassFile2().getConstPool() != methodInfo.getConstPool()) {
            throw new CannotCompileException("bad declaring class");
        }
        return new CtMethod(methodInfo, ctClass);
    }

    public int hashCode() {
        return this.getStringRep().hashCode();
    }

    @Override
    void nameReplaced() {
        this.cachedStringRep = null;
    }

    final String getStringRep() {
        if (this.cachedStringRep == null) {
            this.cachedStringRep = this.methodInfo.getName() + Descriptor.getParamDescriptor(this.methodInfo.getDescriptor());
        }
        return this.cachedStringRep;
    }

    public boolean equals(Object object) {
        return object != null && object instanceof CtMethod && ((CtMethod)object).getStringRep().equals(this.getStringRep());
    }

    @Override
    public String getLongName() {
        return this.getDeclaringClass().getName() + "." + this.getName() + Descriptor.toString(this.getSignature());
    }

    @Override
    public String getName() {
        return this.methodInfo.getName();
    }

    public void setName(String string) {
        this.b.checkModify();
        this.methodInfo.setName(string);
    }

    public CtClass getReturnType() throws NotFoundException {
        return this.getReturnType0();
    }

    @Override
    public boolean isEmpty() {
        CodeAttribute codeAttribute = this.getMethodInfo2().getCodeAttribute();
        if (codeAttribute == null) {
            return (this.getModifiers() & 0x400) != 0;
        }
        CodeIterator codeIterator = codeAttribute.iterator();
        try {
            return codeIterator.hasNext() && codeIterator.byteAt(codeIterator.next()) == 177 && !codeIterator.hasNext();
        }
        catch (BadBytecode badBytecode) {
            return false;
        }
    }

    public void setBody(CtMethod ctMethod, ClassMap classMap) throws CannotCompileException {
        CtMethod.setBody0(ctMethod.b, ctMethod.methodInfo, this.b, this.methodInfo, classMap);
    }

    public void setWrappedBody(CtMethod ctMethod, CtMethod$ConstParameter ctMethod$ConstParameter) throws CannotCompileException {
        CtClass ctClass;
        CtClass[] arrctClass;
        this.b.checkModify();
        CtClass ctClass2 = this.getDeclaringClass();
        try {
            arrctClass = this.getParameterTypes();
            ctClass = this.getReturnType();
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        Bytecode bytecode = CtNewWrappedMethod.makeBody(ctClass2, ctClass2.getClassFile2(), ctMethod, arrctClass, ctClass, ctMethod$ConstParameter);
        CodeAttribute codeAttribute = bytecode.toCodeAttribute();
        this.methodInfo.setCodeAttribute(codeAttribute);
        this.methodInfo.setAccessFlags(this.methodInfo.getAccessFlags() & 0xFFFFFBFF);
    }
}

