/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.annotation.Annotation$Pair;
import javassist.bytecode.annotation.AnnotationImpl;
import javassist.bytecode.annotation.AnnotationMemberValue;
import javassist.bytecode.annotation.AnnotationsWriter;
import javassist.bytecode.annotation.ArrayMemberValue;
import javassist.bytecode.annotation.BooleanMemberValue;
import javassist.bytecode.annotation.ByteMemberValue;
import javassist.bytecode.annotation.CharMemberValue;
import javassist.bytecode.annotation.ClassMemberValue;
import javassist.bytecode.annotation.DoubleMemberValue;
import javassist.bytecode.annotation.EnumMemberValue;
import javassist.bytecode.annotation.FloatMemberValue;
import javassist.bytecode.annotation.IntegerMemberValue;
import javassist.bytecode.annotation.LongMemberValue;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.NoSuchClassError;
import javassist.bytecode.annotation.ShortMemberValue;
import javassist.bytecode.annotation.StringMemberValue;

public class Annotation {
    ConstPool pool;
    int typeIndex;
    Map<String, Annotation$Pair> members;

    public Annotation(int n6, ConstPool constPool) {
        this.pool = constPool;
        this.typeIndex = n6;
        this.members = null;
    }

    public Annotation(String string, ConstPool constPool) {
        this(constPool.addUtf8Info(Descriptor.of(string)), constPool);
    }

    public Annotation(ConstPool constPool, CtClass ctClass) throws NotFoundException {
        this(constPool.addUtf8Info(Descriptor.of(ctClass.getName())), constPool);
        if (!ctClass.isInterface()) {
            throw new RuntimeException("Only interfaces are allowed for Annotation creation.");
        }
        CtMethod[] arrctMethod = ctClass.getDeclaredMethods();
        if (arrctMethod.length > 0) {
            this.members = new LinkedHashMap<String, Annotation$Pair>();
        }
        for (CtMethod ctMethod : arrctMethod) {
            this.addMemberValue(ctMethod.getName(), Annotation.createMemberValue(constPool, ctMethod.getReturnType()));
        }
    }

    public static MemberValue createMemberValue(ConstPool constPool, CtClass ctClass) throws NotFoundException {
        if (ctClass == CtClass.booleanType) {
            return new BooleanMemberValue(constPool);
        }
        if (ctClass == CtClass.byteType) {
            return new ByteMemberValue(constPool);
        }
        if (ctClass == CtClass.charType) {
            return new CharMemberValue(constPool);
        }
        if (ctClass == CtClass.shortType) {
            return new ShortMemberValue(constPool);
        }
        if (ctClass == CtClass.intType) {
            return new IntegerMemberValue(constPool);
        }
        if (ctClass == CtClass.longType) {
            return new LongMemberValue(constPool);
        }
        if (ctClass == CtClass.floatType) {
            return new FloatMemberValue(constPool);
        }
        if (ctClass == CtClass.doubleType) {
            return new DoubleMemberValue(constPool);
        }
        if (ctClass.getName().equals("java.lang.Class")) {
            return new ClassMemberValue(constPool);
        }
        if (ctClass.getName().equals("java.lang.String")) {
            return new StringMemberValue(constPool);
        }
        if (ctClass.isArray()) {
            CtClass ctClass2 = ctClass.getComponentType();
            MemberValue memberValue = Annotation.createMemberValue(constPool, ctClass2);
            return new ArrayMemberValue(memberValue, constPool);
        }
        if (ctClass.isInterface()) {
            Annotation annotation = new Annotation(constPool, ctClass);
            return new AnnotationMemberValue(annotation, constPool);
        }
        EnumMemberValue enumMemberValue = new EnumMemberValue(constPool);
        enumMemberValue.setType(ctClass.getName());
        return enumMemberValue;
    }

    public void addMemberValue(int n6, MemberValue memberValue) {
        Annotation$Pair annotation$Pair = new Annotation$Pair();
        annotation$Pair.name = n6;
        annotation$Pair.value = memberValue;
        this.addMemberValue(annotation$Pair);
    }

    public void addMemberValue(String string, MemberValue memberValue) {
        Annotation$Pair annotation$Pair = new Annotation$Pair();
        annotation$Pair.name = this.pool.addUtf8Info(string);
        annotation$Pair.value = memberValue;
        if (this.members == null) {
            this.members = new LinkedHashMap<String, Annotation$Pair>();
        }
        this.members.put(string, annotation$Pair);
    }

    private void addMemberValue(Annotation$Pair annotation$Pair) {
        String string = this.pool.getUtf8Info(annotation$Pair.name);
        if (this.members == null) {
            this.members = new LinkedHashMap<String, Annotation$Pair>();
        }
        this.members.put(string, annotation$Pair);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("@");
        stringBuffer.append(this.getTypeName());
        if (this.members != null) {
            stringBuffer.append("(");
            for (String string : this.members.keySet()) {
                stringBuffer.append(string).append("=").append(this.getMemberValue(string)).append(", ");
            }
            stringBuffer.setLength(stringBuffer.length() - 2);
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }

    public String getTypeName() {
        return Descriptor.toClassName(this.pool.getUtf8Info(this.typeIndex));
    }

    public Set<String> getMemberNames() {
        if (this.members == null) {
            return null;
        }
        return this.members.keySet();
    }

    public MemberValue getMemberValue(String string) {
        if (this.members == null || this.members.get(string) == null) {
            return null;
        }
        return this.members.get((Object)string).value;
    }

    public Object toAnnotationType(ClassLoader classLoader, ClassPool classPool) throws ClassNotFoundException, NoSuchClassError {
        Class<?> class_ = MemberValue.loadClass(classLoader, this.getTypeName());
        try {
            return AnnotationImpl.make(classLoader, class_, classPool, this);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new ClassNotFoundException(class_.getName(), illegalArgumentException);
        }
        catch (IllegalAccessError illegalAccessError) {
            throw new ClassNotFoundException(class_.getName(), illegalAccessError);
        }
    }

    public void write(AnnotationsWriter annotationsWriter) throws IOException {
        String string = this.pool.getUtf8Info(this.typeIndex);
        if (this.members == null) {
            annotationsWriter.annotation(string, 0);
            return;
        }
        annotationsWriter.annotation(string, this.members.size());
        for (Annotation$Pair annotation$Pair : this.members.values()) {
            annotationsWriter.memberValuePair(annotation$Pair.name);
            annotation$Pair.value.write(annotationsWriter);
        }
    }

    public int hashCode() {
        return this.getTypeName().hashCode() + (this.members == null ? 0 : this.members.hashCode());
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || !(object instanceof Annotation)) {
            return false;
        }
        Annotation annotation = (Annotation)object;
        if (!this.getTypeName().equals(annotation.getTypeName())) {
            return false;
        }
        Map<String, Annotation$Pair> map = annotation.members;
        if (this.members == map) {
            return true;
        }
        if (this.members == null) {
            return map == null;
        }
        if (map == null) {
            return false;
        }
        return this.members.equals(map);
    }
}

