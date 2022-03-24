/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import java.util.HashMap;
import java.util.Map;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.ExceptionsAttribute;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.SyntheticAttribute;
import javassist.compiler.CompileError;

public class AccessorMaker {
    private CtClass clazz;
    private int uniqueNumber;
    private Map<String, Object> accessors;
    static final String a = "a.nI";

    public AccessorMaker(CtClass ctClass) {
        this.clazz = ctClass;
        this.uniqueNumber = 1;
        this.accessors = new HashMap<String, Object>();
    }

    public String getConstructor(CtClass ctClass, String string, MethodInfo methodInfo) throws CompileError {
        String string2 = "<init>:" + string;
        String string3 = (String)this.accessors.get(string2);
        if (string3 != null) {
            return string3;
        }
        string3 = Descriptor.appendParameter(a, string);
        ClassFile classFile = this.clazz.getClassFile();
        try {
            ConstPool constPool = classFile.getConstPool();
            ClassPool classPool = this.clazz.getClassPool();
            MethodInfo methodInfo2 = new MethodInfo(constPool, "<init>", string3);
            methodInfo2.setAccessFlags(0);
            methodInfo2.addAttribute(new SyntheticAttribute(constPool));
            ExceptionsAttribute exceptionsAttribute = methodInfo.getExceptionsAttribute();
            if (exceptionsAttribute != null) {
                methodInfo2.addAttribute(exceptionsAttribute.copy(constPool, null));
            }
            CtClass[] arrctClass = Descriptor.getParameterTypes(string, classPool);
            Bytecode bytecode = new Bytecode(constPool);
            bytecode.addAload(0);
            int n6 = 1;
            for (int k = 0; k < arrctClass.length; ++k) {
                n6 += bytecode.addLoad(n6, arrctClass[k]);
            }
            bytecode.setMaxLocals(n6 + 1);
            bytecode.addInvokespecial(this.clazz, "<init>", string);
            bytecode.addReturn(null);
            methodInfo2.setCodeAttribute(bytecode.toCodeAttribute());
            classFile.addMethod(methodInfo2);
        }
        catch (CannotCompileException cannotCompileException) {
            throw new CompileError(cannotCompileException);
        }
        catch (NotFoundException notFoundException) {
            throw new CompileError(notFoundException);
        }
        this.accessors.put(string2, string3);
        return string3;
    }

    public String getMethodAccessor(String string, String string2, String string3, MethodInfo methodInfo) throws CompileError {
        String string4 = string + ":" + string2;
        String string5 = (String)this.accessors.get(string4);
        if (string5 != null) {
            return string5;
        }
        ClassFile classFile = this.clazz.getClassFile();
        string5 = this.findAccessorName(classFile);
        try {
            ConstPool constPool = classFile.getConstPool();
            ClassPool classPool = this.clazz.getClassPool();
            MethodInfo methodInfo2 = new MethodInfo(constPool, string5, string3);
            methodInfo2.setAccessFlags(8);
            methodInfo2.addAttribute(new SyntheticAttribute(constPool));
            ExceptionsAttribute exceptionsAttribute = methodInfo.getExceptionsAttribute();
            if (exceptionsAttribute != null) {
                methodInfo2.addAttribute(exceptionsAttribute.copy(constPool, null));
            }
            CtClass[] arrctClass = Descriptor.getParameterTypes(string3, classPool);
            int n6 = 0;
            Bytecode bytecode = new Bytecode(constPool);
            for (int k = 0; k < arrctClass.length; ++k) {
                n6 += bytecode.addLoad(n6, arrctClass[k]);
            }
            bytecode.setMaxLocals(n6);
            if (string2 == string3) {
                bytecode.addInvokestatic(this.clazz, string, string2);
            } else {
                bytecode.addInvokevirtual(this.clazz, string, string2);
            }
            bytecode.addReturn(Descriptor.getReturnType(string2, classPool));
            methodInfo2.setCodeAttribute(bytecode.toCodeAttribute());
            classFile.addMethod(methodInfo2);
        }
        catch (CannotCompileException cannotCompileException) {
            throw new CompileError(cannotCompileException);
        }
        catch (NotFoundException notFoundException) {
            throw new CompileError(notFoundException);
        }
        this.accessors.put(string4, string5);
        return string5;
    }

    public MethodInfo getFieldGetter(FieldInfo fieldInfo, boolean bl) throws CompileError {
        String string = fieldInfo.getName();
        String string2 = string + ":getter";
        Object object = this.accessors.get(string2);
        if (object != null) {
            return (MethodInfo)object;
        }
        ClassFile classFile = this.clazz.getClassFile();
        String string3 = this.findAccessorName(classFile);
        try {
            ConstPool constPool = classFile.getConstPool();
            ClassPool classPool = this.clazz.getClassPool();
            String string4 = fieldInfo.getDescriptor();
            String string5 = bl ? "()" + string4 : "(" + Descriptor.of(this.clazz) + ")" + string4;
            MethodInfo methodInfo = new MethodInfo(constPool, string3, string5);
            methodInfo.setAccessFlags(8);
            methodInfo.addAttribute(new SyntheticAttribute(constPool));
            Bytecode bytecode = new Bytecode(constPool);
            if (bl) {
                bytecode.addGetstatic(Bytecode.THIS, string, string4);
            } else {
                bytecode.addAload(0);
                bytecode.addGetfield(Bytecode.THIS, string, string4);
                bytecode.setMaxLocals(1);
            }
            bytecode.addReturn(Descriptor.toCtClass(string4, classPool));
            methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
            classFile.addMethod(methodInfo);
            this.accessors.put(string2, methodInfo);
            return methodInfo;
        }
        catch (CannotCompileException cannotCompileException) {
            throw new CompileError(cannotCompileException);
        }
        catch (NotFoundException notFoundException) {
            throw new CompileError(notFoundException);
        }
    }

    public MethodInfo getFieldSetter(FieldInfo fieldInfo, boolean bl) throws CompileError {
        String string = fieldInfo.getName();
        String string2 = string + ":setter";
        Object object = this.accessors.get(string2);
        if (object != null) {
            return (MethodInfo)object;
        }
        ClassFile classFile = this.clazz.getClassFile();
        String string3 = this.findAccessorName(classFile);
        try {
            int n6;
            ConstPool constPool = classFile.getConstPool();
            ClassPool classPool = this.clazz.getClassPool();
            String string4 = fieldInfo.getDescriptor();
            String string5 = bl ? "(" + string4 + ")V" : "(" + Descriptor.of(this.clazz) + string4 + ")V";
            MethodInfo methodInfo = new MethodInfo(constPool, string3, string5);
            methodInfo.setAccessFlags(8);
            methodInfo.addAttribute(new SyntheticAttribute(constPool));
            Bytecode bytecode = new Bytecode(constPool);
            if (bl) {
                n6 = bytecode.addLoad(0, Descriptor.toCtClass(string4, classPool));
                bytecode.addPutstatic(Bytecode.THIS, string, string4);
            } else {
                bytecode.addAload(0);
                n6 = bytecode.addLoad(1, Descriptor.toCtClass(string4, classPool)) + 1;
                bytecode.addPutfield(Bytecode.THIS, string, string4);
            }
            bytecode.addReturn(null);
            bytecode.setMaxLocals(n6);
            methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
            classFile.addMethod(methodInfo);
            this.accessors.put(string2, methodInfo);
            return methodInfo;
        }
        catch (CannotCompileException cannotCompileException) {
            throw new CompileError(cannotCompileException);
        }
        catch (NotFoundException notFoundException) {
            throw new CompileError(notFoundException);
        }
    }

    private String findAccessorName(ClassFile classFile) {
        String string;
        while (classFile.getMethod(string = "access$" + this.uniqueNumber++) != null) {
        }
        return string;
    }
}

