/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import javassist.ClassPool;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.AnnotationsWriter;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.MemberValueVisitor;

public class ArrayMemberValue
extends MemberValue {
    MemberValue type;
    MemberValue[] values;

    public ArrayMemberValue(ConstPool constPool) {
        super('[', constPool);
        this.type = null;
        this.values = null;
    }

    public ArrayMemberValue(MemberValue memberValue, ConstPool constPool) {
        super('[', constPool);
        this.type = memberValue;
        this.values = null;
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) throws ClassNotFoundException {
        Class<?> class_;
        if (this.values == null) {
            throw new ClassNotFoundException("no array elements found: " + method.getName());
        }
        int n6 = this.values.length;
        if (this.type == null) {
            class_ = method.getReturnType().getComponentType();
            if (class_ == null || n6 > 0) {
                throw new ClassNotFoundException("broken array type: " + method.getName());
            }
        } else {
            class_ = this.type.getType(classLoader);
        }
        Object object = Array.newInstance(class_, n6);
        for (int k = 0; k < n6; ++k) {
            Array.set(object, k, this.values[k].getValue(classLoader, classPool, method));
        }
        return object;
    }

    @Override
    Class<?> getType(ClassLoader classLoader) throws ClassNotFoundException {
        if (this.type == null) {
            throw new ClassNotFoundException("no array type specified");
        }
        Object object = Array.newInstance(this.type.getType(classLoader), 0);
        return object.getClass();
    }

    public MemberValue getType() {
        return this.type;
    }

    public MemberValue[] getValue() {
        return this.values;
    }

    public void setValue(MemberValue[] arrmemberValue) {
        this.values = arrmemberValue;
        if (arrmemberValue != null && arrmemberValue.length > 0) {
            this.type = arrmemberValue[0];
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        if (this.values != null) {
            for (int k = 0; k < this.values.length; ++k) {
                stringBuffer.append(this.values[k].toString());
                if (k + 1 >= this.values.length) continue;
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        int n6 = this.values == null ? 0 : this.values.length;
        annotationsWriter.arrayValue(n6);
        for (int k = 0; k < n6; ++k) {
            this.values[k].write(annotationsWriter);
        }
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitArrayMemberValue(this);
    }
}

