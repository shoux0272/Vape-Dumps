/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.CodeIterator;
import javassist.bytecode.Opcode;

public class Util
implements Opcode {
    public static int getJumpTarget(int n6, CodeIterator codeIterator) {
        int n10;
        return n6 += (n10 = codeIterator.byteAt(n6)) == 201 || n10 == 200 ? codeIterator.s32bitAt(n6 + 1) : codeIterator.s16bitAt(n6 + 1);
    }

    public static boolean isJumpInstruction(int n6) {
        return n6 >= 153 && n6 <= 168 || n6 == 198 || n6 == 199 || n6 == 201 || n6 == 200;
    }

    public static boolean isGoto(int n6) {
        return n6 == 167 || n6 == 200;
    }

    public static boolean isJsr(int n6) {
        return n6 == 168 || n6 == 201;
    }

    public static boolean isReturn(int n6) {
        return n6 >= 172 && n6 <= 177;
    }
}

