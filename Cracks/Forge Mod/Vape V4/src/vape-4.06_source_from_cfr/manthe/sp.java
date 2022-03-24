/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public enum sp {
    BLOCK_CHILD("Custom color"),
    RAINBOW("Rainbow"),
    SATURATION("Saturation"),
    VIBRANCE("Vibrance");

    private final String b;

    private sp(String string2) {
        this.b = string2;
    }

    public String a() {
        return this.b;
    }
}

