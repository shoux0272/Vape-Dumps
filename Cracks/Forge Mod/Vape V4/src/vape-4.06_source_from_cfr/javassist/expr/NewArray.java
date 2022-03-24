/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CannotCompileException;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtPrimitiveType;
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
import javassist.expr.NewArray$ProceedForArray;

public class NewArray
extends Expr {
    int opcode;

    protected NewArray(int n6, CodeIterator codeIterator, CtClass ctClass, MethodInfo methodInfo, int n10) {
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

    @Override
    public CtClass[] mayThrow() {
        return super.mayThrow();
    }

    public CtClass getComponentType() throws NotFoundException {
        if (this.opcode == 188) {
            int n6 = this.iterator.byteAt(this.currentPos + 1);
            return this.getPrimitiveType(n6);
        }
        if (this.opcode == 189 || this.opcode == 197) {
            int n10 = this.iterator.u16bitAt(this.currentPos + 1);
            String string = this.getConstPool().getClassInfo(n10);
            int n11 = Descriptor.arrayDimension(string);
            string = Descriptor.toArrayComponent(string, n11);
            return Descriptor.toCtClass(string, this.thisClass.getClassPool());
        }
        throw new RuntimeException("bad opcode: " + this.opcode);
    }

    CtClass getPrimitiveType(int n6) {
        switch (n6) {
            case 4: {
                return CtClass.booleanType;
            }
            case 5: {
                return CtClass.charType;
            }
            case 6: {
                return CtClass.floatType;
            }
            case 7: {
                return CtClass.doubleType;
            }
            case 8: {
                return CtClass.byteType;
            }
            case 9: {
                return CtClass.shortType;
            }
            case 10: {
                return CtClass.intType;
            }
            case 11: {
                return CtClass.longType;
            }
        }
        throw new RuntimeException("bad atype: " + n6);
    }

    public int getDimension() {
        if (this.opcode == 188) {
            return 1;
        }
        if (this.opcode == 189 || this.opcode == 197) {
            int n6 = this.iterator.u16bitAt(this.currentPos + 1);
            String string = this.getConstPool().getClassInfo(n6);
            return Descriptor.arrayDimension(string) + (this.opcode == 189 ? 1 : 0);
        }
        throw new RuntimeException("bad opcode: " + this.opcode);
    }

    public int getCreatedDimensions() {
        if (this.opcode == 197) {
            return this.iterator.byteAt(this.currentPos + 3);
        }
        return 1;
    }

    @Override
    public void replace(String string) throws CannotCompileException {
        try {
            this.replace2(string);
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

    private void replace2(String string) throws CompileError, NotFoundException, BadBytecode, CannotCompileException {
        int n6;
        int n10;
        String string2;
        Object object;
        this.thisClass.getClassFile();
        ConstPool constPool = this.getConstPool();
        int n11 = this.currentPos;
        int n12 = 0;
        int n13 = 1;
        if (this.opcode == 188) {
            n12 = this.iterator.byteAt(this.currentPos + 1);
            object = (CtPrimitiveType)this.getPrimitiveType(n12);
            string2 = "[" + ((CtPrimitiveType)object).getDescriptor();
            n10 = 2;
        } else if (this.opcode == 189) {
            n12 = this.iterator.u16bitAt(n11 + 1);
            string2 = constPool.getClassInfo(n12);
            string2 = string2.startsWith("[") ? "[" + string2 : "[L" + string2 + ";";
            n10 = 3;
        } else if (this.opcode == 197) {
            n12 = this.iterator.u16bitAt(this.currentPos + 1);
            string2 = constPool.getClassInfo(n12);
            n13 = this.iterator.byteAt(this.currentPos + 3);
            n10 = 4;
        } else {
            throw new RuntimeException("bad opcode: " + this.opcode);
        }
        CtClass ctClass = Descriptor.toCtClass(string2, this.thisClass.getClassPool());
        object = new Javac(this.thisClass);
        CodeAttribute codeAttribute = this.iterator.get();
        CtClass[] arrctClass = new CtClass[n13];
        for (n6 = 0; n6 < n13; ++n6) {
            arrctClass[n6] = CtClass.intType;
        }
        n6 = codeAttribute.getMaxLocals();
        ((Javac)object).recordParams("java.lang.Object", arrctClass, true, n6, this.withinStatic());
        NewArray.checkResultValue(ctClass, string);
        int n14 = ((Javac)object).recordReturnType(ctClass, true);
        ((Javac)object).recordProceed(new NewArray$ProceedForArray(ctClass, this.opcode, n12, n13));
        Bytecode bytecode = ((Javac)object).getBytecode();
        NewArray.storeStack(arrctClass, true, n6, bytecode);
        ((Javac)object).recordLocalVariables(codeAttribute, n11);
        bytecode.addOpcode(1);
        bytecode.addAstore(n14);
        ((Javac)object).compileStmnt(string);
        bytecode.addAload(n14);
        this.replace0(n11, bytecode, n10);
    }
}

