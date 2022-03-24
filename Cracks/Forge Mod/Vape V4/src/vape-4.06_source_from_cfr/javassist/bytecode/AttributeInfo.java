/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javassist.bytecode.AnnotationDefaultAttribute;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.BootstrapMethodsAttribute;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.ConstPool;
import javassist.bytecode.ConstantAttribute;
import javassist.bytecode.DeprecatedAttribute;
import javassist.bytecode.EnclosingMethodAttribute;
import javassist.bytecode.ExceptionsAttribute;
import javassist.bytecode.InnerClassesAttribute;
import javassist.bytecode.LineNumberAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.LocalVariableTypeAttribute;
import javassist.bytecode.MethodParametersAttribute;
import javassist.bytecode.NestHostAttribute;
import javassist.bytecode.NestMembersAttribute;
import javassist.bytecode.ParameterAnnotationsAttribute;
import javassist.bytecode.SignatureAttribute;
import javassist.bytecode.SourceFileAttribute;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMapTable;
import javassist.bytecode.SyntheticAttribute;
import javassist.bytecode.TypeAnnotationsAttribute;

public class AttributeInfo {
    protected ConstPool constPool;
    int name;
    byte[] info;
    private static int[] b;

    protected AttributeInfo(ConstPool constPool, int n6, byte[] arrby) {
        this.constPool = constPool;
        this.name = n6;
        this.info = arrby;
    }

    protected AttributeInfo(ConstPool constPool, String string) {
        this(constPool, string, (byte[])null);
    }

    public AttributeInfo(ConstPool constPool, String string, byte[] arrby) {
        this(constPool, constPool.addUtf8Info(string), arrby);
    }

    protected AttributeInfo(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        this.constPool = constPool;
        this.name = n6;
        int n10 = dataInputStream.readInt();
        this.info = new byte[n10];
        if (n10 > 0) {
            dataInputStream.readFully(this.info);
        }
    }

    static AttributeInfo read(ConstPool constPool, DataInputStream dataInputStream) throws IOException {
        int n6 = dataInputStream.readUnsignedShort();
        String string = constPool.getUtf8Info(n6);
        char c3 = string.charAt(0);
        if (c3 < 'E') {
            if (string.equals("AnnotationDefault")) {
                return new AnnotationDefaultAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("BootstrapMethods")) {
                return new BootstrapMethodsAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("Code")) {
                return new CodeAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("ConstantValue")) {
                return new ConstantAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("Deprecated")) {
                return new DeprecatedAttribute(constPool, n6, dataInputStream);
            }
        }
        if (c3 < 'M') {
            if (string.equals("EnclosingMethod")) {
                return new EnclosingMethodAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("Exceptions")) {
                return new ExceptionsAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("InnerClasses")) {
                return new InnerClassesAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("LineNumberTable")) {
                return new LineNumberAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("LocalVariableTable")) {
                return new LocalVariableAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("LocalVariableTypeTable")) {
                return new LocalVariableTypeAttribute(constPool, n6, dataInputStream);
            }
        }
        if (c3 < 'S') {
            if (string.equals("MethodParameters")) {
                return new MethodParametersAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("NestHost")) {
                return new NestHostAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("NestMembers")) {
                return new NestMembersAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("RuntimeVisibleAnnotations") || string.equals("RuntimeInvisibleAnnotations")) {
                return new AnnotationsAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("RuntimeVisibleParameterAnnotations") || string.equals("RuntimeInvisibleParameterAnnotations")) {
                return new ParameterAnnotationsAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("RuntimeVisibleTypeAnnotations") || string.equals("RuntimeInvisibleTypeAnnotations")) {
                return new TypeAnnotationsAttribute(constPool, n6, dataInputStream);
            }
        }
        if (c3 >= 'S') {
            if (string.equals("Signature")) {
                return new SignatureAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("SourceFile")) {
                return new SourceFileAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("Synthetic")) {
                return new SyntheticAttribute(constPool, n6, dataInputStream);
            }
            if (string.equals("StackMap")) {
                return new StackMap(constPool, n6, dataInputStream);
            }
            if (string.equals("StackMapTable")) {
                return new StackMapTable(constPool, n6, dataInputStream);
            }
        }
        return new AttributeInfo(constPool, n6, dataInputStream);
    }

    public String getName() {
        return this.constPool.getUtf8Info(this.name);
    }

    public ConstPool getConstPool() {
        return this.constPool;
    }

    public int length() {
        return this.info.length + 6;
    }

    public byte[] get() {
        return this.info;
    }

    public void set(byte[] arrby) {
        this.info = arrby;
    }

    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        return new AttributeInfo(constPool, this.getName(), Arrays.copyOf(this.info, this.info.length));
    }

    void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.name);
        dataOutputStream.writeInt(this.info.length);
        if (this.info.length > 0) {
            dataOutputStream.write(this.info);
        }
    }

    static int getLength(List<AttributeInfo> list) {
        int n6 = 0;
        for (AttributeInfo attributeInfo : list) {
            n6 += attributeInfo.length();
        }
        return n6;
    }

    static AttributeInfo lookup(List<AttributeInfo> list, String string) {
        if (list == null) {
            return null;
        }
        for (AttributeInfo attributeInfo : list) {
            if (!attributeInfo.getName().equals(string)) continue;
            return attributeInfo;
        }
        return null;
    }

    static synchronized AttributeInfo remove(List<AttributeInfo> list, String string) {
        if (list == null) {
            return null;
        }
        for (AttributeInfo attributeInfo : list) {
            if (!attributeInfo.getName().equals(string) || !list.remove(attributeInfo)) continue;
            return attributeInfo;
        }
        return null;
    }

    static void writeAll(List<AttributeInfo> list, DataOutputStream dataOutputStream) throws IOException {
        if (list == null) {
            return;
        }
        for (AttributeInfo attributeInfo : list) {
            attributeInfo.write(dataOutputStream);
        }
    }

    static List<AttributeInfo> copyAll(List<AttributeInfo> list, ConstPool constPool) {
        if (list == null) {
            return null;
        }
        ArrayList<AttributeInfo> arrayList = new ArrayList<AttributeInfo>();
        for (AttributeInfo attributeInfo : list) {
            arrayList.add(attributeInfo.copy(constPool, null));
        }
        return arrayList;
    }

    void renameClass(String string, String string2) {
    }

    void renameClass(Map<String, String> map) {
    }

    static void renameClass(List<AttributeInfo> list, String string, String string2) {
        if (list == null) {
            return;
        }
        for (AttributeInfo attributeInfo : list) {
            attributeInfo.renameClass(string, string2);
        }
    }

    static void renameClass(List<AttributeInfo> list, Map<String, String> map) {
        if (list == null) {
            return;
        }
        for (AttributeInfo attributeInfo : list) {
            attributeInfo.renameClass(map);
        }
    }

    void getRefClasses(Map<String, String> map) {
    }

    static void getRefClasses(List<AttributeInfo> list, Map<String, String> map) {
        if (list == null) {
            return;
        }
        for (AttributeInfo attributeInfo : list) {
            attributeInfo.getRefClasses(map);
        }
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public static int[] e() {
        return b;
    }

    static {
        if (AttributeInfo.e() == null) {
            AttributeInfo.b(new int[4]);
        }
    }
}

