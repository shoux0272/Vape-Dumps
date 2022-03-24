/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
package a;

import a.Utils;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import ripygore.Mappings;

public class b {
    private static final TIntObjectMap<Method> METHODS = new TIntObjectHashMap();
    private static final TIntObjectMap<Field> FIELDS = new TIntObjectHashMap();
    private static final TIntObjectMap<Constructor<?>> CONSTRUCTORS = new TIntObjectHashMap();

    public static void a(int id2, Class<?> cls, String name, String desc, boolean remap) throws NoSuchMethodException {
        b.getMethod(id2, cls, name, desc, remap, false);
    }

    public static void b(int id2, Class<?> cls, String name, String desc, boolean remap) throws NoSuchMethodException {
        b.getMethod(id2, cls, name, desc, remap, true);
    }

    private static void getMethod(int id2, Class<?> cls, String name, String desc, boolean remap, boolean isStatic) throws NoSuchMethodException {
        if (name.equals("<init>")) {
            b.getConstructor(id2, cls, desc);
        } else {
            if (!name.equals("ordinal") && !name.equals("values")) {
                boolean skipParamCheck = name.equals("getEnchantmentModifierDamage");
                for (Method method : cls.getDeclaredMethods()) {
                    if (!Mappings.match(method, name) || !Utils.checkParameterTypes(method.getParameterTypes(), method.getReturnType(), desc) && !skipParamCheck) continue;
                    method.setAccessible(true);
                    METHODS.put(id2, (Object)method);
                    return;
                }
                System.out.println("METHOD NOT FOUND: " + id2 + " " + name + " IN " + cls.getName());
                throw new NoSuchMethodException();
            }
            METHODS.put(id2, (Object)Enum.class.getDeclaredMethod(name, new Class[0]));
        }
    }

    private static void getConstructor(int id2, Class<?> cls, String desc) {
        Constructor<?>[] constructors;
        for (Constructor<?> constructor : constructors = cls.getDeclaredConstructors()) {
            if (!Utils.checkParameterTypes(constructor.getParameterTypes(), Void.TYPE, desc)) continue;
            constructor.setAccessible(true);
            CONSTRUCTORS.put(id2, constructor);
            return;
        }
    }

    public static void c(int id2, Object instance, Object ... params) throws Exception {
        b.invokeMethod(id2, instance, Void.TYPE, params);
    }

    public static boolean d(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Boolean.TYPE, params);
    }

    public static char e(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Character.TYPE, params).charValue();
    }

    public static short f(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Short.TYPE, params);
    }

    public static int g(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Integer.TYPE, params);
    }

    public static long h(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Long.TYPE, params);
    }

    public static float i(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Float.TYPE, params).floatValue();
    }

    public static double j(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Double.TYPE, params);
    }

    public static Object k(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Object.class, params);
    }

    public static boolean[] l(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, boolean[].class, params);
    }

    public static char[] m(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, char[].class, params);
    }

    public static short[] n(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, short[].class, params);
    }

    public static int[] o(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, int[].class, params);
    }

    public static long[] p(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, long[].class, params);
    }

    public static float[] q(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, float[].class, params);
    }

    public static double[] r(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, double[].class, params);
    }

    public static Object[] s(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Object[].class, params);
    }

    private static <T> T invokeMethod(int id2, Object instance, Class<T> type, Object ... params) throws Exception {
        return (T)((Method)METHODS.get(id2)).invoke(instance, params);
    }

    public static void t(int id2, Class<?> cls, String name, String type, boolean remap) throws NoSuchFieldException {
        b.getField(id2, cls, name, type, remap, false);
    }

    public static void u(int id2, Class<?> cls, String name, String type, boolean remap) throws NoSuchFieldException {
        b.getField(id2, cls, name, type, remap, true);
    }

    private static void getField(int id2, Class<?> cls, String name, String type, boolean remap, boolean isStatic) throws NoSuchFieldException {
        for (Field field : cls.getDeclaredFields()) {
            if (!Mappings.match(field, name)) continue;
            field.setAccessible(true);
            FIELDS.put(id2, (Object)field);
            return;
        }
        System.out.println("FIELD NOT FOUND: " + id2 + " " + name + " IN " + cls.getName());
        throw new NoSuchFieldException();
    }

    public static boolean v(int id2, Object instance) throws Exception {
        return ((Field)FIELDS.get(id2)).getBoolean(instance);
    }

    public static char w(int id2, Object instance) throws Exception {
        return ((Field)FIELDS.get(id2)).getChar(instance);
    }

    public static short x(int id2, Object instance) throws Exception {
        return ((Field)FIELDS.get(id2)).getShort(instance);
    }

    public static int y(int id2, Object instance) throws Exception {
        return ((Field)FIELDS.get(id2)).getInt(instance);
    }

    public static long z(int id2, Object instance) throws Exception {
        return ((Field)FIELDS.get(id2)).getLong(instance);
    }

    public static float aa(int id2, Object instance) throws Exception {
        Field field = (Field)FIELDS.get(id2);
        return field.getType() == Float.TYPE ? field.getFloat(instance) : (float)field.getDouble(instance);
    }

    public static double bb(int id2, Object instance) throws Exception {
        return ((Field)FIELDS.get(id2)).getDouble(instance);
    }

    public static Object cc(int id2, Object instance) throws Exception {
        return b.getField(id2, instance);
    }

    public static boolean[] dd(int id2, Object instance) throws Exception {
        return (boolean[])b.getField(id2, instance);
    }

    public static char[] ee(int id2, Object instance) throws Exception {
        return (char[])b.getField(id2, instance);
    }

    public static short[] ff(int id2, Object instance) throws Exception {
        return (short[])b.getField(id2, instance);
    }

    public static int[] gg(int id2, Object instance) throws Exception {
        return (int[])b.getField(id2, instance);
    }

    public static long[] hh(int id2, Object instance) throws Exception {
        return (long[])b.getField(id2, instance);
    }

    public static float[] ii(int id2, Object instance) throws Exception {
        return (float[])b.getField(id2, instance);
    }

    public static double[] jj(int id2, Object instance) throws Exception {
        return (double[])b.getField(id2, instance);
    }

    public static Object[] kk(int id2, Object instance) throws Exception {
        return (Object[])b.getField(id2, instance);
    }

    private static <T> T getField(int id2, Object instance) throws Exception {
        try {
            return (T)((Field)FIELDS.get(id2)).get(instance);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            throw var4;
        }
    }

    public static void ll(int id2, Object instance, boolean value) throws Exception {
        ((Field)FIELDS.get(id2)).setBoolean(instance, value);
    }

    public static void mm(int id2, Object instance, char value) throws Exception {
        ((Field)FIELDS.get(id2)).setChar(instance, value);
    }

    public static void nn(int id2, Object instance, short value) throws Exception {
        ((Field)FIELDS.get(id2)).setShort(instance, value);
    }

    public static void oo(int id2, Object instance, int value) throws Exception {
        ((Field)FIELDS.get(id2)).setInt(instance, value);
    }

    public static void pp(int id2, Object instance, long value) throws Exception {
        ((Field)FIELDS.get(id2)).setLong(instance, value);
    }

    public static void qq(int id2, Object instance, float value) throws Exception {
        ((Field)FIELDS.get(id2)).setFloat(instance, value);
    }

    public static void rr(int id2, Object instance, double value) throws Exception {
        ((Field)FIELDS.get(id2)).setDouble(instance, value);
    }

    public static void ss(int id2, Object instance, Object value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    public static void tt(int id2, Object instance, boolean[] value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    public static void uu(int id2, Object instance, char[] value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    public static void vv(int id2, Object instance, short[] value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    public static void ww(int id2, Object instance, int[] value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    public static void xx(int id2, Object instance, long[] value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    public static void yy(int id2, Object instance, float[] value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    public static void zz(int id2, Object instance, double[] value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    public static void aaa(int id2, Object instance, Object[] value) throws Exception {
        b.setObjectField(id2, instance, value);
    }

    private static void setObjectField(int id2, Object instance, Object value) throws Exception {
        ((Field)FIELDS.get(id2)).set(instance, value);
    }

    public static void bbb(int id2, Object instance, Object ... params) throws Exception {
        b.invokeMethod(id2, instance, Void.TYPE, params);
    }

    public static Object ccc(int id2, Class<?> cls, Object ... params) throws Exception {
        return b.invokeConstructor(id2, params);
    }

    private static <T> T invokeConstructor(int id2, Object ... params) throws Exception {
        return ((Constructor)CONSTRUCTORS.get(id2)).newInstance(params);
    }

    public static byte ddd(int id2, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id2, instance, Byte.TYPE, params);
    }

    public static String gfn(int id2) {
        return ((Field)FIELDS.get(id2)).getName();
    }

    public static String gmn(int id2) {
        return ((Method)METHODS.get(id2)).getName();
    }
}

