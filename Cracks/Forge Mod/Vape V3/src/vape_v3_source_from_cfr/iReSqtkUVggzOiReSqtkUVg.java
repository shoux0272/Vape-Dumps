/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class iReSqtkUVggzOiReSqtkUVg
extends iReSqtkUVgbRmiReSqtkUVg {
    public iReSqtkUVggzOiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.bP, iReSqtkUVgauSiReSqtkUVg.d() == 13 ? 3 : 0);
    }

    @Override
    public void a(Object object) {
        if (Keyboard.isRepeatEvent()) {
            return;
        }
        iReSqtkUVgMDuiReSqtkUVg iReSqtkUVgMDuiReSqtkUVg2 = new iReSqtkUVgMDuiReSqtkUVg(Keyboard.getEventKey(), Keyboard.getEventKeyState());
        iReSqtkUVgMDuiReSqtkUVg2.fire();
    }
}

