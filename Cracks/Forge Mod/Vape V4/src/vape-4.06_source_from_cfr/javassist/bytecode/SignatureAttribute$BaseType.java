/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.CtClass;
import javassist.bytecode.Descriptor;
import javassist.bytecode.SignatureAttribute$Type;

public class SignatureAttribute$BaseType
extends SignatureAttribute$Type {
    char descriptor;

    SignatureAttribute$BaseType(char c3) {
        this.descriptor = c3;
    }

    public SignatureAttribute$BaseType(String string) {
        this(Descriptor.of(string).charAt(0));
    }

    public char getDescriptor() {
        return this.descriptor;
    }

    public CtClass getCtlass() {
        return Descriptor.toPrimitiveClass(this.descriptor);
    }

    public String toString() {
        return Descriptor.toClassName(Character.toString(this.descriptor));
    }

    @Override
    void encode(StringBuffer stringBuffer) {
        stringBuffer.append(this.descriptor);
    }
}

