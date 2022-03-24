/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.ClassPool;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.annotation.AnnotationsWriter;
import javassist.bytecode.annotation.MemberValueVisitor;
import javassist.bytecode.annotation.NoSuchClassError;
import manthe.cy;

public abstract class MemberValue {
    ConstPool cp;
    char tag;
    private static cy[] c;

    MemberValue(char c3, ConstPool constPool) {
        this.cp = constPool;
        this.tag = c3;
    }

    abstract Object getValue(ClassLoader var1, ClassPool var2, Method var3) throws ClassNotFoundException;

    abstract Class<?> getType(ClassLoader var1) throws ClassNotFoundException;

    static Class<?> loadClass(ClassLoader classLoader, String string) throws ClassNotFoundException, NoSuchClassError {
        try {
            return Class.forName(MemberValue.convertFromArray(string), true, classLoader);
        }
        catch (LinkageError linkageError) {
            throw new NoSuchClassError(string, linkageError);
        }
    }

    private static String convertFromArray(String string) {
        int n6 = string.indexOf("[]");
        if (n6 != -1) {
            String string2 = string.substring(0, n6);
            StringBuffer stringBuffer = new StringBuffer(Descriptor.of(string2));
            while (n6 != -1) {
                stringBuffer.insert(0, "[");
                n6 = string.indexOf("[]", n6 + 1);
            }
            return stringBuffer.toString().replace('/', '.');
        }
        return string;
    }

    public abstract void accept(MemberValueVisitor var1);

    public abstract void write(AnnotationsWriter var1) throws IOException;

    public static void b(cy[] arrcy) {
        c = arrcy;
    }

    public static cy[] b() {
        return c;
    }

    static {
        if (MemberValue.b() == null) {
            MemberValue.b(new cy[3]);
        }
    }
}

