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
import java.util.List;

public class t7 {
    @Expose
    @SerializedName(value="token")
    private String c;
    @Expose
    @SerializedName(value="password")
    private String d;
    @Expose
    @SerializedName(value="username")
    private String e;
    @Expose
    @SerializedName(value="limit")
    private boolean a;
    @Expose
    @SerializedName(value="skin")
    private String b;
    @Expose
    @SerializedName(value="info")
    private List<String> f;

    public String d() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public boolean e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public List<String> a() {
        return this.f;
    }
}

