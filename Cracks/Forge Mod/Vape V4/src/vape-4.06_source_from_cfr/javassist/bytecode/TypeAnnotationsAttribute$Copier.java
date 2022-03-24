/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.util.Map;
import javassist.bytecode.AnnotationsAttribute$Copier;
import javassist.bytecode.ConstPool;
import javassist.bytecode.TypeAnnotationsAttribute$SubCopier;
import javassist.bytecode.annotation.TypeAnnotationsWriter;

class TypeAnnotationsAttribute$Copier
extends AnnotationsAttribute$Copier {
    TypeAnnotationsAttribute$SubCopier sub;

    TypeAnnotationsAttribute$Copier(byte[] arrby, ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        super(arrby, constPool, constPool2, map, false);
        TypeAnnotationsWriter typeAnnotationsWriter = new TypeAnnotationsWriter(this.output, constPool2);
        this.writer = typeAnnotationsWriter;
        this.sub = new TypeAnnotationsAttribute$SubCopier(arrby, constPool, constPool2, map, typeAnnotationsWriter);
    }

    @Override
    int annotationArray(int n6, int n10) throws Exception {
        this.writer.numAnnotations(n10);
        for (int k = 0; k < n10; ++k) {
            int n11 = this.info[n6] & 0xFF;
            n6 = this.sub.targetInfo(n6 + 1, n11);
            n6 = this.sub.typePath(n6);
            n6 = this.annotation(n6);
        }
        return n6;
    }
}

