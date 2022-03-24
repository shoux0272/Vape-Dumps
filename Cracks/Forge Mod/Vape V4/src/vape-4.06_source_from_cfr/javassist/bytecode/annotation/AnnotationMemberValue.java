/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.ClassPool;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.AnnotationImpl;
import javassist.bytecode.annotation.AnnotationsWriter;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.MemberValueVisitor;

public class AnnotationMemberValue
extends MemberValue {
    Annotation value;

    public AnnotationMemberValue(ConstPool constPool) {
        this(null, constPool);
    }

    public AnnotationMemberValue(Annotation annotation, ConstPool constPool) {
        super('@', constPool);
        this.value = annotation;
    }

    @Override
    Object getValue(ClassLoader classLoader, ClassPool classPool, Method method) throws ClassNotFoundException {
        return AnnotationImpl.make(classLoader, this.getType(classLoader), classPool, this.value);
    }

    @Override
    Class<?> getType(ClassLoader classLoader) throws ClassNotFoundException {
        if (this.value == null) {
            throw new ClassNotFoundException("no type specified");
        }
        return AnnotationMemberValue.loadClass(classLoader, this.value.getTypeName());
    }

    public Annotation getValue() {
        return this.value;
    }

    public void setValue(Annotation annotation) {
        this.value = annotation;
    }

    public String toString() {
        return this.value.toString();
    }

    @Override
    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        annotationsWriter.annotationValue();
        this.value.write(annotationsWriter);
    }

    @Override
    public void accept(MemberValueVisitor memberValueVisitor) {
        memberValueVisitor.visitAnnotationMemberValue(this);
    }
}

