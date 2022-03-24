/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.security.PrivilegedExceptionAction;
import javassist.util.proxy.SerializedProxy;

class SerializedProxy$1
implements PrivilegedExceptionAction<Class<?>> {
    final String val$className;
    final SerializedProxy this$0;

    SerializedProxy$1(SerializedProxy serializedProxy, String string) {
        this.this$0 = serializedProxy;
        this.val$className = string;
    }

    @Override
    public Class<?> run() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return Class.forName(this.val$className, true, classLoader);
    }
}

