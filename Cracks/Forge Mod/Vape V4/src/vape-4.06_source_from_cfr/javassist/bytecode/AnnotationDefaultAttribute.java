/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.AnnotationsAttribute$Copier;
import javassist.bytecode.AnnotationsAttribute$Parser;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.AnnotationsWriter;
import javassist.bytecode.annotation.MemberValue;

public class AnnotationDefaultAttribute
extends AttributeInfo {
    public static final String tag = "AnnotationDefault";

    public AnnotationDefaultAttribute(ConstPool constPool, byte[] arrby) {
        super(constPool, tag, arrby);
    }

    public AnnotationDefaultAttribute(ConstPool constPool) {
        this(constPool, new byte[]{0, 0});
    }

    AnnotationDefaultAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        AnnotationsAttribute$Copier annotationsAttribute$Copier = new AnnotationsAttribute$Copier(this.info, this.constPool, constPool, map);
        try {
            annotationsAttribute$Copier.memberValue(0);
            return new AnnotationDefaultAttribute(constPool, annotationsAttribute$Copier.close());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.toString());
        }
    }

    public MemberValue getDefaultValue() {
        try {
            return new AnnotationsAttribute$Parser(this.info, this.constPool).parseMemberValue();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.toString());
        }
    }

    public void setDefaultValue(MemberValue memberValue) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AnnotationsWriter annotationsWriter = new AnnotationsWriter(byteArrayOutputStream, this.constPool);
        try {
            memberValue.write(annotationsWriter);
            annotationsWriter.close();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        this.set(byteArrayOutputStream.toByteArray());
    }

    public String toString() {
        return this.getDefaultValue().toString();
    }
}

