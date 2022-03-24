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
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.Dw;
import manthe.o5;

public class Cw
implements Dw {
    @Expose
    @SerializedName(value="accessToken")
    private String c;
    @Expose
    @SerializedName(value="clientToken")
    private String a;
    @Expose
    @SerializedName(value="availableProfiles")
    private List<o5> e;
    @Expose
    @SerializedName(value="selectedProfile")
    private o5 f;
    @Expose
    @SerializedName(value="errorMessage")
    private String b;
    private static int d;

    public String d() {
        return this.c;
    }

    public String g() {
        return this.a;
    }

    public List<o5> a() {
        return this.e;
    }

    public o5 b() {
        return this.f;
    }

    public String h() {
        return this.b;
    }

    public void c() {
        this.b = null;
    }

    public static void b(int n6) {
        d = n6;
    }

    public static int e() {
        return d;
    }

    public static int f() {
        int n6 = Cw.e();
        if (n6 == 0) {
            return 98;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (Cw.f() != 0) {
            Cw.b(97);
        }
    }
}

