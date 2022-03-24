/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  iReSqtkUVgalqiReSqtkUVg
 */
import java.util.Collections;

class iReSqtkUVgJSyiReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgRyMiReSqtkUVg a;

    private iReSqtkUVgJSyiReSqtkUVg(iReSqtkUVgRyMiReSqtkUVg iReSqtkUVgRyMiReSqtkUVg2) {
        this.a = iReSqtkUVgRyMiReSqtkUVg2;
    }

    @Override
    public void run() {
        iReSqtkUVgRyMiReSqtkUVg.a(this.a).a(Collections.emptyList());
        this.a.a("Unbound");
        iReSqtkUVgRyMiReSqtkUVg.b(this.a).interrupt();
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        this.a.a();
    }

    /* synthetic */ iReSqtkUVgJSyiReSqtkUVg(iReSqtkUVgRyMiReSqtkUVg iReSqtkUVgRyMiReSqtkUVg2, iReSqtkUVgalqiReSqtkUVg iReSqtkUVgalqiReSqtkUVg2) {
        this(iReSqtkUVgRyMiReSqtkUVg2);
    }
}

