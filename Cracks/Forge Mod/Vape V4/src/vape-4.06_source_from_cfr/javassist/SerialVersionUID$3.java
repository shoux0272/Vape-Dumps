/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.util.Comparator;
import javassist.CtMethod;

class SerialVersionUID$3
implements Comparator<CtMethod> {
    SerialVersionUID$3() {
    }

    @Override
    public int compare(CtMethod ctMethod, CtMethod ctMethod2) {
        int n6 = ctMethod.getName().compareTo(ctMethod2.getName());
        if (n6 == 0) {
            n6 = ctMethod.getMethodInfo2().getDescriptor().compareTo(ctMethod2.getMethodInfo2().getDescriptor());
        }
        return n6;
    }
}

