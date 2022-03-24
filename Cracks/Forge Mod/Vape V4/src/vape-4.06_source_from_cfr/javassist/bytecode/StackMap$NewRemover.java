/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMap$SimpleCopy;

class StackMap$NewRemover
extends StackMap$SimpleCopy {
    int posOfNew;

    StackMap$NewRemover(StackMap stackMap, int n6) {
        super(stackMap);
        this.posOfNew = n6;
    }

    @Override
    public int stack(int n6, int n10, int n11) {
        return this.stackTypeInfoArray(n6, n10, n11);
    }

    private int stackTypeInfoArray(int n6, int n10, int n11) {
        int n12;
        byte by;
        int n13;
        int n14 = n6;
        int n15 = 0;
        for (n13 = 0; n13 < n11; ++n13) {
            by = this.info[n14];
            if (by == 7) {
                n14 += 3;
                continue;
            }
            if (by == 8) {
                n12 = ByteArray.readU16bit(this.info, n14 + 1);
                if (n12 == this.posOfNew) {
                    ++n15;
                }
                n14 += 3;
                continue;
            }
            ++n14;
        }
        this.writer.write16bit(n11 - n15);
        for (n13 = 0; n13 < n11; ++n13) {
            by = this.info[n6];
            if (by == 7) {
                n12 = ByteArray.readU16bit(this.info, n6 + 1);
                this.objectVariable(n6, n12);
                n6 += 3;
                continue;
            }
            if (by == 8) {
                n12 = ByteArray.readU16bit(this.info, n6 + 1);
                if (n12 != this.posOfNew) {
                    this.uninitialized(n6, n12);
                }
                n6 += 3;
                continue;
            }
            this.typeInfo(n6, by);
            ++n6;
        }
        return n6;
    }
}

