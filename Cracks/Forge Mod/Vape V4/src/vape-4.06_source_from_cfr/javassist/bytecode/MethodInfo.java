/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javassist.ClassPool;
import javassist.bytecode.AnnotationDefaultAttribute;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ClassFile;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.ExceptionsAttribute;
import javassist.bytecode.LineNumberAttribute;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMapTable;
import javassist.bytecode.stackmap.MapMaker;

public class MethodInfo {
    ConstPool constPool;
    int accessFlags;
    int name;
    String cachedName;
    int descriptor;
    List<AttributeInfo> attribute;
    public static boolean doPreverify = false;
    public static final String nameInit = "<init>";
    public static final String nameClinit = "<clinit>";

    private MethodInfo(ConstPool constPool) {
        this.constPool = constPool;
        this.attribute = null;
    }

    public MethodInfo(ConstPool constPool, String string, String string2) {
        this(constPool);
        this.accessFlags = 0;
        this.name = constPool.addUtf8Info(string);
        this.cachedName = string;
        this.descriptor = this.constPool.addUtf8Info(string2);
    }

    MethodInfo(ConstPool constPool, DataInputStream dataInputStream) throws IOException {
        this(constPool);
        this.read(dataInputStream);
    }

    public MethodInfo(ConstPool constPool, String string, MethodInfo methodInfo, Map<String, String> map) throws BadBytecode {
        this(constPool);
        this.read(methodInfo, string, map);
    }

    public String toString() {
        return this.getName() + " " + this.getDescriptor();
    }

    void compact(ConstPool constPool) {
        this.name = constPool.addUtf8Info(this.getName());
        this.descriptor = constPool.addUtf8Info(this.getDescriptor());
        this.attribute = AttributeInfo.copyAll(this.attribute, constPool);
        this.constPool = constPool;
    }

    void prune(ConstPool constPool) {
        AttributeInfo attributeInfo;
        ExceptionsAttribute exceptionsAttribute;
        AnnotationDefaultAttribute annotationDefaultAttribute;
        AttributeInfo attributeInfo2;
        AttributeInfo attributeInfo3;
        AttributeInfo attributeInfo4;
        ArrayList<AttributeInfo> arrayList = new ArrayList<AttributeInfo>();
        AttributeInfo attributeInfo5 = this.getAttribute("RuntimeInvisibleAnnotations");
        if (attributeInfo5 != null) {
            attributeInfo5 = attributeInfo5.copy(constPool, null);
            arrayList.add(attributeInfo5);
        }
        if ((attributeInfo4 = this.getAttribute("RuntimeVisibleAnnotations")) != null) {
            attributeInfo4 = attributeInfo4.copy(constPool, null);
            arrayList.add(attributeInfo4);
        }
        if ((attributeInfo3 = this.getAttribute("RuntimeInvisibleParameterAnnotations")) != null) {
            attributeInfo3 = attributeInfo3.copy(constPool, null);
            arrayList.add(attributeInfo3);
        }
        if ((attributeInfo2 = this.getAttribute("RuntimeVisibleParameterAnnotations")) != null) {
            attributeInfo2 = attributeInfo2.copy(constPool, null);
            arrayList.add(attributeInfo2);
        }
        if ((annotationDefaultAttribute = (AnnotationDefaultAttribute)this.getAttribute("AnnotationDefault")) != null) {
            arrayList.add(annotationDefaultAttribute);
        }
        if ((exceptionsAttribute = this.getExceptionsAttribute()) != null) {
            arrayList.add(exceptionsAttribute);
        }
        if ((attributeInfo = this.getAttribute("Signature")) != null) {
            attributeInfo = attributeInfo.copy(constPool, null);
            arrayList.add(attributeInfo);
        }
        this.attribute = arrayList;
        this.name = constPool.addUtf8Info(this.getName());
        this.descriptor = constPool.addUtf8Info(this.getDescriptor());
        this.constPool = constPool;
    }

    public String getName() {
        if (this.cachedName == null) {
            this.cachedName = this.constPool.getUtf8Info(this.name);
        }
        return this.cachedName;
    }

    public void setName(String string) {
        this.name = this.constPool.addUtf8Info(string);
        this.cachedName = string;
    }

    public boolean isMethod() {
        String string = this.getName();
        return !string.equals(nameInit) && !string.equals(nameClinit);
    }

    public ConstPool getConstPool() {
        return this.constPool;
    }

    public boolean isConstructor() {
        return this.getName().equals(nameInit);
    }

    public boolean isStaticInitializer() {
        return this.getName().equals(nameClinit);
    }

    public int getAccessFlags() {
        return this.accessFlags;
    }

    public void setAccessFlags(int n6) {
        this.accessFlags = n6;
    }

    public String getDescriptor() {
        return this.constPool.getUtf8Info(this.descriptor);
    }

    public void setDescriptor(String string) {
        if (!string.equals(this.getDescriptor())) {
            this.descriptor = this.constPool.addUtf8Info(string);
        }
    }

    public List<AttributeInfo> getAttributes() {
        if (this.attribute == null) {
            this.attribute = new ArrayList<AttributeInfo>();
        }
        return this.attribute;
    }

    public AttributeInfo getAttribute(String string) {
        return AttributeInfo.lookup(this.attribute, string);
    }

    public AttributeInfo removeAttribute(String string) {
        return AttributeInfo.remove(this.attribute, string);
    }

    public void addAttribute(AttributeInfo attributeInfo) {
        if (this.attribute == null) {
            this.attribute = new ArrayList<AttributeInfo>();
        }
        AttributeInfo.remove(this.attribute, attributeInfo.getName());
        this.attribute.add(attributeInfo);
    }

    public ExceptionsAttribute getExceptionsAttribute() {
        AttributeInfo attributeInfo = AttributeInfo.lookup(this.attribute, "Exceptions");
        return (ExceptionsAttribute)attributeInfo;
    }

    public CodeAttribute getCodeAttribute() {
        AttributeInfo attributeInfo = AttributeInfo.lookup(this.attribute, "Code");
        return (CodeAttribute)attributeInfo;
    }

    public void removeExceptionsAttribute() {
        AttributeInfo.remove(this.attribute, "Exceptions");
    }

    public void setExceptionsAttribute(ExceptionsAttribute exceptionsAttribute) {
        this.removeExceptionsAttribute();
        if (this.attribute == null) {
            this.attribute = new ArrayList<AttributeInfo>();
        }
        this.attribute.add(exceptionsAttribute);
    }

    public void removeCodeAttribute() {
        AttributeInfo.remove(this.attribute, "Code");
    }

    public void setCodeAttribute(CodeAttribute codeAttribute) {
        this.removeCodeAttribute();
        if (this.attribute == null) {
            this.attribute = new ArrayList<AttributeInfo>();
        }
        this.attribute.add(codeAttribute);
    }

    public void rebuildStackMapIf6(ClassPool classPool, ClassFile classFile) throws BadBytecode {
        if (classFile.getMajorVersion() >= 50) {
            this.rebuildStackMap(classPool);
        }
        if (doPreverify) {
            this.rebuildStackMapForME(classPool);
        }
    }

    public void rebuildStackMap(ClassPool classPool) throws BadBytecode {
        CodeAttribute codeAttribute = this.getCodeAttribute();
        if (codeAttribute != null) {
            StackMapTable stackMapTable = MapMaker.make(classPool, this);
            codeAttribute.setAttribute(stackMapTable);
        }
    }

    public void rebuildStackMapForME(ClassPool classPool) throws BadBytecode {
        CodeAttribute codeAttribute = this.getCodeAttribute();
        if (codeAttribute != null) {
            StackMap stackMap = MapMaker.make2(classPool, this);
            codeAttribute.setAttribute(stackMap);
        }
    }

    public int getLineNumber(int n6) {
        CodeAttribute codeAttribute = this.getCodeAttribute();
        if (codeAttribute == null) {
            return -1;
        }
        LineNumberAttribute lineNumberAttribute = (LineNumberAttribute)codeAttribute.getAttribute("LineNumberTable");
        if (lineNumberAttribute == null) {
            return -1;
        }
        return lineNumberAttribute.toLineNumber(n6);
    }

    public void setSuperclass(String string) throws BadBytecode {
        if (!this.isConstructor()) {
            return;
        }
        CodeAttribute codeAttribute = this.getCodeAttribute();
        byte[] arrby = codeAttribute.getCode();
        CodeIterator codeIterator = codeAttribute.iterator();
        int n6 = codeIterator.skipSuperConstructor();
        if (n6 >= 0) {
            ConstPool constPool = this.constPool;
            int n10 = ByteArray.readU16bit(arrby, n6 + 1);
            int n11 = constPool.getMethodrefNameAndType(n10);
            int n12 = constPool.addClassInfo(string);
            int n13 = constPool.addMethodrefInfo(n12, n11);
            ByteArray.write16bit(n13, arrby, n6 + 1);
        }
    }

    private void read(MethodInfo methodInfo, String string, Map<String, String> map) {
        CodeAttribute codeAttribute;
        ConstPool constPool = this.constPool;
        this.accessFlags = methodInfo.accessFlags;
        this.name = constPool.addUtf8Info(string);
        this.cachedName = string;
        ConstPool constPool2 = methodInfo.constPool;
        String string2 = constPool2.getUtf8Info(methodInfo.descriptor);
        String string3 = Descriptor.rename(string2, map);
        this.descriptor = constPool.addUtf8Info(string3);
        this.attribute = new ArrayList<AttributeInfo>();
        ExceptionsAttribute exceptionsAttribute = methodInfo.getExceptionsAttribute();
        if (exceptionsAttribute != null) {
            this.attribute.add(exceptionsAttribute.copy(constPool, map));
        }
        if ((codeAttribute = methodInfo.getCodeAttribute()) != null) {
            this.attribute.add(codeAttribute.copy(constPool, map));
        }
    }

    private void read(DataInputStream dataInputStream) throws IOException {
        this.accessFlags = dataInputStream.readUnsignedShort();
        this.name = dataInputStream.readUnsignedShort();
        this.descriptor = dataInputStream.readUnsignedShort();
        int n6 = dataInputStream.readUnsignedShort();
        this.attribute = new ArrayList<AttributeInfo>();
        for (int k = 0; k < n6; ++k) {
            this.attribute.add(AttributeInfo.read(this.constPool, dataInputStream));
        }
    }

    void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.accessFlags);
        dataOutputStream.writeShort(this.name);
        dataOutputStream.writeShort(this.descriptor);
        if (this.attribute == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort(this.attribute.size());
            AttributeInfo.writeAll(this.attribute, dataOutputStream);
        }
    }
}

