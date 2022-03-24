/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Objects;

class oS {
    String a;
    int b;

    public oS(String string, int n6) {
        this.a = string;
        this.b = n6;
    }

    public String b() {
        return this.a;
    }

    public int a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object instanceof oS) {
            return ((oS)object).b().equals(this.b()) && ((oS)object).a() == this.a();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.b(), this.a());
    }
}

