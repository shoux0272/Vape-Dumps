/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;

class TypeAnnotationsAttribute$SubWalker {
    byte[] info;

    TypeAnnotationsAttribute$SubWalker(byte[] arrby) {
        this.info = arrby;
    }

    final int targetInfo(int n6, int n10) throws Exception {
        switch (n10) {
            case 0: 
            case 1: {
                int n11 = this.info[n6] & 0xFF;
                this.typeParameterTarget(n6, n10, n11);
                return n6 + 1;
            }
            case 16: {
                int n12 = ByteArray.readU16bit(this.info, n6);
                this.supertypeTarget(n6, n12);
                return n6 + 2;
            }
            case 17: 
            case 18: {
                int n13 = this.info[n6] & 0xFF;
                int n14 = this.info[n6 + 1] & 0xFF;
                this.typeParameterBoundTarget(n6, n10, n13, n14);
                return n6 + 2;
            }
            case 19: 
            case 20: 
            case 21: {
                this.emptyTarget(n6, n10);
                return n6;
            }
            case 22: {
                int n15 = this.info[n6] & 0xFF;
                this.formalParameterTarget(n6, n15);
                return n6 + 1;
            }
            case 23: {
                int n16 = ByteArray.readU16bit(this.info, n6);
                this.throwsTarget(n6, n16);
                return n6 + 2;
            }
            case 64: 
            case 65: {
                int n17 = ByteArray.readU16bit(this.info, n6);
                return this.localvarTarget(n6 + 2, n10, n17);
            }
            case 66: {
                int n18 = ByteArray.readU16bit(this.info, n6);
                this.catchTarget(n6, n18);
                return n6 + 2;
            }
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                int n19 = ByteArray.readU16bit(this.info, n6);
                this.offsetTarget(n6, n10, n19);
                return n6 + 2;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                int n20 = ByteArray.readU16bit(this.info, n6);
                int n21 = this.info[n6 + 2] & 0xFF;
                this.typeArgumentTarget(n6, n10, n20, n21);
                return n6 + 3;
            }
        }
        throw new RuntimeException("invalid target type: " + n10);
    }

    void typeParameterTarget(int n6, int n10, int n11) throws Exception {
    }

    void supertypeTarget(int n6, int n10) throws Exception {
    }

    void typeParameterBoundTarget(int n6, int n10, int n11, int n12) throws Exception {
    }

    void emptyTarget(int n6, int n10) throws Exception {
    }

    void formalParameterTarget(int n6, int n10) throws Exception {
    }

    void throwsTarget(int n6, int n10) throws Exception {
    }

    int localvarTarget(int n6, int n10, int n11) throws Exception {
        for (int k = 0; k < n11; ++k) {
            int n12 = ByteArray.readU16bit(this.info, n6);
            int n13 = ByteArray.readU16bit(this.info, n6 + 2);
            int n14 = ByteArray.readU16bit(this.info, n6 + 4);
            this.localvarTarget(n6, n10, n12, n13, n14);
            n6 += 6;
        }
        return n6;
    }

    void localvarTarget(int n6, int n10, int n11, int n12, int n13) throws Exception {
    }

    void catchTarget(int n6, int n10) throws Exception {
    }

    void offsetTarget(int n6, int n10, int n11) throws Exception {
    }

    void typeArgumentTarget(int n6, int n10, int n11, int n12) throws Exception {
    }

    final int typePath(int n6) throws Exception {
        int n10 = this.info[n6++] & 0xFF;
        return this.typePath(n6, n10);
    }

    int typePath(int n6, int n10) throws Exception {
        for (int k = 0; k < n10; ++k) {
            int n11 = this.info[n6] & 0xFF;
            int n12 = this.info[n6 + 1] & 0xFF;
            this.typePath(n6, n11, n12);
            n6 += 2;
        }
        return n6;
    }

    void typePath(int n6, int n10, int n11) throws Exception {
    }
}

