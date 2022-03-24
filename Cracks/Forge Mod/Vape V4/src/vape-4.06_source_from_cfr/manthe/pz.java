/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Cj;
import manthe.D_;
import manthe.n8;
import manthe.ng;
import manthe.on;
import manthe.qd;
import manthe.r8;

class pz
extends Thread {
    final String a;
    final n8 b;

    pz(n8 n82, String string) {
        this.b = n82;
        this.a = string;
    }

    @Override
    public void run() {
        block21: {
            try {
                D_ d_2 = on.p.w();
                qd qd2 = d_2.a();
                if (qd2 == null || !qd2.a()) {
                    String string = this.b.a.ag.z().E();
                    if (string == null || string.equals("") || !r8.a(this.b.a).matcher(string).matches()) {
                        r8.b(this.b.a).z().a("Invalid Key!");
                        try {
                            Thread.sleep(3000L);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        r8.b(this.b.a).z().a(this.a);
                        r8.b(this.b.a).b(false);
                        return;
                    }
                    qd qd3 = d_2.a(string);
                    if (qd3 == null) {
                        r8.b(this.b.a).z().a("Invalid Key!");
                        try {
                            Thread.sleep(3000L);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        r8.b(this.b.a).z().a(this.a);
                        r8.b(this.b.a).b(false);
                        return;
                    }
                    if (qd3.a()) {
                        r8.b(this.b.a).z().a("Generate Alt");
                        this.b.a.ag.b(true);
                        if (on.p.D().e.u().booleanValue()) {
                            on.p.D().d.b(string);
                        }
                        break block21;
                    }
                    r8.b(this.b.a).z().a("No Active License!");
                    try {
                        Thread.sleep(3000L);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    r8.b(this.b.a).z().a(this.a);
                    r8.b(this.b.a).b(false);
                    return;
                }
                r8.b(this.b.a).z().a("Generating alt...");
                Cj cj2 = d_2.b();
                if (cj2 == null) {
                    r8.b(this.b.a).z().a("Could not generate alt!");
                    try {
                        Thread.sleep(3000L);
                    }
                    catch (Exception exception) {}
                } else {
                    ng.i.a(cj2);
                    r8.b(this.b.a).z().a("Generated Alt " + cj2.c());
                    try {
                        Thread.sleep(1500L);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                r8.b(this.b.a).z().a("Generate Alt");
            }
            catch (Exception exception) {
                exception.printStackTrace();
                r8.b(this.b.a).z().a("An Exception Occurred!");
                try {
                    Thread.sleep(3000L);
                }
                catch (Exception exception2) {
                    // empty catch block
                }
                r8.b(this.b.a).z().a(this.a);
            }
        }
        r8.b(this.b.a).b(false);
    }
}

