/*
 * Decompiled with CFR 0.150.
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
final class Util {
    private Util() {
    }

    static <T> List<T> add(List<T> list, T element) {
        ArrayList<T> newList = list == null ? new ArrayList<T>(1) : list;
        newList.add(element);
        return newList;
    }

    static <T> List<T> asArrayList(int length) {
        ArrayList<Object> list = new ArrayList<Object>(length);
        for (int i10 = 0; i10 < length; ++i10) {
            list.add(null);
        }
        return list;
    }

    static <T> List<T> asArrayList(T[] array) {
        if (array == null) {
            return new ArrayList();
        }
        ArrayList<T> list = new ArrayList<T>(array.length);
        for (T t2 : array) {
            list.add(t2);
        }
        return list;
    }

    static List<Byte> asArrayList(byte[] byteArray) {
        if (byteArray == null) {
            return new ArrayList<Byte>();
        }
        ArrayList<Byte> byteList = new ArrayList<Byte>(byteArray.length);
        for (byte b3 : byteArray) {
            byteList.add(b3);
        }
        return byteList;
    }

    static List<Boolean> asArrayList(boolean[] booleanArray) {
        if (booleanArray == null) {
            return new ArrayList<Boolean>();
        }
        ArrayList<Boolean> booleanList = new ArrayList<Boolean>(booleanArray.length);
        for (boolean b3 : booleanArray) {
            booleanList.add(b3);
        }
        return booleanList;
    }

    static List<Short> asArrayList(short[] shortArray) {
        if (shortArray == null) {
            return new ArrayList<Short>();
        }
        ArrayList<Short> shortList = new ArrayList<Short>(shortArray.length);
        for (short s : shortArray) {
            shortList.add(s);
        }
        return shortList;
    }

    static List<Character> asArrayList(char[] charArray) {
        if (charArray == null) {
            return new ArrayList<Character>();
        }
        ArrayList<Character> charList = new ArrayList<Character>(charArray.length);
        for (char c3 : charArray) {
            charList.add(Character.valueOf(c3));
        }
        return charList;
    }

    static List<Integer> asArrayList(int[] intArray) {
        if (intArray == null) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> intList = new ArrayList<Integer>(intArray.length);
        for (int i10 : intArray) {
            intList.add(i10);
        }
        return intList;
    }

    static List<Float> asArrayList(float[] floatArray) {
        if (floatArray == null) {
            return new ArrayList<Float>();
        }
        ArrayList<Float> floatList = new ArrayList<Float>(floatArray.length);
        for (float f10 : floatArray) {
            floatList.add(Float.valueOf(f10));
        }
        return floatList;
    }

    static List<Long> asArrayList(long[] longArray) {
        if (longArray == null) {
            return new ArrayList<Long>();
        }
        ArrayList<Long> longList = new ArrayList<Long>(longArray.length);
        for (long l : longArray) {
            longList.add(l);
        }
        return longList;
    }

    static List<Double> asArrayList(double[] doubleArray) {
        if (doubleArray == null) {
            return new ArrayList<Double>();
        }
        ArrayList<Double> doubleList = new ArrayList<Double>(doubleArray.length);
        for (double d10 : doubleArray) {
            doubleList.add(d10);
        }
        return doubleList;
    }

    static <T> List<T> asArrayList(int length, T[] array) {
        ArrayList<T> list = new ArrayList<T>(length);
        for (int i10 = 0; i10 < length; ++i10) {
            list.add(array[i10]);
        }
        return list;
    }
}

