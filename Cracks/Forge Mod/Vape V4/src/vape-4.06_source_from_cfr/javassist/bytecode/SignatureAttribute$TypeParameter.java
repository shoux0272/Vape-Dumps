/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$ObjectType;

public class SignatureAttribute$TypeParameter {
    String name;
    SignatureAttribute$ObjectType superClass;
    SignatureAttribute$ObjectType[] superInterfaces;

    SignatureAttribute$TypeParameter(String string, int n6, int n10, SignatureAttribute$ObjectType signatureAttribute$ObjectType, SignatureAttribute$ObjectType[] arrsignatureAttribute$ObjectType) {
        this.name = string.substring(n6, n10);
        this.superClass = signatureAttribute$ObjectType;
        this.superInterfaces = arrsignatureAttribute$ObjectType;
    }

    public SignatureAttribute$TypeParameter(String string, SignatureAttribute$ObjectType signatureAttribute$ObjectType, SignatureAttribute$ObjectType[] arrsignatureAttribute$ObjectType) {
        this.name = string;
        this.superClass = signatureAttribute$ObjectType;
        this.superInterfaces = arrsignatureAttribute$ObjectType == null ? new SignatureAttribute$ObjectType[0] : arrsignatureAttribute$ObjectType;
    }

    public SignatureAttribute$TypeParameter(String string) {
        this(string, null, null);
    }

    public String getName() {
        return this.name;
    }

    public SignatureAttribute$ObjectType getClassBound() {
        return this.superClass;
    }

    public SignatureAttribute$ObjectType[] getInterfaceBound() {
        return this.superInterfaces;
    }

    public String toString() {
        int n6;
        StringBuffer stringBuffer = new StringBuffer(this.getName());
        if (this.superClass != null) {
            stringBuffer.append(" extends ").append(this.superClass.toString());
        }
        if ((n6 = this.superInterfaces.length) > 0) {
            for (int k = 0; k < n6; ++k) {
                if (k > 0 || this.superClass != null) {
                    stringBuffer.append(" & ");
                } else {
                    stringBuffer.append(" extends ");
                }
                stringBuffer.append(this.superInterfaces[k].toString());
            }
        }
        return stringBuffer.toString();
    }

    static void toString(StringBuffer stringBuffer, SignatureAttribute$TypeParameter[] arrsignatureAttribute$TypeParameter) {
        stringBuffer.append('<');
        for (int k = 0; k < arrsignatureAttribute$TypeParameter.length; ++k) {
            if (k > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(arrsignatureAttribute$TypeParameter[k]);
        }
        stringBuffer.append('>');
    }

    void encode(StringBuffer stringBuffer) {
        stringBuffer.append(this.name);
        if (this.superClass == null) {
            stringBuffer.append(":Ljava/lang/Object;");
        } else {
            stringBuffer.append(':');
            this.superClass.encode(stringBuffer);
        }
        for (int k = 0; k < this.superInterfaces.length; ++k) {
            stringBuffer.append(':');
            this.superInterfaces[k].encode(stringBuffer);
        }
    }
}

