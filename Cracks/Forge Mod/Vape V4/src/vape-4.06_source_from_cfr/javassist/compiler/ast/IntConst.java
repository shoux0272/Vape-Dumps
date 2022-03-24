/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.DoubleConst;
import javassist.compiler.ast.Visitor;

public class IntConst
extends ASTree {
    private static final long serialVersionUID = 1L;
    protected long value;
    protected int type;

    public IntConst(long l, int n6) {
        this.value = l;
        this.type = n6;
    }

    public long get() {
        return this.value;
    }

    public void set(long l) {
        this.value = l;
    }

    public int getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return Long.toString(this.value);
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atIntConst(this);
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

    private IntConst compute0(int n6, IntConst intConst) {
        long l;
        int n10 = this.type;
        int n11 = intConst.type;
        int n12 = n10 == 403 || n11 == 403 ? 403 : (n10 == 401 && n11 == 401 ? 401 : 402);
        long l6 = this.value;
        long l10 = intConst.value;
        switch (n6) {
            case 43: {
                l = l6 + l10;
                break;
            }
            case 45: {
                l = l6 - l10;
                break;
            }
            case 42: {
                l = l6 * l10;
                break;
            }
            case 47: {
                l = l6 / l10;
                break;
            }
            case 37: {
                l = l6 % l10;
                break;
            }
            case 124: {
                l = l6 | l10;
                break;
            }
            case 94: {
                l = l6 ^ l10;
                break;
            }
            case 38: {
                l = l6 & l10;
                break;
            }
            case 364: {
                l = this.value << (int)l10;
                n12 = n10;
                break;
            }
            case 366: {
                l = this.value >> (int)l10;
                n12 = n10;
                break;
            }
            case 370: {
                l = this.value >>> (int)l10;
                n12 = n10;
                break;
            }
            default: {
                return null;
            }
        }
        return new IntConst(l, n12);
    }

    private DoubleConst compute0(int n6, DoubleConst doubleConst) {
        double d10;
        double d11 = this.value;
        double d12 = doubleConst.value;
        switch (n6) {
            case 43: {
                d10 = d11 + d12;
                break;
            }
            case 45: {
                d10 = d11 - d12;
                break;
            }
            case 42: {
                d10 = d11 * d12;
                break;
            }
            case 47: {
                d10 = d11 / d12;
                break;
            }
            case 37: {
                d10 = d11 % d12;
                break;
            }
            default: {
                return null;
            }
        }
        return new DoubleConst(d10, doubleConst.type);
    }
}

