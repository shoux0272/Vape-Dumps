/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Objects;
import manthe.fk;
import manthe.vq;

class to {
    int b;
    int a;
    private boolean c;

    private to(int n6, int n10) {
        this.b = n6;
        this.a = n10;
        this.c = n6 == 0 || fk.a(n6).e();
    }

    boolean a() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        to to2 = (to)object;
        return this.b == to2.b && this.a == to2.a;
    }

    public int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public String toString() {
        return "BlockData{id=" + this.b + ", meta=" + this.a + '}';
    }

    to(int n6, int n10, vq vq2) {
        this(n6, n10);
    }
}

