/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$ObjectType;
import javassist.bytecode.SignatureAttribute$Type;

public class SignatureAttribute$ArrayType
extends SignatureAttribute$ObjectType {
    int dim;
    SignatureAttribute$Type componentType;

    public SignatureAttribute$ArrayType(int n6, SignatureAttribute$Type signatureAttribute$Type) {
        this.dim = n6;
        this.componentType = signatureAttribute$Type;
    }

    public int getDimension() {
        return this.dim;
    }

    public SignatureAttribute$Type getComponentType() {
        return this.componentType;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.componentType.toString());
        for (int k = 0; k < this.dim; ++k) {
            stringBuffer.append("[]");
        }
        return stringBuffer.toString();
    }

    @Override
    void encode(StringBuffer stringBuffer) {
        for (int k = 0; k < this.dim; ++k) {
            stringBuffer.append('[');
        }
        this.componentType.encode(stringBuffer);
    }
}

