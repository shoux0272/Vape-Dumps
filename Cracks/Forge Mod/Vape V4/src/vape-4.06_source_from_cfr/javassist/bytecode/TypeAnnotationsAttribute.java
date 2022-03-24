/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.TypeAnnotationsAttribute$Copier;
import javassist.bytecode.TypeAnnotationsAttribute$Renamer;

public class TypeAnnotationsAttribute
extends AttributeInfo {
    public static final String visibleTag = "RuntimeVisibleTypeAnnotations";
    public static final String invisibleTag = "RuntimeInvisibleTypeAnnotations";

    public TypeAnnotationsAttribute(ConstPool constPool, String string, byte[] arrby) {
        super(constPool, string, arrby);
    }

    TypeAnnotationsAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public int numAnnotations() {
        return ByteArray.readU16bit(this.info, 0);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        TypeAnnotationsAttribute$Copier typeAnnotationsAttribute$Copier = new TypeAnnotationsAttribute$Copier(this.info, this.constPool, constPool, map);
        try {
            typeAnnotationsAttribute$Copier.annotationArray();
            return new TypeAnnotationsAttribute(constPool, this.getName(), typeAnnotationsAttribute$Copier.close());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    void renameClass(String string, String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string, string2);
        this.renameClass(hashMap);
    }

    @Override
    void renameClass(Map<String, String> map) {
        TypeAnnotationsAttribute$Renamer typeAnnotationsAttribute$Renamer = new TypeAnnotationsAttribute$Renamer(this.info, this.getConstPool(), map);
        try {
            typeAnnotationsAttribute$Renamer.annotationArray();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    void getRefClasses(Map<String, String> map) {
        this.renameClass(map);
    }
}

