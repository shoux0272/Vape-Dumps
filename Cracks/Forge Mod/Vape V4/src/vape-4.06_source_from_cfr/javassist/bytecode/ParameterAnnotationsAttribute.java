/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javassist.bytecode.AnnotationsAttribute$Copier;
import javassist.bytecode.AnnotationsAttribute$Parser;
import javassist.bytecode.AnnotationsAttribute$Renamer;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.AnnotationsWriter;

public class ParameterAnnotationsAttribute
extends AttributeInfo {
    public static final String visibleTag = "RuntimeVisibleParameterAnnotations";
    public static final String invisibleTag = "RuntimeInvisibleParameterAnnotations";

    public ParameterAnnotationsAttribute(ConstPool constPool, String string, byte[] arrby) {
        super(constPool, string, arrby);
    }

    public ParameterAnnotationsAttribute(ConstPool constPool, String string) {
        this(constPool, string, new byte[]{0});
    }

    ParameterAnnotationsAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public int numParameters() {
        return this.info[0] & 0xFF;
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        AnnotationsAttribute$Copier annotationsAttribute$Copier = new AnnotationsAttribute$Copier(this.info, this.constPool, constPool, map);
        try {
            annotationsAttribute$Copier.parameters();
            return new ParameterAnnotationsAttribute(constPool, this.getName(), annotationsAttribute$Copier.close());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.toString());
        }
    }

    public Annotation[][] getAnnotations() {
        try {
            return new AnnotationsAttribute$Parser(this.info, this.constPool).parseParameters();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.toString());
        }
    }

    public void setAnnotations(Annotation[][] arrannotation) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AnnotationsWriter annotationsWriter = new AnnotationsWriter(byteArrayOutputStream, this.constPool);
        try {
            annotationsWriter.numParameters(arrannotation.length);
            for (Annotation[] arrannotation2 : arrannotation) {
                annotationsWriter.numAnnotations(arrannotation2.length);
                for (int k = 0; k < arrannotation2.length; ++k) {
                    arrannotation2[k].write(annotationsWriter);
                }
            }
            annotationsWriter.close();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        this.set(byteArrayOutputStream.toByteArray());
    }

    @Override
    void renameClass(String string, String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string, string2);
        this.renameClass(hashMap);
    }

    @Override
    void renameClass(Map<String, String> map) {
        AnnotationsAttribute$Renamer annotationsAttribute$Renamer = new AnnotationsAttribute$Renamer(this.info, this.getConstPool(), map);
        try {
            annotationsAttribute$Renamer.parameters();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    void getRefClasses(Map<String, String> map) {
        this.renameClass(map);
    }

    public String toString() {
        Annotation[][] arrannotation = this.getAnnotations();
        StringBuilder stringBuilder = new StringBuilder();
        Annotation[][] arrannotation2 = arrannotation;
        int n6 = arrannotation2.length;
        for (int k = 0; k < n6; ++k) {
            Annotation[] arrannotation3;
            for (Annotation annotation : arrannotation3 = arrannotation2[k]) {
                stringBuilder.append(annotation.toString()).append(" ");
            }
            stringBuilder.append(", ");
        }
        return stringBuilder.toString().replaceAll(" (?=,)|, $", "");
    }
}

