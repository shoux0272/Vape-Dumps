/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.StackMapTable$Walker;
import javassist.bytecode.StackMapTable$Writer;

class StackMapTable$SimpleCopy
extends StackMapTable$Walker {
    private StackMapTable$Writer writer;

    public StackMapTable$SimpleCopy(byte[] arrby) {
        super(arrby);
        this.writer = new StackMapTable$Writer(arrby.length);
    }

    public byte[] doit() throws BadBytecode {
        this.parse();
        return this.writer.toByteArray();
    }

    @Override
    public void sameFrame(int n6, int n10) {
        this.writer.sameFrame(n10);
    }

    @Override
    public void sameLocals(int n6, int n10, int n11, int n12) {
        this.writer.sameLocals(n10, n11, this.copyData(n11, n12));
    }

    @Override
    public void chopFrame(int n6, int n10, int n11) {
        this.writer.chopFrame(n10, n11);
    }

    @Override
    public void appendFrame(int n6, int n10, int[] arrn, int[] arrn2) {
        this.writer.appendFrame(n10, arrn, this.copyData(arrn, arrn2));
    }

    @Override
    public void fullFrame(int n6, int n10, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        this.writer.fullFrame(n10, arrn, this.copyData(arrn, arrn2), arrn3, this.copyData(arrn3, arrn4));
    }

    protected int copyData(int n6, int n10) {
        return n10;
    }

    protected int[] copyData(int[] arrn, int[] arrn2) {
        return arrn2;
    }
}

