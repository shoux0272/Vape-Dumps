/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.Opcode;

public abstract class Transformer
implements Opcode {
    private Transformer c;
    private static String e;

    public Transformer(Transformer transformer) {
        this.c = transformer;
    }

    public Transformer d() {
        return this.c;
    }

    public void initialize(ConstPool constPool, CodeAttribute codeAttribute) {
    }

    public void initialize(ConstPool constPool, CtClass ctClass, MethodInfo methodInfo) throws CannotCompileException {
        this.initialize(constPool, methodInfo.getCodeAttribute());
    }

    public void clean() {
    }

    public abstract int transform(CtClass var1, int var2, CodeIterator var3, ConstPool var4) throws CannotCompileException, BadBytecode;

    public int extraLocals() {
        return 0;
    }

    public int f() {
        return 0;
    }

    public static void b(String string) {
        e = string;
    }

    public static String b() {
        return e;
    }

    static {
        if (Transformer.b() != null) {
            Transformer.b("WHh5Bb");
        }
    }
}

