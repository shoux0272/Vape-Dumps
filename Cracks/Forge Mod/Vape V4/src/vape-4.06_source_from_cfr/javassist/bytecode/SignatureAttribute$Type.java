/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

public abstract class SignatureAttribute$Type {
    abstract void encode(StringBuffer var1);

    static void toString(StringBuffer stringBuffer, SignatureAttribute$Type[] arrsignatureAttribute$Type) {
        for (int k = 0; k < arrsignatureAttribute$Type.length; ++k) {
            if (k > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(arrsignatureAttribute$Type[k]);
        }
    }

    public String jvmTypeName() {
        return this.toString();
    }
}

