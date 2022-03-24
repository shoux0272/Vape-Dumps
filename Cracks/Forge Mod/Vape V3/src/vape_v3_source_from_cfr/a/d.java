/*
 * Decompiled with CFR 0.150.
 */
package a;

import a.Utils;

public class d {
    public static Object getGuiObject() {
        return Utils.getGuiObject();
    }

    public static void initGui(Object object) {
        iReSqtkUVgFuiiReSqtkUVg.e.c().d.a(object);
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        if (iReSqtkUVgypOiReSqtkUVg2.e.i().booleanValue()) {
            iReSqtkUVgypOiReSqtkUVg.z();
        }
    }

    public static void onGuiClosed(Object object) {
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        iReSqtkUVgypOiReSqtkUVg2.b(object);
    }

    public static void updateScreen(Object object) {
        iReSqtkUVgFuiiReSqtkUVg.e.c().d.c(object);
    }

    public static void keyTyped(Object object, char c2, int n) {
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : iReSqtkUVgypOiReSqtkUVg2.E()) {
            if (!iReSqtkUVgCMeiReSqtkUVg2.a(c2, n)) continue;
            return;
        }
        if (iReSqtkUVgypOiReSqtkUVg.D() != null && iReSqtkUVgypOiReSqtkUVg.D().a(c2, n)) {
            return;
        }
        iReSqtkUVgFuiiReSqtkUVg.e.c().d.a(object, c2, n);
    }

    public static void mouseClicked(Object object, int n, int n2, int n3) {
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        if (iReSqtkUVgypOiReSqtkUVg.D() != null && iReSqtkUVgypOiReSqtkUVg.D().a(n, n2, n3)) {
            return;
        }
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : iReSqtkUVgypOiReSqtkUVg2.E()) {
            if (iReSqtkUVgCMeiReSqtkUVg2.a(n, n2, n3)) break;
        }
        iReSqtkUVgFuiiReSqtkUVg.e.c().d.a(object, n, n2, n3);
    }

    public static void mouseMovedOrUp(Object object, int n, int n2, int n3) {
        iReSqtkUVgFuiiReSqtkUVg.e.c().d.b(object, n, n2, n3);
    }

    public static void handleMouseInput(Object object) {
    }

    public static void drawScreen(Object object, int n, int n2, float f) {
        iReSqtkUVgFuiiReSqtkUVg.e.c().d.a(object, n, n2, f);
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        iReSqtkUVgypOiReSqtkUVg2.H();
    }
}

