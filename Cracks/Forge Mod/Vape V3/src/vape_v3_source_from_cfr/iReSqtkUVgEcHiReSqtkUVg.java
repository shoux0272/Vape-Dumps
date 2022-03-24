/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgEcHiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    public iReSqtkUVgEcHiReSqtkUVg() {
        super("Anti-FML", 8919359, iReSqtkUVgqTOiReSqtkUVg.f, "Some servers prevent Forge from connecting\nthis will bypass that.\nYou must reconnect to the server inorder for this to work.");
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgaWmiReSqtkUVg iReSqtkUVgaWmiReSqtkUVg2) {
    }

    @Override
    public void a(iReSqtkUVgmTziReSqtkUVg iReSqtkUVgmTziReSqtkUVg2) {
        if (iReSqtkUVgmTziReSqtkUVg2.getPacket().a().getClass().getName().toLowerCase().contains(iReSqtkUVgSzRiReSqtkUVg.cY)) {
            iReSqtkUVgmTziReSqtkUVg2.setCanceled(true);
        }
    }
}

