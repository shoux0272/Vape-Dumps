/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.util.Comparator;
import javassist.CtConstructor;

class SerialVersionUID$2
implements Comparator<CtConstructor> {
    SerialVersionUID$2() {
    }

    @Override
    public int compare(CtConstructor ctConstructor, CtConstructor ctConstructor2) {
        return ctConstructor.getMethodInfo2().getDescriptor().compareTo(ctConstructor2.getMethodInfo2().getDescriptor());
    }
}

