/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cv;
import manthe.dX;
import manthe.kO;
import manthe.l9;

public class lw
extends l9 {
    private dX f;

    public lw(cv cv2, dX dX2) {
        super(cv2);
        this.f = dX2;
    }

    public dX getGui() {
        return this.f;
    }

    public void setGui(dX dX2) {
        this.f = dX2;
    }

    @Override
    public boolean fire() {
        return new kO(this.f.a()).fire();
    }
}

