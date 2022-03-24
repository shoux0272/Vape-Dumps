/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.analysis.MultiType;
import javassist.bytecode.analysis.Type;

public class MultiArrayType
extends Type {
    private MultiType component;
    private int dims;

    public MultiArrayType(MultiType multiType, int n6) {
        super(null);
        this.component = multiType;
        this.dims = n6;
    }

    @Override
    public CtClass getCtClass() {
        CtClass ctClass = this.component.getCtClass();
        if (ctClass == null) {
            return null;
        }
        ClassPool classPool = ctClass.getClassPool();
        if (classPool == null) {
            classPool = ClassPool.getDefault();
        }
        String string = this.arrayName(ctClass.getName(), this.dims);
        try {
            return classPool.get(string);
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException);
        }
    }

    @Override
    boolean popChanged() {
        return this.component.popChanged();
    }

    @Override
    public int getDimensions() {
        return this.dims;
    }

    @Override
    public Type getComponent() {
        return this.dims == 1 ? this.component : new MultiArrayType(this.component, this.dims - 1);
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean isArray() {
        return true;
    }

    @Override
    public boolean isAssignableFrom(Type type) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean isReference() {
        return true;
    }

    public boolean isAssignableTo(Type type) {
        if (MultiArrayType.eq(type.getCtClass(), Type.OBJECT.getCtClass())) {
            return true;
        }
        if (MultiArrayType.eq(type.getCtClass(), Type.CLONEABLE.getCtClass())) {
            return true;
        }
        if (MultiArrayType.eq(type.getCtClass(), Type.SERIALIZABLE.getCtClass())) {
            return true;
        }
        if (!type.isArray()) {
            return false;
        }
        Type type2 = this.getRootComponent(type);
        int n6 = type.getDimensions();
        if (n6 > this.dims) {
            return false;
        }
        if (n6 < this.dims) {
            if (MultiArrayType.eq(type2.getCtClass(), Type.OBJECT.getCtClass())) {
                return true;
            }
            if (MultiArrayType.eq(type2.getCtClass(), Type.CLONEABLE.getCtClass())) {
                return true;
            }
            return MultiArrayType.eq(type2.getCtClass(), Type.SERIALIZABLE.getCtClass());
        }
        return this.component.isAssignableTo(type2);
    }

    @Override
    public int hashCode() {
        return this.component.hashCode() + this.dims;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MultiArrayType)) {
            return false;
        }
        MultiArrayType multiArrayType = (MultiArrayType)object;
        return this.component.equals(multiArrayType.component) && this.dims == multiArrayType.dims;
    }

    @Override
    public String toString() {
        return this.arrayName(this.component.toString(), this.dims);
    }
}

