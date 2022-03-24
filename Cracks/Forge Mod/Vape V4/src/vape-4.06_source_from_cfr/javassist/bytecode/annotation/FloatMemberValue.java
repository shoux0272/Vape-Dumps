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

public class FloatMemberValue
extends MemberValue {
    int valueIndex;

    public FloatMemberValue(int n6, ConstPool constPool) {
        super('F', constPool);
        this.valueIndex = n6;
    }

    public FloatMemberValue(float f10, ConstPool constPool) {
        super('F', constPool);
        this.setValue(f10);
    }

    public FloatMemberValue(ConstPool constPool) {
        super('F', constPool);
        this.setValue(0.0f);
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return Float.valueOf(this.getValue());
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return Float.TYPE;
    }

    public float getValue() {
        return this.cp.getFloatInfo(this.valueIndex);
    }

    public void setValue(float f10) {
        this.valueIndex = this.cp.addFloatInfo(f10);
    }

    public String toString() {
        return Float.toString(this.getValue());
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitFloatMemberValue(this);
    }
}

