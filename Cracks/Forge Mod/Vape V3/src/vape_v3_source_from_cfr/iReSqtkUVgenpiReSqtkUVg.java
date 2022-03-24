/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.nio.ByteBuffer;
import org.lwjgl.input.Mouse;

public class iReSqtkUVgenpiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b = this.b("buttons", false, ByteBuffer.class);

    public iReSqtkUVgenpiReSqtkUVg() {
        super(Mouse.class);
    }

    public ByteBuffer a(Object object) {
        return (ByteBuffer)this.b.h(object);
    }
}

