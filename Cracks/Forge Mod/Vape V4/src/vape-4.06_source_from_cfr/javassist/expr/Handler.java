/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CannotCompileException;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.MethodInfo;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.expr.Expr;

public class Handler
extends Expr {
    private static String EXCEPTION_NAME = "$1";
    private ExceptionTable etable;
    private int index;

    protected Handler(ExceptionTable exceptionTable, int n6, CodeIterator codeIterator, CtClass ctClass, MethodInfo methodInfo) {
        super(exceptionTable.handlerPc(n6), codeIterator, ctClass, methodInfo);
        this.etable = exceptionTable;
        this.index = n6;
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

    @Override
    public CtClass[] mayThrow() {
        return super.mayThrow();
    }

    public CtClass getType() throws NotFoundException {
        int n6 = this.etable.catchType(this.index);
        if (n6 == 0) {
            return null;
        }
        ConstPool constPool = this.getConstPool();
        String string = constPool.getClassInfo(n6);
        return this.thisClass.getClassPool().getCtClass(string);
    }

    public boolean isFinally() {
        return this.etable.catchType(this.index) == 0;
    }

    @Override
    public void replace(String string) throws CannotCompileException {
        throw new RuntimeException("not implemented yet");
    }

    public void insertBefore(String string) throws CannotCompileException {
        this.edited = true;
        ConstPool constPool = this.getConstPool();
        CodeAttribute codeAttribute = this.iterator.get();
        Javac javac = new Javac(this.thisClass);
        Bytecode bytecode = javac.getBytecode();
        bytecode.setStackDepth(1);
        bytecode.setMaxLocals(codeAttribute.getMaxLocals());
        try {
            CtClass ctClass = this.getType();
            int n6 = javac.recordVariable(ctClass, EXCEPTION_NAME);
            javac.recordReturnType(ctClass, false);
            bytecode.addAstore(n6);
            javac.compileStmnt(string);
            bytecode.addAload(n6);
            int n10 = this.etable.handlerPc(this.index);
            bytecode.addOpcode(167);
            bytecode.addIndex(n10 - this.iterator.getCodeLength() - bytecode.currentPc() + 1);
            this.maxStack = bytecode.getMaxStack();
            this.maxLocals = bytecode.getMaxLocals();
            int n11 = this.iterator.append(bytecode.get());
            this.iterator.append(bytecode.getExceptionTable(), n11);
            this.etable.setHandlerPc(this.index, n11);
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
    }
}

