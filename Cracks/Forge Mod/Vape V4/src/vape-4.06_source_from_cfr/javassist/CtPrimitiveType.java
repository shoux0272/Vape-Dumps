/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CtClass;

public final class CtPrimitiveType
extends CtClass {
    private char descriptor;
    private String wrapperName;
    private String getMethodName;
    private String mDescriptor;
    private int returnOp;
    private int arrayType;
    private int dataSize;

    CtPrimitiveType(String string, char c3, String string2, String string3, String string4, int n6, int n10, int n11) {
        super(string);
        this.descriptor = c3;
        this.wrapperName = string2;
        this.getMethodName = string3;
        this.mDescriptor = string4;
        this.returnOp = n6;
        this.arrayType = n10;
        this.dataSize = n11;
    }

    @Override
    public boolean isPrimitive() {
        return true;
    }

    @Override
    public int getModifiers() {
        return 17;
    }

    public char getDescriptor() {
        return this.descriptor;
    }

    public String getWrapperName() {
        return this.wrapperName;
    }

    public String getGetMethodName() {
        return this.getMethodName;
    }

    public String getGetMethodDescriptor() {
        return this.mDescriptor;
    }

    public int getReturnOp() {
        return this.returnOp;
    }

    public int getArrayType() {
        return this.arrayType;
    }

    public int getDataSize() {
        return this.dataSize;
    }
}

