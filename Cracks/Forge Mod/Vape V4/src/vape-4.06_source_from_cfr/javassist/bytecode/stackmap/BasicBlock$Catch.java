/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import javassist.bytecode.stackmap.BasicBlock;

public class BasicBlock$Catch {
    public BasicBlock$Catch next;
    public BasicBlock body;
    public int typeIndex;

    BasicBlock$Catch(BasicBlock basicBlock, int n6, BasicBlock$Catch basicBlock$Catch) {
        this.body = basicBlock;
        this.typeIndex = n6;
        this.next = basicBlock$Catch;
    }
}

