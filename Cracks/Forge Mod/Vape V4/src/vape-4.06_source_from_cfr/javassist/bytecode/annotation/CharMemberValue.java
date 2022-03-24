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

public class CharMemberValue
extends MemberValue {
    int valueIndex;

    public CharMemberValue(int n6, ConstPool constPool) {
        super('C', constPool);
        this.valueIndex = n6;
    }

    public CharMemberValue(char c3, ConstPool constPool) {
        super('C', constPool);
        this.setValue(c3);
    }

    public CharMemberValue(ConstPool constPool) {
        super('C', constPool);
        this.setValue('\u0000');
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return Character.valueOf(this.getValue());
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return Character.TYPE;
    }

    public char getValue() {
        return (char)this.cp.getIntegerInfo(this.valueIndex);
    }

    public void setValue(char c3) {
        this.valueIndex = this.cp.addIntegerInfo(c3);
    }

    public String toString() {
        return Character.toString(this.getValue());
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitCharMemberValue(this);
    }
}

