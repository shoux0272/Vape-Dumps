/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField$ArrayInitializer;
import javassist.CtField$CodeInitializer;
import javassist.CtField$DoubleInitializer;
import javassist.CtField$FloatInitializer;
import javassist.CtField$IntInitializer;
import javassist.CtField$LongInitializer;
import javassist.CtField$MethodInitializer;
import javassist.CtField$MultiArrayInitializer;
import javassist.CtField$NewInitializer;
import javassist.CtField$ParamInitializer;
import javassist.CtField$PtreeInitializer;
import javassist.CtField$StringInitializer;
import javassist.NotFoundException;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ConstPool;
import javassist.compiler.Javac;
import javassist.compiler.ast.ASTree;

public abstract class CtField$Initializer {
    public static CtField$Initializer constant(int n6) {
        return new CtField$IntInitializer(n6);
    }

    public static CtField$Initializer constant(boolean bl) {
        return new CtField$IntInitializer(bl ? 1 : 0);
    }

    public static CtField$Initializer constant(long l) {
        return new CtField$LongInitializer(l);
    }

    public static CtField$Initializer constant(float f10) {
        return new CtField$FloatInitializer(f10);
    }

    public static CtField$Initializer constant(double d10) {
        return new CtField$DoubleInitializer(d10);
    }

    public static CtField$Initializer constant(String string) {
        return new CtField$StringInitializer(string);
    }

    public static CtField$Initializer byParameter(int n6) {
        CtField$ParamInitializer ctField$ParamInitializer = new CtField$ParamInitializer();
        ctField$ParamInitializer.nthParam = n6;
        return ctField$ParamInitializer;
    }

    public static CtField$Initializer byNew(CtClass ctClass) {
        CtField$NewInitializer ctField$NewInitializer = new CtField$NewInitializer();
        ctField$NewInitializer.objectType = ctClass;
        ctField$NewInitializer.stringParams = null;
        ctField$NewInitializer.withConstructorParams = false;
        return ctField$NewInitializer;
    }

    public static CtField$Initializer byNew(CtClass ctClass, String[] arrstring) {
        CtField$NewInitializer ctField$NewInitializer = new CtField$NewInitializer();
        ctField$NewInitializer.objectType = ctClass;
        ctField$NewInitializer.stringParams = arrstring;
        ctField$NewInitializer.withConstructorParams = false;
        return ctField$NewInitializer;
    }

    public static CtField$Initializer byNewWithParams(CtClass ctClass) {
        CtField$NewInitializer ctField$NewInitializer = new CtField$NewInitializer();
        ctField$NewInitializer.objectType = ctClass;
        ctField$NewInitializer.stringParams = null;
        ctField$NewInitializer.withConstructorParams = true;
        return ctField$NewInitializer;
    }

    public static CtField$Initializer byNewWithParams(CtClass ctClass, String[] arrstring) {
        CtField$NewInitializer ctField$NewInitializer = new CtField$NewInitializer();
        ctField$NewInitializer.objectType = ctClass;
        ctField$NewInitializer.stringParams = arrstring;
        ctField$NewInitializer.withConstructorParams = true;
        return ctField$NewInitializer;
    }

    public static CtField$Initializer a(CtClass ctClass, String string) {
        CtField$MethodInitializer ctField$MethodInitializer = new CtField$MethodInitializer();
        ctField$MethodInitializer.objectType = ctClass;
        ctField$MethodInitializer.methodName = string;
        ctField$MethodInitializer.stringParams = null;
        ctField$MethodInitializer.withConstructorParams = false;
        return ctField$MethodInitializer;
    }

    public static CtField$Initializer a(CtClass ctClass, String string, String[] arrstring) {
        CtField$MethodInitializer ctField$MethodInitializer = new CtField$MethodInitializer();
        ctField$MethodInitializer.objectType = ctClass;
        ctField$MethodInitializer.methodName = string;
        ctField$MethodInitializer.stringParams = arrstring;
        ctField$MethodInitializer.withConstructorParams = false;
        return ctField$MethodInitializer;
    }

    public static CtField$Initializer b(CtClass ctClass, String string) {
        CtField$MethodInitializer ctField$MethodInitializer = new CtField$MethodInitializer();
        ctField$MethodInitializer.objectType = ctClass;
        ctField$MethodInitializer.methodName = string;
        ctField$MethodInitializer.stringParams = null;
        ctField$MethodInitializer.withConstructorParams = true;
        return ctField$MethodInitializer;
    }

    public static CtField$Initializer b(CtClass ctClass, String string, String[] arrstring) {
        CtField$MethodInitializer ctField$MethodInitializer = new CtField$MethodInitializer();
        ctField$MethodInitializer.objectType = ctClass;
        ctField$MethodInitializer.methodName = string;
        ctField$MethodInitializer.stringParams = arrstring;
        ctField$MethodInitializer.withConstructorParams = true;
        return ctField$MethodInitializer;
    }

    public static CtField$Initializer byNewArray(CtClass ctClass, int n6) throws NotFoundException {
        return new CtField$ArrayInitializer(ctClass.getComponentType(), n6);
    }

    public static CtField$Initializer byNewArray(CtClass ctClass, int[] arrn) {
        return new CtField$MultiArrayInitializer(ctClass, arrn);
    }

    public static CtField$Initializer byExpr(String string) {
        return new CtField$CodeInitializer(string);
    }

    static CtField$Initializer byExpr(ASTree aSTree) {
        return new CtField$PtreeInitializer(aSTree);
    }

    void check(String string) throws CannotCompileException {
    }

    abstract int compile(CtClass var1, String var2, Bytecode var3, CtClass[] var4, Javac var5) throws CannotCompileException;

    abstract int compileIfStatic(CtClass var1, String var2, Bytecode var3, Javac var4) throws CannotCompileException;

    int getConstantValue(ConstPool constPool, CtClass ctClass) {
        return 0;
    }
}

