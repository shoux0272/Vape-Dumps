/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.io.InvalidClassException;
import java.lang.reflect.Method;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;
import javassist.util.proxy.RuntimeSupport$DefaultMethodHandler;
import javassist.util.proxy.SecurityActions;
import javassist.util.proxy.SerializedProxy;

public class RuntimeSupport {
    public static MethodHandler default_interceptor = new RuntimeSupport$DefaultMethodHandler();

    public static void find2Methods(Class<?> class_, String string, String string2, int n6, String string3, Method[] arrmethod) {
        arrmethod[n6 + 1] = string2 == null ? null : RuntimeSupport.findMethod(class_, string2, string3);
        arrmethod[n6] = RuntimeSupport.findSuperClassMethod(class_, string, string3);
    }

    public static void find2Methods(Object object, String string, String string2, int n6, String string3, Method[] arrmethod) {
        arrmethod[n6 + 1] = string2 == null ? null : RuntimeSupport.findMethod(object, string2, string3);
        arrmethod[n6] = RuntimeSupport.findSuperMethod(object, string, string3);
    }

    public static Method findMethod(Object object, String string, String string2) {
        Method method = RuntimeSupport.findMethod2(object.getClass(), string, string2);
        if (method == null) {
            RuntimeSupport.error(object.getClass(), string, string2);
        }
        return method;
    }

    public static Method findMethod(Class<?> class_, String string, String string2) {
        Method method = RuntimeSupport.findMethod2(class_, string, string2);
        if (method == null) {
            RuntimeSupport.error(class_, string, string2);
        }
        return method;
    }

    public static Method findSuperMethod(Object object, String string, String string2) {
        Class<?> class_ = object.getClass();
        return RuntimeSupport.findSuperClassMethod(class_, string, string2);
    }

    public static Method findSuperClassMethod(Class<?> class_, String string, String string2) {
        Method method = RuntimeSupport.findSuperMethod2(class_.getSuperclass(), string, string2);
        if (method == null) {
            method = RuntimeSupport.searchInterfaces(class_, string, string2);
        }
        if (method == null) {
            RuntimeSupport.error(class_, string, string2);
        }
        return method;
    }

    private static void error(Class<?> class_, String string, String string2) {
        throw new RuntimeException("not found " + string + ":" + string2 + " in " + class_.getName());
    }

    private static Method findSuperMethod2(Class<?> class_, String string, String string2) {
        Method method = RuntimeSupport.findMethod2(class_, string, string2);
        if (method != null) {
            return method;
        }
        Class<?> class_2 = class_.getSuperclass();
        if (class_2 != null && (method = RuntimeSupport.findSuperMethod2(class_2, string, string2)) != null) {
            return method;
        }
        return RuntimeSupport.searchInterfaces(class_, string, string2);
    }

    private static Method searchInterfaces(Class<?> class_, String string, String string2) {
        Method method = null;
        Class<?>[] arrclass = class_.getInterfaces();
        for (int k = 0; k < arrclass.length; ++k) {
            method = RuntimeSupport.findSuperMethod2(arrclass[k], string, string2);
            if (method == null) continue;
            return method;
        }
        return method;
    }

    private static Method findMethod2(Class<?> class_, String string, String string2) {
        Method[] arrmethod = SecurityActions.getDeclaredMethods(class_);
        int n6 = arrmethod.length;
        for (int k = 0; k < n6; ++k) {
            if (!arrmethod[k].getName().equals(string) || !RuntimeSupport.makeDescriptor(arrmethod[k]).equals(string2)) continue;
            return arrmethod[k];
        }
        return null;
    }

    public static String makeDescriptor(Method method) {
        Class<?>[] arrclass = method.getParameterTypes();
        return RuntimeSupport.makeDescriptor(arrclass, method.getReturnType());
    }

    public static String makeDescriptor(Class<?>[] arrclass, Class<?> class_) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        for (int k = 0; k < arrclass.length; ++k) {
            RuntimeSupport.makeDesc(stringBuffer, arrclass[k]);
        }
        stringBuffer.append(')');
        if (class_ != null) {
            RuntimeSupport.makeDesc(stringBuffer, class_);
        }
        return stringBuffer.toString();
    }

    public static String makeDescriptor(String string, Class<?> class_) {
        StringBuffer stringBuffer = new StringBuffer(string);
        RuntimeSupport.makeDesc(stringBuffer, class_);
        return stringBuffer.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void makeDesc(StringBuffer stringBuffer, Class<?> class_) {
        if (class_.isArray()) {
            stringBuffer.append('[');
            RuntimeSupport.makeDesc(stringBuffer, class_.getComponentType());
            return;
        } else if (class_.isPrimitive()) {
            if (class_ == Void.TYPE) {
                stringBuffer.append('V');
                return;
            } else if (class_ == Integer.TYPE) {
                stringBuffer.append('I');
                return;
            } else if (class_ == Byte.TYPE) {
                stringBuffer.append('B');
                return;
            } else if (class_ == Long.TYPE) {
                stringBuffer.append('J');
                return;
            } else if (class_ == Double.TYPE) {
                stringBuffer.append('D');
                return;
            } else if (class_ == Float.TYPE) {
                stringBuffer.append('F');
                return;
            } else if (class_ == Character.TYPE) {
                stringBuffer.append('C');
                return;
            } else if (class_ == Short.TYPE) {
                stringBuffer.append('S');
                return;
            } else {
                if (class_ != Boolean.TYPE) throw new RuntimeException("bad type: " + class_.getName());
                stringBuffer.append('Z');
            }
            return;
        } else {
            stringBuffer.append('L').append(class_.getName().replace('.', '/')).append(';');
        }
    }

    public static SerializedProxy makeSerializedProxy(Object object) throws InvalidClassException {
        Class<?> class_ = object.getClass();
        MethodHandler methodHandler = null;
        if (object instanceof ProxyObject) {
            methodHandler = ((ProxyObject)object).getHandler();
        } else if (object instanceof Proxy) {
            methodHandler = ProxyFactory.getHandler((Proxy)object);
        }
        return new SerializedProxy(class_, ProxyFactory.getFilterSignature(class_), methodHandler);
    }
}

