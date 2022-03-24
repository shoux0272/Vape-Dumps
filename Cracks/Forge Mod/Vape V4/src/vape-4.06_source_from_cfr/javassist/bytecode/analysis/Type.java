/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.analysis.MultiArrayType;
import javassist.bytecode.analysis.MultiType;

public class Type {
    private final CtClass clazz;
    private final boolean special;
    private static final Map<CtClass, Type> prims = new IdentityHashMap<CtClass, Type>();
    public static final Type DOUBLE = new Type(CtClass.doubleType);
    public static final Type BOOLEAN = new Type(CtClass.booleanType);
    public static final Type LONG = new Type(CtClass.longType);
    public static final Type CHAR = new Type(CtClass.charType);
    public static final Type BYTE = new Type(CtClass.byteType);
    public static final Type SHORT = new Type(CtClass.shortType);
    public static final Type INTEGER = new Type(CtClass.intType);
    public static final Type FLOAT = new Type(CtClass.floatType);
    public static final Type VOID = new Type(CtClass.voidType);
    public static final Type UNINIT = new Type(null);
    public static final Type RETURN_ADDRESS = new Type(null, true);
    public static final Type TOP = new Type(null, true);
    public static final Type BOGUS = new Type(null, true);
    public static final Type OBJECT = Type.lookupType("java.lang.Object");
    public static final Type SERIALIZABLE = Type.lookupType("java.io.Serializable");
    public static final Type CLONEABLE = Type.lookupType("java.lang.Cloneable");
    public static final Type THROWABLE = Type.lookupType("java.lang.Throwable");

    public static Type get(CtClass ctClass) {
        Type type = prims.get(ctClass);
        return type != null ? type : new Type(ctClass);
    }

    private static Type lookupType(String string) {
        try {
            return new Type(ClassPool.getDefault().get(string));
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException);
        }
    }

    Type(CtClass ctClass) {
        this(ctClass, false);
    }

    private Type(CtClass ctClass, boolean bl) {
        this.clazz = ctClass;
        this.special = bl;
    }

    boolean popChanged() {
        return false;
    }

    public int getSize() {
        return this.clazz == CtClass.doubleType || this.clazz == CtClass.longType || this == TOP ? 2 : 1;
    }

    public CtClass getCtClass() {
        return this.clazz;
    }

    public boolean isReference() {
        return !this.special && (this.clazz == null || !this.clazz.isPrimitive());
    }

    public boolean isSpecial() {
        return this.special;
    }

    public boolean isArray() {
        return this.clazz != null && this.clazz.isArray();
    }

    public int getDimensions() {
        if (!this.isArray()) {
            return 0;
        }
        String string = this.clazz.getName();
        int n6 = string.length() - 1;
        int n10 = 0;
        while (string.charAt(n6) == ']') {
            n6 -= 2;
            ++n10;
        }
        return n10;
    }

    public Type getComponent() {
        CtClass ctClass;
        if (this.clazz == null || !this.clazz.isArray()) {
            return null;
        }
        try {
            ctClass = this.clazz.getComponentType();
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException);
        }
        Type type = prims.get(ctClass);
        return type != null ? type : new Type(ctClass);
    }

    public boolean isAssignableFrom(Type type) {
        if (this == type) {
            return true;
        }
        if (type == UNINIT && this.isReference() || this == UNINIT && type.isReference()) {
            return true;
        }
        if (type instanceof MultiType) {
            return ((MultiType)type).isAssignableTo(this);
        }
        if (type instanceof MultiArrayType) {
            return ((MultiArrayType)type).isAssignableTo(this);
        }
        if (this.clazz == null || this.clazz.isPrimitive()) {
            return false;
        }
        try {
            return type.clazz.subtypeOf(this.clazz);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public Type merge(Type type) {
        if (type == this) {
            return this;
        }
        if (type == null) {
            return this;
        }
        if (type == UNINIT) {
            return this;
        }
        if (this == UNINIT) {
            return type;
        }
        if (!type.isReference() || !this.isReference()) {
            return BOGUS;
        }
        if (type instanceof MultiType) {
            return type.merge(this);
        }
        if (type.isArray() && this.isArray()) {
            return this.mergeArray(type);
        }
        try {
            return this.mergeClasses(type);
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException);
        }
    }

    Type getRootComponent(Type type) {
        while (type.isArray()) {
            type = type.getComponent();
        }
        return type;
    }

    private Type createArray(Type type, int n6) {
        Type type2;
        if (type instanceof MultiType) {
            return new MultiArrayType((MultiType)type, n6);
        }
        String string = this.arrayName(type.clazz.getName(), n6);
        try {
            type2 = Type.get(this.getClassPool(type).get(string));
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException);
        }
        return type2;
    }

    String arrayName(String string, int n6) {
        int n10 = string.length();
        int n11 = n10 + n6 * 2;
        char[] arrc = new char[n11];
        string.getChars(0, n10, arrc, 0);
        while (n10 < n11) {
            arrc[n10++] = 91;
            arrc[n10++] = 93;
        }
        string = new String(arrc);
        return string;
    }

    private ClassPool getClassPool(Type type) {
        ClassPool classPool = type.clazz.getClassPool();
        return classPool != null ? classPool : ClassPool.getDefault();
    }

    private Type mergeArray(Type type) {
        int n6;
        Type type2;
        int n10;
        Type type3 = this.getRootComponent(type);
        Type type4 = this.getRootComponent(this);
        int n11 = type.getDimensions();
        if (n11 == (n10 = this.getDimensions())) {
            Type type5 = type4.merge(type3);
            if (type5 == BOGUS) {
                return OBJECT;
            }
            return this.createArray(type5, n10);
        }
        if (n11 < n10) {
            type2 = type3;
            n6 = n11;
        } else {
            type2 = type4;
            n6 = n10;
        }
        if (Type.eq(Type.CLONEABLE.clazz, type2.clazz) || Type.eq(Type.SERIALIZABLE.clazz, type2.clazz)) {
            return this.createArray(type2, n6);
        }
        return this.createArray(OBJECT, n6);
    }

    private static CtClass findCommonSuperClass(CtClass ctClass, CtClass ctClass2) throws NotFoundException {
        CtClass ctClass3;
        CtClass ctClass4 = ctClass;
        CtClass ctClass5 = ctClass3 = ctClass2;
        CtClass ctClass6 = ctClass4;
        while (true) {
            if (Type.eq(ctClass4, ctClass3) && ctClass4.getSuperclass() != null) {
                return ctClass4;
            }
            CtClass ctClass7 = ctClass4.getSuperclass();
            CtClass ctClass8 = ctClass3.getSuperclass();
            if (ctClass8 == null) {
                ctClass3 = ctClass5;
                break;
            }
            if (ctClass7 == null) {
                ctClass4 = ctClass6;
                ctClass6 = ctClass5;
                ctClass5 = ctClass4;
                ctClass4 = ctClass3;
                ctClass3 = ctClass5;
                break;
            }
            ctClass4 = ctClass7;
            ctClass3 = ctClass8;
        }
        while ((ctClass4 = ctClass4.getSuperclass()) != null) {
            ctClass6 = ctClass6.getSuperclass();
        }
        ctClass4 = ctClass6;
        while (!Type.eq(ctClass4, ctClass3)) {
            ctClass4 = ctClass4.getSuperclass();
            ctClass3 = ctClass3.getSuperclass();
        }
        return ctClass4;
    }

    private Type mergeClasses(Type type) throws NotFoundException {
        CtClass ctClass = Type.findCommonSuperClass(this.clazz, type.clazz);
        if (ctClass.getSuperclass() == null) {
            Map<String, CtClass> map = this.findCommonInterfaces(type);
            if (map.size() == 1) {
                return new Type(map.values().iterator().next());
            }
            if (map.size() > 1) {
                return new MultiType(map);
            }
            return new Type(ctClass);
        }
        Map<String, CtClass> map = this.findExclusiveDeclaredInterfaces(type, ctClass);
        if (map.size() > 0) {
            return new MultiType(map, new Type(ctClass));
        }
        return new Type(ctClass);
    }

    private Map<String, CtClass> findCommonInterfaces(Type type) {
        Map<String, CtClass> map = this.getAllInterfaces(type.clazz, null);
        Map<String, CtClass> map2 = this.getAllInterfaces(this.clazz, null);
        return this.findCommonInterfaces(map, map2);
    }

    private Map<String, CtClass> findExclusiveDeclaredInterfaces(Type type, CtClass ctClass) {
        Map<String, CtClass> map = this.getDeclaredInterfaces(type.clazz, null);
        Map<String, CtClass> map2 = this.getDeclaredInterfaces(this.clazz, null);
        Map<String, CtClass> map3 = this.getAllInterfaces(ctClass, null);
        for (String string : map3.keySet()) {
            map.remove(string);
            map2.remove(string);
        }
        return this.findCommonInterfaces(map, map2);
    }

    Map<String, CtClass> findCommonInterfaces(Map<String, CtClass> map, Map<String, CtClass> map2) {
        if (map2 == null) {
            map2 = new HashMap<String, CtClass>();
        }
        if (map == null || map.isEmpty()) {
            map2.clear();
        }
        for (String object : map2.keySet()) {
            if (map.containsKey(object)) continue;
            map2.remove(object);
        }
        for (CtClass ctClass : map2.values()) {
            CtClass[] arrctClass;
            try {
                arrctClass = ctClass.getInterfaces();
            }
            catch (NotFoundException notFoundException) {
                throw new RuntimeException(notFoundException);
            }
            for (CtClass ctClass2 : arrctClass) {
                map2.remove(ctClass2.getName());
            }
        }
        return map2;
    }

    Map<String, CtClass> getAllInterfaces(CtClass ctClass, Map<String, CtClass> map) {
        if (map == null) {
            map = new HashMap<String, CtClass>();
        }
        if (ctClass.isInterface()) {
            map.put(ctClass.getName(), ctClass);
        }
        do {
            try {
                CtClass[] arrctClass;
                for (CtClass ctClass2 : arrctClass = ctClass.getInterfaces()) {
                    map.put(ctClass2.getName(), ctClass2);
                    this.getAllInterfaces(ctClass2, map);
                }
                ctClass = ctClass.getSuperclass();
            }
            catch (NotFoundException notFoundException) {
                throw new RuntimeException(notFoundException);
            }
        } while (ctClass != null);
        return map;
    }

    Map<String, CtClass> getDeclaredInterfaces(CtClass ctClass, Map<String, CtClass> map) {
        CtClass[] arrctClass;
        if (map == null) {
            map = new HashMap<String, CtClass>();
        }
        if (ctClass.isInterface()) {
            map.put(ctClass.getName(), ctClass);
        }
        try {
            arrctClass = ctClass.getInterfaces();
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException);
        }
        for (CtClass ctClass2 : arrctClass) {
            map.put(ctClass2.getName(), ctClass2);
            this.getDeclaredInterfaces(ctClass2, map);
        }
        return map;
    }

    public int hashCode() {
        return this.getClass().hashCode() + this.clazz.hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof Type)) {
            return false;
        }
        return object.getClass() == this.getClass() && Type.eq(this.clazz, ((Type)object).clazz);
    }

    static boolean eq(CtClass ctClass, CtClass ctClass2) {
        return ctClass == ctClass2 || ctClass != null && ctClass2 != null && ctClass.getName().equals(ctClass2.getName());
    }

    public String toString() {
        if (this == BOGUS) {
            return "BOGUS";
        }
        if (this == UNINIT) {
            return "UNINIT";
        }
        if (this == RETURN_ADDRESS) {
            return "RETURN ADDRESS";
        }
        if (this == TOP) {
            return "TOP";
        }
        return this.clazz == null ? "null" : this.clazz.getName();
    }

    static {
        prims.put(CtClass.doubleType, DOUBLE);
        prims.put(CtClass.longType, LONG);
        prims.put(CtClass.charType, CHAR);
        prims.put(CtClass.shortType, SHORT);
        prims.put(CtClass.intType, INTEGER);
        prims.put(CtClass.floatType, FLOAT);
        prims.put(CtClass.byteType, BYTE);
        prims.put(CtClass.booleanType, BOOLEAN);
        prims.put(CtClass.voidType, VOID);
    }
}

