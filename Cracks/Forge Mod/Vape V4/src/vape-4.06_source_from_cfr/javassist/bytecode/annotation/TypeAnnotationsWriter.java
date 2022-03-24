/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.io.OutputStream;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.AnnotationsWriter;

public class TypeAnnotationsWriter
extends AnnotationsWriter {
    public TypeAnnotationsWriter(OutputStream outputStream, ConstPool constPool) {
        super(outputStream, constPool);
    }

    @Override
    public void numAnnotations(int n6) throws IOException {
        super.numAnnotations(n6);
    }

    public void typeParameterTarget(int n6, int n10) throws IOException {
        this.output.write(n6);
        this.output.write(n10);
    }

    public void supertypeTarget(int n6) throws IOException {
        this.output.write(16);
        this.write16bit(n6);
    }

    public void typeParameterBoundTarget(int n6, int n10, int n11) throws IOException {
        this.output.write(n6);
        this.output.write(n10);
        this.output.write(n11);
    }

    public void emptyTarget(int n6) throws IOException {
        this.output.write(n6);
    }

    public void formalParameterTarget(int n6) throws IOException {
        this.output.write(22);
        this.output.write(n6);
    }

    public void throwsTarget(int n6) throws IOException {
        this.output.write(23);
        this.write16bit(n6);
    }

    public void localVarTarget(int n6, int n10) throws IOException {
        this.output.write(n6);
        this.write16bit(n10);
    }

    public void localVarTargetTable(int n6, int n10, int n11) throws IOException {
        this.write16bit(n6);
        this.write16bit(n10);
        this.write16bit(n11);
    }

    public void catchTarget(int n6) throws IOException {
        this.output.write(66);
        this.write16bit(n6);
    }

    public void offsetTarget(int n6, int n10) throws IOException {
        this.output.write(n6);
        this.write16bit(n10);
    }

    public void typeArgumentTarget(int n6, int n10, int n11) throws IOException {
        this.output.write(n6);
        this.write16bit(n10);
        this.output.write(n11);
    }

    public void typePath(int n6) throws IOException {
        this.output.write(n6);
    }

    public void typePathPath(int n6, int n10) throws IOException {
        this.output.write(n6);
        this.output.write(n10);
    }
}

