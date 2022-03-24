/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.ClassPool;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.SignatureAttribute;
import javassist.bytecode.annotation.AnnotationsWriter;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.MemberValueVisitor;

public class ClassMemberValue
extends MemberValue {
    int valueIndex;

    public ClassMemberValue(int n6, ConstPool constPool) {
        super('c', constPool);
        this.valueIndex = n6;
    }

    public ClassMemberValue(String string, ConstPool constPool) {
        super('c', constPool);
        this.setValue(string);
    }

    public ClassMemberValue(ConstPool constPool) {
        super('c', constPool);
        this.setValue("java.lang.Class");
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) throws ClassNotFoundException {
        String string = this.getValue();
        if (string.equals("void")) {
            return Void.TYPE;
        }
        if (string.equals("int")) {
            return Integer.TYPE;
        }
        if (string.equals("byte")) {
            return Byte.TYPE;
        }
        if (string.equals("long")) {
            return Long.TYPE;
        }
        if (string.equals("double")) {
            return Double.TYPE;
        }
        if (string.equals("float")) {
            return Float.TYPE;
        }
        if (string.equals("char")) {
            return Character.TYPE;
        }
        if (string.equals("short")) {
            return Short.TYPE;
        }
        if (string.equals("boolean")) {
            return Boolean.TYPE;
        }
        return ClassMemberValue.loadClass(classLoader, string);
    }

    @Override
    Class<?> getType(ClassLoader classLoader) throws ClassNotFoundException {
        return ClassMemberValue.loadClass(classLoader, "java.lang.Class");
    }

    public String getValue() {
        String string = this.cp.getUtf8Info(this.valueIndex);
        try {
            return SignatureAttribute.toTypeSignature(string).jvmTypeName();
        }
        catch (BadBytecode badBytecode) {
            throw new RuntimeException(badBytecode);
        }
    }

    public void setValue(String string) {
        String string2 = Descriptor.of(string);
        this.valueIndex = this.cp.addUtf8Info(string2);
    }

    public String toString() {
        return this.getValue().replace('$', '.') + ".class";
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.classInfoIndex(this.cp.getUtf8Info(this.valueIndex));
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitClassMemberValue(this);
    }
}

