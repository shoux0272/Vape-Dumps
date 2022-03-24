/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CtClass;
import javassist.CtField;
import javassist.Modifier;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.convert.TransformReadField;
import javassist.convert.Transformer;

public final class TransformFieldAccess
extends Transformer {
    private String newClassname;
    private String newFieldname;
    private String fieldname;
    private CtClass fieldClass;
    private boolean isPrivate;
    private int newIndex;
    private ConstPool constPool;

    public TransformFieldAccess(Transformer transformer, CtField ctField, String string, String string2) {
        super(transformer);
        this.fieldClass = ctField.getDeclaringClass();
        this.fieldname = ctField.getName();
        this.isPrivate = Modifier.isPrivate(ctField.getModifiers());
        this.newClassname = string;
        this.newFieldname = string2;
        this.constPool = null;
    }

    @Override
    public void initialize(ConstPool constPool, CodeAttribute codeAttribute) {
        if (this.constPool != constPool) {
            this.newIndex = 0;
        }
    }

    @Override
    public int transform(CtClass ctClass, int n6, CodeIterator codeIterator, ConstPool constPool) {
        int n10 = codeIterator.byteAt(n6);
        if (n10 == 180 || n10 == 178 || n10 == 181 || n10 == 179) {
            int n11 = codeIterator.u16bitAt(n6 + 1);
            String string = TransformReadField.isField(ctClass.getClassPool(), constPool, this.fieldClass, this.fieldname, this.isPrivate, n11);
            if (string != null) {
                if (this.newIndex == 0) {
                    int n12 = constPool.addNameAndTypeInfo(this.newFieldname, string);
                    this.newIndex = constPool.addFieldrefInfo(constPool.addClassInfo(this.newClassname), n12);
                    this.constPool = constPool;
                }
                codeIterator.write16bit(this.newIndex, n6 + 1);
            }
        }
        return n6;
    }
}

