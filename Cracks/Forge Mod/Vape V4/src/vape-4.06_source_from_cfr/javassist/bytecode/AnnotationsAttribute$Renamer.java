/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.util.Map;
import javassist.bytecode.AnnotationsAttribute$Walker;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;

class AnnotationsAttribute$Renamer
extends AnnotationsAttribute$Walker {
    ConstPool cpool;
    Map<String, String> classnames;

    AnnotationsAttribute$Renamer(byte[] arrby, ConstPool constPool, Map<String, String> map) {
        super(arrby);
        this.cpool = constPool;
        this.classnames = map;
    }

    @Override
    int annotation(int n6, int n10, int n11) throws Exception {
        this.renameType(n6 - 4, n10);
        return super.annotation(n6, n10, n11);
    }

    @Override
    void enumMemberValue(int n6, int n10, int n11) throws Exception {
        this.renameType(n6 + 1, n10);
        super.enumMemberValue(n6, n10, n11);
    }

    @Override
    void classMemberValue(int n6, int n10) throws Exception {
        this.renameType(n6 + 1, n10);
        super.classMemberValue(n6, n10);
    }

    private void renameType(int n6, int n10) {
        String string;
        String string2 = this.cpool.getUtf8Info(n10);
        if (!string2.equals(string = Descriptor.rename(string2, this.classnames))) {
            int n11 = this.cpool.addUtf8Info(string);
            ByteArray.write16bit(n11, this.info, n6);
        }
    }
}

