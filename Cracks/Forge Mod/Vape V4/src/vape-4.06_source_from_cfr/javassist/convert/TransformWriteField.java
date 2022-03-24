/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CtClass;
import javassist.CtField;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.convert.TransformReadField;
import javassist.convert.Transformer;

public final class TransformWriteField
extends TransformReadField {
    public TransformWriteField(Transformer transformer, CtField ctField, String string, String string2) {
        super(transformer, ctField, string, string2);
    }

    @Override
    public int transform(CtClass ctClass, int n6, CodeIterator codeIterator, ConstPool constPool) throws BadBytecode {
        int n10 = codeIterator.byteAt(n6);
        if (n10 == 181 || n10 == 179) {
            int n11 = codeIterator.u16bitAt(n6 + 1);
            String string = TransformWriteField.isField(ctClass.getClassPool(), constPool, this.fieldClass, this.fieldname, this.isPrivate, n11);
            if (string != null) {
                if (n10 == 179) {
                    CodeAttribute codeAttribute = codeIterator.get();
                    codeIterator.move(n6);
                    char c3 = string.charAt(0);
                    if (c3 == 'J' || c3 == 'D') {
                        n6 = codeIterator.insertGap(3);
                        codeIterator.writeByte(1, n6);
                        codeIterator.writeByte(91, n6 + 1);
                        codeIterator.writeByte(87, n6 + 2);
                        codeAttribute.setMaxStack(codeAttribute.getMaxStack() + 2);
                    } else {
                        n6 = codeIterator.insertGap(2);
                        codeIterator.writeByte(1, n6);
                        codeIterator.writeByte(95, n6 + 1);
                        codeAttribute.setMaxStack(codeAttribute.getMaxStack() + 1);
                    }
                    n6 = codeIterator.next();
                }
                int n12 = constPool.addClassInfo(this.methodClassname);
                String string2 = "(Ljava/lang/Object;" + string + ")V";
                int n13 = constPool.addMethodrefInfo(n12, this.methodName, string2);
                codeIterator.writeByte(184, n6);
                codeIterator.write16bit(n13, n6 + 1);
            }
        }
        return n6;
    }
}

