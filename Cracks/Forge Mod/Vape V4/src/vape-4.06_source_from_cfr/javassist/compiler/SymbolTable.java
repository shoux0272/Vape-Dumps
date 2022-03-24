/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import java.util.HashMap;
import javassist.compiler.ast.Declarator;

public final class SymbolTable
extends HashMap<String, Declarator> {
    private static final long serialVersionUID = 1L;
    private SymbolTable parent;

    public SymbolTable() {
        this((SymbolTable)null);
    }

    public SymbolTable(SymbolTable symbolTable) {
        this.parent = symbolTable;
    }

    public SymbolTable getParent() {
        return this.parent;
    }

    public Declarator lookup(String string) {
        Declarator declarator = (Declarator)this.get(string);
        if (declarator == null && this.parent != null) {
            return this.parent.lookup(string);
        }
        return declarator;
    }

    public void append(String string, Declarator declarator) {
        this.put(string, declarator);
    }
}

