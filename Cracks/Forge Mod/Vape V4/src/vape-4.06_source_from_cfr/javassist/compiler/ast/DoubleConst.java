/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.IntConst;
import javassist.compiler.ast.Visitor;

public class DoubleConst
extends ASTree {
    private static final long serialVersionUID = 1L;
    protected double value;
    protected int type;

    public DoubleConst(double d10, int n6) {
        this.value = d10;
        this.type = n6;
    }

    public double get() {
        return this.value;
    }

    public void set(double d10) {
        this.value = d10;
    }

    public int getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return Double.toString(this.value);
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atDoubleConst(this);
    }

    public ASTree compute(int n6, ASTree aSTree) {
        if (aSTree instanceof IntConst) {
            return this.compute0(n6, (IntConst)aSTree);
        }
        if (aSTree instanceof DoubleConst) {
            return this.compute0(n6, (DoubleConst)aSTree);
        }
        return null;
    }

    private DoubleConst compute0(int n6, DoubleConst doubleConst) {
        int n10 = this.type == 405 || doubleConst.type == 405 ? 405 : 404;
        return DoubleConst.compute(n6, this.value, doubleConst.value, n10);
    }

    private DoubleConst compute0(int n6, IntConst intConst) {
        return DoubleConst.compute(n6, this.value, intConst.value, this.type);
    }

    private static DoubleConst compute(int n6, double d10, double d11, int n10) {
        double d12;
        switch (n6) {
            case 43: {
                d12 = d10 + d11;
                break;
            }
            case 45: {
                d12 = d10 - d11;
                break;
            }
            case 42: {
                d12 = d10 * d11;
                break;
            }
            case 47: {
                d12 = d10 / d11;
                break;
            }
            case 37: {
                d12 = d10 % d11;
                break;
            }
            default: {
                return null;
            }
        }
        return new DoubleConst(d12, n10);
    }
}

