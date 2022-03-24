/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

final class ExprEditor$NewOp {
    ExprEditor$NewOp next;
    int pos;
    String type;

    ExprEditor$NewOp(ExprEditor$NewOp exprEditor$NewOp, int n6, String string) {
        this.next = exprEditor$NewOp;
        this.pos = n6;
        this.type = string;
    }
}

