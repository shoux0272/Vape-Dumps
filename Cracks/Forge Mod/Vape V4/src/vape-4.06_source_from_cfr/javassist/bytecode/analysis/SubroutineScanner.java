/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.Opcode;
import javassist.bytecode.analysis.Subroutine;
import javassist.bytecode.analysis.Util;

public class SubroutineScanner
implements Opcode {
    private Subroutine[] subroutines;
    Map<Integer, Subroutine> subTable = new HashMap<Integer, Subroutine>();
    Set<Integer> done = new HashSet<Integer>();

    public Subroutine[] scan(MethodInfo methodInfo) throws BadBytecode {
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        CodeIterator codeIterator = codeAttribute.iterator();
        this.subroutines = new Subroutine[codeAttribute.getCodeLength()];
        this.subTable.clear();
        this.done.clear();
        this.scan(0, codeIterator, null);
        ExceptionTable exceptionTable = codeAttribute.getExceptionTable();
        for (int k = 0; k < exceptionTable.size(); ++k) {
            int n6 = exceptionTable.handlerPc(k);
            this.scan(n6, codeIterator, this.subroutines[exceptionTable.startPc(k)]);
        }
        return this.subroutines;
    }

    private void scan(int n6, CodeIterator codeIterator, Subroutine subroutine) throws BadBytecode {
        boolean bl;
        if (this.done.contains(n6)) {
            return;
        }
        this.done.add(n6);
        int n10 = codeIterator.lookAhead();
        codeIterator.move(n6);
        while (bl = this.scanOp(n6 = codeIterator.next(), codeIterator, subroutine) && codeIterator.hasNext()) {
        }
        codeIterator.move(n10);
    }

    private boolean scanOp(int n6, CodeIterator codeIterator, Subroutine subroutine) throws BadBytecode {
        this.subroutines[n6] = subroutine;
        int n10 = codeIterator.byteAt(n6);
        if (n10 == 170) {
            this.scanTableSwitch(n6, codeIterator, subroutine);
            return false;
        }
        if (n10 == 171) {
            this.scanLookupSwitch(n6, codeIterator, subroutine);
            return false;
        }
        if (Util.isReturn(n10) || n10 == 169 || n10 == 191) {
            return false;
        }
        if (Util.isJumpInstruction(n10)) {
            int n11 = Util.getJumpTarget(n6, codeIterator);
            if (n10 == 168 || n10 == 201) {
                Subroutine subroutine2 = this.subTable.get(n11);
                if (subroutine2 == null) {
                    subroutine2 = new Subroutine(n11, n6);
                    this.subTable.put(n11, subroutine2);
                    this.scan(n11, codeIterator, subroutine2);
                } else {
                    subroutine2.addCaller(n6);
                }
            } else {
                this.scan(n11, codeIterator, subroutine);
                if (Util.isGoto(n10)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void scanLookupSwitch(int n6, CodeIterator codeIterator, Subroutine subroutine) throws BadBytecode {
        int n10 = (n6 & 0xFFFFFFFC) + 4;
        this.scan(n6 + codeIterator.s32bitAt(n10), codeIterator, subroutine);
        int n11 = codeIterator.s32bitAt(n10 += 4);
        int n12 = n11 * 8 + (n10 += 4);
        n10 += 4;
        while (n10 < n12) {
            int n13 = codeIterator.s32bitAt(n10) + n6;
            this.scan(n13, codeIterator, subroutine);
            n10 += 8;
        }
    }

    private void scanTableSwitch(int n6, CodeIterator codeIterator, Subroutine subroutine) throws BadBytecode {
        int n10 = (n6 & 0xFFFFFFFC) + 4;
        this.scan(n6 + codeIterator.s32bitAt(n10), codeIterator, subroutine);
        int n11 = codeIterator.s32bitAt(n10 += 4);
        int n12 = codeIterator.s32bitAt(n10 += 4);
        int n13 = (n12 - n11 + 1) * 4 + (n10 += 4);
        while (n10 < n13) {
            int n14 = codeIterator.s32bitAt(n10) + n6;
            this.scan(n14, codeIterator, subroutine);
            n10 += 4;
        }
    }
}

