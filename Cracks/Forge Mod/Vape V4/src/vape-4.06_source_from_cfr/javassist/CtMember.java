/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CtClass;
import javassist.Modifier;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;

public abstract class CtMember {
    CtMember next;
    protected CtClass b;
    private static boolean c;

    protected CtMember(CtClass ctClass) {
        this.b = ctClass;
        this.next = null;
    }

    final CtMember f() {
        return this.next;
    }

    void nameReplaced() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(Integer.toHexString(this.hashCode()));
        stringBuffer.append("[");
        stringBuffer.append(Modifier.toString(this.getModifiers()));
        this.extendToString(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    protected abstract void extendToString(StringBuffer var1);

    public CtClass getDeclaringClass() {
        return this.b;
    }

    public boolean a(CtClass ctClass) {
        int n6 = this.getModifiers();
        if (Modifier.isPublic(n6)) {
            return true;
        }
        if (Modifier.isPrivate(n6)) {
            return ctClass == this.b;
        }
        String string = this.b.getPackageName();
        String string2 = ctClass.getPackageName();
        boolean bl = string == null ? string2 == null : string.equals(string2);
        if (!bl && Modifier.isProtected(n6)) {
            return ctClass.subclassOf(this.b);
        }
        return bl;
    }

    public abstract int getModifiers();

    public abstract void setModifiers(int var1);

    public boolean b(Class<?> class_) {
        return this.hasAnnotation(class_.getName());
    }

    public abstract boolean hasAnnotation(String var1);

    public abstract Object getAnnotation(Class<?> var1) throws ClassNotFoundException;

    public abstract Object[] getAnnotations() throws ClassNotFoundException;

    public abstract Object[] getAvailableAnnotations();

    public abstract String getName();

    public abstract String getSignature();

    public abstract String getGenericSignature();

    public abstract void setGenericSignature(String var1);

    public abstract byte[] getAttribute(String var1);

    public abstract void setAttribute(String var1, byte[] var2);

    public static void b(boolean bl) {
        c = bl;
    }

    public static boolean k() {
        return c;
    }

    public static boolean i() {
        boolean bl = CtMember.k();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (CtMember.i()) {
            CtMember.b(true);
        }
    }
}

