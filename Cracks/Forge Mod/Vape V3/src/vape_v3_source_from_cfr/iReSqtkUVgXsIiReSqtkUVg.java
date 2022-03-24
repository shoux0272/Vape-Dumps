/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class iReSqtkUVgXsIiReSqtkUVg {
    private static final Random a = new Random();

    public static int a(int n, int n2) {
        int n3 = n2 - n;
        return n3 <= 0 ? n : a.nextInt(n3) + n + 1;
    }

    public static int a(iReSqtkUVgfXGiReSqtkUVg iReSqtkUVgfXGiReSqtkUVg2) {
        return iReSqtkUVgXsIiReSqtkUVg.a(iReSqtkUVgfXGiReSqtkUVg2.i()[0].intValue(), iReSqtkUVgfXGiReSqtkUVg2.i()[1].intValue());
    }
}

