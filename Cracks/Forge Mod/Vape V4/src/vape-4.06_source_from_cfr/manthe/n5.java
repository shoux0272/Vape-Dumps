/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Objects;

public class n5 {
    private final int a;
    private final int b;
    private final int d;
    private static String c;

    public n5(int n6, int n10, int n11) {
        this.a = n6;
        this.b = n10;
        this.d = n11;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        n5 n52 = (n5)object;
        return this.a == n52.a && this.b == n52.b && this.d == n52.d;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.d);
    }

    public static void b(String string) {
        c = string;
    }

    public static String b() {
        return c;
    }

    static {
        if (n5.b() != null) {
            n5.b("sf1MAb");
        }
    }
}

