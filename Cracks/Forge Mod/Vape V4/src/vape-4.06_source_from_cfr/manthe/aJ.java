/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Objects;

class aJ {
    private int b;
    private int a;

    public aJ(int n6, int n10) {
        this.b = n6;
        this.a = n10;
    }

    public int b() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof aJ) {
            return ((aJ)object).b() == this.b() && ((aJ)object).a() == this.a();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.b(), this.a());
    }
}

