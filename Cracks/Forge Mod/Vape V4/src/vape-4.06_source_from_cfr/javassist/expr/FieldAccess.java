/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CannotCompileException;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtField;
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
import javassist.expr.FieldAccess$ProceedForRead;
import javassist.expr.FieldAccess$ProceedForWrite;

public class FieldAccess
extends Expr {
    int opcode;

    protected FieldAccess(int n6, CodeIterator codeIterator, CtClass ctClass, MethodInfo methodInfo, int n10) {
        super(n6, codeIterator, ctClass, methodInfo);
        this.opcode = n10;
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

    public boolean isStatic() {
        return FieldAccess.isStatic(this.opcode);
    }

    static boolean isStatic(int n6) {
        return n6 == 178 || n6 == 179;
    }

    public boolean isReader() {
        return this.opcode == 180 || this.opcode == 178;
    }

    public boolean isWriter() {
        return this.opcode == 181 || this.opcode == 179;
    }

    private CtClass getCtClass() throws NotFoundException {
        return this.thisClass.getClassPool().get(this.getClassName());
    }

    public String getClassName() {
        int n6 = this.iterator.u16bitAt(this.currentPos + 1);
        return this.getConstPool().getFieldrefClassName(n6);
    }

    public String s() {
        int n6 = this.iterator.u16bitAt(this.currentPos + 1);
        return this.getConstPool().getFieldrefName(n6);
    }

    public CtField getField() throws NotFoundException {
        CtClass ctClass = this.getCtClass();
        int n6 = this.iterator.u16bitAt(this.currentPos + 1);
        ConstPool constPool = this.getConstPool();
        return ctClass.getField(constPool.getFieldrefName(n6), constPool.getFieldrefType(n6));
    }

    @Override
    public CtClass[] mayThrow() {
        return super.mayThrow();
    }

    public String u() {
        int n6 = this.iterator.u16bitAt(this.currentPos + 1);
        return this.getConstPool().getFieldrefType(n6);
    }

    @Override
    public void replace(String string) throws CannotCompileException {
        this.thisClass.getClassFile();
        ConstPool constPool = this.getConstPool();
        int n6 = this.currentPos;
        int n10 = this.iterator.u16bitAt(n6 + 1);
        Javac javac = new Javac(this.thisClass);
        CodeAttribute codeAttribute = this.iterator.get();
        try {
            CtClass ctClass;
            CtClass[] arrctClass;
            CtClass ctClass2 = Descriptor.toCtClass(constPool.getFieldrefType(n10), this.thisClass.getClassPool());
            boolean bl = this.isReader();
            if (bl) {
                arrctClass = new CtClass[]{};
                ctClass = ctClass2;
            } else {
                arrctClass = new CtClass[]{ctClass2};
                ctClass = CtClass.voidType;
            }
            int n11 = codeAttribute.getMaxLocals();
            javac.recordParams(constPool.getFieldrefClassName(n10), arrctClass, true, n11, this.withinStatic());
            boolean bl2 = FieldAccess.checkResultValue(ctClass, string);
            if (bl) {
                bl2 = true;
            }
            int n12 = javac.recordReturnType(ctClass, bl2);
            if (bl) {
                javac.recordProceed(new FieldAccess$ProceedForRead(ctClass, this.opcode, n10, n11));
            } else {
                javac.recordType(ctClass2);
                javac.recordProceed(new FieldAccess$ProceedForWrite(arrctClass[0], this.opcode, n10, n11));
            }
            Bytecode bytecode = javac.getBytecode();
            FieldAccess.storeStack(arrctClass, this.isStatic(), n11, bytecode);
            javac.recordLocalVariables(codeAttribute, n6);
            if (bl2) {
                if (ctClass == CtClass.voidType) {
                    bytecode.addOpcode(1);
                    bytecode.addAstore(n12);
                } else {
                    bytecode.addConstZero(ctClass);
                    bytecode.addStore(n12, ctClass);
                }
            }
            javac.compileStmnt(string);
            if (bl) {
                bytecode.addLoad(n12, ctClass);
            }
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

