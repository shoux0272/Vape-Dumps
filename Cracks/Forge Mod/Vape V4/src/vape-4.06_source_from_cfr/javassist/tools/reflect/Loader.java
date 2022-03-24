/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.reflect;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.NotFoundException;
import javassist.tools.reflect.Reflection;

public class Loader
extends javassist.Loader {
    protected Reflection reflection;

    public static void main(String[] arrstring) throws Throwable {
        Loader loader = new Loader();
        loader.run(arrstring);
    }

    public Loader() throws CannotCompileException, NotFoundException {
        this.delegateLoadingOf("a.ps");
        this.reflection = new Reflection();
        ClassPool classPool = ClassPool.getDefault();
        this.addTranslator(classPool, this.reflection);
    }

    public boolean makeReflective(String string, String string2, String string3) throws CannotCompileException, NotFoundException {
        return this.reflection.makeReflective(string, string2, string3);
    }
}

