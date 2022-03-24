/*
 * Decompiled with CFR 0.150.
 */
public class j
extends ClassLoader {
    public j(ClassLoader p) {
        super(p);
    }

    private static native Class lc(String var0);

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class<?> c2 = j.lc(name);
        if (c2 != null) {
            return c2;
        }
        try {
            c2 = super.loadClass(name);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return c2;
    }
}

