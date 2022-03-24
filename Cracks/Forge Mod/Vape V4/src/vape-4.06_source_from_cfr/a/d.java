/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package a;

import a.Utils;
import manthe.DO;
import manthe.nx;
import manthe.on;
import manthe.r1;
import manthe.zu;
import org.lwjgl.input.Keyboard;

public class d {
    public static Object getGuiObject() {
        return Utils.getGuiObject();
    }

    public static void initGui(Object object) {
        Keyboard.enableRepeatEvents((boolean)true);
        on.p.M().aA.e(object);
        zu zu2 = on.p.H().b(zu.class);
        if (zu2.G.u().booleanValue()) {
            nx.c().f();
        }
    }

    public static void onGuiClosed(Object object) {
        Keyboard.enableRepeatEvents((boolean)false);
        zu zu2 = on.p.H().b(zu.class);
        zu2.b(object);
    }

    public static void updateScreen(Object object) {
        on.p.M().aA.f(object);
    }

    public static void keyTyped(Object object, char c3, int n6) {
        zu zu2 = on.p.H().b(zu.class);
        for (r1 object2 : zu2.Y()) {
            if (!object2.a(c3, n6)) continue;
            return;
        }
        if (zu.W != null) {
            for (DO dO2 : zu.W.r()) {
                dO2.a(c3, n6);
            }
        }
        on.p.M().aA.a(object, c3, n6);
    }

    public static void mouseClicked(Object object, int n6, int n22, int n32) {
        zu zu2 = on.p.H().b(zu.class);
        zu2.a(n6, n22, n32);
        on.p.M().aA.a(object, n6, n22, n32);
    }

    public static void mouseMovedOrUp(Object object, int n6, int n22, int n32) {
        on.p.M().aA.b(object, n6, n22, n32);
    }

    public static void handleMouseInput(Object object) {
        zu zu2 = on.p.H().b(zu.class);
        zu2.aa();
        on.p.M().aA.h(object);
    }

    public static void drawScreen(Object object, int n6, int n22, float f10) {
        on.p.M().aA.a(object, n6, n22, f10);
        zu zu2 = on.p.H().b(zu.class);
        zu2.am();
    }
}

