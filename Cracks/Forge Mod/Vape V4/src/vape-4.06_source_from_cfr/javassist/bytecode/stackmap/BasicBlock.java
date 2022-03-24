/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.stackmap.BasicBlock$Catch;

public class BasicBlock {
    protected int position;
    protected int length;
    protected int incoming;
    protected BasicBlock[] exit;
    protected boolean stop;
    protected BasicBlock$Catch toCatch;

    protected BasicBlock(int n6) {
        this.position = n6;
        this.length = 0;
        this.incoming = 0;
    }

    public static BasicBlock find(BasicBlock[] arrbasicBlock, int n6) throws BadBytecode {
        for (BasicBlock basicBlock : arrbasicBlock) {
            if (basicBlock.position > n6 || n6 >= basicBlock.position + basicBlock.length) continue;
            return basicBlock;
        }
        throw new BadBytecode("no basic block at " + n6);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = this.getClass().getName();
        int n6 = string.lastIndexOf(46);
        stringBuffer.append(n6 < 0 ? string : string.substring(n6 + 1));
        stringBuffer.append("[");
        this.toString2(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /*
     * WARNING - void declaration
     */
    protected void toString2(StringBuffer stringBuffer) {
        void var2_4;
        stringBuffer.append("pos=").append(this.position).append(", len=").append(this.length).append(", in=").append(this.incoming).append(", exit{");
        if (this.exit != null) {
            for (BasicBlock basicBlock : this.exit) {
                stringBuffer.append(basicBlock.position).append(",");
            }
        }
        stringBuffer.append("}, {");
        BasicBlock$Catch basicBlock$Catch = this.toCatch;
        while (var2_4 != null) {
            stringBuffer.append("(").append(var2_4.body.position).append(", ").append(var2_4.typeIndex).append("), ");
            BasicBlock$Catch basicBlock$Catch2 = var2_4.next;
        }
        stringBuffer.append("}");
    }
}

