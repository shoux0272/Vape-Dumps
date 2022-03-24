/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Visitor;

public class Pair
extends ASTree {
    private static final long serialVersionUID = 1L;
    protected ASTree left;
    protected ASTree right;

    public Pair(ASTree aSTree, ASTree aSTree2) {
        this.left = aSTree;
        this.right = aSTree2;
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atPair(this);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(<Pair> ");
        stringBuffer.append(this.left == null ? "<null>" : this.left.toString());
        stringBuffer.append(" . ");
        stringBuffer.append(this.right == null ? "<null>" : this.right.toString());
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    @Override
    public ASTree getLeft() {
        return this.left;
    }

    @Override
    public ASTree getRight() {
        return this.right;
    }

    @Override
    public void setLeft(ASTree aSTree) {
        this.left = aSTree;
    }

    @Override
    public void setRight(ASTree aSTree) {
        this.right = aSTree;
    }
}

