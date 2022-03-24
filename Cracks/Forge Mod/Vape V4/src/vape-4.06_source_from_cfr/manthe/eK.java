/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.cy;
import manthe.dR;
import manthe.eH;
import manthe.fG;
import manthe.ik;

public class eK
extends cy {
    public eK(Object object) {
        super(object);
    }

    public static eK f() {
        return new eK(ik.a(eK.a.M().cj));
    }

    public void a(dR dR2, eH eH2, fG fG2, int n6, int n10) {
        if (V.c() == 13) {
            ik.a(eK.a.M().cj, this.b, dR2.a(), eH2.a(), fG2.a(), n6, n10);
        } else {
            ik.a(eK.a.M().cj, this.b, fG2.a(), n6, n10);
        }
    }

    public void b(dR dR2, eH eH2, fG fG2, int n6, int n10) {
        if (V.c() == 13) {
            ik.b(eK.a.M().cj, this.b, dR2.a(), eH2.a(), fG2.a(), n6, n10);
        } else {
            ik.a(eK.a.M().cj, this.b, dR2.a(), fG2.a(), n6, n10);
        }
    }

    public float g() {
        return ik.a(eK.a.M().cj, this.b);
    }

    public void a(float f10) {
        ik.a(eK.a.M().cj, this.b, f10);
    }
}

