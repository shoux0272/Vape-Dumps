/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$Type;

public abstract class SignatureAttribute$ObjectType
extends SignatureAttribute$Type {
    public String encode() {
        StringBuffer stringBuffer = new StringBuffer();
        this.encode(stringBuffer);
        return stringBuffer.toString();
    }
}

