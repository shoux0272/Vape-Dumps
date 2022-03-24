/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cv;
import manthe.dk;
import manthe.ki;
import manthe.l9;

public class lZ
extends l9 {
    private final dk f;

    public lZ(cv cv2) {
        super(cv2);
        this.f = new dk(cv2);
    }

    @Override
    public boolean fire() {
        return new ki(this.f.g(), this.f.i()).fire();
    }
}

