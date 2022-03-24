/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Visitor;

public class ArrayInit
extends ASTList {
    private static final long serialVersionUID = 1L;

    public ArrayInit(ASTree aSTree) {
        super(aSTree);
    }

    public int h() {
        int n6 = this.length();
        if (n6 == 1 && this.head() == null) {
            return 0;
        }
        return n6;
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atArrayInit(this);
    }

    @Override
    public String getTag() {
        return "array";
    }
}

