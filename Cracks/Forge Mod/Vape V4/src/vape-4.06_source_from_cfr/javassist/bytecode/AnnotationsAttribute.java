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
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.AnnotationsWriter;

public class AnnotationsAttribute
extends AttributeInfo {
    public static final String visibleTag = "RuntimeVisibleAnnotations";
    public static final String invisibleTag = "RuntimeInvisibleAnnotations";

    public AnnotationsAttribute(ConstPool constPool, String string, byte[] arrby) {
        super(constPool, string, arrby);
    }

    public AnnotationsAttribute(ConstPool constPool, String string) {
        this(constPool, string, new byte[]{0, 0});
    }

    AnnotationsAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public int numAnnotations() {
        return ByteArray.readU16bit(this.info, 0);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        AnnotationsAttribute$Copier annotationsAttribute$Copier = new AnnotationsAttribute$Copier(this.info, this.constPool, constPool, map);
        try {
            annotationsAttribute$Copier.annotationArray();
            return new AnnotationsAttribute(constPool, this.getName(), annotationsAttribute$Copier.close());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public Annotation getAnnotation(String string) {
        Annotation[] arrannotation = this.getAnnotations();
        for (int k = 0; k < arrannotation.length; ++k) {
            if (!arrannotation[k].getTypeName().equals(string)) continue;
            return arrannotation[k];
        }
        return null;
    }

    public void addAnnotation(Annotation annotation) {
        String string = annotation.getTypeName();
        Annotation[] arrannotation = this.getAnnotations();
        for (int k = 0; k < arrannotation.length; ++k) {
            if (!arrannotation[k].getTypeName().equals(string)) continue;
            arrannotation[k] = annotation;
            this.setAnnotations(arrannotation);
            return;
        }
        Annotation[] arrannotation2 = new Annotation[arrannotation.length + 1];
        System.arraycopy(arrannotation, 0, arrannotation2, 0, arrannotation.length);
        arrannotation2[arrannotation.length] = annotation;
        this.setAnnotations(arrannotation2);
    }

    public boolean removeAnnotation(String string) {
        Annotation[] arrannotation = this.getAnnotations();
        for (int k = 0; k < arrannotation.length; ++k) {
            if (!arrannotation[k].getTypeName().equals(string)) continue;
            Annotation[] arrannotation2 = new Annotation[arrannotation.length - 1];
            System.arraycopy(arrannotation, 0, arrannotation2, 0, k);
            if (k < arrannotation.length - 1) {
                System.arraycopy(arrannotation, k + 1, arrannotation2, k, arrannotation.length - k - 1);
            }
            this.setAnnotations(arrannotation2);
            return true;
        }
        return false;
    }

    public Annotation[] getAnnotations() {
        try {
            return new AnnotationsAttribute$Parser(this.info, this.constPool).parseAnnotations();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setAnnotations(Annotation[] arrannotation) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AnnotationsWriter annotationsWriter = new AnnotationsWriter(byteArrayOutputStream, this.constPool);
        try {
            int n6 = arrannotation.length;
            annotationsWriter.numAnnotations(n6);
            for (int k = 0; k < n6; ++k) {
                arrannotation[k].write(annotationsWriter);
            }
            annotationsWriter.close();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        this.set(byteArrayOutputStream.toByteArray());
    }

    public void setAnnotation(Annotation annotation) {
        this.setAnnotations(new Annotation[]{annotation});
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
            annotationsAttribute$Renamer.annotationArray();
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
        Annotation[] arrannotation = this.getAnnotations();
        StringBuilder stringBuilder = new StringBuilder();
        int n6 = 0;
        while (n6 < arrannotation.length) {
            stringBuilder.append(arrannotation[n6++].toString());
            if (n6 == arrannotation.length) continue;
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }
}

