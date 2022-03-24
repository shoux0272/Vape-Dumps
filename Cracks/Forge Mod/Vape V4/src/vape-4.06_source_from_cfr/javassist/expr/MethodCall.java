/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.MethodInfo;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.expr.Expr;

public class MethodCall
extends Expr {
    protected MethodCall(int n6, CodeIterator codeIterator, CtClass ctClass, MethodInfo methodInfo) {
        super(n6, codeIterator, ctClass, methodInfo);
    }

    private int getNameAndType(ConstPool constPool) {
        int n6 = this.currentPos;
        int n10 = this.iterator.byteAt(n6);
        int n11 = this.iterator.u16bitAt(n6 + 1);
        if (n10 == 185) {
            return constPool.getInterfaceMethodrefNameAndType(n11);
        }
        return constPool.getMethodrefNameAndType(n11);
    }

    @Override
    public CtBehavior where() {
        return super.where();
    }

    @Override
    public int getLineNumber() {
        return super.getLineNumber();
    }

    @Override
    public String getFileName() {
        return super.getFileName();
    }

    protected CtClass getCtClass() throws NotFoundException {
        return this.thisClass.getClassPool().get(this.getClassName());
    }

    public String getClassName() {
        ConstPool constPool = this.getConstPool();
        int n6 = this.currentPos;
        int n10 = this.iterator.byteAt(n6);
        int n11 = this.iterator.u16bitAt(n6 + 1);
        String string = n10 == 185 ? constPool.getInterfaceMethodrefClassName(n11) : constPool.getMethodrefClassName(n11);
        if (string.charAt(0) == '[') {
            string = Descriptor.toClassName(string);
        }
        return string;
    }

    public String getMethodName() {
        ConstPool constPool = this.getConstPool();
        int n6 = this.getNameAndType(constPool);
        return constPool.getUtf8Info(constPool.getNameAndTypeName(n6));
    }

    public CtMethod getMethod() throws NotFoundException {
        return this.getCtClass().getMethod(this.getMethodName(), this.getSignature());
    }

    public String getSignature() {
        ConstPool constPool = this.getConstPool();
        int n6 = this.getNameAndType(constPool);
        return constPool.getUtf8Info(constPool.getNameAndTypeDescriptor(n6));
    }

    @Override
    public CtClass[] mayThrow() {
        return super.mayThrow();
    }

    public boolean isSuper() {
        return this.iterator.byteAt(this.currentPos) == 183 && !this.where().getDeclaringClass().getName().equals(this.getClassName());
    }

    @Override
    public void replace(String string) throws CannotCompileException {
        String string2;
        String string3;
        String string4;
        int n6;
        this.thisClass.getClassFile();
        ConstPool constPool = this.getConstPool();
        int n10 = this.currentPos;
        int n11 = this.iterator.u16bitAt(n10 + 1);
        int n12 = this.iterator.byteAt(n10);
        if (n12 == 185) {
            n6 = 5;
            string4 = constPool.getInterfaceMethodrefClassName(n11);
            string3 = constPool.getInterfaceMethodrefName(n11);
            string2 = constPool.getInterfaceMethodrefType(n11);
        } else if (n12 == 184 || n12 == 183 || n12 == 182) {
            n6 = 3;
            string4 = constPool.getMethodrefClassName(n11);
            string3 = constPool.getMethodrefName(n11);
            string2 = constPool.getMethodrefType(n11);
        } else {
            throw new CannotCompileException("not method invocation");
        }
        Javac javac = new Javac(this.thisClass);
        ClassPool classPool = this.thisClass.getClassPool();
        CodeAttribute codeAttribute = this.iterator.get();
        try {
            CtClass[] arrctClass = Descriptor.getParameterTypes(string2, classPool);
            CtClass ctClass = Descriptor.getReturnType(string2, classPool);
            int n13 = codeAttribute.getMaxLocals();
            javac.recordParams(string4, arrctClass, true, n13, this.withinStatic());
            int n14 = javac.recordReturnType(ctClass, true);
            if (n12 == 184) {
                javac.recordStaticProceed(string4, string3);
            } else if (n12 == 183) {
                javac.recordSpecialProceed("$0", string4, string3, string2, n11);
            } else {
                javac.recordProceed("$0", string3);
            }
            MethodCall.checkResultValue(ctClass, string);
            Bytecode bytecode = javac.getBytecode();
            MethodCall.storeStack(arrctClass, n12 == 184, n13, bytecode);
            javac.recordLocalVariables(codeAttribute, n10);
            if (ctClass != CtClass.voidType) {
                bytecode.addConstZero(ctClass);
                bytecode.addStore(n14, ctClass);
            }
            javac.compileStmnt(string);
            if (ctClass != CtClass.voidType) {
                bytecode.addLoad(n14, ctClass);
            }
            this.replace0(n10, bytecode, n6);
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException("broken method");
        }
    }
}

