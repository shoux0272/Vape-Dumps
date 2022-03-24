/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javassist.CannotCompileException;
import javassist.CtBehavior;

public abstract class Callback {
    public static Map<String, Callback> callbacks = new HashMap<String, Callback>();
    private final String sourceCode;

    public Callback(String string) {
        String string2 = UUID.randomUUID().toString();
        callbacks.put(string2, this);
        this.sourceCode = "((javassist.tools.Callback) javassist.tools.Callback.callbacks.get(\"" + string2 + "\")).result(new Object[]{" + string + "});";
    }

    public abstract void result(Object[] var1);

    public String toString() {
        return this.sourceCode();
    }

    public String sourceCode() {
        return this.sourceCode;
    }

    public static void insertBefore(CtBehavior ctBehavior, Callback callback) throws CannotCompileException {
        ctBehavior.insertBefore(callback.toString());
    }

    public static void insertAfter(CtBehavior ctBehavior, Callback callback) throws CannotCompileException {
        ctBehavior.insertAfter(callback.toString(), false);
    }

    public static void insertAfter(CtBehavior ctBehavior, Callback callback, boolean bl) throws CannotCompileException {
        ctBehavior.insertAfter(callback.toString(), bl);
    }

    public static int insertAt(CtBehavior ctBehavior, Callback callback, int n6) throws CannotCompileException {
        return ctBehavior.insertAt(n6, callback.toString());
    }
}

