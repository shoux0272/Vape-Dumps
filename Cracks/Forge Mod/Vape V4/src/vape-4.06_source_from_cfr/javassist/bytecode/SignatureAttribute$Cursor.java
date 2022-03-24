/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.SignatureAttribute;
import javassist.bytecode.SignatureAttribute$1;

class SignatureAttribute$Cursor {
    int position = 0;

    private SignatureAttribute$Cursor() {
    }

    int indexOf(String string, int n6) throws BadBytecode {
        int n10 = string.indexOf(n6, this.position);
        if (n10 < 0) {
            throw SignatureAttribute.access$000(string);
        }
        this.position = n10 + 1;
        return n10;
    }

    SignatureAttribute$Cursor(SignatureAttribute$1 signatureAttribute$1) {
        this();
    }
}

