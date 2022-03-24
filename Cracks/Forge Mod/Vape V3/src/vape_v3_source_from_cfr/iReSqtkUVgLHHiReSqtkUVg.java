/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgLHHiReSqtkUVg {
    public static int a(Color color) {
        return iReSqtkUVgLHHiReSqtkUVg.a(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static int a(int n) {
        return iReSqtkUVgLHHiReSqtkUVg.a(n, n, n, 255);
    }

    public static int a(int n, int n2) {
        return iReSqtkUVgLHHiReSqtkUVg.a(n, n, n, n2);
    }

    public static int a(int n, int n2, int n3) {
        return iReSqtkUVgLHHiReSqtkUVg.a(n, n2, n3, 255);
    }

    public static int a(int n, int n2, int n3, int n4) {
        int n5 = 0;
        n5 |= iReSqtkUVgKexiReSqtkUVg.a(n4, 0, 255) << 24;
        n5 |= iReSqtkUVgKexiReSqtkUVg.a(n, 0, 255) << 16;
        n5 |= iReSqtkUVgKexiReSqtkUVg.a(n2, 0, 255) << 8;
        return n5 |= iReSqtkUVgKexiReSqtkUVg.a(n3, 0, 255);
    }
}

