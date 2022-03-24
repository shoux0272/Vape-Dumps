/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$ObjectType;

public class SignatureAttribute$TypeArgument {
    SignatureAttribute$ObjectType arg;
    char wildcard;

    SignatureAttribute$TypeArgument(SignatureAttribute$ObjectType signatureAttribute$ObjectType, char c3) {
        this.arg = signatureAttribute$ObjectType;
        this.wildcard = c3;
    }

    public SignatureAttribute$TypeArgument(SignatureAttribute$ObjectType signatureAttribute$ObjectType) {
        this(signatureAttribute$ObjectType, ' ');
    }

    public SignatureAttribute$TypeArgument() {
        this(null, '*');
    }

    public static SignatureAttribute$TypeArgument subclassOf(SignatureAttribute$ObjectType signatureAttribute$ObjectType) {
        return new SignatureAttribute$TypeArgument(signatureAttribute$ObjectType, '+');
    }

    public static SignatureAttribute$TypeArgument superOf(SignatureAttribute$ObjectType signatureAttribute$ObjectType) {
        return new SignatureAttribute$TypeArgument(signatureAttribute$ObjectType, '-');
    }

    public char getKind() {
        return this.wildcard;
    }

    public boolean isWildcard() {
        return this.wildcard != ' ';
    }

    public SignatureAttribute$ObjectType getType() {
        return this.arg;
    }

    public String toString() {
        if (this.wildcard == '*') {
            return "?";
        }
        String string = this.arg.toString();
        if (this.wildcard == ' ') {
            return string;
        }
        if (this.wildcard == '+') {
            return "? extends " + string;
        }
        return "? super " + string;
    }

    static void encode(StringBuffer stringBuffer, SignatureAttribute$TypeArgument[] arrsignatureAttribute$TypeArgument) {
        stringBuffer.append('<');
        for (int k = 0; k < arrsignatureAttribute$TypeArgument.length; ++k) {
            SignatureAttribute$TypeArgument signatureAttribute$TypeArgument = arrsignatureAttribute$TypeArgument[k];
            if (signatureAttribute$TypeArgument.isWildcard()) {
                stringBuffer.append(signatureAttribute$TypeArgument.wildcard);
            }
            if (signatureAttribute$TypeArgument.getType() == null) continue;
            signatureAttribute$TypeArgument.getType().encode(stringBuffer);
        }
        stringBuffer.append('>');
    }
}

