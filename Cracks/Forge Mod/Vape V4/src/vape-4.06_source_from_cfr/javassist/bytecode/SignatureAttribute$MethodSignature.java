/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.SignatureAttribute$BaseType;
import javassist.bytecode.SignatureAttribute$ObjectType;
import javassist.bytecode.SignatureAttribute$Type;
import javassist.bytecode.SignatureAttribute$TypeParameter;

public class SignatureAttribute$MethodSignature {
    SignatureAttribute$TypeParameter[] typeParams;
    SignatureAttribute$Type[] params;
    SignatureAttribute$Type retType;
    SignatureAttribute$ObjectType[] exceptions;

    public SignatureAttribute$MethodSignature(SignatureAttribute$TypeParameter[] arrsignatureAttribute$TypeParameter, SignatureAttribute$Type[] arrsignatureAttribute$Type, SignatureAttribute$Type signatureAttribute$Type, SignatureAttribute$ObjectType[] arrsignatureAttribute$ObjectType) {
        this.typeParams = arrsignatureAttribute$TypeParameter == null ? new SignatureAttribute$TypeParameter[0] : arrsignatureAttribute$TypeParameter;
        this.params = arrsignatureAttribute$Type == null ? new SignatureAttribute$Type[0] : arrsignatureAttribute$Type;
        this.retType = signatureAttribute$Type == null ? new SignatureAttribute$BaseType("void") : signatureAttribute$Type;
        this.exceptions = arrsignatureAttribute$ObjectType == null ? new SignatureAttribute$ObjectType[0] : arrsignatureAttribute$ObjectType;
    }

    public SignatureAttribute$TypeParameter[] getTypeParameters() {
        return this.typeParams;
    }

    public SignatureAttribute$Type[] getParameterTypes() {
        return this.params;
    }

    public SignatureAttribute$Type getReturnType() {
        return this.retType;
    }

    public SignatureAttribute$ObjectType[] getExceptionTypes() {
        return this.exceptions;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        SignatureAttribute$TypeParameter.toString(stringBuffer, this.typeParams);
        stringBuffer.append(" (");
        SignatureAttribute$Type.toString(stringBuffer, this.params);
        stringBuffer.append(") ");
        stringBuffer.append(this.retType);
        if (this.exceptions.length > 0) {
            stringBuffer.append(" throws ");
            SignatureAttribute$Type.toString(stringBuffer, this.exceptions);
        }
        return stringBuffer.toString();
    }

    public String encode() {
        int n6;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.typeParams.length > 0) {
            stringBuffer.append('<');
            for (n6 = 0; n6 < this.typeParams.length; ++n6) {
                this.typeParams[n6].encode(stringBuffer);
            }
            stringBuffer.append('>');
        }
        stringBuffer.append('(');
        for (n6 = 0; n6 < this.params.length; ++n6) {
            this.params[n6].encode(stringBuffer);
        }
        stringBuffer.append(')');
        this.retType.encode(stringBuffer);
        if (this.exceptions.length > 0) {
            for (n6 = 0; n6 < this.exceptions.length; ++n6) {
                stringBuffer.append('^');
                this.exceptions[n6].encode(stringBuffer);
            }
        }
        return stringBuffer.toString();
    }
}

