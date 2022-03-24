/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.analysis.Type;

public class Frame {
    private Type[] locals;
    private Type[] stack;
    private int top;
    private boolean jsrMerged;
    private boolean retMerged;

    public Frame(int n6, int n10) {
        this.locals = new Type[n6];
        this.stack = new Type[n10];
    }

    public Type getLocal(int n6) {
        return this.locals[n6];
    }

    public void setLocal(int n6, Type type) {
        this.locals[n6] = type;
    }

    public Type getStack(int n6) {
        return this.stack[n6];
    }

    public void setStack(int n6, Type type) {
        this.stack[n6] = type;
    }

    public void clearStack() {
        this.top = 0;
    }

    public int getTopIndex() {
        return this.top - 1;
    }

    public int localsLength() {
        return this.locals.length;
    }

    public Type peek() {
        if (this.top < 1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return this.stack[this.top - 1];
    }

    public Type pop() {
        if (this.top < 1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return this.stack[--this.top];
    }

    public void push(Type type) {
        this.stack[this.top++] = type;
    }

    public Frame copy() {
        Frame frame = new Frame(this.locals.length, this.stack.length);
        System.arraycopy(this.locals, 0, frame.locals, 0, this.locals.length);
        System.arraycopy(this.stack, 0, frame.stack, 0, this.stack.length);
        frame.top = this.top;
        return frame;
    }

    public Frame copyStack() {
        Frame frame = new Frame(this.locals.length, this.stack.length);
        System.arraycopy(this.stack, 0, frame.stack, 0, this.stack.length);
        frame.top = this.top;
        return frame;
    }

    public boolean mergeStack(Frame frame) {
        boolean bl = false;
        if (this.top != frame.top) {
            throw new RuntimeException("Operand stacks could not be merged, they are different sizes!");
        }
        for (int k = 0; k < this.top; ++k) {
            if (this.stack[k] == null) continue;
            Type type = this.stack[k];
            Type type2 = type.merge(frame.stack[k]);
            if (type2 == Type.BOGUS) {
                throw new RuntimeException("Operand stacks could not be merged due to differing primitive types: pos = " + k);
            }
            this.stack[k] = type2;
            if (type2.equals(type) && !type2.popChanged()) continue;
            bl = true;
        }
        return bl;
    }

    public boolean merge(Frame frame) {
        boolean bl = false;
        for (int k = 0; k < this.locals.length; ++k) {
            if (this.locals[k] != null) {
                Type type;
                Type type2 = this.locals[k];
                this.locals[k] = type = type2.merge(frame.locals[k]);
                if (type.equals(type2) && !type.popChanged()) continue;
                bl = true;
                continue;
            }
            if (frame.locals[k] == null) continue;
            this.locals[k] = frame.locals[k];
            bl = true;
        }
        return bl |= this.mergeStack(frame);
    }

    public String toString() {
        int n6;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("locals = [");
        for (n6 = 0; n6 < this.locals.length; ++n6) {
            stringBuffer.append(this.locals[n6] == null ? "empty" : this.locals[n6].toString());
            if (n6 >= this.locals.length - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append("] stack = [");
        for (n6 = 0; n6 < this.top; ++n6) {
            stringBuffer.append(this.stack[n6]);
            if (n6 >= this.top - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    boolean isJsrMerged() {
        return this.jsrMerged;
    }

    void setJsrMerged(boolean bl) {
        this.jsrMerged = bl;
    }

    boolean isRetMerged() {
        return this.retMerged;
    }

    void setRetMerged(boolean bl) {
        this.retMerged = bl;
    }
}

