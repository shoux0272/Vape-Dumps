/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.LineNumberAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMapTable;

class CodeIterator$Pointers {
    int cursor;
    int mark0;
    int mark;
    int mark2;
    ExceptionTable etable;
    LineNumberAttribute line;
    LocalVariableAttribute vars;
    LocalVariableAttribute types;
    StackMapTable stack;
    StackMap stack2;

    CodeIterator$Pointers(int n6, int n10, int n11, int n12, ExceptionTable exceptionTable, CodeAttribute codeAttribute) {
        this.cursor = n6;
        this.mark = n10;
        this.mark2 = n11;
        this.mark0 = n12;
        this.etable = exceptionTable;
        this.line = (LineNumberAttribute)codeAttribute.getAttribute("LineNumberTable");
        this.vars = (LocalVariableAttribute)codeAttribute.getAttribute("LocalVariableTable");
        this.types = (LocalVariableAttribute)codeAttribute.getAttribute("LocalVariableTypeTable");
        this.stack = (StackMapTable)codeAttribute.getAttribute("StackMapTable");
        this.stack2 = (StackMap)codeAttribute.getAttribute("StackMap");
    }

    void shiftPc(int n6, int n10, boolean bl) throws BadBytecode {
        if (n6 < this.cursor || n6 == this.cursor && bl) {
            this.cursor += n10;
        }
        if (n6 < this.mark || n6 == this.mark && bl) {
            this.mark += n10;
        }
        if (n6 < this.mark2 || n6 == this.mark2 && bl) {
            this.mark2 += n10;
        }
        if (n6 < this.mark0 || n6 == this.mark0 && bl) {
            this.mark0 += n10;
        }
        this.etable.shiftPc(n6, n10, bl);
        if (this.line != null) {
            this.line.shiftPc(n6, n10, bl);
        }
        if (this.vars != null) {
            this.vars.shiftPc(n6, n10, bl);
        }
        if (this.types != null) {
            this.types.shiftPc(n6, n10, bl);
        }
        if (this.stack != null) {
            this.stack.shiftPc(n6, n10, bl);
        }
        if (this.stack2 != null) {
            this.stack2.shiftPc(n6, n10, bl);
        }
    }

    void shiftForSwitch(int n6, int n10) throws BadBytecode {
        if (this.stack != null) {
            this.stack.shiftForSwitch(n6, n10);
        }
        if (this.stack2 != null) {
            this.stack2.shiftForSwitch(n6, n10);
        }
    }
}

