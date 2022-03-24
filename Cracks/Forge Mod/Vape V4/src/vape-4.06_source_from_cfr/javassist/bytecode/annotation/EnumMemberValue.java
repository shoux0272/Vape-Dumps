/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.ClassPool;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.annotation.AnnotationsWriter;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.MemberValueVisitor;

public class EnumMemberValue
extends MemberValue {
    int typeIndex;
    int valueIndex;

    public EnumMemberValue(int n6, int n10, ConstPool constPool) {
        super('e', constPool);
        this.typeIndex = n6;
        this.valueIndex = n10;
    }

    public EnumMemberValue(ConstPool constPool) {
        super('e', constPool);
        this.valueIndex = 0;
        this.typeIndex = 0;
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) throws ClassNotFoundException {
        try {
            return this.getType(classLoader).getField(this.getValue()).get(null);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new ClassNotFoundException(this.getType() + "." + this.getValue());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new ClassNotFoundException(this.getType() + "." + this.getValue());
        }
    }

    @Override
    Class<?> getType(ClassLoader classLoader) throws ClassNotFoundException {
        return EnumMemberValue.loadClass(classLoader, this.getType());
    }

    public String getType() {
        return Descriptor.toClassName(this.cp.getUtf8Info(this.typeIndex));
    }

    public void setType(String string) {
        this.typeIndex = this.cp.addUtf8Info(Descriptor.of(string));
    }

    public String getValue() {
        return this.cp.getUtf8Info(this.valueIndex);
    }

    public void setValue(String string) {
        this.valueIndex = this.cp.addUtf8Info(string);
    }

    public String toString() {
        return this.getType() + "." + this.getValue();
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.enumConstValue(this.cp.getUtf8Info(this.typeIndex), this.getValue());
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitEnumMemberValue(this);
    }
}

