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

public class DoubleMemberValue
extends MemberValue {
    int valueIndex;

    public DoubleMemberValue(int n6, ConstPool constPool) {
        super('D', constPool);
        this.valueIndex = n6;
    }

    public DoubleMemberValue(double d10, ConstPool constPool) {
        super('D', constPool);
        this.setValue(d10);
    }

    public DoubleMemberValue(ConstPool constPool) {
        super('D', constPool);
        this.setValue(0.0);
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return this.getValue();
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return Double.TYPE;
    }

    public double getValue() {
        return this.cp.getDoubleInfo(this.valueIndex);
    }

    public void setValue(double d10) {
        this.valueIndex = this.cp.addDoubleInfo(d10);
    }

    public String toString() {
        return Double.toString(this.getValue());
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitDoubleMemberValue(this);
    }
}

