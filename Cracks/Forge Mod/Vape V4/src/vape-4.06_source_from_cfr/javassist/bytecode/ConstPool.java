/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javassist.CtClass;
import javassist.bytecode.ClassInfo;
import javassist.bytecode.ConstInfo;
import javassist.bytecode.ConstInfoPadding;
import javassist.bytecode.Descriptor;
import javassist.bytecode.DoubleInfo;
import javassist.bytecode.DynamicInfo;
import javassist.bytecode.FieldrefInfo;
import javassist.bytecode.FloatInfo;
import javassist.bytecode.IntegerInfo;
import javassist.bytecode.InterfaceMethodrefInfo;
import javassist.bytecode.InvokeDynamicInfo;
import javassist.bytecode.LongInfo;
import javassist.bytecode.LongVector;
import javassist.bytecode.MemberrefInfo;
import javassist.bytecode.MethodHandleInfo;
import javassist.bytecode.MethodTypeInfo;
import javassist.bytecode.MethodrefInfo;
import javassist.bytecode.ModuleInfo;
import javassist.bytecode.NameAndTypeInfo;
import javassist.bytecode.PackageInfo;
import javassist.bytecode.StringInfo;
import javassist.bytecode.Utf8Info;

public final class ConstPool {
    LongVector items;
    int numOfItems;
    int thisClassInfo;
    Map<ConstInfo, ConstInfo> itemsCache;
    public static final int g = 7;
    public static final int u = 9;
    public static final int CONST_Methodref = 10;
    public static final int CONST_InterfaceMethodref = 11;
    public static final int C = 8;
    public static final int B = 3;
    public static final int F = 4;
    public static final int m = 5;
    public static final int l = 6;
    public static final int CONST_NameAndType = 12;
    public static final int o = 1;
    public static final int CONST_MethodHandle = 15;
    public static final int CONST_MethodType = 16;
    public static final int CONST_Dynamic = 17;
    public static final int d = 18;
    public static final int E = 18;
    public static final int CONST_Module = 19;
    public static final int CONST_Package = 20;
    public static final CtClass THIS = null;
    public static final int x = 1;
    public static final int REF_getStatic = 2;
    public static final int j = 3;
    public static final int h = 4;
    public static final int f = 5;
    public static final int s = 6;
    public static final int q = 7;
    public static final int e = 8;
    public static final int v = 9;

    public ConstPool(String string) {
        this.items = new LongVector();
        this.itemsCache = null;
        this.numOfItems = 0;
        this.addItem0(null);
        this.thisClassInfo = this.addClassInfo(string);
    }

    public ConstPool(DataInputStream dataInputStream) throws IOException {
        this.itemsCache = null;
        this.thisClassInfo = 0;
        this.read(dataInputStream);
    }

    void prune() {
        this.itemsCache = null;
    }

    public int getSize() {
        return this.numOfItems;
    }

    public String getClassName() {
        return this.getClassInfo(this.thisClassInfo);
    }

    public int getThisClassInfo() {
        return this.thisClassInfo;
    }

    void setThisClassInfo(int n6) {
        this.thisClassInfo = n6;
    }

    ConstInfo getItem(int n6) {
        return this.items.elementAt(n6);
    }

    public int getTag(int n6) {
        return this.getItem(n6).getTag();
    }

    public String getClassInfo(int n6) {
        ClassInfo classInfo = (ClassInfo)this.getItem(n6);
        if (classInfo == null) {
            return null;
        }
        return Descriptor.toJavaName(this.getUtf8Info(classInfo.name));
    }

    public String getClassInfoByDescriptor(int n6) {
        ClassInfo classInfo = (ClassInfo)this.getItem(n6);
        if (classInfo == null) {
            return null;
        }
        String string = this.getUtf8Info(classInfo.name);
        if (string.charAt(0) == '[') {
            return string;
        }
        return Descriptor.of(string);
    }

    public int getNameAndTypeName(int n6) {
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(n6);
        return nameAndTypeInfo.memberName;
    }

    public int getNameAndTypeDescriptor(int n6) {
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(n6);
        return nameAndTypeInfo.typeDescriptor;
    }

    public int P(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        return memberrefInfo.classIndex;
    }

    public int getMemberNameAndType(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        return memberrefInfo.nameAndTypeIndex;
    }

    public int k(int n6) {
        FieldrefInfo fieldrefInfo = (FieldrefInfo)this.getItem(n6);
        return fieldrefInfo.classIndex;
    }

    public String getFieldrefClassName(int n6) {
        FieldrefInfo fieldrefInfo = (FieldrefInfo)this.getItem(n6);
        if (fieldrefInfo == null) {
            return null;
        }
        return this.getClassInfo(fieldrefInfo.classIndex);
    }

    public int getFieldrefNameAndType(int n6) {
        FieldrefInfo fieldrefInfo = (FieldrefInfo)this.getItem(n6);
        return fieldrefInfo.nameAndTypeIndex;
    }

    public String getFieldrefName(int n6) {
        FieldrefInfo fieldrefInfo = (FieldrefInfo)this.getItem(n6);
        if (fieldrefInfo == null) {
            return null;
        }
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(fieldrefInfo.nameAndTypeIndex);
        if (nameAndTypeInfo == null) {
            return null;
        }
        return this.getUtf8Info(nameAndTypeInfo.memberName);
    }

    public String getFieldrefType(int n6) {
        FieldrefInfo fieldrefInfo = (FieldrefInfo)this.getItem(n6);
        if (fieldrefInfo == null) {
            return null;
        }
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(fieldrefInfo.nameAndTypeIndex);
        if (nameAndTypeInfo == null) {
            return null;
        }
        return this.getUtf8Info(nameAndTypeInfo.typeDescriptor);
    }

    public int z(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        return memberrefInfo.classIndex;
    }

    public String getMethodrefClassName(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        if (memberrefInfo == null) {
            return null;
        }
        return this.getClassInfo(memberrefInfo.classIndex);
    }

    public int getMethodrefNameAndType(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        return memberrefInfo.nameAndTypeIndex;
    }

    public String getMethodrefName(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        if (memberrefInfo == null) {
            return null;
        }
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(memberrefInfo.nameAndTypeIndex);
        if (nameAndTypeInfo == null) {
            return null;
        }
        return this.getUtf8Info(nameAndTypeInfo.memberName);
    }

    public String getMethodrefType(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        if (memberrefInfo == null) {
            return null;
        }
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(memberrefInfo.nameAndTypeIndex);
        if (nameAndTypeInfo == null) {
            return null;
        }
        return this.getUtf8Info(nameAndTypeInfo.typeDescriptor);
    }

    public int K(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        return memberrefInfo.classIndex;
    }

    public String getInterfaceMethodrefClassName(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        return this.getClassInfo(memberrefInfo.classIndex);
    }

    public int getInterfaceMethodrefNameAndType(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        return memberrefInfo.nameAndTypeIndex;
    }

    public String getInterfaceMethodrefName(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        if (memberrefInfo == null) {
            return null;
        }
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(memberrefInfo.nameAndTypeIndex);
        if (nameAndTypeInfo == null) {
            return null;
        }
        return this.getUtf8Info(nameAndTypeInfo.memberName);
    }

    public String getInterfaceMethodrefType(int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        if (memberrefInfo == null) {
            return null;
        }
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(memberrefInfo.nameAndTypeIndex);
        if (nameAndTypeInfo == null) {
            return null;
        }
        return this.getUtf8Info(nameAndTypeInfo.typeDescriptor);
    }

    public Object getLdcValue(int n6) {
        ConstInfo constInfo = this.getItem(n6);
        Object object = null;
        if (constInfo instanceof StringInfo) {
            object = this.getStringInfo(n6);
        } else if (constInfo instanceof FloatInfo) {
            object = Float.valueOf(this.getFloatInfo(n6));
        } else if (constInfo instanceof IntegerInfo) {
            object = this.getIntegerInfo(n6);
        } else if (constInfo instanceof LongInfo) {
            object = this.getLongInfo(n6);
        } else if (constInfo instanceof DoubleInfo) {
            object = this.getDoubleInfo(n6);
        }
        return object;
    }

    public int getIntegerInfo(int n6) {
        IntegerInfo integerInfo = (IntegerInfo)this.getItem(n6);
        return integerInfo.value;
    }

    public float getFloatInfo(int n6) {
        FloatInfo floatInfo = (FloatInfo)this.getItem(n6);
        return floatInfo.value;
    }

    public long getLongInfo(int n6) {
        LongInfo longInfo = (LongInfo)this.getItem(n6);
        return longInfo.value;
    }

    public double getDoubleInfo(int n6) {
        DoubleInfo doubleInfo = (DoubleInfo)this.getItem(n6);
        return doubleInfo.value;
    }

    public String getStringInfo(int n6) {
        StringInfo stringInfo = (StringInfo)this.getItem(n6);
        return this.getUtf8Info(stringInfo.string);
    }

    public String getUtf8Info(int n6) {
        Utf8Info utf8Info = (Utf8Info)this.getItem(n6);
        return utf8Info.string;
    }

    public int getMethodHandleKind(int n6) {
        MethodHandleInfo methodHandleInfo = (MethodHandleInfo)this.getItem(n6);
        return methodHandleInfo.refKind;
    }

    public int getMethodHandleIndex(int n6) {
        MethodHandleInfo methodHandleInfo = (MethodHandleInfo)this.getItem(n6);
        return methodHandleInfo.refIndex;
    }

    public int getMethodTypeInfo(int n6) {
        MethodTypeInfo methodTypeInfo = (MethodTypeInfo)this.getItem(n6);
        return methodTypeInfo.descriptor;
    }

    public int getInvokeDynamicBootstrap(int n6) {
        InvokeDynamicInfo invokeDynamicInfo = (InvokeDynamicInfo)this.getItem(n6);
        return invokeDynamicInfo.bootstrap;
    }

    public int getInvokeDynamicNameAndType(int n6) {
        InvokeDynamicInfo invokeDynamicInfo = (InvokeDynamicInfo)this.getItem(n6);
        return invokeDynamicInfo.nameAndType;
    }

    public String getInvokeDynamicType(int n6) {
        InvokeDynamicInfo invokeDynamicInfo = (InvokeDynamicInfo)this.getItem(n6);
        if (invokeDynamicInfo == null) {
            return null;
        }
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(invokeDynamicInfo.nameAndType);
        if (nameAndTypeInfo == null) {
            return null;
        }
        return this.getUtf8Info(nameAndTypeInfo.typeDescriptor);
    }

    public int getDynamicBootstrap(int n6) {
        DynamicInfo dynamicInfo = (DynamicInfo)this.getItem(n6);
        return dynamicInfo.bootstrap;
    }

    public int getDynamicNameAndType(int n6) {
        DynamicInfo dynamicInfo = (DynamicInfo)this.getItem(n6);
        return dynamicInfo.nameAndType;
    }

    public String getDynamicType(int n6) {
        DynamicInfo dynamicInfo = (DynamicInfo)this.getItem(n6);
        if (dynamicInfo == null) {
            return null;
        }
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(dynamicInfo.nameAndType);
        if (nameAndTypeInfo == null) {
            return null;
        }
        return this.getUtf8Info(nameAndTypeInfo.typeDescriptor);
    }

    public String getModuleInfo(int n6) {
        ModuleInfo moduleInfo = (ModuleInfo)this.getItem(n6);
        return this.getUtf8Info(moduleInfo.name);
    }

    public String getPackageInfo(int n6) {
        PackageInfo packageInfo = (PackageInfo)this.getItem(n6);
        return this.getUtf8Info(packageInfo.name);
    }

    public int isConstructor(String string, int n6) {
        return this.isMember(string, "<init>", n6);
    }

    public int isMember(String string, String string2, int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        if (this.getClassInfo(memberrefInfo.classIndex).equals(string)) {
            NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(memberrefInfo.nameAndTypeIndex);
            if (this.getUtf8Info(nameAndTypeInfo.memberName).equals(string2)) {
                return nameAndTypeInfo.typeDescriptor;
            }
        }
        return 0;
    }

    public String eqMember(String string, String string2, int n6) {
        MemberrefInfo memberrefInfo = (MemberrefInfo)this.getItem(n6);
        NameAndTypeInfo nameAndTypeInfo = (NameAndTypeInfo)this.getItem(memberrefInfo.nameAndTypeIndex);
        if (this.getUtf8Info(nameAndTypeInfo.memberName).equals(string) && this.getUtf8Info(nameAndTypeInfo.typeDescriptor).equals(string2)) {
            return this.getClassInfo(memberrefInfo.classIndex);
        }
        return null;
    }

    private int addItem0(ConstInfo constInfo) {
        this.items.addElement(constInfo);
        return this.numOfItems++;
    }

    private int addItem(ConstInfo constInfo) {
        ConstInfo constInfo2;
        if (this.itemsCache == null) {
            this.itemsCache = ConstPool.makeItemsCache(this.items);
        }
        if ((constInfo2 = this.itemsCache.get(constInfo)) != null) {
            return constInfo2.index;
        }
        this.items.addElement(constInfo);
        this.itemsCache.put(constInfo, constInfo);
        return this.numOfItems++;
    }

    public int copy(int n6, ConstPool constPool, Map<String, String> map) {
        if (n6 == 0) {
            return 0;
        }
        ConstInfo constInfo = this.getItem(n6);
        return constInfo.copy(this, constPool, map);
    }

    int addConstInfoPadding() {
        return this.addItem0(new ConstInfoPadding(this.numOfItems));
    }

    public int addClassInfo(CtClass ctClass) {
        if (ctClass == THIS) {
            return this.thisClassInfo;
        }
        if (!ctClass.isArray()) {
            return this.addClassInfo(ctClass.getName());
        }
        return this.addClassInfo(Descriptor.toJvmName(ctClass));
    }

    public int addClassInfo(String string) {
        int n6 = this.addUtf8Info(Descriptor.toJvmName(string));
        return this.addItem(new ClassInfo(n6, this.numOfItems));
    }

    public int addNameAndTypeInfo(String string, String string2) {
        return this.addNameAndTypeInfo(this.addUtf8Info(string), this.addUtf8Info(string2));
    }

    public int addNameAndTypeInfo(int n6, int n10) {
        return this.addItem(new NameAndTypeInfo(n6, n10, this.numOfItems));
    }

    public int addFieldrefInfo(int n6, String string, String string2) {
        int n10 = this.addNameAndTypeInfo(string, string2);
        return this.addFieldrefInfo(n6, n10);
    }

    public int addFieldrefInfo(int n6, int n10) {
        return this.addItem(new FieldrefInfo(n6, n10, this.numOfItems));
    }

    public int addMethodrefInfo(int n6, String string, String string2) {
        int n10 = this.addNameAndTypeInfo(string, string2);
        return this.addMethodrefInfo(n6, n10);
    }

    public int addMethodrefInfo(int n6, int n10) {
        return this.addItem(new MethodrefInfo(n6, n10, this.numOfItems));
    }

    public int addInterfaceMethodrefInfo(int n6, String string, String string2) {
        int n10 = this.addNameAndTypeInfo(string, string2);
        return this.addInterfaceMethodrefInfo(n6, n10);
    }

    public int addInterfaceMethodrefInfo(int n6, int n10) {
        return this.addItem(new InterfaceMethodrefInfo(n6, n10, this.numOfItems));
    }

    public int addStringInfo(String string) {
        int n6 = this.addUtf8Info(string);
        return this.addItem(new StringInfo(n6, this.numOfItems));
    }

    public int addIntegerInfo(int n6) {
        return this.addItem(new IntegerInfo(n6, this.numOfItems));
    }

    public int addFloatInfo(float f10) {
        return this.addItem(new FloatInfo(f10, this.numOfItems));
    }

    public int addLongInfo(long l) {
        int n6 = this.addItem(new LongInfo(l, this.numOfItems));
        if (n6 == this.numOfItems - 1) {
            this.addConstInfoPadding();
        }
        return n6;
    }

    public int addDoubleInfo(double d10) {
        int n6 = this.addItem(new DoubleInfo(d10, this.numOfItems));
        if (n6 == this.numOfItems - 1) {
            this.addConstInfoPadding();
        }
        return n6;
    }

    public int addUtf8Info(String string) {
        return this.addItem(new Utf8Info(string, this.numOfItems));
    }

    public int addMethodHandleInfo(int n6, int n10) {
        return this.addItem(new MethodHandleInfo(n6, n10, this.numOfItems));
    }

    public int addMethodTypeInfo(int n6) {
        return this.addItem(new MethodTypeInfo(n6, this.numOfItems));
    }

    public int addInvokeDynamicInfo(int n6, int n10) {
        return this.addItem(new InvokeDynamicInfo(n6, n10, this.numOfItems));
    }

    public int addDynamicInfo(int n6, int n10) {
        return this.addItem(new DynamicInfo(n6, n10, this.numOfItems));
    }

    public int addModuleInfo(int n6) {
        return this.addItem(new ModuleInfo(n6, this.numOfItems));
    }

    public int addPackageInfo(int n6) {
        return this.addItem(new PackageInfo(n6, this.numOfItems));
    }

    public Set<String> getClassNames() {
        HashSet<String> hashSet = new HashSet<String>();
        LongVector longVector = this.items;
        int n6 = this.numOfItems;
        for (int k = 1; k < n6; ++k) {
            String string = longVector.elementAt(k).getClassName(this);
            if (string == null) continue;
            hashSet.add(string);
        }
        return hashSet;
    }

    public void renameClass(String string, String string2) {
        LongVector longVector = this.items;
        int n6 = this.numOfItems;
        for (int k = 1; k < n6; ++k) {
            ConstInfo constInfo = longVector.elementAt(k);
            constInfo.renameClass(this, string, string2, this.itemsCache);
        }
    }

    public void renameClass(Map<String, String> map) {
        LongVector longVector = this.items;
        int n6 = this.numOfItems;
        for (int k = 1; k < n6; ++k) {
            ConstInfo constInfo = longVector.elementAt(k);
            constInfo.renameClass(this, map, this.itemsCache);
        }
    }

    private void read(DataInputStream dataInputStream) throws IOException {
        int n6 = dataInputStream.readUnsignedShort();
        this.items = new LongVector(n6);
        this.numOfItems = 0;
        this.addItem0(null);
        while (--n6 > 0) {
            int n10 = this.readOne(dataInputStream);
            if (n10 != 5 && n10 != 6) continue;
            this.addConstInfoPadding();
            --n6;
        }
    }

    private static Map<ConstInfo, ConstInfo> makeItemsCache(LongVector longVector) {
        ConstInfo constInfo;
        HashMap<ConstInfo, ConstInfo> hashMap = new HashMap<ConstInfo, ConstInfo>();
        int n6 = 1;
        while ((constInfo = longVector.elementAt(n6++)) != null) {
            hashMap.put(constInfo, constInfo);
        }
        return hashMap;
    }

    private int readOne(DataInputStream dataInputStream) throws IOException {
        ConstInfo constInfo;
        int n6 = dataInputStream.readUnsignedByte();
        switch (n6) {
            case 1: {
                constInfo = new Utf8Info(dataInputStream, this.numOfItems);
                break;
            }
            case 3: {
                constInfo = new IntegerInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 4: {
                constInfo = new FloatInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 5: {
                constInfo = new LongInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 6: {
                constInfo = new DoubleInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 7: {
                constInfo = new ClassInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 8: {
                constInfo = new StringInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 9: {
                constInfo = new FieldrefInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 10: {
                constInfo = new MethodrefInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 11: {
                constInfo = new InterfaceMethodrefInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 12: {
                constInfo = new NameAndTypeInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 15: {
                constInfo = new MethodHandleInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 16: {
                constInfo = new MethodTypeInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 17: {
                constInfo = new DynamicInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 18: {
                constInfo = new InvokeDynamicInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 19: {
                constInfo = new ModuleInfo(dataInputStream, this.numOfItems);
                break;
            }
            case 20: {
                constInfo = new PackageInfo(dataInputStream, this.numOfItems);
                break;
            }
            default: {
                throw new IOException("invalid constant type: " + n6 + " at " + this.numOfItems);
            }
        }
        this.addItem0(constInfo);
        return n6;
    }

    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.numOfItems);
        LongVector longVector = this.items;
        int n6 = this.numOfItems;
        for (int k = 1; k < n6; ++k) {
            longVector.elementAt(k).write(dataOutputStream);
        }
    }

    public void print() {
        this.print(new PrintWriter(System.out, true));
    }

    public void print(PrintWriter printWriter) {
        int n6 = this.numOfItems;
        for (int k = 1; k < n6; ++k) {
            printWriter.print(k);
            printWriter.print(" ");
            this.items.elementAt(k).print(printWriter);
        }
    }
}

