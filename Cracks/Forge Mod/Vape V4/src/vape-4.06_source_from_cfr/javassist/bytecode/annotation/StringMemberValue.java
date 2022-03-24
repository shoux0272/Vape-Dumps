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

public class StringMemberValue
extends MemberValue {
    int valueIndex;

    public StringMemberValue(int n6, ConstPool constPool) {
        super('s', constPool);
        this.valueIndex = n6;
    }

    public StringMemberValue(String string, ConstPool constPool) {
        super('s', constPool);
        this.setValue(string);
    }

    public StringMemberValue(ConstPool constPool) {
        super('s', constPool);
        this.setValue("");
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) {
        return this.getValue();
    }

    @Override
    Class<?> getType(ClassLoader classLoader) {
        return String.class;
    }

    public String getValue() {
        return this.cp.getUtf8Info(this.valueIndex);
    }

    public void setValue(String string) {
        this.valueIndex = this.cp.addUtf8Info(string);
    }

    public String toString() {
        return "\"" + this.getValue() + "\"";
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.constValueIndex(this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitStringMemberValue(this);
    }
}

