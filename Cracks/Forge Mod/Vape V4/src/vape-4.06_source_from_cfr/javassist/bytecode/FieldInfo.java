/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ConstPool;
import javassist.bytecode.ConstantAttribute;

public final class FieldInfo {
    ConstPool constPool;
    int accessFlags;
    int name;
    String cachedName;
    String cachedType;
    int descriptor;
    List<AttributeInfo> attribute;

    private FieldInfo(ConstPool constPool) {
        this.constPool = constPool;
        this.accessFlags = 0;
        this.attribute = null;
    }

    public FieldInfo(ConstPool constPool, String string, String string2) {
        this(constPool);
        this.name = constPool.addUtf8Info(string);
        this.cachedName = string;
        this.descriptor = constPool.addUtf8Info(string2);
    }

    FieldInfo(ConstPool constPool, DataInputStream dataInputStream) throws IOException {
        this(constPool);
        this.read(dataInputStream);
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
        int n6;
        AttributeInfo attributeInfo;
        AttributeInfo attributeInfo2;
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
        if ((n6 = this.getConstantValue()) != 0) {
            n6 = this.constPool.copy(n6, constPool, null);
            arrayList.add(new ConstantAttribute(constPool, n6));
        }
        this.attribute = arrayList;
        this.name = constPool.addUtf8Info(this.getName());
        this.descriptor = constPool.addUtf8Info(this.getDescriptor());
        this.constPool = constPool;
    }

    public ConstPool getConstPool() {
        return this.constPool;
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

    public int getConstantValue() {
        if ((this.accessFlags & 8) == 0) {
            return 0;
        }
        ConstantAttribute constantAttribute = (ConstantAttribute)this.getAttribute("ConstantValue");
        if (constantAttribute == null) {
            return 0;
        }
        return constantAttribute.getConstantValue();
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

