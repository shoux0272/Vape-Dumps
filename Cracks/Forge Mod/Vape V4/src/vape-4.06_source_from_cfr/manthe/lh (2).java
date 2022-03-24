/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.nio.ByteOrder;
import manthe.Ao;
import manthe.e4;
import manthe.kl;
import manthe.on;

public class lh
extends kl {
    private final e4 e;
    private final float g;
    private final float i;
    private final float f;
    private int h;
    private final int d;

    public lh(Object object, float f10, float f11, float f12, int n6) {
        this.e = new e4(object);
        this.g = f10;
        this.i = f11;
        this.f = f12;
        this.d = n6;
        this.h = 255;
    }

    public void setOpacity(int n6) {
        this.h = n6;
    }

    @Override
    public boolean fire() {
        if (on.p.H().b(Ao.class).N()) {
            int n6;
            int n10;
            int n11;
            on.p.H().b(Ao.class).a(this);
            int n12 = this.e.b(this.d);
            int n13 = this.e.g().get(n12);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                n11 = (int)((float)(n13 & 0xFF) * this.g);
                n10 = (int)((float)(n13 >> 8 & 0xFF) * this.i);
                n6 = (int)((float)(n13 >> 16 & 0xFF) * this.f);
            } else {
                n11 = (int)((float)(n12 >> 24 & 0xFF) * this.g);
                n10 = (int)((float)(n12 >> 16 & 0xFF) * this.i);
                n6 = (int)((float)(n12 >> 8 & 0xFF) * this.f);
            }
            int n14 = 0;
            n14 |= this.h << 24;
            n14 |= n11 << 16;
            n14 |= n10 << 8;
            this.e.g().put(n12, n14 |= n6);
        }
        return super.fire();
    }
}

