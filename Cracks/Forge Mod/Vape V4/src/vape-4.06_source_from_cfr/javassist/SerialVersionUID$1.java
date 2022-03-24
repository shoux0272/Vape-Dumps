/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.util.Comparator;
import javassist.CtField;

class SerialVersionUID$1
implements Comparator<CtField> {
    SerialVersionUID$1() {
    }

    @Override
    public int compare(CtField ctField, CtField ctField2) {
        return ctField.getName().compareTo(ctField2.getName());
    }
}

