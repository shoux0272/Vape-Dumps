/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.AnnotationDefaultAttribute;
import javassist.bytecode.ClassFile;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.MemberValue;

public class AnnotationImpl
implements InvocationHandler {
    private static final String JDK_ANNOTATION_CLASS_NAME = "java.lang.annotation.Annotation";
    private static Method JDK_ANNOTATION_TYPE_METHOD = null;
    private Annotation annotation;
    private ClassPool pool;
    private ClassLoader classLoader;
    private transient Class<?> annotationType;
    private transient int cachedHashCode = Integer.MIN_VALUE;

    public static Object make(ClassLoader classLoader, Class<?> class_, ClassPool classPool, Annotation annotation) throws IllegalArgumentException {
        AnnotationImpl annotationImpl = new AnnotationImpl(annotation, classPool, classLoader);
        return Proxy.newProxyInstance(classLoader, new Class[]{class_}, (InvocationHandler)annotationImpl);
    }

    private AnnotationImpl(Annotation annotation, ClassPool classPool, ClassLoader classLoader) {
        this.annotation = annotation;
        this.pool = classPool;
        this.classLoader = classLoader;
    }

    public String getTypeName() {
        return this.annotation.getTypeName();
    }

    private Class<?> getAnnotationType() {
        if (this.annotationType == null) {
            String string = this.annotation.getTypeName();
            try {
                this.annotationType = this.classLoader.loadClass(string);
            }
            catch (ClassNotFoundException classNotFoundException) {
                NoClassDefFoundError noClassDefFoundError = new NoClassDefFoundError("Error loading annotation class: " + string);
                noClassDefFoundError.setStackTrace(classNotFoundException.getStackTrace());
                throw noClassDefFoundError;
            }
        }
        return this.annotationType;
    }

    public Annotation getAnnotation() {
        return this.annotation;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        MemberValue memberValue;
        String string = method.getName();
        if (Object.class == method.getDeclaringClass()) {
            if ("equals".equals(string)) {
                Object object2 = arrobject[0];
                return this.checkEquals(object2);
            }
            if ("toString".equals(string)) {
                return this.annotation.toString();
            }
            if ("hashCode".equals(string)) {
                return this.hashCode();
            }
        } else if ("annotationType".equals(string) && method.getParameterTypes().length == 0) {
            return this.getAnnotationType();
        }
        if ((memberValue = this.annotation.getMemberValue(string)) == null) {
            return this.getDefault(string, method);
        }
        return memberValue.getValue(this.classLoader, this.pool, method);
    }

    private Object getDefault(String string, Method method) throws ClassNotFoundException, RuntimeException {
        String string2 = this.annotation.getTypeName();
        if (this.pool != null) {
            try {
                AnnotationDefaultAttribute annotationDefaultAttribute;
                CtClass ctClass = this.pool.get(string2);
                ClassFile classFile = ctClass.getClassFile2();
                MethodInfo methodInfo = classFile.getMethod(string);
                if (methodInfo != null && (annotationDefaultAttribute = (AnnotationDefaultAttribute)methodInfo.getAttribute("AnnotationDefault")) != null) {
                    MemberValue memberValue = annotationDefaultAttribute.getDefaultValue();
                    return memberValue.getValue(this.classLoader, this.pool, method);
                }
            }
            catch (NotFoundException notFoundException) {
                throw new RuntimeException("cannot find a class file: " + string2);
            }
        }
        throw new RuntimeException("no default value: " + string2 + "." + string + "()");
    }

    public int hashCode() {
        if (this.cachedHashCode == Integer.MIN_VALUE) {
            int n6 = 0;
            this.getAnnotationType();
            Method[] arrmethod = this.annotationType.getDeclaredMethods();
            for (int k = 0; k < arrmethod.length; ++k) {
                String string = arrmethod[k].getName();
                int n10 = 0;
                MemberValue memberValue = this.annotation.getMemberValue(string);
                Object object = null;
                try {
                    if (memberValue != null) {
                        object = memberValue.getValue(this.classLoader, this.pool, arrmethod[k]);
                    }
                    if (object == null) {
                        object = this.getDefault(string, arrmethod[k]);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
                catch (Exception exception) {
                    throw new RuntimeException("Error retrieving value " + string + " for annotation " + this.annotation.getTypeName(), exception);
                }
                if (object != null) {
                    n10 = object.getClass().isArray() ? AnnotationImpl.arrayHashCode(object) : object.hashCode();
                }
                n6 += 127 * string.hashCode() ^ n10;
            }
            this.cachedHashCode = n6;
        }
        return this.cachedHashCode;
    }

    private boolean checkEquals(Object object) throws Exception {
        Object object2;
        if (object == null) {
            return false;
        }
        if (object instanceof Proxy && (object2 = Proxy.getInvocationHandler(object)) instanceof AnnotationImpl) {
            AnnotationImpl annotationImpl = (AnnotationImpl)object2;
            return this.annotation.equals(annotationImpl.annotation);
        }
        object2 = (Class)JDK_ANNOTATION_TYPE_METHOD.invoke(object, new Object[0]);
        if (!this.getAnnotationType().equals(object2)) {
            return false;
        }
        Method[] arrmethod = this.annotationType.getDeclaredMethods();
        for (int k = 0; k < arrmethod.length; ++k) {
            String string = arrmethod[k].getName();
            MemberValue memberValue = this.annotation.getMemberValue(string);
            Object object3 = null;
            Object object4 = null;
            try {
                if (memberValue != null) {
                    object3 = memberValue.getValue(this.classLoader, this.pool, arrmethod[k]);
                }
                if (object3 == null) {
                    object3 = this.getDefault(string, arrmethod[k]);
                }
                object4 = arrmethod[k].invoke(object, new Object[0]);
            }
            catch (RuntimeException runtimeException) {
                throw runtimeException;
            }
            catch (Exception exception) {
                throw new RuntimeException("Error retrieving value " + string + " for annotation " + this.annotation.getTypeName(), exception);
            }
            if (object3 == null && object4 != null) {
                return false;
            }
            if (object3 == null || object3.equals(object4)) continue;
            return false;
        }
        return true;
    }

    private static int arrayHashCode(Object object) {
        if (object == null) {
            return 0;
        }
        int n6 = 1;
        Object[] arrobject = (Object[])object;
        for (int k = 0; k < arrobject.length; ++k) {
            int n10 = 0;
            if (arrobject[k] != null) {
                n10 = arrobject[k].hashCode();
            }
            n6 = 31 * n6 + n10;
        }
        return n6;
    }

    static {
        try {
            Class<?> class_ = Class.forName(JDK_ANNOTATION_CLASS_NAME);
            JDK_ANNOTATION_TYPE_METHOD = class_.getMethod("annotationType", null);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

