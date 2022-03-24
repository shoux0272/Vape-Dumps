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

public class ByteMemberValue
extends MemberValue {
    int valueIndex;

    public ByteMemberValue(int n6, ConstPool constPool) {
        super('B', constPool);
        this.valueIndex = n6;
    }

    public ByteMemberValue(byte by, ConstPool constPool) {
        super('B', constPool);
        this.setValue(by);
    }

    public ByteMemberValue(ConstPool constPool) {
        super('B', constPool);
        this.setValue((byte)0);
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return this.getValue();
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return Byte.TYPE;
    }

    public byte getValue() {
        return (byte)this.cp.getIntegerInfo(this.valueIndex);
    }

    public void setValue(byte by) {
        this.valueIndex = this.cp.addIntegerInfo(by);
    }

    public String toString() {
        return Byte.toString(this.getValue());
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitByteMemberValue(this);
    }
}

