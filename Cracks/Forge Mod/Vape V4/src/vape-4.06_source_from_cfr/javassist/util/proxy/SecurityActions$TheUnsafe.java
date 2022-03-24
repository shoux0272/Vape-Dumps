/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javassist.util.proxy.SecurityActions;

class SecurityActions$TheUnsafe {
    final Class<?> unsafe;
    final Object theUnsafe;
    final Map<String, List<Method>> methods;
    final SecurityActions this$0;

    SecurityActions$TheUnsafe(SecurityActions securityActions, Class<?> class_, Object object) {
        this.this$0 = securityActions;
        this.methods = new HashMap<String, List<Method>>();
        this.unsafe = class_;
        this.theUnsafe = object;
        for (Method method : this.unsafe.getDeclaredMethods()) {
            if (!this.methods.containsKey(method.getName())) {
                this.methods.put(method.getName(), Collections.singletonList(method));
                continue;
            }
            if (this.methods.get(method.getName()).size() == 1) {
                this.methods.put(method.getName(), new ArrayList(this.methods.get(method.getName())));
            }
            this.methods.get(method.getName()).add(method);
        }
    }

    private Method getM(String string, Object[] arrobject) {
        return this.methods.get(string).get(0);
    }

    public Object call(String string, Object ... arrobject) {
        try {
            return this.getM(string, arrobject).invoke(this.theUnsafe, arrobject);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}

