/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.reflect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javassist.tools.reflect.CannotInvokeException;
import javassist.tools.reflect.ClassMetaobject;
import javassist.tools.reflect.Metalevel;

public class Metaobject
implements Serializable {
    private static final long serialVersionUID = 1L;
    protected ClassMetaobject classmetaobject;
    protected Metalevel baseobject;
    protected Method[] methods;

    public Metaobject(Object object, Object[] arrobject) {
        this.baseobject = (Metalevel)object;
        this.classmetaobject = this.baseobject._getClass();
        this.methods = this.classmetaobject.getReflectiveMethods();
    }

    protected Metaobject() {
        this.baseobject = null;
        this.classmetaobject = null;
        this.methods = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.baseobject);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.baseobject = (Metalevel)objectInputStream.readObject();
        this.classmetaobject = this.baseobject._getClass();
        this.methods = this.classmetaobject.getReflectiveMethods();
    }

    public final ClassMetaobject getClassMetaobject() {
        return this.classmetaobject;
    }

    public final Object getObject() {
        return this.baseobject;
    }

    public final void setObject(Object object) {
        this.baseobject = (Metalevel)object;
        this.classmetaobject = this.baseobject._getClass();
        this.methods = this.classmetaobject.getReflectiveMethods();
        this.baseobject._setMetaobject(this);
    }

    public final String getMethodName(int n6) {
        char c3;
        String string = this.methods[n6].getName();
        int n10 = 3;
        while ((c3 = string.charAt(n10++)) >= '0' && '9' >= c3) {
        }
        return string.substring(n10);
    }

    public final Class<?>[] getParameterTypes(int n6) {
        return this.methods[n6].getParameterTypes();
    }

    public final Class<?> getReturnType(int n6) {
        return this.methods[n6].getReturnType();
    }

    public Object trapFieldRead(String string) {
        Class<?> class_ = this.getClassMetaobject().getJavaClass();
        try {
            return class_.getField(string).get(this.getObject());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new RuntimeException(noSuchFieldException.toString());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException.toString());
        }
    }

    public void trapFieldWrite(String string, Object object) {
        Class<?> class_ = this.getClassMetaobject().getJavaClass();
        try {
            class_.getField(string).set(this.getObject(), object);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new RuntimeException(noSuchFieldException.toString());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException.toString());
        }
    }

    public Object trapMethodcall(int n6, Object[] arrobject) throws Throwable {
        try {
            return this.methods[n6].invoke(this.getObject(), arrobject);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new CannotInvokeException(illegalAccessException);
        }
    }
}

