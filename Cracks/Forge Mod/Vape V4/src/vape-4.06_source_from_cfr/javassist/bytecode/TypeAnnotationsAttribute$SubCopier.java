/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.util.Map;
import javassist.bytecode.ConstPool;
import javassist.bytecode.TypeAnnotationsAttribute$SubWalker;
import javassist.bytecode.annotation.TypeAnnotationsWriter;

class TypeAnnotationsAttribute$SubCopier
extends TypeAnnotationsAttribute$SubWalker {
    ConstPool srcPool;
    ConstPool destPool;
    Map<String, String> classnames;
    TypeAnnotationsWriter writer;

    TypeAnnotationsAttribute$SubCopier(byte[] arrby, ConstPool constPool, ConstPool constPool2, Map<String, String> map, TypeAnnotationsWriter typeAnnotationsWriter) {
        super(arrby);
        this.srcPool = constPool;
        this.destPool = constPool2;
        this.classnames = map;
        this.writer = typeAnnotationsWriter;
    }

    @Override
    void typeParameterTarget(int n6, int n10, int n11) throws Exception {
        this.writer.typeParameterTarget(n10, n11);
    }

    @Override
    void supertypeTarget(int n6, int n10) throws Exception {
        this.writer.supertypeTarget(n10);
    }

    @Override
    void typeParameterBoundTarget(int n6, int n10, int n11, int n12) throws Exception {
        this.writer.typeParameterBoundTarget(n10, n11, n12);
    }

    @Override
    void emptyTarget(int n6, int n10) throws Exception {
        this.writer.emptyTarget(n10);
    }

    @Override
    void formalParameterTarget(int n6, int n10) throws Exception {
        this.writer.formalParameterTarget(n10);
    }

    @Override
    void throwsTarget(int n6, int n10) throws Exception {
        this.writer.throwsTarget(n10);
    }

    @Override
    int localvarTarget(int n6, int n10, int n11) throws Exception {
        this.writer.localVarTarget(n10, n11);
        return super.localvarTarget(n6, n10, n11);
    }

    @Override
    void localvarTarget(int n6, int n10, int n11, int n12, int n13) throws Exception {
        this.writer.localVarTargetTable(n11, n12, n13);
    }

    @Override
    void catchTarget(int n6, int n10) throws Exception {
        this.writer.catchTarget(n10);
    }

    @Override
    void offsetTarget(int n6, int n10, int n11) throws Exception {
        this.writer.offsetTarget(n10, n11);
    }

    @Override
    void typeArgumentTarget(int n6, int n10, int n11, int n12) throws Exception {
        this.writer.typeArgumentTarget(n10, n11, n12);
    }

    @Override
    int typePath(int n6, int n10) throws Exception {
        this.writer.typePath(n10);
        return super.typePath(n6, n10);
    }

    @Override
    void typePath(int n6, int n10, int n11) throws Exception {
        this.writer.typePathPath(n10, n11);
    }
}

