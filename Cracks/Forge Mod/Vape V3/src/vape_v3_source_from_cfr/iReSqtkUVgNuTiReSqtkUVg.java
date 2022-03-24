/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import org.lwjgl.input.Mouse;

public class iReSqtkUVgNuTiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    public iReSqtkUVgNuTiReSqtkUVg() {
        super("AutoTool", 6485058, iReSqtkUVgqTOiReSqtkUVg.g, "Automatically swaps your hand to the appropriate tool.");
    }

    @Override
    public void q() {
        if (iReSqtkUVgeLLiReSqtkUVg.l().b() || !Mouse.isButtonDown((int)0) || iReSqtkUVgeLLiReSqtkUVg.f().c()) {
            return;
        }
        iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.l();
        if (iReSqtkUVgVjsiReSqtkUVg2.d().b() && !iReSqtkUVgVjsiReSqtkUVg2.f().equals(iReSqtkUVgYCPiReSqtkUVg.d())) {
            iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVgVjsiReSqtkUVg2.j();
            float f = 1.0f;
            int n = -1;
            iReSqtkUVgMECiReSqtkUVg iReSqtkUVgMECiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().ba();
            for (int i = 44; i >= 9; --i) {
                iReSqtkUVgnGEiReSqtkUVg iReSqtkUVgnGEiReSqtkUVg2;
                iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgMECiReSqtkUVg2.a(i).d();
                if (iReSqtkUVgyetiReSqtkUVg2.b()) continue;
                float f2 = iReSqtkUVgyetiReSqtkUVg2.a(iReSqtkUVgVjsiReSqtkUVg2.g(), iReSqtkUVgVjsiReSqtkUVg2.h(), iReSqtkUVgVjsiReSqtkUVg2.i());
                iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e();
                if (iReSqtkUVgLUhiReSqtkUVg2.c() && iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.aX) && (iReSqtkUVgnGEiReSqtkUVg2 = new iReSqtkUVgnGEiReSqtkUVg(iReSqtkUVgLUhiReSqtkUVg2)).d().equals(iReSqtkUVgoqniReSqtkUVg.d())) {
                    f2 = 1.5f;
                }
                if (!(f2 > f)) continue;
                f = f2;
                n = i;
            }
            if (n >= 36 && n <= 44) {
                iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(n - 36);
            }
        } else if (iReSqtkUVgVjsiReSqtkUVg2.d().c()) {
            float f = 1.0f;
            int n = -1;
            iReSqtkUVgMECiReSqtkUVg iReSqtkUVgMECiReSqtkUVg3 = iReSqtkUVgeLLiReSqtkUVg.e().ba();
            for (int i = 44; i >= 9; --i) {
                float f3;
                iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg3 = iReSqtkUVgMECiReSqtkUVg3.a(i).d();
                if (iReSqtkUVgyetiReSqtkUVg3.b() || !((f3 = (float)iReSqtkUVgVUTiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg3)) > f)) continue;
                f = f3;
                n = i;
            }
            if (n >= 36 && n <= 44) {
                iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(n - 36);
            }
        }
    }

    @Override
    public void g() {
        this.a(50L, true);
    }
}

