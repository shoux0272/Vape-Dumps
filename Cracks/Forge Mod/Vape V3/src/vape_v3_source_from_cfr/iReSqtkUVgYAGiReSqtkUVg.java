/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class iReSqtkUVgYAGiReSqtkUVg
extends iReSqtkUVgncDiReSqtkUVg {
    public iReSqtkUVgYAGiReSqtkUVg(iReSqtkUVgfipiReSqtkUVg iReSqtkUVgfipiReSqtkUVg2, int n) {
        super(iReSqtkUVgfipiReSqtkUVg2);
        this.a = n;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (iReSqtkUVgJZmiReSqtkUVg2 instanceof iReSqtkUVgypOiReSqtkUVg) {
                ((iReSqtkUVgypOiReSqtkUVg)iReSqtkUVgJZmiReSqtkUVg2).b(this);
            }
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        if (Keyboard.isKeyDown((int)29) && Keyboard.isKeyDown((int)199) && this.a == 1) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgXoiiReSqtkUVg.class).a(true);
        }
        return this.isCanceled();
    }
}

