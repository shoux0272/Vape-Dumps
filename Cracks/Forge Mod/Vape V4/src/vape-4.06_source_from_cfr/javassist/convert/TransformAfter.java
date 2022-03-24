/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeIterator;
import javassist.convert.TransformBefore;
import javassist.convert.Transformer;

public class TransformAfter
extends TransformBefore {
    public TransformAfter(Transformer transformer, CtMethod ctMethod, CtMethod ctMethod2) throws NotFoundException {
        super(transformer, ctMethod, ctMethod2);
    }

    @Override
    protected int match2(int n6, CodeIterator codeIterator) throws BadBytecode {
        codeIterator.move(n6);
        codeIterator.insert(this.saveCode);
        codeIterator.insert(this.loadCode);
        int n10 = codeIterator.insertGap(3);
        codeIterator.setMark(n10);
        codeIterator.insert(this.loadCode);
        n6 = codeIterator.next();
        n10 = codeIterator.getMark();
        codeIterator.writeByte(codeIterator.byteAt(n6), n10);
        codeIterator.write16bit(codeIterator.u16bitAt(n6 + 1), n10 + 1);
        codeIterator.writeByte(184, n6);
        codeIterator.write16bit(this.newIndex, n6 + 1);
        codeIterator.move(n10);
        return codeIterator.next();
    }
}

