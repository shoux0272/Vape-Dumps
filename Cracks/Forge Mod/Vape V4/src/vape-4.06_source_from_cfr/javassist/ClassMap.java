/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.util.HashMap;
import javassist.CtClass;
import javassist.bytecode.Descriptor;

public class ClassMap
extends HashMap<String, String> {
    private static final long serialVersionUID = 1L;
    private ClassMap parent;

    public ClassMap() {
        this.parent = null;
    }

    ClassMap(ClassMap classMap) {
        this.parent = classMap;
    }

    @Override
    public void put(CtClass ctClass, CtClass ctClass2) {
        this.put(ctClass.getName(), ctClass2.getName());
    }

    @Override
    public String put(String string, String string2) {
        if (string == string2) {
            return string;
        }
        String string3 = ClassMap.toJvmName(string);
        String string4 = this.get(string3);
        if (string4 == null || !string4.equals(string3)) {
            return super.put(string3, ClassMap.toJvmName(string2));
        }
        return string4;
    }

    public void putIfNone(String string, String string2) {
        if (string == string2) {
            return;
        }
        String string3 = ClassMap.toJvmName(string);
        String string4 = this.get(string3);
        if (string4 == null) {
            super.put(string3, ClassMap.toJvmName(string2));
        }
    }

    protected final String put0(String string, String string2) {
        return super.put(string, string2);
    }

    @Override
    public String get(Object object) {
        String string = (String)super.get(object);
        if (string == null && this.parent != null) {
            return this.parent.get(object);
        }
        return string;
    }

    public void fix(CtClass ctClass) {
        this.fix(ctClass.getName());
    }

    public void fix(String string) {
        String string2 = ClassMap.toJvmName(string);
        super.put(string2, string2);
    }

    public static String toJvmName(String string) {
        return Descriptor.toJvmName(string);
    }

    public static String toJavaName(String string) {
        return Descriptor.toJavaName(string);
    }
}

