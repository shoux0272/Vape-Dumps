/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import manthe.mD;

public class D4 {
    private final List<mD> a;
    private boolean b = false;

    public D4(mD ... arrmD) {
        this.b = arrmD.length > 4;
        this.a = new ArrayList<mD>(Arrays.asList(arrmD));
    }

    public D4(List<mD> list) {
        this.b = list.size() > 4;
        this.a = list;
    }

    public boolean a() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }
}

