/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.CtField;
import javassist.compiler.CompileError;
import javassist.compiler.ast.Symbol;
import javassist.compiler.ast.Visitor;

public class Member
extends Symbol {
    private static final long serialVersionUID = 1L;
    private CtField field = null;

    public Member(String string) {
        super(string);
    }

    public void setField(CtField ctField) {
        this.field = ctField;
    }

    public CtField getField() {
        return this.field;
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atMember(this);
    }
}

