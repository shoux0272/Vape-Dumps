/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;
import javassist.NotFoundException;

final class CtArray
extends CtClass {
    protected ClassPool pool;
    private CtClass[] interfaces = null;

    CtArray(String string, ClassPool classPool) {
        super(string);
        this.pool = classPool;
    }

    @Override
    public ClassPool getClassPool() {
        return this.pool;
    }

    @Override
    public boolean isArray() {
        return true;
    }

    @Override
    public int getModifiers() {
        int n6 = 16;
        try {
            n6 |= this.getComponentType().getModifiers() & 7;
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        return n6;
    }

    @Override
    public CtClass[] getInterfaces() throws NotFoundException {
        if (this.interfaces == null) {
            Class<?>[] arrclass = Object[].class.getInterfaces();
            this.interfaces = new CtClass[arrclass.length];
            for (int k = 0; k < arrclass.length; ++k) {
                this.interfaces[k] = this.pool.get(arrclass[k].getName());
            }
        }
        return this.interfaces;
    }

    @Override
    public boolean subtypeOf(CtClass ctClass) throws NotFoundException {
        if (super.subtypeOf(ctClass)) {
            return true;
        }
        String string = ctClass.getName();
        if (string.equals("java.lang.Object")) {
            return true;
        }
        CtClass[] arrctClass = this.getInterfaces();
        for (int k = 0; k < arrctClass.length; ++k) {
            if (!arrctClass[k].subtypeOf(ctClass)) continue;
            return true;
        }
        return ctClass.isArray() && this.getComponentType().subtypeOf(ctClass.getComponentType());
    }

    @Override
    public CtClass getComponentType() throws NotFoundException {
        String string = this.getName();
        return this.pool.get(string.substring(0, string.length() - 2));
    }

    @Override
    public CtClass getSuperclass() throws NotFoundException {
        return this.pool.get("java.lang.Object");
    }

    @Override
    public CtMethod[] getMethods() {
        try {
            return this.getSuperclass().getMethods();
        }
        catch (NotFoundException notFoundException) {
            return super.getMethods();
        }
    }

    @Override
    public CtMethod getMethod(String string, String string2) throws NotFoundException {
        return this.getSuperclass().getMethod(string, string2);
    }

    @Override
    public CtConstructor[] getConstructors() {
        try {
            return this.getSuperclass().getConstructors();
        }
        catch (NotFoundException notFoundException) {
            return super.getConstructors();
        }
    }
}

