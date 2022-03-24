/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.util.ArrayList;
import java.util.Collections;
import manthe.ok;
import manthe.on;
import manthe.uU;
import manthe.zu;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

class oc
extends Thread {
    final ok a;

    private oc(ok ok2) {
        this.a = ok2;
    }

    @Override
    public void run() {
        zu zu2 = on.p.H().b(zu.class);
        this.a.a("Press a key");
        long l = Keyboard.getEventNanoseconds();
        long l6 = Mouse.getEventNanoseconds();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n6 = -1;
        int n10 = -1;
        while (true) {
            int n11;
            if (Thread.interrupted()) {
                return;
            }
            if (n6 != -1 && !Keyboard.isKeyDown((int)n6) || n10 != -1 && !Mouse.isButtonDown((int)n10) || arrayList.size() >= 3) break;
            if (l != Keyboard.getEventNanoseconds() && !Keyboard.isRepeatEvent() && Keyboard.getEventKeyState()) {
                l = Keyboard.getEventNanoseconds();
                n11 = Keyboard.getEventKey();
                if (arrayList.contains(n11)) continue;
                arrayList.add(n11);
                if (n6 == -1) {
                    n6 = n11;
                }
                if (this.a.a().startsWith("Bound")) {
                    this.a.a(this.a.a() + " + " + Keyboard.getKeyName((int)n11));
                } else {
                    this.a.a("Bound to " + Keyboard.getKeyName((int)n11));
                }
                if (!zu2.y.u().booleanValue()) break;
                Keyboard.next();
                continue;
            }
            Keyboard.next();
            if (Keyboard.isKeyDown((int)42)) continue;
            if (l6 != Mouse.getEventNanoseconds() && Mouse.getEventButtonState()) {
                l6 = Mouse.getEventNanoseconds();
                if (this.a.a().startsWith("Bound")) {
                    this.a.a(this.a.a() + " + M" + (Mouse.getEventButton() + 1));
                } else {
                    this.a.a("Bound to M" + (Mouse.getEventButton() + 1));
                    if (Mouse.getEventButton() == 0) {
                        ok.b(this.a).a(Collections.emptyList());
                        break;
                    }
                }
                n11 = -100 + Mouse.getEventButton();
                if (n10 == -1) {
                    n10 = Mouse.getEventButton();
                }
                if (arrayList.contains(n11)) continue;
                arrayList.add(n11);
                if (!zu2.y.u().booleanValue()) break;
                Mouse.next();
                continue;
            }
            Mouse.next();
        }
        ok.b(this.a).a(arrayList);
        if (ok.c(this.a) != null) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
        }
        this.a.b();
    }

    oc(ok ok2, uU uU2) {
        this(ok2);
    }
}

