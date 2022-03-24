/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.util.Map;
import javassist.bytecode.ConstPool;
import javassist.bytecode.StackMapTable$SimpleCopy;

class StackMapTable$Copier
extends StackMapTable$SimpleCopy {
    private ConstPool srcPool;
    private ConstPool destPool;
    private Map<String, String> classnames;

    public StackMapTable$Copier(ConstPool constPool, byte[] arrby, ConstPool constPool2, Map<String, String> map) {
        super(arrby);
        this.srcPool = constPool;
        this.destPool = constPool2;
        this.classnames = map;
    }

    @Override
    protected int copyData(int n6, int n10) {
        if (n6 == 7) {
            return this.srcPool.copy(n10, this.destPool, this.classnames);
        }
        return n10;
    }

    @Override
    protected int[] copyData(int[] arrn, int[] arrn2) {
        int[] arrn3 = new int[arrn2.length];
        for (int k = 0; k < arrn2.length; ++k) {
            arrn3[k] = arrn[k] == 7 ? this.srcPool.copy(arrn2[k], this.destPool, this.classnames) : arrn2[k];
        }
        return arrn3;
    }
}

