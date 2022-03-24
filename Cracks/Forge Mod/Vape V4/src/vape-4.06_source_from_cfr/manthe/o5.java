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

public class o5 {
    @Expose
    @SerializedName(value="id")
    private String a;
    @Expose
    @SerializedName(value="name")
    private String c;
    @Expose
    @SerializedName(value="legacy")
    private boolean b;

    public String b() {
        return this.a;
    }

    public String a() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }
}

