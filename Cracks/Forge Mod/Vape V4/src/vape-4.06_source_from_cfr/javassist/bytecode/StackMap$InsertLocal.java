/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.StackMap;
import javassist.bytecode.StackMap$SimpleCopy;

class StackMap$InsertLocal
extends StackMap$SimpleCopy {
    private int varIndex;
    private int varTag;
    private int varData;

    StackMap$InsertLocal(StackMap stackMap, int n6, int n10, int n11) {
        super(stackMap);
        this.varIndex = n6;
        this.varTag = n10;
        this.varData = n11;
    }

    @Override
    public int typeInfoArray(int n6, int n10, int n11, boolean bl) {
        if (!bl || n11 < this.varIndex) {
            return super.typeInfoArray(n6, n10, n11, bl);
        }
        this.writer.write16bit(n11 + 1);
        for (int k = 0; k < n11; ++k) {
            if (k == this.varIndex) {
                this.writeVarTypeInfo();
            }
            n6 = this.typeInfoArray2(k, n6);
        }
        if (n11 == this.varIndex) {
            this.writeVarTypeInfo();
        }
        return n6;
    }

    private void writeVarTypeInfo() {
        if (this.varTag == 7) {
            this.writer.writeVerifyTypeInfo(7, this.varData);
        } else if (this.varTag == 8) {
            this.writer.writeVerifyTypeInfo(8, this.varData);
        } else {
            this.writer.writeVerifyTypeInfo(this.varTag, 0);
        }
    }
}

