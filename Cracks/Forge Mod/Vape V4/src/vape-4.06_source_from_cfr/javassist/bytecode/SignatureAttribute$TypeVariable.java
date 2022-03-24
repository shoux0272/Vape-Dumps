/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$ObjectType;

public class SignatureAttribute$TypeVariable
extends SignatureAttribute$ObjectType {
    String name;

    SignatureAttribute$TypeVariable(String string, int n6, int n10) {
        this.name = string.substring(n6, n10);
    }

    public SignatureAttribute$TypeVariable(String string) {
        this.name = string;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    void encode(StringBuffer stringBuffer) {
        stringBuffer.append('T').append(this.name).append(';');
    }
}

