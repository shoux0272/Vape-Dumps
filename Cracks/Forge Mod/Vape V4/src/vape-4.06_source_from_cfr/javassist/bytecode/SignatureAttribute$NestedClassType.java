/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$ClassType;
import javassist.bytecode.SignatureAttribute$TypeArgument;

public class SignatureAttribute$NestedClassType
extends SignatureAttribute$ClassType {
    SignatureAttribute$ClassType parent;

    SignatureAttribute$NestedClassType(String string, int n6, int n10, SignatureAttribute$TypeArgument[] arrsignatureAttribute$TypeArgument, SignatureAttribute$ClassType signatureAttribute$ClassType) {
        super(string, n6, n10, arrsignatureAttribute$TypeArgument);
        this.parent = signatureAttribute$ClassType;
    }

    public SignatureAttribute$NestedClassType(SignatureAttribute$ClassType signatureAttribute$ClassType, String string, SignatureAttribute$TypeArgument[] arrsignatureAttribute$TypeArgument) {
        super(string, arrsignatureAttribute$TypeArgument);
        this.parent = signatureAttribute$ClassType;
    }

    @Override
    public SignatureAttribute$ClassType getDeclaringClass() {
        return this.parent;
    }
}

