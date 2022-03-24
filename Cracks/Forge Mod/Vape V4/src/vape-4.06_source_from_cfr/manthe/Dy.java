/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.util.Random;
import manthe.Ds;
import manthe.sk;

public class Dy
extends Ds<Double[], sk> {
    private final Random l = new Random();

    public Dy(Object object, String string, sk sk2) {
        super(object, string, sk2);
    }

    public static Dy a(Object object, String string, String string2, String string3, String string4, double d10, double d11, double d12, double d13, double d14) {
        sk sk2 = new sk(d13, d10, d14, string3, string4, string2);
        sk2.b(7.0);
        sk2.f(d12);
        sk2.h(d11);
        Dy dy2 = new Dy(object, string, sk2);
        dy2.a(new Double[]{d11, d12});
        sk2.a(dy2);
        return dy2;
    }

    public static Dy a(Object object, String string, String string2, String string3, double d10, double d11, double d12, double d13) {
        sk sk2 = new sk(d13, d10, 0.1, string2, " " + string3, string);
        sk2.b(7.0);
        sk2.f(d12);
        sk2.h(d11);
        Dy dy2 = new Dy(object, string, sk2);
        dy2.a(new Double[]{d11, d12});
        sk2.a(dy2);
        return dy2;
    }

    public static Dy a(Object object, String string, String string2, String string3, double d10, double d11, double d12, double d13, double d14) {
        sk sk2 = new sk(d13, d10, d14, string2, " " + string3, string);
        sk2.b(7.0);
        sk2.f(d12);
        sk2.h(d11);
        Dy dy2 = new Dy(object, string, sk2);
        dy2.a(new Double[]{d11, d12});
        sk2.a(dy2);
        return dy2;
    }

    public static Dy a(Object object, String string, String string2, String string3, double d10, double d11, double d12, double d13, double d14, String string4) {
        sk sk2 = new sk(d13, d10, d14, string2, " " + string3, string);
        sk2.b(7.0);
        sk2.f(d12);
        sk2.h(d11);
        Dy dy2 = new Dy(object, string, sk2);
        sk2.a(dy2);
        dy2.a(new Double[]{d11, d12});
        sk2.b(string4);
        return dy2;
    }

    public Double[] v() {
        return new Double[]{((sk)this.c()).F(), ((sk)this.c()).z()};
    }

    @Override
    public void a(Double[] arrdouble) {
        if (this.b() == null) {
            this.a(arrdouble);
        }
        boolean bl = true;
        if (this.s() == ((Double[])this.b())[0].doubleValue() && this.w() == ((Double[])this.b())[1].doubleValue()) {
            bl = false;
        }
        if (bl) {
            ((sk)this.c()).h(arrdouble[0]);
            ((sk)this.c()).f(arrdouble[1]);
        } else {
            ((sk)this.c()).g(arrdouble[0]);
            ((sk)this.c()).i(arrdouble[1]);
        }
        this.d();
    }

    @Override
    public void a(String string) {
    }

    @Override
    public JsonObject m() {
        JsonObject jsonObject = super.m();
        jsonObject.remove("value");
        jsonObject.addProperty("minimum", (Number)this.v()[0]);
        jsonObject.addProperty("maximum", (Number)this.v()[1]);
        return jsonObject;
    }

    @Override
    public boolean a(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.e())) {
            if (!jsonObject.has("minimum")) {
                return false;
            }
            double d10 = jsonObject.get("minimum").getAsDouble();
            double d11 = jsonObject.get("maximum").getAsDouble();
            this.a(new Double[]{d10, d11});
            return true;
        }
        return false;
    }

    public String r() {
        return ((sk)this.c()).B().b(this.v()[0]);
    }

    public String u() {
        return ((sk)this.c()).B().b(this.v()[1]);
    }

    public double t() {
        double d10 = this.v()[0];
        double d11 = this.v()[1];
        return d10 + (d11 - d10) * this.l.nextDouble();
    }

    public double s() {
        return this.v()[0];
    }

    public double w() {
        return this.v()[1];
    }
}

