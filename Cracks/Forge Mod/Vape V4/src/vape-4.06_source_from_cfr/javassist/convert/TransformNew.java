/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMapTable;
import javassist.convert.Transformer;

public final class TransformNew
extends Transformer {
    private int nested;
    private String classname;
    private String trapClass;
    private String trapMethod;

    public TransformNew(Transformer transformer, String string, String string2, String string3) {
        super(transformer);
        this.classname = string;
        this.trapClass = string2;
        this.trapMethod = string3;
    }

    @Override
    public void initialize(ConstPool constPool, CodeAttribute codeAttribute) {
        this.nested = 0;
    }

    @Override
    public int transform(CtClass ctClass, int n6, CodeIterator codeIterator, ConstPool constPool) throws CannotCompileException {
        int n10;
        int n11;
        int n12 = codeIterator.byteAt(n6);
        if (n12 == 187) {
            int n13 = codeIterator.u16bitAt(n6 + 1);
            if (constPool.getClassInfo(n13).equals(this.classname)) {
                StackMap stackMap;
                if (codeIterator.byteAt(n6 + 3) != 89) {
                    throw new CannotCompileException("NEW followed by no DUP was found");
                }
                codeIterator.writeByte(0, n6);
                codeIterator.writeByte(0, n6 + 1);
                codeIterator.writeByte(0, n6 + 2);
                codeIterator.writeByte(0, n6 + 3);
                ++this.nested;
                StackMapTable stackMapTable = (StackMapTable)codeIterator.get().getAttribute("StackMapTable");
                if (stackMapTable != null) {
                    stackMapTable.removeNew(n6);
                }
                if ((stackMap = (StackMap)codeIterator.get().getAttribute("StackMap")) != null) {
                    stackMap.removeNew(n6);
                }
            }
        } else if (n12 == 183 && (n11 = constPool.isConstructor(this.classname, n10 = codeIterator.u16bitAt(n6 + 1))) != 0 && this.nested > 0) {
            int n14 = this.computeMethodref(n11, constPool);
            codeIterator.writeByte(184, n6);
            codeIterator.write16bit(n14, n6 + 1);
            --this.nested;
        }
        return n6;
    }

    private int computeMethodref(int n6, ConstPool constPool) {
        int n10 = constPool.addClassInfo(this.trapClass);
        int n11 = constPool.addUtf8Info(this.trapMethod);
        n6 = constPool.addUtf8Info(Descriptor.changeReturnType(this.classname, constPool.getUtf8Info(n6)));
        return constPool.addMethodrefInfo(n10, constPool.addNameAndTypeInfo(n11, n6));
    }
}

