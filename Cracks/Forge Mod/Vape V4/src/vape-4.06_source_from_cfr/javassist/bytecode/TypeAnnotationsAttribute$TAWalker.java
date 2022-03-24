/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.AnnotationsAttribute$Walker;
import javassist.bytecode.TypeAnnotationsAttribute$SubWalker;

class TypeAnnotationsAttribute$TAWalker
extends AnnotationsAttribute$Walker {
    TypeAnnotationsAttribute$SubWalker subWalker;

    TypeAnnotationsAttribute$TAWalker(byte[] arrby) {
        super(arrby);
        this.subWalker = new TypeAnnotationsAttribute$SubWalker(arrby);
    }

    @Override
    int annotationArray(int n6, int n10) throws Exception {
        for (int k = 0; k < n10; ++k) {
            int n11 = this.info[n6] & 0xFF;
            n6 = this.subWalker.targetInfo(n6 + 1, n11);
            n6 = this.subWalker.typePath(n6);
            n6 = this.annotation(n6);
        }
        return n6;
    }
}

