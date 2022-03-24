/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.IOException;
import javassist.CannotCompileException;
import javassist.CtClass;

public class Loader$Simple
extends ClassLoader {
    public Loader$Simple() {
    }

    public Loader$Simple(ClassLoader classLoader) {
        super(classLoader);
    }

    public Class<?> invokeDefineClass(CtClass ctClass) throws IOException, CannotCompileException {
        byte[] arrby = ctClass.toBytecode();
        return this.defineClass(ctClass.getName(), arrby, 0, arrby.length);
    }
}

