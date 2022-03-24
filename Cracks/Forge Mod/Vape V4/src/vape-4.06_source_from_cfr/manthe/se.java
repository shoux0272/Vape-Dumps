/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.d_;
import manthe.fG;
import manthe.fK;
import manthe.fl;
import manthe.on;
import manthe.si;

public class se
extends si {
    public se() {
        super(A5.da, 0);
    }

    @Override
    public void a(Object object) {
        d_ d_2 = new d_(object);
        if (on.p.t().f.u().booleanValue()) {
            fG fG2 = d_2.i();
            if (fG2.e() || fG2.i().e() || d_2.j() == null) {
                return;
            }
            for (String string : fG2.i().f()) {
                if (string.equals("display") || string.equals("Unbreakable") || string.equals("HideFlags") || string.equals("overrideMeta") || string.equals("AttributeModifiers")) continue;
                fl fl2 = fG2.i().b(string);
                d_2.j().add("");
                if (fl2.a(A5.au)) {
                    fK fK2 = new fK(fl2);
                    d_2.j().add("\u00a79" + string);
                    for (String string2 : fK2.f()) {
                        fl fl3 = fK2.b(string2);
                        if (fl3.a(A5.au) || fl3.a(A5.dv)) continue;
                        d_2.j().add(string2 + ": " + fl3.toString());
                    }
                    continue;
                }
                d_2.j().add(string + ": " + fl2.toString());
            }
        }
    }
}

