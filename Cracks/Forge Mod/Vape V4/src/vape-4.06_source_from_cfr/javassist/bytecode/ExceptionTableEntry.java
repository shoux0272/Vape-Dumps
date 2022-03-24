/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

class ExceptionTableEntry {
    int startPc;
    int endPc;
    int handlerPc;
    int catchType;

    ExceptionTableEntry(int n6, int n10, int n11, int n12) {
        this.startPc = n6;
        this.endPc = n10;
        this.handlerPc = n11;
        this.catchType = n12;
    }
}

