/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.LineNumberAttribute$Pc;

public class LineNumberAttribute
extends AttributeInfo {
    public static final String tag = "LineNumberTable";

    LineNumberAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    private LineNumberAttribute(ConstPool constPool, byte[] arrby) {
        super(constPool, tag, arrby);
    }

    public int tableLength() {
        return ByteArray.readU16bit(this.info, 0);
    }

    public int startPc(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 4 + 2);
    }

    public int lineNumber(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 4 + 4);
    }

    public int toLineNumber(int n6) {
        int n10;
        int n11 = this.tableLength();
        for (n10 = 0; n10 < n11; ++n10) {
            if (n6 >= this.startPc(n10)) continue;
            if (n10 != 0) break;
            return this.lineNumber(0);
        }
        return this.lineNumber(n10 - 1);
    }

    public int toStartPc(int n6) {
        int n10 = this.tableLength();
        for (int k = 0; k < n10; ++k) {
            if (n6 != this.lineNumber(k)) continue;
            return this.startPc(k);
        }
        return -1;
    }

    public LineNumberAttribute$Pc toNearPc(int n6) {
        int n10 = this.tableLength();
        int n11 = 0;
        int n12 = 0;
        if (n10 > 0) {
            n12 = this.lineNumber(0) - n6;
            n11 = this.startPc(0);
        }
        for (int k = 1; k < n10; ++k) {
            int n13 = this.lineNumber(k) - n6;
            if ((n13 >= 0 || n13 <= n12) && (n13 < 0 || n13 >= n12 && n12 >= 0)) continue;
            n12 = n13;
            n11 = this.startPc(k);
        }
        LineNumberAttribute$Pc lineNumberAttribute$Pc = new LineNumberAttribute$Pc();
        lineNumberAttribute$Pc.index = n11;
        lineNumberAttribute$Pc.line = n6 + n12;
        return lineNumberAttribute$Pc;
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        byte[] arrby = this.info;
        int n6 = arrby.length;
        byte[] arrby2 = new byte[n6];
        for (int k = 0; k < n6; ++k) {
            arrby2[k] = arrby[k];
        }
        LineNumberAttribute lineNumberAttribute = new LineNumberAttribute(constPool, arrby2);
        return lineNumberAttribute;
    }

    void shiftPc(int n6, int n10, boolean bl) {
        int n11 = this.tableLength();
        for (int k = 0; k < n11; ++k) {
            int n12 = k * 4 + 2;
            int n13 = ByteArray.readU16bit(this.info, n12);
            if (n13 <= n6 && (!bl || n13 != n6)) continue;
            ByteArray.write16bit(n13 + n10, this.info, n12);
        }
    }
}

