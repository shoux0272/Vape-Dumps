/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.AnnotationsAttribute$Walker;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.annotation.AnnotationsWriter;

class AnnotationsAttribute$Copier
extends AnnotationsAttribute$Walker {
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    AnnotationsWriter writer;
    ConstPool srcPool;
    ConstPool destPool;
    Map<String, String> classnames;

    AnnotationsAttribute$Copier(byte[] arrby, ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        this(arrby, constPool, constPool2, map, true);
    }

    AnnotationsAttribute$Copier(byte[] arrby, ConstPool constPool, ConstPool constPool2, Map<String, String> map, boolean bl) {
        super(arrby);
        if (bl) {
            this.writer = new AnnotationsWriter(this.output, constPool2);
        }
        this.srcPool = constPool;
        this.destPool = constPool2;
        this.classnames = map;
    }

    byte[] close() throws IOException {
        this.writer.close();
        return this.output.toByteArray();
    }

    @Override
    void parameters(int n6, int n10) throws Exception {
        this.writer.numParameters(n6);
        super.parameters(n6, n10);
    }

    @Override
    int annotationArray(int n6, int n10) throws Exception {
        this.writer.numAnnotations(n10);
        return super.annotationArray(n6, n10);
    }

    @Override
    int annotation(int n6, int n10, int n11) throws Exception {
        this.writer.annotation(this.copyType(n10), n11);
        return super.annotation(n6, n10, n11);
    }

    @Override
    int memberValuePair(int n6, int n10) throws Exception {
        this.writer.memberValuePair(this.copy(n10));
        return super.memberValuePair(n6, n10);
    }

    @Override
    void constValueMember(int n6, int n10) throws Exception {
        this.writer.constValueIndex(n6, this.copy(n10));
        super.constValueMember(n6, n10);
    }

    @Override
    void enumMemberValue(int n6, int n10, int n11) throws Exception {
        this.writer.enumConstValue(this.copyType(n10), this.copy(n11));
        super.enumMemberValue(n6, n10, n11);
    }

    @Override
    void classMemberValue(int n6, int n10) throws Exception {
        this.writer.classInfoIndex(this.copyType(n10));
        super.classMemberValue(n6, n10);
    }

    @Override
    int annotationMemberValue(int n6) throws Exception {
        this.writer.annotationValue();
        return super.annotationMemberValue(n6);
    }

    @Override
    int arrayMemberValue(int n6, int n10) throws Exception {
        this.writer.arrayValue(n10);
        return super.arrayMemberValue(n6, n10);
    }

    int copy(int n6) {
        return this.srcPool.copy(n6, this.destPool, this.classnames);
    }

    int copyType(int n6) {
        String string = this.srcPool.getUtf8Info(n6);
        String string2 = Descriptor.rename(string, this.classnames);
        return this.destPool.addUtf8Info(string2);
    }
}

