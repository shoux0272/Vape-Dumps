/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$NestedClassType;
import javassist.bytecode.SignatureAttribute$ObjectType;
import javassist.bytecode.SignatureAttribute$TypeArgument;

public class SignatureAttribute$ClassType
extends SignatureAttribute$ObjectType {
    String name;
    SignatureAttribute$TypeArgument[] arguments;
    public static SignatureAttribute$ClassType OBJECT = new SignatureAttribute$ClassType("java.lang.Object", null);

    static SignatureAttribute$ClassType make(String string, int n6, int n10, SignatureAttribute$TypeArgument[] arrsignatureAttribute$TypeArgument, SignatureAttribute$ClassType signatureAttribute$ClassType) {
        if (signatureAttribute$ClassType == null) {
            return new SignatureAttribute$ClassType(string, n6, n10, arrsignatureAttribute$TypeArgument);
        }
        return new SignatureAttribute$NestedClassType(string, n6, n10, arrsignatureAttribute$TypeArgument, signatureAttribute$ClassType);
    }

    SignatureAttribute$ClassType(String string, int n6, int n10, SignatureAttribute$TypeArgument[] arrsignatureAttribute$TypeArgument) {
        this.name = string.substring(n6, n10).replace('/', '.');
        this.arguments = arrsignatureAttribute$TypeArgument;
    }

    public SignatureAttribute$ClassType(String string, SignatureAttribute$TypeArgument[] arrsignatureAttribute$TypeArgument) {
        this.name = string;
        this.arguments = arrsignatureAttribute$TypeArgument;
    }

    public SignatureAttribute$ClassType(String string) {
        this(string, null);
    }

    public String getName() {
        return this.name;
    }

    public SignatureAttribute$TypeArgument[] getTypeArguments() {
        return this.arguments;
    }

    public SignatureAttribute$ClassType getDeclaringClass() {
        return null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        SignatureAttribute$ClassType signatureAttribute$ClassType = this.getDeclaringClass();
        if (signatureAttribute$ClassType != null) {
            stringBuffer.append(signatureAttribute$ClassType.toString()).append('.');
        }
        return this.toString2(stringBuffer);
    }

    private String toString2(StringBuffer stringBuffer) {
        stringBuffer.append(this.name);
        if (this.arguments != null) {
            stringBuffer.append('<');
            int n6 = this.arguments.length;
            for (int k = 0; k < n6; ++k) {
                if (k > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(this.arguments[k].toString());
            }
            stringBuffer.append('>');
        }
        return stringBuffer.toString();
    }

    @Override
    public String jvmTypeName() {
        StringBuffer stringBuffer = new StringBuffer();
        SignatureAttribute$ClassType signatureAttribute$ClassType = this.getDeclaringClass();
        if (signatureAttribute$ClassType != null) {
            stringBuffer.append(signatureAttribute$ClassType.jvmTypeName()).append('$');
        }
        return this.toString2(stringBuffer);
    }

    @Override
    void encode(StringBuffer stringBuffer) {
        stringBuffer.append('L');
        this.encode2(stringBuffer);
        stringBuffer.append(';');
    }

    void encode2(StringBuffer stringBuffer) {
        SignatureAttribute$ClassType signatureAttribute$ClassType = this.getDeclaringClass();
        if (signatureAttribute$ClassType != null) {
            signatureAttribute$ClassType.encode2(stringBuffer);
            stringBuffer.append('$');
        }
        stringBuffer.append(this.name.replace('.', '/'));
        if (this.arguments != null) {
            SignatureAttribute$TypeArgument.encode(stringBuffer, this.arguments);
        }
    }
}

