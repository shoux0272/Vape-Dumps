/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.TokenId;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Symbol;
import javassist.compiler.ast.Visitor;

public class Declarator
extends ASTList
implements TokenId {
    private static final long serialVersionUID = 1L;
    protected int varType;
    protected int arrayDim;
    protected int localVar;
    protected String qualifiedClass;

    public Declarator(int n6, int n10) {
        super(null);
        this.varType = n6;
        this.arrayDim = n10;
        this.localVar = -1;
        this.qualifiedClass = null;
    }

    public Declarator(ASTList aSTList, int n6) {
        super(null);
        this.varType = 307;
        this.arrayDim = n6;
        this.localVar = -1;
        this.qualifiedClass = Declarator.astToClassName(aSTList, '/');
    }

    public Declarator(int n6, String string, int n10, int n11, Symbol symbol) {
        super(null);
        this.varType = n6;
        this.arrayDim = n10;
        this.localVar = n11;
        this.qualifiedClass = string;
        this.setLeft(symbol);
        Declarator.append(this, null);
    }

    public Declarator make(Symbol symbol, int n6, ASTree aSTree) {
        Declarator declarator = new Declarator(this.varType, this.arrayDim + n6);
        declarator.qualifiedClass = this.qualifiedClass;
        declarator.setLeft(symbol);
        Declarator.append(declarator, aSTree);
        return declarator;
    }

    public int getType() {
        return this.varType;
    }

    public int getArrayDim() {
        return this.arrayDim;
    }

    public void addArrayDim(int n6) {
        this.arrayDim += n6;
    }

    public String getClassName() {
        return this.qualifiedClass;
    }

    public void setClassName(String string) {
        this.qualifiedClass = string;
    }

    public Symbol getVariable() {
        return (Symbol)this.getLeft();
    }

    public void setVariable(Symbol symbol) {
        this.setLeft(symbol);
    }

    public ASTree getInitializer() {
        ASTList aSTList = this.tail();
        if (aSTList != null) {
            return aSTList.head();
        }
        return null;
    }

    public void setLocalVar(int n6) {
        this.localVar = n6;
    }

    public int getLocalVar() {
        return this.localVar;
    }

    @Override
    public String getTag() {
        return "decl";
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atDeclarator(this);
    }

    public static String astToClassName(ASTList aSTList, char c3) {
        if (aSTList == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Declarator.astToClassName(stringBuffer, aSTList, c3);
        return stringBuffer.toString();
    }

    private static void astToClassName(StringBuffer stringBuffer, ASTList aSTList, char c3) {
        while (true) {
            ASTree aSTree;
            if ((aSTree = aSTList.head()) instanceof Symbol) {
                stringBuffer.append(((Symbol)aSTree).get());
            } else if (aSTree instanceof ASTList) {
                Declarator.astToClassName(stringBuffer, (ASTList)aSTree, c3);
            }
            aSTList = aSTList.tail();
            if (aSTList == null) break;
            stringBuffer.append(c3);
        }
    }
}

