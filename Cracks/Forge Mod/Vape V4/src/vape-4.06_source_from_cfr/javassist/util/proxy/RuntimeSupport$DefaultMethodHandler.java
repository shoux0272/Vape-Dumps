/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.io.Serializable;
import java.lang.reflect.Method;
import javassist.util.proxy.MethodHandler;

class RuntimeSupport$DefaultMethodHandler
implements MethodHandler,
Serializable {
    private static final long serialVersionUID = 1L;

    RuntimeSupport$DefaultMethodHandler() {
    }

    @Override
    public Object invoke(Object object, Method method, Method method2, Object[] arrobject) throws Exception {
        return method2.invoke(object, arrobject);
    }
}

