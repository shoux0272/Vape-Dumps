/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;

class AnnotationsAttribute$Walker {
    byte[] info;

    AnnotationsAttribute$Walker(byte[] arrby) {
        this.info = arrby;
    }

    final void parameters() throws Exception {
        int n6 = this.info[0] & 0xFF;
        this.parameters(n6, 1);
    }

    void parameters(int n6, int n10) throws Exception {
        for (int k = 0; k < n6; ++k) {
            n10 = this.annotationArray(n10);
        }
    }

    final void annotationArray() throws Exception {
        this.annotationArray(0);
    }

    final int annotationArray(int n6) throws Exception {
        int n10 = ByteArray.readU16bit(this.info, n6);
        return this.annotationArray(n6 + 2, n10);
    }

    int annotationArray(int n6, int n10) throws Exception {
        for (int k = 0; k < n10; ++k) {
            n6 = this.annotation(n6);
        }
        return n6;
    }

    final int annotation(int n6) throws Exception {
        int n10 = ByteArray.readU16bit(this.info, n6);
        int n11 = ByteArray.readU16bit(this.info, n6 + 2);
        return this.annotation(n6 + 4, n10, n11);
    }

    int annotation(int n6, int n10, int n11) throws Exception {
        for (int k = 0; k < n11; ++k) {
            n6 = this.memberValuePair(n6);
        }
        return n6;
    }

    final int memberValuePair(int n6) throws Exception {
        int n10 = ByteArray.readU16bit(this.info, n6);
        return this.memberValuePair(n6 + 2, n10);
    }

    int memberValuePair(int n6, int n10) throws Exception {
        return this.memberValue(n6);
    }

    final int memberValue(int n6) throws Exception {
        int n10 = this.info[n6] & 0xFF;
        if (n10 == 101) {
            int n11 = ByteArray.readU16bit(this.info, n6 + 1);
            int n12 = ByteArray.readU16bit(this.info, n6 + 3);
            this.enumMemberValue(n6, n11, n12);
            return n6 + 5;
        }
        if (n10 == 99) {
            int n13 = ByteArray.readU16bit(this.info, n6 + 1);
            this.classMemberValue(n6, n13);
            return n6 + 3;
        }
        if (n10 == 64) {
            return this.annotationMemberValue(n6 + 1);
        }
        if (n10 == 91) {
            int n14 = ByteArray.readU16bit(this.info, n6 + 1);
            return this.arrayMemberValue(n6 + 3, n14);
        }
        int n15 = ByteArray.readU16bit(this.info, n6 + 1);
        this.constValueMember(n10, n15);
        return n6 + 3;
    }

    void constValueMember(int n6, int n10) throws Exception {
    }

    void enumMemberValue(int n6, int n10, int n11) throws Exception {
    }

    void classMemberValue(int n6, int n10) throws Exception {
    }

    int annotationMemberValue(int n6) throws Exception {
        return this.annotation(n6);
    }

    int arrayMemberValue(int n6, int n10) throws Exception {
        for (int k = 0; k < n10; ++k) {
            n6 = this.memberValue(n6);
        }
        return n6;
    }
}

