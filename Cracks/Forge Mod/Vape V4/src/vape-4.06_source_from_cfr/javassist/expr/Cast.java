/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MethodInfo;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.expr.Cast$ProceedForCast;
import javassist.expr.Expr;

public class Cast
extends Expr {
    protected Cast(int n6, CodeIterator codeIterator, CtClass ctClass, MethodInfo methodInfo) {
        super(n6, codeIterator, ctClass, methodInfo);
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

    public CtClass getType() throws NotFoundException {
        ConstPool constPool = this.getConstPool();
        int n6 = this.currentPos;
        int n10 = this.iterator.u16bitAt(n6 + 1);
        String string = constPool.getClassInfo(n10);
        return this.thisClass.getClassPool().getCtClass(string);
    }

    @Override
    public CtClass[] mayThrow() {
        return super.mayThrow();
    }

    @Override
    public void replace(String string) throws CannotCompileException {
        this.thisClass.getClassFile();
        ConstPool constPool = this.getConstPool();
        int n6 = this.currentPos;
        int n10 = this.iterator.u16bitAt(n6 + 1);
        Javac javac = new Javac(this.thisClass);
        ClassPool classPool = this.thisClass.getClassPool();
        CodeAttribute codeAttribute = this.iterator.get();
        try {
            CtClass[] arrctClass = new CtClass[]{classPool.get("java.lang.Object")};
            CtClass ctClass = this.getType();
            int n11 = codeAttribute.getMaxLocals();
            javac.recordParams("java.lang.Object", arrctClass, true, n11, this.withinStatic());
            int n12 = javac.recordReturnType(ctClass, true);
            javac.recordProceed(new Cast$ProceedForCast(n10, ctClass));
            Cast.checkResultValue(ctClass, string);
            Bytecode bytecode = javac.getBytecode();
            Cast.storeStack(arrctClass, true, n11, bytecode);
            javac.recordLocalVariables(codeAttribute, n6);
            bytecode.addConstZero(ctClass);
            bytecode.addStore(n12, ctClass);
            javac.compileStmnt(string);
            bytecode.addLoad(n12, ctClass);
            this.replace0(n6, bytecode, 3);
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

