/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgeoIiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private final String b;
    private String c;

    public iReSqtkUVgeoIiReSqtkUVg(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }
}

