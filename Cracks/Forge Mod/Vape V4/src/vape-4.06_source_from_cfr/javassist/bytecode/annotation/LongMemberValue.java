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

public class LongMemberValue
extends MemberValue {
    int valueIndex;

    public LongMemberValue(int n6, ConstPool constPool) {
        super('J', constPool);
        this.valueIndex = n6;
    }

    public LongMemberValue(long l, ConstPool constPool) {
        super('J', constPool);
        this.setValue(l);
    }

    public LongMemberValue(ConstPool constPool) {
        super('J', constPool);
        this.setValue(0L);
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return this.getValue();
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return Long.TYPE;
    }

    public long getValue() {
        return this.cp.getLongInfo(this.valueIndex);
    }

    public void setValue(long l) {
        this.valueIndex = this.cp.addLongInfo(l);
    }

    public String toString() {
        return Long.toString(this.getValue());
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitLongMemberValue(this);
    }
}

