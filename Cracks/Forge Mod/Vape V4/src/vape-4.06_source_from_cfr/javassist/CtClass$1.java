/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.ClassMap;
import javassist.CtClass;

class CtClass$1
extends ClassMap {
    private static final long serialVersionUID = 1L;
    final CtClass this$0;

    CtClass$1(CtClass ctClass) {
        this.this$0 = ctClass;
    }

    @Override
    public String put(String string, String string2) {
        return this.put0(string, string2);
    }

    @Override
    public String get(Object object) {
        String string = CtClass$1.toJavaName((String)object);
        this.put0(string, string);
        return null;
    }

    @Override
    public void fix(String string) {
    }
}

