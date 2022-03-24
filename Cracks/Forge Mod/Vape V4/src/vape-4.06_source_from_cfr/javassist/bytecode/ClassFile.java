/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javassist.CannotCompileException;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.DuplicateMemberException;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.InnerClassesAttribute;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.SourceFileAttribute;

public final class ClassFile {
    int major;
    int minor;
    ConstPool constPool;
    int thisClass;
    int accessFlags;
    int superClass;
    int[] interfaces;
    List<FieldInfo> fields;
    List<MethodInfo> methods;
    List<AttributeInfo> attributes;
    String thisclassname;
    String[] cachedInterfaces;
    String cachedSuperclass;
    public static final int JAVA_1 = 45;
    public static final int JAVA_2 = 46;
    public static final int JAVA_3 = 47;
    public static final int JAVA_4 = 48;
    public static final int JAVA_5 = 49;
    public static final int JAVA_6 = 50;
    public static final int JAVA_7 = 51;
    public static final int JAVA_8 = 52;
    public static final int JAVA_9 = 53;
    public static final int JAVA_10 = 54;
    public static final int JAVA_11 = 55;
    public static final int MAJOR_VERSION;

    public ClassFile(DataInputStream dataInputStream) throws IOException {
        this.read(dataInputStream);
    }

    public ClassFile(boolean bl, String string, String string2) {
        this.major = MAJOR_VERSION;
        this.minor = 0;
        this.constPool = new ConstPool(string);
        this.thisClass = this.constPool.getThisClassInfo();
        this.accessFlags = bl ? 1536 : 32;
        this.initSuperclass(string2);
        this.interfaces = null;
        this.fields = new ArrayList<FieldInfo>();
        this.methods = new ArrayList<MethodInfo>();
        this.thisclassname = string;
        this.attributes = new ArrayList<AttributeInfo>();
        this.attributes.add(new SourceFileAttribute(this.constPool, ClassFile.getSourcefileName(this.thisclassname)));
    }

    private void initSuperclass(String string) {
        if (string != null) {
            this.superClass = this.constPool.addClassInfo(string);
            this.cachedSuperclass = string;
        } else {
            this.superClass = this.constPool.addClassInfo("java.lang.Object");
            this.cachedSuperclass = "java.lang.Object";
        }
    }

    private static String getSourcefileName(String string) {
        return string.replaceAll("^.*\\.", "") + ".java";
    }

    public void compact() {
        ConstPool constPool = this.compact0();
        for (MethodInfo object : this.methods) {
            object.compact(constPool);
        }
        for (FieldInfo fieldInfo : this.fields) {
            fieldInfo.compact(constPool);
        }
        this.attributes = AttributeInfo.copyAll(this.attributes, constPool);
        this.constPool = constPool;
    }

    private ConstPool compact0() {
        ConstPool constPool = new ConstPool(this.thisclassname);
        this.thisClass = constPool.getThisClassInfo();
        String string = this.getSuperclass();
        if (string != null) {
            this.superClass = constPool.addClassInfo(this.getSuperclass());
        }
        if (this.interfaces != null) {
            for (int k = 0; k < this.interfaces.length; ++k) {
                this.interfaces[k] = constPool.addClassInfo(this.constPool.getClassInfo(this.interfaces[k]));
            }
        }
        return constPool;
    }

    public void prune() {
        AttributeInfo attributeInfo;
        AttributeInfo attributeInfo2;
        ConstPool constPool = this.compact0();
        ArrayList<AttributeInfo> arrayList = new ArrayList<AttributeInfo>();
        AttributeInfo attributeInfo3 = this.getAttribute("RuntimeInvisibleAnnotations");
        if (attributeInfo3 != null) {
            attributeInfo3 = attributeInfo3.copy(constPool, null);
            arrayList.add(attributeInfo3);
        }
        if ((attributeInfo2 = this.getAttribute("RuntimeVisibleAnnotations")) != null) {
            attributeInfo2 = attributeInfo2.copy(constPool, null);
            arrayList.add(attributeInfo2);
        }
        if ((attributeInfo = this.getAttribute("Signature")) != null) {
            attributeInfo = attributeInfo.copy(constPool, null);
            arrayList.add(attributeInfo);
        }
        for (MethodInfo object : this.methods) {
            object.prune(constPool);
        }
        for (FieldInfo fieldInfo : this.fields) {
            fieldInfo.prune(constPool);
        }
        this.attributes = arrayList;
        this.constPool = constPool;
    }

    public ConstPool getConstPool() {
        return this.constPool;
    }

    public boolean s() {
        return (this.accessFlags & 0x200) != 0;
    }

    public boolean t() {
        return (this.accessFlags & 0x10) != 0;
    }

    public boolean d() {
        return (this.accessFlags & 0x400) != 0;
    }

    public int getAccessFlags() {
        return this.accessFlags;
    }

    public void setAccessFlags(int n6) {
        if ((n6 & 0x200) == 0) {
            n6 |= 0x20;
        }
        this.accessFlags = n6;
    }

    public int getInnerAccessFlags() {
        InnerClassesAttribute innerClassesAttribute = (InnerClassesAttribute)this.getAttribute("InnerClasses");
        if (innerClassesAttribute == null) {
            return -1;
        }
        String string = this.getName();
        int n6 = innerClassesAttribute.tableLength();
        for (int k = 0; k < n6; ++k) {
            if (!string.equals(innerClassesAttribute.innerClass(k))) continue;
            return innerClassesAttribute.accessFlags(k);
        }
        return -1;
    }

    public String getName() {
        return this.thisclassname;
    }

    public void setName(String string) {
        this.renameClass(this.thisclassname, string);
    }

    public String getSuperclass() {
        if (this.cachedSuperclass == null) {
            this.cachedSuperclass = this.constPool.getClassInfo(this.superClass);
        }
        return this.cachedSuperclass;
    }

    public int getSuperclassId() {
        return this.superClass;
    }

    public void setSuperclass(String string) throws CannotCompileException {
        if (string == null) {
            string = "java.lang.Object";
        }
        try {
            this.superClass = this.constPool.addClassInfo(string);
            for (MethodInfo methodInfo : this.methods) {
                methodInfo.setSuperclass(string);
            }
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
        this.cachedSuperclass = string;
    }

    public final void renameClass(String string, String string2) {
        String string3;
        if (string.equals(string2)) {
            return;
        }
        if (string.equals(this.thisclassname)) {
            this.thisclassname = string2;
        }
        string = Descriptor.toJvmName(string);
        string2 = Descriptor.toJvmName(string2);
        this.constPool.renameClass(string, string2);
        AttributeInfo.renameClass(this.attributes, string, string2);
        for (MethodInfo object : this.methods) {
            string3 = object.getDescriptor();
            object.setDescriptor(Descriptor.rename(string3, string, string2));
            AttributeInfo.renameClass(object.getAttributes(), string, string2);
        }
        for (FieldInfo fieldInfo : this.fields) {
            string3 = fieldInfo.getDescriptor();
            fieldInfo.setDescriptor(Descriptor.rename(string3, string, string2));
            AttributeInfo.renameClass(fieldInfo.getAttributes(), string, string2);
        }
    }

    public final void renameClass(Map<String, String> map) {
        String string;
        String string2 = map.get(Descriptor.toJvmName(this.thisclassname));
        if (string2 != null) {
            this.thisclassname = Descriptor.toJavaName(string2);
        }
        this.constPool.renameClass(map);
        AttributeInfo.renameClass(this.attributes, map);
        for (MethodInfo object : this.methods) {
            string = object.getDescriptor();
            object.setDescriptor(Descriptor.rename(string, map));
            AttributeInfo.renameClass(object.getAttributes(), map);
        }
        for (FieldInfo fieldInfo : this.fields) {
            string = fieldInfo.getDescriptor();
            fieldInfo.setDescriptor(Descriptor.rename(string, map));
            AttributeInfo.renameClass(fieldInfo.getAttributes(), map);
        }
    }

    public final void getRefClasses(Map<String, String> map) {
        String string;
        this.constPool.renameClass(map);
        AttributeInfo.getRefClasses(this.attributes, map);
        for (MethodInfo object : this.methods) {
            string = object.getDescriptor();
            Descriptor.rename(string, map);
            AttributeInfo.getRefClasses(object.getAttributes(), map);
        }
        for (FieldInfo fieldInfo : this.fields) {
            string = fieldInfo.getDescriptor();
            Descriptor.rename(string, map);
            AttributeInfo.getRefClasses(fieldInfo.getAttributes(), map);
        }
    }

    public String[] getInterfaces() {
        if (this.cachedInterfaces != null) {
            return this.cachedInterfaces;
        }
        String[] arrstring = null;
        if (this.interfaces == null) {
            arrstring = new String[]{};
        } else {
            String[] arrstring2 = new String[this.interfaces.length];
            for (int k = 0; k < this.interfaces.length; ++k) {
                arrstring2[k] = this.constPool.getClassInfo(this.interfaces[k]);
            }
            arrstring = arrstring2;
        }
        this.cachedInterfaces = arrstring;
        return arrstring;
    }

    public void setInterfaces(String[] arrstring) {
        this.cachedInterfaces = null;
        if (arrstring != null) {
            this.interfaces = new int[arrstring.length];
            for (int k = 0; k < arrstring.length; ++k) {
                this.interfaces[k] = this.constPool.addClassInfo(arrstring[k]);
            }
        }
    }

    public void addInterface(String string) {
        this.cachedInterfaces = null;
        int n6 = this.constPool.addClassInfo(string);
        if (this.interfaces == null) {
            this.interfaces = new int[1];
            this.interfaces[0] = n6;
        } else {
            int n10 = this.interfaces.length;
            int[] arrn = new int[n10 + 1];
            System.arraycopy(this.interfaces, 0, arrn, 0, n10);
            arrn[n10] = n6;
            this.interfaces = arrn;
        }
    }

    public List<FieldInfo> getFields() {
        return this.fields;
    }

    public void addField(FieldInfo fieldInfo) throws DuplicateMemberException {
        this.testExistingField(fieldInfo.getName(), fieldInfo.getDescriptor());
        this.fields.add(fieldInfo);
    }

    public final void addField2(FieldInfo fieldInfo) {
        this.fields.add(fieldInfo);
    }

    private void testExistingField(String string, String string2) throws DuplicateMemberException {
        for (FieldInfo fieldInfo : this.fields) {
            if (!fieldInfo.getName().equals(string)) continue;
            throw new DuplicateMemberException("duplicate field: " + string);
        }
    }

    public List<MethodInfo> getMethods() {
        return this.methods;
    }

    public MethodInfo getMethod(String string) {
        for (MethodInfo methodInfo : this.methods) {
            if (!methodInfo.getName().equals(string)) continue;
            return methodInfo;
        }
        return null;
    }

    public MethodInfo getStaticInitializer() {
        return this.getMethod("<clinit>");
    }

    public void addMethod(MethodInfo methodInfo) throws DuplicateMemberException {
        this.testExistingMethod(methodInfo);
        this.methods.add(methodInfo);
    }

    public final void addMethod2(MethodInfo methodInfo) {
        this.methods.add(methodInfo);
    }

    private void testExistingMethod(MethodInfo methodInfo) throws DuplicateMemberException {
        String string = methodInfo.getName();
        String string2 = methodInfo.getDescriptor();
        ListIterator<MethodInfo> listIterator = this.methods.listIterator(0);
        while (listIterator.hasNext()) {
            if (!ClassFile.isDuplicated(methodInfo, string, string2, listIterator.next(), listIterator)) continue;
            throw new DuplicateMemberException("duplicate method: " + string + " in " + this.getName());
        }
    }

    private static boolean isDuplicated(MethodInfo methodInfo, String string, String string2, MethodInfo methodInfo2, ListIterator<MethodInfo> listIterator) {
        if (!methodInfo2.getName().equals(string)) {
            return false;
        }
        String string3 = methodInfo2.getDescriptor();
        if (!Descriptor.eqParamTypes(string3, string2)) {
            return false;
        }
        if (string3.equals(string2)) {
            if (ClassFile.notBridgeMethod(methodInfo2)) {
                return true;
            }
            listIterator.remove();
            return false;
        }
        return false;
    }

    private static boolean notBridgeMethod(MethodInfo methodInfo) {
        return (methodInfo.getAccessFlags() & 0x40) == 0;
    }

    public List<AttributeInfo> getAttributes() {
        return this.attributes;
    }

    public AttributeInfo getAttribute(String string) {
        for (AttributeInfo attributeInfo : this.attributes) {
            if (!attributeInfo.getName().equals(string)) continue;
            return attributeInfo;
        }
        return null;
    }

    public AttributeInfo removeAttribute(String string) {
        return AttributeInfo.remove(this.attributes, string);
    }

    public void addAttribute(AttributeInfo attributeInfo) {
        AttributeInfo.remove(this.attributes, attributeInfo.getName());
        this.attributes.add(attributeInfo);
    }

    public String getSourceFile() {
        SourceFileAttribute sourceFileAttribute = (SourceFileAttribute)this.getAttribute("SourceFile");
        if (sourceFileAttribute == null) {
            return null;
        }
        return sourceFileAttribute.getFileName();
    }

    private void read(DataInputStream dataInputStream) throws IOException {
        int n6;
        int n10 = dataInputStream.readInt();
        if (n10 != -889275714) {
            throw new IOException("bad magic number: " + Integer.toHexString(n10));
        }
        this.minor = dataInputStream.readUnsignedShort();
        this.major = dataInputStream.readUnsignedShort();
        this.constPool = new ConstPool(dataInputStream);
        this.accessFlags = dataInputStream.readUnsignedShort();
        this.thisClass = dataInputStream.readUnsignedShort();
        this.constPool.setThisClassInfo(this.thisClass);
        this.superClass = dataInputStream.readUnsignedShort();
        int n11 = dataInputStream.readUnsignedShort();
        if (n11 == 0) {
            this.interfaces = null;
        } else {
            this.interfaces = new int[n11];
            for (n6 = 0; n6 < n11; ++n6) {
                this.interfaces[n6] = dataInputStream.readUnsignedShort();
            }
        }
        ConstPool constPool = this.constPool;
        n11 = dataInputStream.readUnsignedShort();
        this.fields = new ArrayList<FieldInfo>();
        for (n6 = 0; n6 < n11; ++n6) {
            this.addField2(new FieldInfo(constPool, dataInputStream));
        }
        n11 = dataInputStream.readUnsignedShort();
        this.methods = new ArrayList<MethodInfo>();
        for (n6 = 0; n6 < n11; ++n6) {
            this.addMethod2(new MethodInfo(constPool, dataInputStream));
        }
        this.attributes = new ArrayList<AttributeInfo>();
        n11 = dataInputStream.readUnsignedShort();
        for (n6 = 0; n6 < n11; ++n6) {
            this.addAttribute(AttributeInfo.read(constPool, dataInputStream));
        }
        this.thisclassname = this.constPool.getClassInfo(this.thisClass);
    }

    public void write(DataOutputStream dataOutputStream) throws IOException {
        int n6;
        dataOutputStream.writeInt(-889275714);
        dataOutputStream.writeShort(this.minor);
        dataOutputStream.writeShort(this.major);
        this.constPool.write(dataOutputStream);
        dataOutputStream.writeShort(this.accessFlags);
        dataOutputStream.writeShort(this.thisClass);
        dataOutputStream.writeShort(this.superClass);
        int n10 = this.interfaces == null ? 0 : this.interfaces.length;
        dataOutputStream.writeShort(n10);
        for (n6 = 0; n6 < n10; ++n6) {
            dataOutputStream.writeShort(this.interfaces[n6]);
        }
        n10 = this.fields.size();
        dataOutputStream.writeShort(n10);
        for (n6 = 0; n6 < n10; ++n6) {
            FieldInfo fieldInfo = this.fields.get(n6);
            fieldInfo.write(dataOutputStream);
        }
        dataOutputStream.writeShort(this.methods.size());
        for (MethodInfo methodInfo : this.methods) {
            methodInfo.write(dataOutputStream);
        }
        dataOutputStream.writeShort(this.attributes.size());
        AttributeInfo.writeAll(this.attributes, dataOutputStream);
    }

    public int getMajorVersion() {
        return this.major;
    }

    public void setMajorVersion(int n6) {
        this.major = n6;
    }

    public int getMinorVersion() {
        return this.minor;
    }

    public void setMinorVersion(int n6) {
        this.minor = n6;
    }

    public void setVersionToJava5() {
        this.major = 49;
        this.minor = 0;
    }

    static {
        int n6 = 47;
        try {
            Class.forName("java.lang.StringBuilder");
            n6 = 49;
            Class.forName("java.util.zip.DeflaterInputStream");
            n6 = 50;
            Class.forName("java.lang.invoke.CallSite", false, ClassLoader.getSystemClassLoader());
            n6 = 51;
            Class.forName("java.util.function.Function");
            n6 = 52;
            Class.forName("java.lang.Module");
            n6 = 53;
            List.class.getMethod("copyOf", Collection.class);
            n6 = 54;
            Class.forName("java.util.Optional").getMethod("isEmpty", new Class[0]);
            n6 = 55;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        MAJOR_VERSION = n6;
    }
}

