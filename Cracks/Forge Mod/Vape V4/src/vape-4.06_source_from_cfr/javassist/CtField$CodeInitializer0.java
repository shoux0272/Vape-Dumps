/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField$Initializer;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.DoubleConst;
import javassist.compiler.ast.IntConst;
import javassist.compiler.ast.StringL;

abstract class CtField$CodeInitializer0
extends CtField$Initializer {
    CtField$CodeInitializer0() {
    }

    abstract void compileExpr(Javac var1) throws CompileError;

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        try {
            bytecode.addAload(0);
            this.compileExpr(javac);
            bytecode.addPutfield(Bytecode.THIS, string, Descriptor.of(ctClass));
            return bytecode.getMaxStack();
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        try {
            this.compileExpr(javac);
            bytecode.addPutstatic(Bytecode.THIS, string, Descriptor.of(ctClass));
            return bytecode.getMaxStack();
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
    }

    int getConstantValue2(ConstPool constPool, CtClass ctClass, ASTree aSTree) {
        if (ctClass.isPrimitive()) {
            if (aSTree instanceof IntConst) {
                long l = ((IntConst)aSTree).get();
                if (ctClass == CtClass.doubleType) {
                    return constPool.addDoubleInfo(l);
                }
                if (ctClass == CtClass.floatType) {
                    return constPool.addFloatInfo(l);
                }
                if (ctClass == CtClass.longType) {
                    return constPool.addLongInfo(l);
                }
                if (ctClass != CtClass.voidType) {
                    return constPool.addIntegerInfo((int)l);
                }
            } else if (aSTree instanceof DoubleConst) {
                double d10 = ((DoubleConst)aSTree).get();
                if (ctClass == CtClass.floatType) {
                    return constPool.addFloatInfo((float)d10);
                }
                if (ctClass == CtClass.doubleType) {
                    return constPool.addDoubleInfo(d10);
                }
            }
        } else if (aSTree instanceof StringL && ctClass.getName().equals("java.lang.String")) {
            return constPool.addStringInfo(((StringL)aSTree).get());
        }
        return 0;
    }
}

