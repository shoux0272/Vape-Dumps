/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.reflect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import javassist.tools.reflect.CannotCreateException;
import javassist.tools.reflect.CannotInvokeException;

public class ClassMetaobject
implements Serializable {
    private static final long serialVersionUID = 1L;
    static final String methodPrefix = "_m_";
    static final int methodPrefixLen = 3;
    private Class<?> javaClass;
    private Constructor<?>[] constructors;
    private Method[] methods;
    public static boolean useContextClassLoader = false;
    private static boolean b;

    public ClassMetaobject(String[] arrstring) {
        try {
            this.javaClass = this.getClassObject(arrstring[0]);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("not found: " + arrstring[0] + ", useContextClassLoader: " + Boolean.toString(useContextClassLoader), classNotFoundException);
        }
        this.constructors = this.javaClass.getConstructors();
        this.methods = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.javaClass.getName());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.javaClass = this.getClassObject(objectInputStream.readUTF());
        this.constructors = this.javaClass.getConstructors();
        this.methods = null;
    }

    private Class<?> getClassObject(String string) throws ClassNotFoundException {
        if (useContextClassLoader) {
            return Thread.currentThread().getContextClassLoader().loadClass(string);
        }
        return Class.forName(string);
    }

    public final Class<?> getJavaClass() {
        return this.javaClass;
    }

    public final String getName() {
        return this.javaClass.getName();
    }

    public final boolean isInstance(Object object) {
        return this.javaClass.isInstance(object);
    }

    public final Object newInstance(Object[] arrobject) throws CannotCreateException {
        int n6 = this.constructors.length;
        for (int k = 0; k < n6; ++k) {
            try {
                return this.constructors[k].newInstance(arrobject);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                continue;
            }
            catch (InstantiationException instantiationException) {
                throw new CannotCreateException(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new CannotCreateException(illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new CannotCreateException(invocationTargetException);
            }
        }
        throw new CannotCreateException("no constructor matches");
    }

    public Object trapFieldRead(String string) {
        Class<?> class_ = this.getJavaClass();
        try {
            return class_.getField(string).get(null);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new RuntimeException(noSuchFieldException.toString());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException.toString());
        }
    }

    public void trapFieldWrite(String string, Object object) {
        Class<?> class_ = this.getJavaClass();
        try {
            class_.getField(string).set(null, object);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new RuntimeException(noSuchFieldException.toString());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException.toString());
        }
    }

    public static Object invoke(Object object, int n6, Object[] arrobject) throws Throwable {
        Method[] arrmethod = object.getClass().getMethods();
        int n10 = arrmethod.length;
        String string = methodPrefix + n6;
        for (int k = 0; k < n10; ++k) {
            if (!arrmethod[k].getName().startsWith(string)) continue;
            try {
                return arrmethod[k].invoke(object, arrobject);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new CannotInvokeException(illegalAccessException);
            }
        }
        throw new CannotInvokeException("cannot find a method");
    }

    public Object trapMethodcall(int n6, Object[] arrobject) throws Throwable {
        try {
            Method[] arrmethod = this.getReflectiveMethods();
            return arrmethod[n6].invoke(null, arrobject);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new CannotInvokeException(illegalAccessException);
        }
    }

    public final Method[] getReflectiveMethods() {
        int n6;
        if (this.methods != null) {
            return this.methods;
        }
        Class<?> class_ = this.getJavaClass();
        Method[] arrmethod = class_.getDeclaredMethods();
        int n10 = arrmethod.length;
        int[] arrn = new int[n10];
        int n11 = 0;
        for (n6 = 0; n6 < n10; ++n6) {
            char c3;
            Method method = arrmethod[n6];
            String string = method.getName();
            if (!string.startsWith(methodPrefix)) continue;
            int n12 = 0;
            int n13 = 3;
            while ('0' <= (c3 = string.charAt(n13)) && c3 <= '9') {
                n12 = n12 * 10 + c3 - 48;
                ++n13;
            }
            arrn[n6] = ++n12;
            if (n12 <= n11) continue;
            n11 = n12;
        }
        this.methods = new Method[n11];
        for (n6 = 0; n6 < n10; ++n6) {
            if (arrn[n6] <= 0) continue;
            this.methods[arrn[n6] - 1] = arrmethod[n6];
        }
        return this.methods;
    }

    public final Method getMethod(int n6) {
        return this.getReflectiveMethods()[n6];
    }

    public final String getMethodName(int n6) {
        char c3;
        String string = this.getReflectiveMethods()[n6].getName();
        int n10 = 3;
        while ((c3 = string.charAt(n10++)) >= '0' && '9' >= c3) {
        }
        return string.substring(n10);
    }

    public final Class<?>[] getParameterTypes(int n6) {
        return this.getReflectiveMethods()[n6].getParameterTypes();
    }

    public final Class<?> getReturnType(int n6) {
        return this.getReflectiveMethods()[n6].getReturnType();
    }

    public final int getMethodIndex(String string, Class<?>[] arrclass) throws NoSuchMethodException {
        Method[] arrmethod = this.getReflectiveMethods();
        for (int k = 0; k < arrmethod.length; ++k) {
            if (arrmethod[k] == null || !this.getMethodName(k).equals(string) || !Arrays.equals(arrclass, arrmethod[k].getParameterTypes())) continue;
            return k;
        }
        throw new NoSuchMethodException("Method " + string + " not found");
    }

    static {
        ClassMetaobject.b(false);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        return b;
    }

    public static boolean e() {
        boolean bl = ClassMetaobject.c();
        return !bl;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

