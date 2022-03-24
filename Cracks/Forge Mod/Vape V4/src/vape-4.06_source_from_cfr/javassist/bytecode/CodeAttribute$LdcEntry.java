/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ExceptionTable;

class CodeAttribute$LdcEntry {
    CodeAttribute$LdcEntry next;
    int where;
    int index;

    CodeAttribute$LdcEntry() {
    }

    static byte[] doit(byte[] arrby, CodeAttribute$LdcEntry codeAttribute$LdcEntry, ExceptionTable exceptionTable, CodeAttribute codeAttribute) throws BadBytecode {
        if (codeAttribute$LdcEntry != null) {
            arrby = CodeIterator.changeLdcToLdcW(arrby, exceptionTable, codeAttribute, codeAttribute$LdcEntry);
        }
        return arrby;
    }
}

