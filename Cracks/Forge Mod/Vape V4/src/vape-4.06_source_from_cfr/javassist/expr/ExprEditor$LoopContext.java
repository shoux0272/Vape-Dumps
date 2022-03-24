/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.expr.ExprEditor$NewOp;

final class ExprEditor$LoopContext {
    ExprEditor.NewOp newList;
    int maxLocals;
    int maxStack;

    ExprEditor$LoopContext(int n6) {
        this.maxLocals = n6;
        this.maxStack = 0;
        this.newList = null;
    }

    void updateMax(int n6, int n10) {
        if (this.maxLocals < n6) {
            this.maxLocals = n6;
        }
        if (this.maxStack < n10) {
            this.maxStack = n10;
        }
    }
}

