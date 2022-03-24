/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CtField;
import javassist.CtField$Initializer;

class FieldInitLink {
    FieldInitLink next = null;
    CtField field;
    CtField$Initializer init;

    FieldInitLink(CtField ctField, CtField$Initializer ctField$Initializer) {
        this.field = ctField;
        this.init = ctField$Initializer;
    }
}

