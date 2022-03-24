/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgOkOiReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgBGPiReSqtkUVg,
iReSqtkUVgXTEiReSqtkUVg {
    private static final int h = 2;
    private final iReSqtkUVgilmiReSqtkUVg p = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.a, 1.0);
    private final iReSqtkUVgilmiReSqtkUVg q = new iReSqtkUVgilmiReSqtkUVg("_", iReSqtkUVgIqLiReSqtkUVg.a, 1.0);
    private final iReSqtkUVgPzKiReSqtkUVg r = new iReSqtkUVgPzKiReSqtkUVg();
    private final iReSqtkUVgPzKiReSqtkUVg s = new iReSqtkUVgPzKiReSqtkUVg();
    private String t = "";
    private int u;
    private double v = 0.0;
    private boolean w = false;

    public iReSqtkUVgOkOiReSqtkUVg(int n) {
        this.u = n;
        iReSqtkUVgLWWiReSqtkUVg iReSqtkUVgLWWiReSqtkUVg2 = new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 3, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 2));
        iReSqtkUVgLWWiReSqtkUVg2.f();
        this.a(iReSqtkUVgLWWiReSqtkUVg2);
        this.p.c(false);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.p);
        this.q.c(this.j().b("_"));
        this.q.c(false);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.q);
        this.a(null, new iReSqtkUVgTAciReSqtkUVg(this));
    }

    public iReSqtkUVgOkOiReSqtkUVg() {
        this(1000);
    }

    public iReSqtkUVgilmiReSqtkUVg D() {
        return this.p;
    }

    @Override
    public void a(boolean bl) {
        if (this.h()) {
            iReSqtkUVguKSiReSqtkUVg.a(this.c(), this.e_(), this.k(), this.l());
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            iReSqtkUVguKSiReSqtkUVg.a(this.m(), this.d(), this, 4);
            iReSqtkUVguKSiReSqtkUVg.a(this.g_() ? k.darker() : k.brighter().brighter().brighter(), this);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            super.a(bl);
            if (!this.t.isEmpty() && !this.g_() && this.p.D().isEmpty()) {
                this.p.a(this.t, this.p.c(), this.p.e_(), Color.LIGHT_GRAY);
            }
            GL11.glDisable((int)3089);
        }
    }

    @Override
    public void c_() {
        super.c_();
        if (this.g_()) {
            String string;
            if (this.r.a(600L)) {
                this.r.b();
                string = this.q.D();
                this.q.a(string.equals("_") ? "" : "_");
            }
            if (Keyboard.isKeyDown((int)14) && this.s.a(100L)) {
                this.q.a("_");
                this.s.b();
                string = this.p.D();
                if (string.length() > 0) {
                    this.p.a(string.substring(0, string.length() - 1));
                }
            }
        } else {
            this.q.a("");
        }
        this.p.c(this.j().b(this.p.D()));
        double d2 = this.p.k() - this.k();
        if (d2 > 0.0) {
            this.p.a_(this.c() - d2);
        }
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.p.d(d2);
        this.q.d(d2);
    }

    @Override
    public boolean a(char c2, int n) {
        if (this.g_()) {
            Object object;
            if (n == 1) {
                this.b(false);
                return true;
            }
            if (c2 == '\u0016' && Keyboard.isKeyDown((int)29) && (object = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null)) != null && object.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                try {
                    this.p.a((String)object.getTransferData(DataFlavor.stringFlavor));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            if ((c2 == '\u00a7' || c2 < ' ' || c2 == '\u007f') && n != 0) {
                return true;
            }
            object = this.p.D();
            if (((String)object).length() <= this.u && n != 14 && c2 != '\u0000') {
                this.p.a((String)object + c2);
            }
            return true;
        }
        return super.a(c2, n);
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        if (!this.t()) {
            this.b(false);
        }
        if (this.t() && n3 == 1) {
            this.p.a("");
        }
        return super.a(n, n2, n3);
    }

    @Override
    public double d() {
        return this.v;
    }

    @Override
    public void a(double d2) {
        this.v = d2;
    }

    public iReSqtkUVgilmiReSqtkUVg E() {
        return this.p;
    }

    public int F() {
        return this.u;
    }

    public void a(int n) {
        this.u = n;
    }

    @Override
    public boolean g_() {
        return this.w;
    }

    @Override
    public void b(boolean bl) {
        this.w = bl;
    }

    public String G() {
        return this.t;
    }

    public void b(String string) {
        this.t = string;
    }
}

