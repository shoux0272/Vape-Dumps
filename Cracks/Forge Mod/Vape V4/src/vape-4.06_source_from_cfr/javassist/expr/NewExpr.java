/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
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
import javassist.expr.NewExpr$ProceedForNew;

public class NewExpr
extends Expr {
    String newTypeName;
    int newPos;

    protected NewExpr(int n6, CodeIterator codeIterator, CtClass ctClass, MethodInfo methodInfo, String string, int n10) {
        super(n6, codeIterator, ctClass, methodInfo);
        this.newTypeName = string;
        this.newPos = n10;
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

    private CtClass getCtClass() throws NotFoundException {
        return this.thisClass.getClassPool().get(this.newTypeName);
    }

    public String getClassName() {
        return this.newTypeName;
    }

    public String getSignature() {
        ConstPool constPool = this.getConstPool();
        int n6 = this.iterator.u16bitAt(this.currentPos + 1);
        return constPool.getMethodrefType(n6);
    }

    public CtConstructor getConstructor() throws NotFoundException {
        ConstPool constPool = this.getConstPool();
        int n6 = this.iterator.u16bitAt(this.currentPos + 1);
        String string = constPool.getMethodrefType(n6);
        return this.getCtClass().getConstructor(string);
    }

    @Override
    public CtClass[] mayThrow() {
        return super.mayThrow();
    }

    private int canReplace() throws CannotCompileException {
        int n6 = this.iterator.byteAt(this.newPos + 3);
        if (n6 == 89) {
            return this.iterator.byteAt(this.newPos + 4) == 94 && this.iterator.byteAt(this.newPos + 5) == 88 ? 6 : 4;
        }
        if (n6 == 90 && this.iterator.byteAt(this.newPos + 4) == 95) {
            return 5;
        }
        return 3;
    }

    @Override
    public void replace(String string) throws CannotCompileException {
        this.thisClass.getClassFile();
        int n6 = 3;
        int n10 = this.newPos;
        int n11 = this.iterator.u16bitAt(n10 + 1);
        int n12 = this.canReplace();
        int n13 = n10 + n12;
        for (int k = n10; k < n13; ++k) {
            this.iterator.writeByte(0, k);
        }
        ConstPool constPool = this.getConstPool();
        n10 = this.currentPos;
        int n14 = this.iterator.u16bitAt(n10 + 1);
        String string2 = constPool.getMethodrefType(n14);
        Javac javac = new Javac(this.thisClass);
        ClassPool classPool = this.thisClass.getClassPool();
        CodeAttribute codeAttribute = this.iterator.get();
        try {
            CtClass[] arrctClass = Descriptor.getParameterTypes(string2, classPool);
            CtClass ctClass = classPool.get(this.newTypeName);
            int n15 = codeAttribute.getMaxLocals();
            javac.recordParams(this.newTypeName, arrctClass, true, n15, this.withinStatic());
            int n16 = javac.recordReturnType(ctClass, true);
            javac.recordProceed(new NewExpr$ProceedForNew(ctClass, n11, n14));
            NewExpr.checkResultValue(ctClass, string);
            Bytecode bytecode = javac.getBytecode();
            NewExpr.storeStack(arrctClass, true, n15, bytecode);
            javac.recordLocalVariables(codeAttribute, n10);
            bytecode.addConstZero(ctClass);
            bytecode.addStore(n16, ctClass);
            javac.compileStmnt(string);
            if (n12 > 3) {
                bytecode.addAload(n16);
            }
            this.replace0(n10, bytecode, 3);
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

