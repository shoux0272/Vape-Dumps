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
import manthe.AF;
import manthe.p2;

public class qA
implements p2 {
    @Expose
    @SerializedName(value="agent")
    private final AF b;
    @Expose
    @SerializedName(value="username")
    private final String a;
    @Expose
    @SerializedName(value="password")
    private final String c;
    @Expose(serialize=false, deserialize=false)
    @SerializedName(value="clientToken")
    private final String d;

    public qA(String string, String string2) {
        this(string, string2, "", new AF());
    }

    public qA(String string, String string2, AF aF) {
        this(string, string2, "", aF);
    }

    public qA(String string, String string2, String string3) {
        this(string, string2, string3, new AF());
    }

    public qA(String string, String string2, String string3, AF aF) {
        this.b = aF;
        this.a = string;
        this.c = string2;
        this.d = string3;
    }
}

