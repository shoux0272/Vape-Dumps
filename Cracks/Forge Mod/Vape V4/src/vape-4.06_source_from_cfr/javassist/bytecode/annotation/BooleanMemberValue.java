/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.ClassPool;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.AnnotationsWriter;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.MemberValueVisitor;

public class BooleanMemberValue
extends MemberValue {
    int valueIndex;

    public BooleanMemberValue(int n6, ConstPool constPool) {
        super('Z', constPool);
        this.valueIndex = n6;
    }

    public BooleanMemberValue(boolean bl, ConstPool constPool) {
        super('Z', constPool);
        this.setValue(bl);
    }

    public BooleanMemberValue(ConstPool constPool) {
        super('Z', constPool);
        this.setValue(false);
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return this.getValue();
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return Boolean.TYPE;
    }

    public boolean getValue() {
        return this.cp.getIntegerInfo(this.valueIndex) != 0;
    }

    public void setValue(boolean bl) {
        this.valueIndex = this.cp.addIntegerInfo(bl ? 1 : 0);
    }

    public String toString() {
        return this.getValue() ? "true" : "false";
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitBooleanMemberValue(this);
    }
}

