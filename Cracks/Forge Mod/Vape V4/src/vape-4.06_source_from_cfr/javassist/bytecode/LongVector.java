/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ConstInfo;

final class LongVector {
    static final int ASIZE = 128;
    static final int ABITS = 7;
    static final int VSIZE = 8;
    private ConstInfo[][] objects;
    private int elements;

    public LongVector() {
        this.objects = new ConstInfo[8][];
        this.elements = 0;
    }

    public LongVector(int n6) {
        int n10 = (n6 >> 7 & 0xFFFFFFF8) + 8;
        this.objects = new ConstInfo[n10][];
        this.elements = 0;
    }

    public int size() {
        return this.elements;
    }

    public int capacity() {
        return this.objects.length * 128;
    }

    public ConstInfo elementAt(int n6) {
        if (n6 < 0 || this.elements <= n6) {
            return null;
        }
        return this.objects[n6 >> 7][n6 & 0x7F];
    }

    public void addElement(ConstInfo constInfo) {
        int n6 = this.elements >> 7;
        int n10 = this.elements & 0x7F;
        int n11 = this.objects.length;
        if (n6 >= n11) {
            ConstInfo[][] arrarrconstInfo = new ConstInfo[n11 + 8][];
            System.arraycopy(this.objects, 0, arrarrconstInfo, 0, n11);
            this.objects = arrarrconstInfo;
        }
        if (this.objects[n6] == null) {
            this.objects[n6] = new ConstInfo[128];
        }
        this.objects[n6][n10] = constInfo;
        ++this.elements;
    }
}

