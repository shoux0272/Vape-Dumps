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

public class qd {
    @Expose
    @SerializedName(value="username")
    private String a;
    @Expose
    @SerializedName(value="hasLicense")
    private boolean b;
    @Expose
    @SerializedName(value="licenseType")
    private String c;
    @Expose
    @SerializedName(value="expires")
    private String d;

    public final String b() {
        return this.a;
    }

    public final boolean a() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }
}

