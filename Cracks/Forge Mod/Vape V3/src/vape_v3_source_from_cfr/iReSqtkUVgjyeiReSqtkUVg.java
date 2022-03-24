/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgjyeiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private int b;
    private iReSqtkUVgPzKiReSqtkUVg c = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgPzKiReSqtkUVg d = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Disable Speed", false, "Disable Speed when flagging.");

    public iReSqtkUVgjyeiReSqtkUVg() {
        super("NoRotate", -2420426, iReSqtkUVgqTOiReSqtkUVg.f, "Prevents the server from\nsetting your view angles.");
        this.a(this.e);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgaWmiReSqtkUVg iReSqtkUVgaWmiReSqtkUVg2) {
        if (iReSqtkUVgaWmiReSqtkUVg2.getPacket().a(iReSqtkUVgSzRiReSqtkUVg.cC)) {
            iReSqtkUVgkAWiReSqtkUVg iReSqtkUVgkAWiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgkAWiReSqtkUVg.class);
            iReSqtkUVgkAWiReSqtkUVg2.a(-5);
            if (this.d.a(2000L)) {
                ++this.b;
                iReSqtkUVgRERiReSqtkUVg iReSqtkUVgRERiReSqtkUVg2 = new iReSqtkUVgRERiReSqtkUVg(iReSqtkUVgaWmiReSqtkUVg2.getPacket());
                iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
                if (iReSqtkUVgtlXiReSqtkUVg2.c()) {
                    iReSqtkUVgRERiReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2.F());
                    iReSqtkUVgRERiReSqtkUVg2.b(iReSqtkUVgtlXiReSqtkUVg2.G());
                }
            }
        }
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (this.c.a(750L) && this.b > 3 && this.d.a(2000L)) {
            this.d.b();
            this.c.b();
            this.b = 0;
            iReSqtkUVgkAWiReSqtkUVg iReSqtkUVgkAWiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgkAWiReSqtkUVg.class);
            if (this.e.j().booleanValue() && iReSqtkUVgkAWiReSqtkUVg2.b()) {
                iReSqtkUVgkAWiReSqtkUVg2.a();
            }
        }
    }
}

