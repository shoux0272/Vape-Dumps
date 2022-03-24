/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.convert.Transformer;

public class TransformReadField
extends Transformer {
    protected String fieldname;
    protected CtClass fieldClass;
    protected boolean isPrivate;
    protected String methodClassname;
    protected String methodName;

    public TransformReadField(Transformer transformer, CtField ctField, String string, String string2) {
        super(transformer);
        this.fieldClass = ctField.getDeclaringClass();
        this.fieldname = ctField.getName();
        this.methodClassname = string;
        this.methodName = string2;
        this.isPrivate = Modifier.isPrivate(ctField.getModifiers());
    }

    static String isField(ClassPool classPool, ConstPool constPool, CtClass ctClass, String string, boolean bl, int n6) {
        if (!constPool.getFieldrefName(n6).equals(string)) {
            return null;
        }
        try {
            CtClass ctClass2 = classPool.get(constPool.getFieldrefClassName(n6));
            if (ctClass2 == ctClass || !bl && TransformReadField.isFieldInSuper(ctClass2, ctClass, string)) {
                return constPool.getFieldrefType(n6);
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        return null;
    }

    static boolean isFieldInSuper(CtClass ctClass, CtClass ctClass2, String string) {
        if (!ctClass.subclassOf(ctClass2)) {
            return false;
        }
        try {
            CtField ctField = ctClass.getField(string);
            return ctField.getDeclaringClass() == ctClass2;
        }
        catch (NotFoundException notFoundException) {
            return false;
        }
    }

    @Override
    public int transform(CtClass ctClass, int n6, CodeIterator codeIterator, ConstPool constPool) throws BadBytecode {
        int n10 = codeIterator.byteAt(n6);
        if (n10 == 180 || n10 == 178) {
            int n11 = codeIterator.u16bitAt(n6 + 1);
            String string = TransformReadField.isField(ctClass.getClassPool(), constPool, this.fieldClass, this.fieldname, this.isPrivate, n11);
            if (string != null) {
                if (n10 == 178) {
                    codeIterator.move(n6);
                    n6 = codeIterator.insertGap(1);
                    codeIterator.writeByte(1, n6);
                    n6 = codeIterator.next();
                }
                String string2 = "(Ljava/lang/Object;)" + string;
                int n12 = constPool.addClassInfo(this.methodClassname);
                int n13 = constPool.addMethodrefInfo(n12, this.methodName, string2);
                codeIterator.writeByte(184, n6);
                codeIterator.write16bit(n13, n6 + 1);
                return n6;
            }
        }
        return n6;
    }
}

