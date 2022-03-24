/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Visitor;

public class ASTList
extends ASTree {
    private static final long serialVersionUID = 1L;
    private ASTree left;
    private ASTList right;

    public ASTList(ASTree aSTree, ASTList aSTList) {
        this.left = aSTree;
        this.right = aSTList;
    }

    public ASTList(ASTree aSTree) {
        this.left = aSTree;
        this.right = null;
    }

    public static ASTList make(ASTree aSTree, ASTree aSTree2, ASTree aSTree3) {
        return new ASTList(aSTree, new ASTList(aSTree2, new ASTList(aSTree3)));
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
        this.right = (ASTList)aSTree;
    }

    public ASTree head() {
        return this.left;
    }

    public void setHead(ASTree aSTree) {
        this.left = aSTree;
    }

    public ASTList tail() {
        return this.right;
    }

    public void setTail(ASTList aSTList) {
        this.right = aSTList;
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atASTList(this);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(<");
        stringBuffer.append(this.getTag());
        stringBuffer.append('>');
        ASTList aSTList = this;
        while (aSTList != null) {
            stringBuffer.append(' ');
            ASTree aSTree = aSTList.left;
            stringBuffer.append(aSTree == null ? "<null>" : aSTree.toString());
            aSTList = aSTList.right;
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public int length() {
        return ASTList.length(this);
    }

    public static int length(ASTList aSTList) {
        if (aSTList == null) {
            return 0;
        }
        int n6 = 0;
        while (aSTList != null) {
            aSTList = aSTList.right;
            ++n6;
        }
        return n6;
    }

    public ASTList sublist(int n6) {
        ASTList aSTList = this;
        while (n6-- > 0) {
            aSTList = aSTList.right;
        }
        return aSTList;
    }

    public boolean subst(ASTree aSTree, ASTree aSTree2) {
        ASTList aSTList = this;
        while (aSTList != null) {
            if (aSTList.left == aSTree2) {
                aSTList.left = aSTree;
                return true;
            }
            aSTList = aSTList.right;
        }
        return false;
    }

    public static ASTList append(ASTList aSTList, ASTree aSTree) {
        return ASTList.concat(aSTList, new ASTList(aSTree));
    }

    public static ASTList concat(ASTList aSTList, ASTList aSTList2) {
        if (aSTList == null) {
            return aSTList2;
        }
        ASTList aSTList3 = aSTList;
        while (aSTList3.right != null) {
            aSTList3 = aSTList3.right;
        }
        aSTList3.right = aSTList2;
        return aSTList;
    }
}

