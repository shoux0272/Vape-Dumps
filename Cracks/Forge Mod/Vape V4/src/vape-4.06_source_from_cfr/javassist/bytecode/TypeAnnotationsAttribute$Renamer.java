/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.util.Map;
import javassist.bytecode.AnnotationsAttribute$Renamer;
import javassist.bytecode.ConstPool;
import javassist.bytecode.TypeAnnotationsAttribute$SubWalker;

class TypeAnnotationsAttribute$Renamer
extends AnnotationsAttribute$Renamer {
    TypeAnnotationsAttribute$SubWalker sub;

    TypeAnnotationsAttribute$Renamer(byte[] arrby, ConstPool constPool, Map<String, String> map) {
        super(arrby, constPool, map);
        this.sub = new TypeAnnotationsAttribute$SubWalker(arrby);
    }

    @Override
    int annotationArray(int n6, int n10) throws Exception {
        for (int k = 0; k < n10; ++k) {
            int n11 = this.info[n6] & 0xFF;
            n6 = this.sub.targetInfo(n6 + 1, n11);
            n6 = this.sub.typePath(n6);
            n6 = this.annotation(n6);
        }
        return n6;
    }
}

