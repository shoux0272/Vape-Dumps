/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$ClassType;
import javassist.bytecode.SignatureAttribute$Type;
import javassist.bytecode.SignatureAttribute$TypeParameter;

public class SignatureAttribute$ClassSignature {
    SignatureAttribute$TypeParameter[] params;
    SignatureAttribute$ClassType superClass;
    SignatureAttribute$ClassType[] interfaces;

    public SignatureAttribute$ClassSignature(SignatureAttribute$TypeParameter[] arrtypeParameter, SignatureAttribute$ClassType signatureAttribute$ClassType, SignatureAttribute$ClassType[] arrsignatureAttribute$ClassType) {
        this.params = arrtypeParameter == null ? new SignatureAttribute$TypeParameter[0] : arrtypeParameter;
        this.superClass = signatureAttribute$ClassType == null ? SignatureAttribute$ClassType.OBJECT : signatureAttribute$ClassType;
        this.interfaces = arrsignatureAttribute$ClassType == null ? new SignatureAttribute$ClassType[0] : arrsignatureAttribute$ClassType;
    }

    public SignatureAttribute$ClassSignature(SignatureAttribute$TypeParameter[] arrsignatureAttribute$TypeParameter) {
        this(arrsignatureAttribute$TypeParameter, null, null);
    }

    public SignatureAttribute$TypeParameter[] getParameters() {
        return this.params;
    }

    public SignatureAttribute$ClassType getSuperClass() {
        return this.superClass;
    }

    public SignatureAttribute$ClassType[] getInterfaces() {
        return this.interfaces;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        SignatureAttribute$TypeParameter.toString(stringBuffer, this.params);
        stringBuffer.append(" extends ").append(this.superClass);
        if (this.interfaces.length > 0) {
            stringBuffer.append(" implements ");
            SignatureAttribute$Type.toString(stringBuffer, this.interfaces);
        }
        return stringBuffer.toString();
    }

    public String encode() {
        int n6;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.params.length > 0) {
            stringBuffer.append('<');
            for (n6 = 0; n6 < this.params.length; ++n6) {
                this.params[n6].encode(stringBuffer);
            }
            stringBuffer.append('>');
        }
        this.superClass.encode(stringBuffer);
        for (n6 = 0; n6 < this.interfaces.length; ++n6) {
            this.interfaces[n6].encode(stringBuffer);
        }
        return stringBuffer.toString();
    }
}

