/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import javassist.bytecode.ConstPool;
import javassist.bytecode.stackmap.TypeData$AbsTypeVar;
import javassist.bytecode.stackmap.TypeData$ArrayElement;
import javassist.bytecode.stackmap.TypeData$ArrayType;
import javassist.bytecode.stackmap.TypeData$BasicType;
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypeData$TypeVar;
import javassist.bytecode.stackmap.TypeTag;

public abstract class TypeData {
    private static int b;

    public static TypeData[] d(int n6) {
        TypeData[] arrtypeData = new TypeData[n6];
        for (int k = 0; k < n6; ++k) {
            arrtypeData[k] = TypeTag.TOP;
        }
        return arrtypeData;
    }

    protected TypeData() {
    }

    private static void a(TypeData typeData, String string, ClassPool classPool) throws BadBytecode {
        typeData.setType(string, classPool);
    }

    public abstract int getTypeTag();

    public abstract int getTypeData(ConstPool var1);

    public TypeData join() {
        return new TypeData$TypeVar(this);
    }

    public abstract TypeData$BasicType isBasicType();

    public abstract boolean is2WordType();

    public boolean isNullType() {
        return false;
    }

    public boolean isUninit() {
        return false;
    }

    public abstract boolean eq(TypeData var1);

    public abstract String getName();

    public abstract void setType(String var1, ClassPool var2) throws BadBytecode;

    public abstract TypeData getArrayType(int var1) throws NotFoundException;

    public int dfs(List<TypeData> list, int n6, ClassPool classPool) throws NotFoundException {
        return n6;
    }

    protected TypeData$TypeVar toTypeVar(int n6) {
        return null;
    }

    public void constructorCalled(int n6) {
    }

    public String toString() {
        return super.toString() + "(" + this.toString2(new HashSet<TypeData>()) + ")";
    }

    abstract String toString2(Set<TypeData> var1);

    public static CtClass c(CtClass ctClass, CtClass ctClass2) throws NotFoundException {
        if (ctClass == ctClass2) {
            return ctClass;
        }
        if (ctClass.isArray() && ctClass2.isArray()) {
            CtClass ctClass3;
            CtClass ctClass4 = ctClass.getComponentType();
            CtClass ctClass5 = TypeData.c(ctClass4, ctClass3 = ctClass2.getComponentType());
            if (ctClass5 == ctClass4) {
                return ctClass;
            }
            if (ctClass5 == ctClass3) {
                return ctClass2;
            }
            return ctClass.getClassPool().get(ctClass5 == null ? "java.lang.Object" : ctClass5.getName() + "[]");
        }
        if (ctClass.isPrimitive() || ctClass2.isPrimitive()) {
            return null;
        }
        if (ctClass.isArray() || ctClass2.isArray()) {
            return ctClass.getClassPool().get("java.lang.Object");
        }
        return TypeData.a(ctClass, ctClass2);
    }

    public static CtClass a(CtClass ctClass, CtClass ctClass2) throws NotFoundException {
        CtClass ctClass3;
        CtClass ctClass4 = ctClass;
        CtClass ctClass5 = ctClass3 = ctClass2;
        CtClass ctClass6 = ctClass4;
        while (true) {
            if (TypeData.b(ctClass4, ctClass3) && ctClass4.getSuperclass() != null) {
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
        while (!TypeData.b(ctClass4, ctClass3)) {
            ctClass4 = ctClass4.getSuperclass();
            ctClass3 = ctClass3.getSuperclass();
        }
        return ctClass4;
    }

    static boolean b(CtClass ctClass, CtClass ctClass2) {
        return ctClass == ctClass2 || ctClass != null && ctClass2 != null && ctClass.getName().equals(ctClass2.getName());
    }

    public static void a(TypeData typeData, TypeData typeData2, ClassPool classPool) throws BadBytecode {
        if (typeData instanceof TypeData$AbsTypeVar && !typeData2.isNullType()) {
            ((TypeData$AbsTypeVar)typeData).merge(TypeData$ArrayType.make(typeData2));
        }
        if (typeData2 instanceof TypeData$AbsTypeVar) {
            if (typeData instanceof TypeData$AbsTypeVar) {
                TypeData$ArrayElement.make(typeData);
            } else if (typeData instanceof TypeData$ClassName) {
                if (!typeData.isNullType()) {
                    String string = TypeData$ArrayElement.access$000(typeData.getName());
                    typeData2.setType(string, classPool);
                }
            } else {
                throw new BadBytecode("bad AASTORE: " + typeData);
            }
        }
    }

    public static void e(int n6) {
        b = n6;
    }

    public static int e() {
        return b;
    }

    public static int i() {
        int n6 = TypeData.e();
        if (n6 == 0) {
            return 15;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (TypeData.i() != 0) {
            TypeData.e(80);
        }
    }
}

