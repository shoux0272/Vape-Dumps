/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;

class SecurityActions$7
implements PrivilegedExceptionAction<Void> {
    final Field val$fld;
    final Object val$target;
    final Object val$value;

    SecurityActions$7(Field field, Object object, Object object2) {
        this.val$fld = field;
        this.val$target = object;
        this.val$value = object2;
    }

    @Override
    public Void run() throws Exception {
        this.val$fld.set(this.val$target, this.val$value);
        return null;
    }
}

