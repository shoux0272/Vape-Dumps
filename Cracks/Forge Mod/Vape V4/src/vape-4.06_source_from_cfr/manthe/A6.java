/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Cj;
import manthe.rs;
import manthe.sb;
import manthe.vK;

class A6
implements vK {
    final sb b;
    final rs a;

    A6(rs rs2, sb sb2) {
        this.a = rs2;
        this.b = sb2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string;
        if (n11 == 0 && (string = this.b.z().E()).contains(":")) {
            String[] arrstring = string.split(":");
            if (arrstring.length == 2) {
                String string2 = arrstring[0];
                String string3 = arrstring[1];
                this.a.a(new Cj(string2, string3));
            }
            this.b.z().a("");
        }
    }
}

