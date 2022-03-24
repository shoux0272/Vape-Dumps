/*
 * Decompiled with CFR 0.150.
 */
public abstract class iReSqtkUVgRyMiReSqtkUVg
implements Runnable {
    private final iReSqtkUVgewJiReSqtkUVg a;
    private final iReSqtkUVgnCWiReSqtkUVg b;
    private iReSqtkUVgJSyiReSqtkUVg c = new iReSqtkUVgJSyiReSqtkUVg(this, null);
    private iReSqtkUVgkJbiReSqtkUVg d = new iReSqtkUVgkJbiReSqtkUVg(this, null);

    public iReSqtkUVgRyMiReSqtkUVg(iReSqtkUVgewJiReSqtkUVg iReSqtkUVgewJiReSqtkUVg2, iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        this.a = iReSqtkUVgewJiReSqtkUVg2;
        this.b = iReSqtkUVgnCWiReSqtkUVg2;
    }

    @Override
    public void run() {
        if (!this.d.isAlive()) {
            this.d = new iReSqtkUVgkJbiReSqtkUVg(this, null);
            this.d.start();
        } else {
            this.c = new iReSqtkUVgJSyiReSqtkUVg(this, null);
            this.c.start();
        }
    }

    public boolean b() {
        return this.d.isAlive() || this.c.isAlive();
    }

    public abstract void a();

    public String c() {
        if (this.b instanceof iReSqtkUVgFWjiReSqtkUVg) {
            return ((iReSqtkUVgFWjiReSqtkUVg)this.b).D().D();
        }
        if (this.b instanceof iReSqtkUVgilmiReSqtkUVg) {
            return ((iReSqtkUVgilmiReSqtkUVg)this.b).D();
        }
        if (this.b instanceof iReSqtkUVgwgUiReSqtkUVg) {
            return ((iReSqtkUVgilmiReSqtkUVg)((iReSqtkUVgwgUiReSqtkUVg)this.b).o().get(0)).D();
        }
        return "";
    }

    public void a(String string) {
        if (this.b instanceof iReSqtkUVgFWjiReSqtkUVg) {
            ((iReSqtkUVgFWjiReSqtkUVg)this.b).D().a(string);
        } else if (this.b instanceof iReSqtkUVgilmiReSqtkUVg) {
            ((iReSqtkUVgilmiReSqtkUVg)this.b).a(string);
        } else if (this.b instanceof iReSqtkUVgwgUiReSqtkUVg) {
            ((iReSqtkUVgilmiReSqtkUVg)((iReSqtkUVgwgUiReSqtkUVg)this.b).o().get(0)).a(string);
        }
    }

    static /* synthetic */ iReSqtkUVgewJiReSqtkUVg a(iReSqtkUVgRyMiReSqtkUVg iReSqtkUVgRyMiReSqtkUVg2) {
        return iReSqtkUVgRyMiReSqtkUVg2.a;
    }

    static /* synthetic */ iReSqtkUVgkJbiReSqtkUVg b(iReSqtkUVgRyMiReSqtkUVg iReSqtkUVgRyMiReSqtkUVg2) {
        return iReSqtkUVgRyMiReSqtkUVg2.d;
    }
}

