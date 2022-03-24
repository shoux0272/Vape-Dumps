/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgAIDiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    public iReSqtkUVgAIDiReSqtkUVg() {
        super("Step", new Color(42, 175, 224).getRGB(), iReSqtkUVgqTOiReSqtkUVg.f);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgBvIiReSqtkUVg iReSqtkUVgBvIiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgBvIiReSqtkUVg2.isPre() && !iReSqtkUVgtlXiReSqtkUVg2.n().j() && iReSqtkUVgtlXiReSqtkUVg2.am()) {
            iReSqtkUVgBvIiReSqtkUVg2.a(1.0);
        } else if (!iReSqtkUVgBvIiReSqtkUVg2.isPre() && iReSqtkUVgBvIiReSqtkUVg2.b() > 0.5 && iReSqtkUVgBvIiReSqtkUVg2.a() > 0.0 && !iReSqtkUVgtlXiReSqtkUVg2.n().j() && iReSqtkUVgtlXiReSqtkUVg2.am()) {
            iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgkAWiReSqtkUVg.class).a(-4);
            if (iReSqtkUVgBvIiReSqtkUVg2.b() >= 0.87) {
                double d2 = iReSqtkUVgBvIiReSqtkUVg2.b();
                double d3 = d2 * 0.42;
                double d4 = d2 * 0.75;
                iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgGzHiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A() + d3, iReSqtkUVgtlXiReSqtkUVg2.B(), iReSqtkUVgtlXiReSqtkUVg2.J()));
                iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgGzHiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A() + d4, iReSqtkUVgtlXiReSqtkUVg2.B(), iReSqtkUVgtlXiReSqtkUVg2.J()));
            }
            iReSqtkUVgeLLiReSqtkUVg.z().a(0.45f);
            iReSqtkUVgsQMiReSqtkUVg iReSqtkUVgsQMiReSqtkUVg2 = new iReSqtkUVgsQMiReSqtkUVg(this);
            iReSqtkUVgsQMiReSqtkUVg2.start();
        }
    }
}

