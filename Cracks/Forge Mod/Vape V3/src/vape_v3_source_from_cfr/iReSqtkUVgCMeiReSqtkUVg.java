/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import com.google.gson.JsonObject;
import java.awt.Color;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgCMeiReSqtkUVg
extends iReSqtkUVgwgUiReSqtkUVg
implements iReSqtkUVgmopiReSqtkUVg,
iReSqtkUVgqXEiReSqtkUVg,
iReSqtkUVgqhUiReSqtkUVg {
    protected static final int h = 2;
    private final boolean p;
    private final iReSqtkUVgwgUiReSqtkUVg q;
    private final iReSqtkUVgilmiReSqtkUVg r;
    private final iReSqtkUVgilmiReSqtkUVg s;
    private final iReSqtkUVgwgUiReSqtkUVg t;
    private final iReSqtkUVgwgUiReSqtkUVg u;
    private final iReSqtkUVgQBEiReSqtkUVg v;
    private final iReSqtkUVgQBEiReSqtkUVg w;
    private final iReSqtkUVgxxliReSqtkUVg x = new iReSqtkUVgxxliReSqtkUVg(0.0, 0.0, 0.0, 0.0);
    private iReSqtkUVgxxliReSqtkUVg y;
    private iReSqtkUVgxxliReSqtkUVg z;
    private boolean A = false;
    private boolean B = false;
    private boolean C = true;
    private boolean D = false;
    private boolean E = false;
    private double F = 0.0;
    private List<iReSqtkUVgnCWiReSqtkUVg> G = new ArrayList<iReSqtkUVgnCWiReSqtkUVg>();
    private int H = -1;
    private boolean I = true;
    private boolean J;
    private iReSqtkUVgeAoiReSqtkUVg K;
    private iReSqtkUVgFWjiReSqtkUVg L;
    private boolean M;

    public iReSqtkUVgCMeiReSqtkUVg(String string, boolean bl) {
        super(false);
        this.p = bl;
        this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 2, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.q = new iReSqtkUVgwgUiReSqtkUVg(true);
        this.q.a(i);
        this.q.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 3, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.r = new iReSqtkUVgilmiReSqtkUVg(string, iReSqtkUVgIqLiReSqtkUVg.b, 1.0);
        this.v = new iReSqtkUVgQBEiReSqtkUVg(this.r.D(), 0.4f, true);
        this.q.a((iReSqtkUVgnCWiReSqtkUVg)this.v);
        this.v.b(3.0f);
        this.v.a(3.0f);
        this.w = new iReSqtkUVgQBEiReSqtkUVg("pin", 0.3f, true);
        this.w.a(-23.0f);
        this.w.b(4.0f);
        this.w.a(new iReSqtkUVggUFiReSqtkUVg(this));
        this.r.a(iReSqtkUVgYKuiReSqtkUVg.b);
        this.s = new iReSqtkUVgilmiReSqtkUVg("+", iReSqtkUVgIqLiReSqtkUVg.b, 1.0);
        this.s.a(iReSqtkUVgYKuiReSqtkUVg.b);
        this.s.a(new iReSqtkUVgwZRiReSqtkUVg(this));
        this.q.a((iReSqtkUVgnCWiReSqtkUVg)this.r);
        this.q.a((iReSqtkUVgnCWiReSqtkUVg)this.s);
        this.q.a(null, new iReSqtkUVggkmiReSqtkUVg(this));
        this.y = new iReSqtkUVgWMjiReSqtkUVg(this, 0.0, 0.0, 0.0, 0.0);
        this.q.a(this.y, new iReSqtkUVgMOJiReSqtkUVg(this));
        if (this.p) {
            this.z = new iReSqtkUVghNPiReSqtkUVg(this, 0.0, 0.0, 0.0, 0.0);
            this.q.a(this.z, new iReSqtkUVgaYViReSqtkUVg(this));
        }
        this.u = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.u.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 0, 2)));
        this.t = new iReSqtkUVgwgUiReSqtkUVg(true);
        this.t.a(j);
        this.u.a((iReSqtkUVgnCWiReSqtkUVg)this.t);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.q);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.u);
        this.c_(true);
        this.L = new iReSqtkUVgFWjiReSqtkUVg(this.N(), true);
        this.L.a(new iReSqtkUVgrNOiReSqtkUVg(this));
    }

    public boolean D() {
        this.K = new iReSqtkUVgeAoiReSqtkUVg(this);
        return true;
    }

    public iReSqtkUVgcvhiReSqtkUVg E() {
        return this.K;
    }

    private void R() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)0.15f, (float)0.15f, (float)0.15f, (float)0.3f);
        GL11.glLineWidth((float)1.0f);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)this.q.c(), (double)this.q.e_());
        GL11.glVertex2d((double)(this.q.c() + this.q.k()), (double)this.q.e_());
        GL11.glVertex2d((double)(this.q.c() + this.q.k()), (double)(this.q.e_() + this.q.l()));
        GL11.glVertex2d((double)this.q.c(), (double)(this.q.e_() + this.q.l()));
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    @Override
    public void a(boolean bl) {
        Object object;
        if (this.h()) {
            for (iReSqtkUVgnCWiReSqtkUVg object2 : this.o()) {
                if (object2.equals(this.u)) {
                    if (this.I) {
                        iReSqtkUVguKSiReSqtkUVg.a(0.0, this.e_(), 999999.0, (this.u.l() + this.q.l()) * (this.F / 100.0));
                    }
                    object = BufferUtils.createIntBuffer((int)16);
                    GL11.glGetInteger((int)3088, (IntBuffer)object);
                    this.x.a(((IntBuffer)object).get());
                    this.x.b(((IntBuffer)object).get());
                    this.x.c(((IntBuffer)object).get());
                    this.x.d(((IntBuffer)object).get());
                    this.u.a(bl);
                    GL11.glDisable((int)3089);
                    continue;
                }
                object2.a(bl);
            }
        }
        if (this.h()) {
            if (this.q.h()) {
                this.R();
                iReSqtkUVgFXsiReSqtkUVg iReSqtkUVgFXsiReSqtkUVg2 = iReSqtkUVguKSiReSqtkUVg.a();
                iReSqtkUVgxxliReSqtkUVg iReSqtkUVgxxliReSqtkUVg2 = this.y.b(this.c(), this.e_());
                if (iReSqtkUVgxxliReSqtkUVg2.a(iReSqtkUVgFXsiReSqtkUVg2)) {
                    iReSqtkUVguKSiReSqtkUVg.a(iReSqtkUVgxxliReSqtkUVg2.a(), iReSqtkUVgxxliReSqtkUVg2.b(), iReSqtkUVgxxliReSqtkUVg2.a() + iReSqtkUVgxxliReSqtkUVg2.c(), iReSqtkUVgxxliReSqtkUVg2.b() + iReSqtkUVgxxliReSqtkUVg2.d(), 1.0, 1.0, 1.0, 0.3);
                }
                if (this.p) {
                    object = this.z.b(this.c(), this.e_());
                    this.w.a(false);
                    if (((iReSqtkUVgxxliReSqtkUVg)object).a(iReSqtkUVgFXsiReSqtkUVg2)) {
                        iReSqtkUVguKSiReSqtkUVg.a(((iReSqtkUVgxxliReSqtkUVg)object).a(), ((iReSqtkUVgxxliReSqtkUVg)object).b(), ((iReSqtkUVgxxliReSqtkUVg)object).a() + ((iReSqtkUVgxxliReSqtkUVg)object).c(), ((iReSqtkUVgxxliReSqtkUVg)object).b() + ((iReSqtkUVgxxliReSqtkUVg)object).d(), 1.0, 1.0, 1.0, 0.3);
                    }
                }
            }
            this.q.a_(!bl);
        }
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        this.r.c(d2);
        this.s.c(-16.0);
        this.w.c(-16.0);
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.v.d(d2);
        this.r.d(d2);
        this.s.d(d2 - 1.5);
        this.w.d(d2 - 1.5);
    }

    public void F() {
        this.t.a_(this.F != 0.0);
        this.u.a_(this.t.h());
        if (this.D) {
            if (this.H != iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class).d) {
                this.H = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class).d;
                this.F = this.E ? (this.F -= 6.0) : (this.F += 6.0);
            }
            this.F = this.E ? 0.0 : 100.0;
        }
    }

    @Override
    public void c_() {
        super.c_();
        this.F();
        if (this.p) {
            this.w.c_();
        }
        if (this.f_()) {
            double d2 = this.c() + (double)this.u();
            double d3 = this.e_() + (double)this.v();
            if (Keyboard.isKeyDown((int)42)) {
                for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.m().d()) {
                    if (!iReSqtkUVgCMeiReSqtkUVg2.h() || iReSqtkUVgCMeiReSqtkUVg2.equals(this) || !(d2 + this.k() >= iReSqtkUVgCMeiReSqtkUVg2.c()) || !(d2 <= iReSqtkUVgCMeiReSqtkUVg2.c() + iReSqtkUVgCMeiReSqtkUVg2.k()) || !(d3 + this.l() >= iReSqtkUVgCMeiReSqtkUVg2.e_()) || !(d3 <= iReSqtkUVgCMeiReSqtkUVg2.e_() + iReSqtkUVgCMeiReSqtkUVg2.l())) continue;
                    return;
                }
            }
            this.a_(d2);
            this.b(d3);
        }
    }

    @Override
    public boolean f_() {
        return this.A;
    }

    @Override
    public void b_(boolean bl) {
        this.A = bl;
    }

    @Override
    public boolean h_() {
        return !this.t.h();
    }

    @Override
    public void c_(boolean bl) {
        this.D = true;
        this.E = bl;
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.J().o()) {
            for (iReSqtkUVgBuwiReSqtkUVg iReSqtkUVgBuwiReSqtkUVg2 : iReSqtkUVgnCWiReSqtkUVg2.g()) {
                iReSqtkUVgBuwiReSqtkUVg2.a(!bl);
            }
        }
    }

    public boolean G() {
        return this.B && this.p;
    }

    public void f(boolean bl) {
        this.B = bl;
    }

    public boolean H() {
        return this.C;
    }

    public void g(boolean bl) {
        this.C = bl;
        this.a_(!bl);
    }

    public iReSqtkUVgilmiReSqtkUVg I() {
        return this.r;
    }

    public iReSqtkUVgnCWiReSqtkUVg c(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        this.t.a(iReSqtkUVgnCWiReSqtkUVg2);
        return iReSqtkUVgnCWiReSqtkUVg2;
    }

    public iReSqtkUVgnCWiReSqtkUVg[] b(iReSqtkUVgnCWiReSqtkUVg[] arriReSqtkUVgnCWiReSqtkUVg) {
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : arriReSqtkUVgnCWiReSqtkUVg) {
            this.t.a(iReSqtkUVgnCWiReSqtkUVg2);
        }
        return arriReSqtkUVgnCWiReSqtkUVg;
    }

    public iReSqtkUVgwgUiReSqtkUVg J() {
        return this.t;
    }

    public List<iReSqtkUVgnCWiReSqtkUVg> K() {
        return this.G;
    }

    public iReSqtkUVgwgUiReSqtkUVg L() {
        return this.q;
    }

    public Color a(Color color, iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2, boolean bl, float f) {
        Object object;
        ArrayList<iReSqtkUVgnCWiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgnCWiReSqtkUVg>();
        if (iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgpqqiReSqtkUVg) {
            object = (iReSqtkUVgpqqiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2;
            if (!object.b() && ((iReSqtkUVgpqqiReSqtkUVg)object).h_()) {
                return iReSqtkUVgnCWiReSqtkUVg2.m();
            }
            arrayList.addAll(((iReSqtkUVgpqqiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).F().o());
        } else if (iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgCMeiReSqtkUVg) {
            arrayList.addAll(((iReSqtkUVgCMeiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).J().o());
        } else if (iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgRjOiReSqtkUVg) {
            arrayList.addAll(((iReSqtkUVgRjOiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).o());
        }
        if (arrayList.isEmpty()) {
            return color;
        }
        object = new float[3];
        object = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), (float[])object);
        Color color2 = color;
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 : arrayList) {
            if (iReSqtkUVgnCWiReSqtkUVg3.y()) {
                if (bl) {
                    if ((f -= 0.025f) <= 0.0f) {
                        f = 1.0f;
                    }
                    object[0] = f;
                    color2 = new Color(Color.HSBtoRGB(f, (float)object[1], (float)object[2]));
                }
                iReSqtkUVgnCWiReSqtkUVg3.a(color2);
            }
            if (!iReSqtkUVgnCWiReSqtkUVg3.h()) continue;
            color2 = this.a(color2, iReSqtkUVgnCWiReSqtkUVg3, bl, f);
        }
        return color2;
    }

    public Color a(Color color, boolean bl) {
        if (this.o().size() <= 0) {
            return color;
        }
        float[] arrf = new float[3];
        arrf = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), arrf);
        return this.a(color, this, bl, arrf[0]);
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("x") != null && !jsonObject.get("x").isJsonNull()) {
            this.a_(jsonObject.get("x").getAsDouble());
        }
        if (jsonObject.get("y") != null && !jsonObject.get("y").isJsonNull()) {
            this.b(jsonObject.get("y").getAsDouble());
        }
        if (jsonObject.get("minimized") != null && !jsonObject.get("minimized").isJsonNull()) {
            this.c_(jsonObject.get("minimized").getAsBoolean());
        }
        if (jsonObject.get("visible") != null && !jsonObject.get("visible").isJsonNull()) {
            this.a_(jsonObject.get("visible").getAsBoolean());
        }
        if (jsonObject.get("pinned") != null && !jsonObject.get("pinned").isJsonNull()) {
            this.f(jsonObject.get("pinned").getAsBoolean());
        }
        if (jsonObject.get("hidden2") != null && !jsonObject.get("hidden2").isJsonNull() && this.K != null) {
            this.K.J().b(!jsonObject.get("hidden2").getAsBoolean());
        }
    }

    public JsonObject M() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", this.I().D());
        jsonObject.addProperty("x", (Number)this.c());
        jsonObject.addProperty("y", (Number)this.e_());
        jsonObject.addProperty("minimized", Boolean.valueOf(this.h_()));
        jsonObject.addProperty("visible", Boolean.valueOf(this.h()));
        if (this.p) {
            jsonObject.addProperty("pinned", Boolean.valueOf(this.G()));
        }
        if (this.K != null) {
            jsonObject.addProperty("hidden2", Boolean.valueOf(!this.K.J().b()));
        }
        return jsonObject;
    }

    @Override
    public String N() {
        return this.I().D();
    }

    @Override
    public void a_(boolean bl) {
        super.a_(bl);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.J().o()) {
            for (iReSqtkUVgBuwiReSqtkUVg iReSqtkUVgBuwiReSqtkUVg2 : iReSqtkUVgnCWiReSqtkUVg2.g()) {
                iReSqtkUVgBuwiReSqtkUVg2.a(bl);
            }
        }
    }

    public void h(boolean bl) {
        this.I = bl;
    }

    public boolean O() {
        return this.J;
    }

    public void i(boolean bl) {
        this.J = bl;
    }

    public double a(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        return (double)iReSqtkUVgdAbiReSqtkUVg2.e() - this.k() * 0.25;
    }

    public double b(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        return -(this.k() * 0.75);
    }

    public boolean c(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        double d2 = this.a(iReSqtkUVgdAbiReSqtkUVg2);
        return this.c() > d2;
    }

    public double d(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        double d2 = this.a(iReSqtkUVgdAbiReSqtkUVg2);
        double d3 = this.b(iReSqtkUVgdAbiReSqtkUVg2);
        if (this.c() < d3) {
            return d3;
        }
        if (this.c() > d2) {
            return d2;
        }
        return this.c();
    }

    public void e(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        if (this.c(iReSqtkUVgdAbiReSqtkUVg2)) {
            this.a_(this.d(iReSqtkUVgdAbiReSqtkUVg2));
        }
    }

    public double f(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        return -(this.I().l() * 0.75);
    }

    public double g(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        return (double)iReSqtkUVgdAbiReSqtkUVg2.f() - this.I().l() * 0.5;
    }

    public boolean h(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        double d2 = this.f(iReSqtkUVgdAbiReSqtkUVg2);
        double d3 = this.g(iReSqtkUVgdAbiReSqtkUVg2);
        return this.e_() < d2 || this.e_() > d3;
    }

    public double i(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        double d2 = this.f(iReSqtkUVgdAbiReSqtkUVg2);
        double d3 = this.g(iReSqtkUVgdAbiReSqtkUVg2);
        if (this.e_() < d2) {
            return d2;
        }
        if (this.e_() > d3) {
            return d3;
        }
        return this.e_();
    }

    public void j(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        if (this.h(iReSqtkUVgdAbiReSqtkUVg2)) {
            this.b(this.i(iReSqtkUVgdAbiReSqtkUVg2));
        }
    }

    public iReSqtkUVgFWjiReSqtkUVg P() {
        return this.L;
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        this.L.a(n, n2, n3);
        return super.a(n, n2, n3);
    }

    public void j(boolean bl) {
        this.M = bl;
    }

    public boolean Q() {
        return this.M;
    }

    static /* synthetic */ iReSqtkUVgQBEiReSqtkUVg a(iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2) {
        return iReSqtkUVgCMeiReSqtkUVg2.w;
    }

    static /* synthetic */ iReSqtkUVgilmiReSqtkUVg b(iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2) {
        return iReSqtkUVgCMeiReSqtkUVg2.s;
    }

    static /* synthetic */ iReSqtkUVgwgUiReSqtkUVg c(iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2) {
        return iReSqtkUVgCMeiReSqtkUVg2.q;
    }

    static /* synthetic */ iReSqtkUVgilmiReSqtkUVg d(iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2) {
        return iReSqtkUVgCMeiReSqtkUVg2.r;
    }

    static /* synthetic */ boolean e(iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2) {
        return iReSqtkUVgCMeiReSqtkUVg2.p;
    }
}

