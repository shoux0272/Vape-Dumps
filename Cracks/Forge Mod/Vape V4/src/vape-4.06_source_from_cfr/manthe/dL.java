/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package manthe;

import com.google.common.collect.ImmutableMap;
import manthe.cy;
import manthe.dr;
import manthe.dx;

public class dL
extends cy {
    public dL(Object object) {
        super(object);
    }

    public dx f() {
        return new dx(dL.a.M().bY.b(this.b));
    }

    public Object a(dr dr2) {
        ImmutableMap immutableMap = dL.a.M().bY.a(this.b);
        if (immutableMap.containsKey(dr2.a())) {
            return immutableMap.get(dr2.a());
        }
        return null;
    }
}

