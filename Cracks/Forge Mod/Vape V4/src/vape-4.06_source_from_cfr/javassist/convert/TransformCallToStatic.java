/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CtMethod;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.convert.TransformCall;
import javassist.convert.Transformer;

public class TransformCallToStatic
extends TransformCall {
    public TransformCallToStatic(Transformer transformer, CtMethod ctMethod, CtMethod ctMethod2) {
        super(transformer, ctMethod, ctMethod2);
        this.methodDescriptor = ctMethod.getMethodInfo2().getDescriptor();
    }

    @Override
    protected int match(int n6, int n10, CodeIterator codeIterator, int n11, ConstPool constPool) {
        if (this.newIndex == 0) {
            String string = Descriptor.insertParameter(this.classname, this.methodDescriptor);
            int n12 = constPool.addNameAndTypeInfo(this.newMethodname, string);
            int n13 = constPool.addClassInfo(this.newClassname);
            this.newIndex = constPool.addMethodrefInfo(n13, n12);
            this.constPool = constPool;
        }
        codeIterator.writeByte(184, n10);
        codeIterator.write16bit(this.newIndex, n10 + 1);
        return n10;
    }
}

