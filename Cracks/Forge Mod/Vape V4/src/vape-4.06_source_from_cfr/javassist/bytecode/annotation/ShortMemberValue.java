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

public class ShortMemberValue
extends MemberValue {
    int valueIndex;

    public ShortMemberValue(int n6, ConstPool constPool) {
        super('S', constPool);
        this.valueIndex = n6;
    }

    public ShortMemberValue(short s, ConstPool constPool) {
        super('S', constPool);
        this.setValue(s);
    }

    public ShortMemberValue(ConstPool constPool) {
        super('S', constPool);
        this.setValue((short)0);
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return this.getValue();
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return Short.TYPE;
    }

    public short getValue() {
        return (short)this.cp.getIntegerInfo(this.valueIndex);
    }

    public void setValue(short s) {
        this.valueIndex = this.cp.addIntegerInfo(s);
    }

    public String toString() {
        return Short.toString(this.getValue());
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitShortMemberValue(this);
    }
}

