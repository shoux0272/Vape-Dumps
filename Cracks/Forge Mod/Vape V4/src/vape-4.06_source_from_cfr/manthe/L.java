/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;

public class L
extends Color {
    private int b = super.getRed();
    private int c = super.getGreen();
    private int a = super.getBlue();
    private int d;

    public L(int n6) {
        super(n6);
        this.d = 255;
    }

    public L(Color color) {
        super(color.getRGB(), true);
        this.d = super.getAlpha();
    }

    public L(int n6, int n10, int n11, int n12) {
        super(n6, n10, n11, n12);
        this.d = super.getAlpha();
    }

    @Override
    public int getRed() {
        return this.b;
    }

    @Override
    public int getGreen() {
        return this.c;
    }

    @Override
    public int getBlue() {
        return this.a;
    }

    @Override
    public int getAlpha() {
        return this.d;
    }

    public void c(int n6) {
        this.b = n6;
    }

    public void b(int n6) {
        this.c = n6;
    }

    public void a(int n6) {
        this.a = n6;
    }

    public void d(int n6) {
        this.d = n6;
    }

    public void a(Color color) {
        this.b = color.getRed();
        this.c = color.getGreen();
        this.a = color.getBlue();
        this.d = color.getAlpha();
    }

    public int a() {
        return (this.d & 0xFF) << 24 | (this.b & 0xFF) << 16 | (this.c & 0xFF) << 8 | (this.a & 0xFF) << 0;
    }
}

