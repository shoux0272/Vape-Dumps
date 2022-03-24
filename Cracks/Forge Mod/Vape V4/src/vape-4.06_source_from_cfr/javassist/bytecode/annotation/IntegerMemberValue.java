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

public class IntegerMemberValue
extends MemberValue {
    int valueIndex;

    public IntegerMemberValue(int n6, ConstPool constPool) {
        super('I', constPool);
        this.valueIndex = n6;
    }

    public IntegerMemberValue(ConstPool constPool, int n6) {
        super('I', constPool);
        this.setValue(n6);
    }

    public IntegerMemberValue(ConstPool constPool) {
        super('I', constPool);
        this.setValue(0);
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return this.getValue();
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return Integer.TYPE;
    }

    public int getValue() {
        return this.cp.getIntegerInfo(this.valueIndex);
    }

    public void setValue(int n6) {
        this.valueIndex = this.cp.addIntegerInfo(n6);
    }

    public String toString() {
        return Integer.toString(this.getValue());
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitIntegerMemberValue(this);
    }
}

