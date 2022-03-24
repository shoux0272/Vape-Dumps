/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import java.io.Serializable;
import javassist.compiler.CompileError;
import javassist.compiler.ast.Visitor;

public abstract class ASTree
implements Serializable {
    private static final long serialVersionUID = 1L;
    private static String b;

    public ASTree getLeft() {
        return null;
    }

    public ASTree getRight() {
        return null;
    }

    public void setLeft(ASTree aSTree) {
    }

    public void setRight(ASTree aSTree) {
    }

    public abstract void accept(Visitor var1) throws CompileError;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('<');
        stringBuffer.append(this.getTag());
        stringBuffer.append('>');
        return stringBuffer.toString();
    }

    protected String getTag() {
        String string = this.getClass().getName();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    static {
        if (ASTree.b() != null) {
            ASTree.b("Le2wpc");
        }
    }
}

