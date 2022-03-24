/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.convert.Transformer;

public final class TransformNewClass
extends Transformer {
    private int nested;
    private String classname;
    private String newClassName;
    private int newClassIndex;
    private int newMethodNTIndex;
    private int newMethodIndex;

    public TransformNewClass(Transformer transformer, String string, String string2) {
        super(transformer);
        this.classname = string;
        this.newClassName = string2;
    }

    @Override
    public void initialize(ConstPool constPool, CodeAttribute codeAttribute) {
        this.nested = 0;
        this.newMethodIndex = 0;
        this.newMethodNTIndex = 0;
        this.newClassIndex = 0;
    }

    @Override
    public int transform(CtClass ctClass, int n6, CodeIterator codeIterator, ConstPool constPool) throws CannotCompileException {
        int n10;
        int n11;
        int n12 = codeIterator.byteAt(n6);
        if (n12 == 187) {
            int n13 = codeIterator.u16bitAt(n6 + 1);
            if (constPool.getClassInfo(n13).equals(this.classname)) {
                if (codeIterator.byteAt(n6 + 3) != 89) {
                    throw new CannotCompileException("NEW followed by no DUP was found");
                }
                if (this.newClassIndex == 0) {
                    this.newClassIndex = constPool.addClassInfo(this.newClassName);
                }
                codeIterator.write16bit(this.newClassIndex, n6 + 1);
                ++this.nested;
            }
        } else if (n12 == 183 && (n11 = constPool.isConstructor(this.classname, n10 = codeIterator.u16bitAt(n6 + 1))) != 0 && this.nested > 0) {
            int n14 = constPool.getMethodrefNameAndType(n10);
            if (this.newMethodNTIndex != n14) {
                this.newMethodNTIndex = n14;
                this.newMethodIndex = constPool.addMethodrefInfo(this.newClassIndex, n14);
            }
            codeIterator.write16bit(this.newMethodIndex, n6 + 1);
            --this.nested;
        }
        return n6;
    }
}

