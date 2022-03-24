/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package manthe;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AF {
    @Expose
    @SerializedName(value="name")
    private final String a;
    @Expose
    @SerializedName(value="version")
    private final int b;

    public AF() {
        this("Minecraft", 1);
    }

    public AF(String string, int n6) {
        this.a = string;
        this.b = n6;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}

