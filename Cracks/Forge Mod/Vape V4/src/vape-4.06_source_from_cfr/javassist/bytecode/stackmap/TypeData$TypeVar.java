/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$AbsTypeVar;
import javassist.bytecode.stackmap.TypeData$BasicType;
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypeData$NullType;
import javassist.bytecode.stackmap.TypeTag;

public class TypeData$TypeVar
extends TypeData$AbsTypeVar {
    protected List<TypeData> lowers = new ArrayList<TypeData>(2);
    protected List<TypeData> usedBy = new ArrayList<TypeData>(2);
    protected List<String> uppers = null;
    protected String fixedType;
    private boolean is2WordType;
    private int visited = 0;
    private int smallest = 0;
    private boolean inList = false;
    private int dimension = 0;

    public TypeData$TypeVar(TypeData typeData) {
        this.merge(typeData);
        this.fixedType = null;
        this.is2WordType = typeData.is2WordType();
    }

    @Override
    public String getName() {
        if (this.fixedType == null) {
            return this.lowers.get(0).getName();
        }
        return this.fixedType;
    }

    @Override
    public TypeData$BasicType isBasicType() {
        if (this.fixedType == null) {
            return this.lowers.get(0).isBasicType();
        }
        return null;
    }

    @Override
    public boolean is2WordType() {
        if (this.fixedType == null) {
            return this.is2WordType;
        }
        return false;
    }

    @Override
    public boolean isNullType() {
        if (this.fixedType == null) {
            return this.lowers.get(0).isNullType();
        }
        return false;
    }

    @Override
    public boolean isUninit() {
        if (this.fixedType == null) {
            return this.lowers.get(0).isUninit();
        }
        return false;
    }

    @Override
    public void merge(TypeData typeData) {
        this.lowers.add(typeData);
        if (typeData instanceof TypeData$TypeVar) {
            ((TypeData$TypeVar)typeData).usedBy.add(this);
        }
    }

    @Override
    public int getTypeTag() {
        if (this.fixedType == null) {
            return this.lowers.get(0).getTypeTag();
        }
        return super.getTypeTag();
    }

    @Override
    public int getTypeData(ConstPool constPool) {
        if (this.fixedType == null) {
            return this.lowers.get(0).getTypeData(constPool);
        }
        return super.getTypeData(constPool);
    }

    @Override
    public void setType(String string, ClassPool classPool) throws BadBytecode {
        if (this.uppers == null) {
            this.uppers = new ArrayList<String>();
        }
        this.uppers.add(string);
    }

    @Override
    protected TypeData$TypeVar toTypeVar(int n6) {
        this.dimension = n6;
        return this;
    }

    @Override
    public TypeData getArrayType(int n6) throws NotFoundException {
        if (n6 == 0) {
            return this;
        }
        TypeData$BasicType typeData$BasicType = this.isBasicType();
        if (typeData$BasicType == null) {
            if (this.isNullType()) {
                return new TypeData$NullType();
            }
            return new TypeData$ClassName(this.getName()).getArrayType(n6);
        }
        return typeData$BasicType.getArrayType(n6);
    }

    @Override
    public int dfs(List<TypeData> list, int n6, ClassPool classPool) throws NotFoundException {
        TypeData$TypeVar typeData$TypeVar;
        if (this.visited > 0) {
            return n6;
        }
        this.visited = this.smallest = ++n6;
        list.add(this);
        this.inList = true;
        int n10 = this.lowers.size();
        for (int k = 0; k < n10; ++k) {
            typeData$TypeVar = this.lowers.get(k).toTypeVar(this.dimension);
            if (typeData$TypeVar == null) continue;
            if (typeData$TypeVar.visited == 0) {
                n6 = typeData$TypeVar.dfs(list, n6, classPool);
                if (typeData$TypeVar.smallest >= this.smallest) continue;
                this.smallest = typeData$TypeVar.smallest;
                continue;
            }
            if (!typeData$TypeVar.inList || typeData$TypeVar.visited >= this.smallest) continue;
            this.smallest = typeData$TypeVar.visited;
        }
        if (this.visited == this.smallest) {
            ArrayList<TypeData> arrayList = new ArrayList<TypeData>();
            do {
                typeData$TypeVar = (TypeData$TypeVar)list.remove(list.size() - 1);
                typeData$TypeVar.inList = false;
                arrayList.add(typeData$TypeVar);
            } while (typeData$TypeVar != this);
            this.fixTypes(arrayList, classPool);
        }
        return n6;
    }

    private void fixTypes(List<TypeData> list, ClassPool classPool) throws NotFoundException {
        HashSet<String> hashSet = new HashSet<String>();
        boolean bl = false;
        TypeData typeData = null;
        int n6 = list.size();
        block0: for (int k = 0; k < n6; ++k) {
            TypeData$TypeVar typeData$TypeVar = (TypeData$TypeVar)list.get(k);
            List<TypeData> list2 = typeData$TypeVar.lowers;
            int n10 = list2.size();
            for (int i10 = 0; i10 < n10; ++i10) {
                TypeData typeData2 = list2.get(i10);
                TypeData typeData3 = typeData2.getArrayType(typeData$TypeVar.dimension);
                TypeData$BasicType typeData$BasicType = typeData3.isBasicType();
                if (typeData == null) {
                    if (typeData$BasicType == null) {
                        bl = false;
                        typeData = typeData3;
                        if (typeData3.isUninit()) {
                            continue block0;
                        }
                    } else {
                        bl = true;
                        typeData = typeData$BasicType;
                    }
                } else if (typeData$BasicType == null && bl || typeData$BasicType != null && typeData != typeData$BasicType) {
                    bl = true;
                    typeData = TypeTag.TOP;
                    continue block0;
                }
                if (typeData$BasicType != null || typeData3.isNullType()) continue;
                hashSet.add(typeData3.getName());
            }
        }
        if (bl) {
            this.is2WordType = typeData.is2WordType();
            this.fixTypes1(list, typeData);
        } else {
            String string = this.fixTypes2(list, hashSet, classPool);
            this.fixTypes1(list, new TypeData$ClassName(string));
        }
    }

    private void fixTypes1(List<TypeData> list, TypeData typeData) throws NotFoundException {
        int n6 = list.size();
        for (int k = 0; k < n6; ++k) {
            TypeData$TypeVar typeData$TypeVar = (TypeData$TypeVar)list.get(k);
            TypeData typeData2 = typeData.getArrayType(-typeData$TypeVar.dimension);
            if (typeData2.isBasicType() == null) {
                typeData$TypeVar.fixedType = typeData2.getName();
                continue;
            }
            typeData$TypeVar.lowers.clear();
            typeData$TypeVar.lowers.add(typeData2);
            typeData$TypeVar.is2WordType = typeData2.is2WordType();
        }
    }

    private String fixTypes2(List<TypeData> list, Set<String> set, ClassPool classPool) throws NotFoundException {
        Iterator<String> iterator = set.iterator();
        if (set.size() == 0) {
            return null;
        }
        if (set.size() == 1) {
            return iterator.next();
        }
        CtClass ctClass = classPool.get(iterator.next());
        while (iterator.hasNext()) {
            ctClass = TypeData$TypeVar.c(ctClass, classPool.get(iterator.next()));
        }
        if (ctClass.getSuperclass() == null || TypeData$TypeVar.isObjectArray(ctClass)) {
            ctClass = this.fixByUppers(list, classPool, new HashSet<TypeData>(), ctClass);
        }
        if (ctClass.isArray()) {
            return Descriptor.toJvmName(ctClass);
        }
        return ctClass.getName();
    }

    private static boolean isObjectArray(CtClass ctClass) throws NotFoundException {
        return ctClass.isArray() && ctClass.getComponentType().getSuperclass() == null;
    }

    private CtClass fixByUppers(List<TypeData> list, ClassPool classPool, Set<TypeData> set, CtClass ctClass) throws NotFoundException {
        if (list == null) {
            return ctClass;
        }
        int n6 = list.size();
        for (int k = 0; k < n6; ++k) {
            TypeData$TypeVar typeData$TypeVar = (TypeData$TypeVar)list.get(k);
            if (!set.add(typeData$TypeVar)) {
                return ctClass;
            }
            if (typeData$TypeVar.uppers != null) {
                int n10 = typeData$TypeVar.uppers.size();
                for (int i10 = 0; i10 < n10; ++i10) {
                    CtClass ctClass2 = classPool.get(typeData$TypeVar.uppers.get(i10));
                    if (!ctClass2.subtypeOf(ctClass)) continue;
                    ctClass = ctClass2;
                }
            }
            ctClass = this.fixByUppers(typeData$TypeVar.usedBy, classPool, set, ctClass);
        }
        return ctClass;
    }

    @Override
    String toString2(Set<TypeData> set) {
        TypeData typeData;
        set.add(this);
        if (this.lowers.size() > 0 && (typeData = this.lowers.get(0)) != null && !set.contains(typeData)) {
            return typeData.toString2(set);
        }
        return "?";
    }
}

