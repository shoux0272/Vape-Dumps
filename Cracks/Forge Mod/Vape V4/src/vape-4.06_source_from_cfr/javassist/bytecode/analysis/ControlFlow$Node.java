/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.analysis.ControlFlow$Access;
import javassist.bytecode.analysis.ControlFlow$Block;
import javassist.bytecode.stackmap.BasicBlock;

public class ControlFlow$Node {
    private ControlFlow$Block block;
    private ControlFlow$Node parent;
    private ControlFlow$Node[] children;

    ControlFlow$Node(ControlFlow$Block controlFlow$Block) {
        this.block = controlFlow$Block;
        this.parent = null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Node[pos=").append(this.block().e());
        stringBuffer.append(", parent=");
        stringBuffer.append(this.parent == null ? "*" : Integer.toString(this.parent.block().e()));
        stringBuffer.append(", children{");
        for (int k = 0; k < this.children.length; ++k) {
            stringBuffer.append(this.children[k].block().e()).append(", ");
        }
        stringBuffer.append("}]");
        return stringBuffer.toString();
    }

    public ControlFlow$Block block() {
        return this.block;
    }

    public ControlFlow$Node parent() {
        return this.parent;
    }

    public int children() {
        return this.children.length;
    }

    public ControlFlow$Node child(int n6) {
        return this.children[n6];
    }

    int makeDepth1stTree(ControlFlow$Node controlFlow$Node, boolean[] arrbl, int n6, int[] arrn, ControlFlow$Access controlFlow$Access) {
        int n10 = this.block.j;
        if (arrbl[n10]) {
            return n6;
        }
        arrbl[n10] = true;
        this.parent = controlFlow$Node;
        BasicBlock[] arrbasicBlock = controlFlow$Access.exits(this);
        if (arrbasicBlock != null) {
            for (int k = 0; k < arrbasicBlock.length; ++k) {
                ControlFlow$Node controlFlow$Node2 = controlFlow$Access.node(arrbasicBlock[k]);
                n6 = controlFlow$Node2.makeDepth1stTree(this, arrbl, n6, arrn, controlFlow$Access);
            }
        }
        arrn[n10] = n6++;
        return n6;
    }

    boolean makeDominatorTree(boolean[] arrbl, int[] arrn, ControlFlow$Access controlFlow$Access) {
        BasicBlock[] arrbasicBlock;
        int n6 = this.block.j;
        if (arrbl[n6]) {
            return false;
        }
        arrbl[n6] = true;
        boolean bl = false;
        BasicBlock[] arrbasicBlock2 = controlFlow$Access.exits(this);
        if (arrbasicBlock2 != null) {
            for (int k = 0; k < arrbasicBlock2.length; ++k) {
                ControlFlow$Node controlFlow$Node = controlFlow$Access.node(arrbasicBlock2[k]);
                if (!controlFlow$Node.makeDominatorTree(arrbl, arrn, controlFlow$Access)) continue;
                bl = true;
            }
        }
        if ((arrbasicBlock = controlFlow$Access.entrances(this)) != null) {
            for (int k = 0; k < arrbasicBlock.length; ++k) {
                ControlFlow$Node controlFlow$Node;
                if (this.parent == null || (controlFlow$Node = ControlFlow$Node.getAncestor(this.parent, controlFlow$Access.node(arrbasicBlock[k]), arrn)) == this.parent) continue;
                this.parent = controlFlow$Node;
                bl = true;
            }
        }
        return bl;
    }

    private static ControlFlow$Node getAncestor(ControlFlow$Node controlFlow$Node, ControlFlow$Node controlFlow$Node2, int[] arrn) {
        while (controlFlow$Node != controlFlow$Node2) {
            if (arrn[controlFlow$Node.block.j] < arrn[controlFlow$Node2.block.j]) {
                controlFlow$Node = controlFlow$Node.parent;
            } else {
                controlFlow$Node2 = controlFlow$Node2.parent;
            }
            if (controlFlow$Node != null && controlFlow$Node2 != null) continue;
            return null;
        }
        return controlFlow$Node;
    }

    private static void setChildren(ControlFlow$Node[] arrcontrolFlow$Node) {
        ControlFlow$Node controlFlow$Node;
        int n6;
        int n10 = arrcontrolFlow$Node.length;
        int[] arrn = new int[n10];
        for (n6 = 0; n6 < n10; ++n6) {
            arrn[n6] = 0;
        }
        for (n6 = 0; n6 < n10; ++n6) {
            controlFlow$Node = arrcontrolFlow$Node[n6].parent;
            if (controlFlow$Node == null) continue;
            int n11 = controlFlow$Node.block.j;
            arrn[n11] = arrn[n11] + 1;
        }
        for (n6 = 0; n6 < n10; ++n6) {
            arrcontrolFlow$Node[n6].children = new ControlFlow$Node[arrn[n6]];
        }
        for (n6 = 0; n6 < n10; ++n6) {
            arrn[n6] = 0;
        }
        for (n6 = 0; n6 < n10; ++n6) {
            controlFlow$Node = arrcontrolFlow$Node[n6];
            ControlFlow$Node controlFlow$Node2 = controlFlow$Node.parent;
            if (controlFlow$Node2 == null) continue;
            int n12 = controlFlow$Node2.block.j;
            int n13 = arrn[n12];
            arrn[n12] = n13 + 1;
            controlFlow$Node2.children[n13] = controlFlow$Node;
        }
    }

    static ControlFlow$Block access$200(ControlFlow$Node controlFlow$Node) {
        return controlFlow$Node.block;
    }

    static void access$300(ControlFlow$Node[] arrcontrolFlow$Node) {
        ControlFlow$Node.setChildren(arrcontrolFlow$Node);
    }
}

