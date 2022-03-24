/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  iReSqtkUVgalqiReSqtkUVg
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import java.util.ArrayList;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

class iReSqtkUVgkJbiReSqtkUVg
extends Thread {
    final /* synthetic */ iReSqtkUVgRyMiReSqtkUVg a;

    private iReSqtkUVgkJbiReSqtkUVg(iReSqtkUVgRyMiReSqtkUVg iReSqtkUVgRyMiReSqtkUVg2) {
        this.a = iReSqtkUVgRyMiReSqtkUVg2;
    }

    @Override
    public void run() {
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        this.a.a("Press a key");
        long l = Keyboard.getEventNanoseconds();
        long l2 = Mouse.getEventNanoseconds();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = -1;
        int n2 = -1;
        while (true) {
            int n3;
            if (Thread.interrupted()) {
                return;
            }
            if (n != -1 && !Keyboard.isKeyDown((int)n) || n2 != -1 && !Mouse.isButtonDown((int)n2) || arrayList.size() >= 3) break;
            if (l != Keyboard.getEventNanoseconds() && !Keyboard.isRepeatEvent() && Keyboard.getEventKeyState()) {
                l = Keyboard.getEventNanoseconds();
                n3 = Keyboard.getEventKey();
                if (arrayList.contains(n3)) continue;
                arrayList.add(n3);
                if (n == -1) {
                    n = n3;
                }
                if (this.a.c().startsWith("Bound")) {
                    this.a.a(this.a.c() + " + " + Keyboard.getKeyName((int)n3));
                } else {
                    this.a.a("Bound to " + Keyboard.getKeyName((int)n3));
                }
                if (!iReSqtkUVgypOiReSqtkUVg2.g.i().booleanValue()) break;
                Keyboard.next();
                continue;
            }
            Keyboard.next();
            if (Keyboard.isKeyDown((int)42)) continue;
            if (l2 != Mouse.getEventNanoseconds() && Mouse.getEventButtonState()) {
                l2 = Mouse.getEventNanoseconds();
                if (this.a.c().startsWith("Bound")) {
                    this.a.a(this.a.c() + " + M" + (Mouse.getEventButton() + 1));
                } else {
                    this.a.a("Bound to M" + (Mouse.getEventButton() + 1));
                }
                n3 = -100 + Mouse.getEventButton();
                if (n2 == -1) {
                    n2 = Mouse.getEventButton();
                }
                if (arrayList.contains(n3)) continue;
                arrayList.add(n3);
                if (!iReSqtkUVgypOiReSqtkUVg2.g.i().booleanValue()) break;
                Mouse.next();
                continue;
            }
            Mouse.next();
        }
        iReSqtkUVgRyMiReSqtkUVg.a(this.a).a(arrayList);
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        this.a.a();
    }

    /* synthetic */ iReSqtkUVgkJbiReSqtkUVg(iReSqtkUVgRyMiReSqtkUVg iReSqtkUVgRyMiReSqtkUVg2, iReSqtkUVgalqiReSqtkUVg iReSqtkUVgalqiReSqtkUVg2) {
        this(iReSqtkUVgRyMiReSqtkUVg2);
    }
}

