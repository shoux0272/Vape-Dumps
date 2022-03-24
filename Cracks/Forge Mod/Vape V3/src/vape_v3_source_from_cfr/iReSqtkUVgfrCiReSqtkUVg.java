/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.lwjgl.input.Keyboard;

public class iReSqtkUVgfrCiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private final iReSqtkUVgOkOiReSqtkUVg p;
    private final iReSqtkUVguOciReSqtkUVg q;
    private String r = "";
    private Map<iReSqtkUVgcvhiReSqtkUVg, iReSqtkUVgFIuiReSqtkUVg> s = new HashMap<iReSqtkUVgcvhiReSqtkUVg, iReSqtkUVgFIuiReSqtkUVg>();
    private Map<iReSqtkUVgRjOiReSqtkUVg, List<iReSqtkUVgnCWiReSqtkUVg>> t = new HashMap<iReSqtkUVgRjOiReSqtkUVg, List<iReSqtkUVgnCWiReSqtkUVg>>();

    public iReSqtkUVgfrCiReSqtkUVg() {
        super("Filter", false);
        this.J().a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.c(iReSqtkUVgwgUiReSqtkUVg2);
        iReSqtkUVgCABiReSqtkUVg iReSqtkUVgCABiReSqtkUVg2 = new iReSqtkUVgCABiReSqtkUVg("magnify", 0.35f, 2.0f, 3.5f, true);
        iReSqtkUVgCABiReSqtkUVg2.D().c(false);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg2);
        this.p = new iReSqtkUVgOkOiReSqtkUVg(33);
        this.p.b("Search within GUI");
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this.p);
        this.c(125.0);
        this.d(20.0);
        this.p.d(20.0);
        this.p.c(150.0);
        this.q = new iReSqtkUVguOciReSqtkUVg(false);
        this.c(this.q);
        this.q.c(100.0);
        this.q.d(130.0);
        ((iReSqtkUVgFWjiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg2).c(15.0);
        ((iReSqtkUVgFWjiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg2).d(20.0);
        this.i(true);
    }

    private void R() {
        Iterator<Map.Entry<iReSqtkUVgcvhiReSqtkUVg, iReSqtkUVgFIuiReSqtkUVg>> iterator = this.s.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<iReSqtkUVgcvhiReSqtkUVg, iReSqtkUVgFIuiReSqtkUVg> entry = iterator.next();
            this.q.D().b(entry.getKey());
            iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg2 = entry.getKey();
            iReSqtkUVgFIuiReSqtkUVg iReSqtkUVgFIuiReSqtkUVg2 = entry.getValue();
            iReSqtkUVgFIuiReSqtkUVg2.b().a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg2);
            List<iReSqtkUVgnCWiReSqtkUVg> list = iReSqtkUVgFIuiReSqtkUVg2.b().o();
            list.clear();
            list.addAll((Collection<iReSqtkUVgnCWiReSqtkUVg>)this.t.get(iReSqtkUVgFIuiReSqtkUVg2.b()));
            iReSqtkUVgcvhiReSqtkUVg2.a(iReSqtkUVgFIuiReSqtkUVg2.c());
            iterator.remove();
        }
        this.s.clear();
        this.t.clear();
        this.q.D().q();
    }

    private void a(iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg2) {
        if (!this.s.containsKey(iReSqtkUVgcvhiReSqtkUVg2)) {
            iReSqtkUVgRjOiReSqtkUVg iReSqtkUVgRjOiReSqtkUVg2 = iReSqtkUVgcvhiReSqtkUVg2.f();
            if (!this.t.containsKey(iReSqtkUVgRjOiReSqtkUVg2)) {
                this.t.put(iReSqtkUVgRjOiReSqtkUVg2, new ArrayList<iReSqtkUVgnCWiReSqtkUVg>(iReSqtkUVgRjOiReSqtkUVg2.o()));
            }
            this.s.put(iReSqtkUVgcvhiReSqtkUVg2, new iReSqtkUVgFIuiReSqtkUVg(iReSqtkUVgcvhiReSqtkUVg2));
            iReSqtkUVgRjOiReSqtkUVg2.b(iReSqtkUVgcvhiReSqtkUVg2);
            iReSqtkUVgcvhiReSqtkUVg2.a((iReSqtkUVgxxliReSqtkUVg)null);
            this.q.c(iReSqtkUVgcvhiReSqtkUVg2);
        }
    }

    @Override
    public void a(boolean bl) {
        String string;
        super.a(true);
        this.c_(false);
        this.a_((double)(iReSqtkUVgeLLiReSqtkUVg.o().e() / 2) - this.k() / 2.0);
        this.b(0.0);
        if (Keyboard.isKeyDown((int)29) && Keyboard.isKeyDown((int)33)) {
            this.p.b(true);
        }
        if (!(string = this.p.D().D().toLowerCase()).equals(this.r)) {
            this.R();
        }
        this.r = string;
        if (!string.equals("")) {
            this.q.a_(true);
            for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
                String string2 = iReSqtkUVgJZmiReSqtkUVg2.N().toLowerCase();
                if (!string2.toLowerCase().contains(string) || iReSqtkUVgJZmiReSqtkUVg2.v() == null) continue;
                iReSqtkUVgYTjiReSqtkUVg iReSqtkUVgYTjiReSqtkUVg2 = iReSqtkUVgJZmiReSqtkUVg2.v();
                this.a(iReSqtkUVgYTjiReSqtkUVg2);
            }
        } else {
            this.q.a_(false);
        }
    }
}

