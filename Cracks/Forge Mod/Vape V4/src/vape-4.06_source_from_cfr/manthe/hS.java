/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.nio.ByteBuffer;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hS
extends gJ {
    private final BG a = this.a("buttons", false, ByteBuffer.class);
    private final BG e = this.a("readBuffer", false, ByteBuffer.class);
    private static boolean d;

    public hS() {
        super(A5.aJ);
    }

    public ByteBuffer a(Object object) {
        return (ByteBuffer)this.a.f(object);
    }

    private ByteBuffer d() {
        return (ByteBuffer)this.e.f(null);
    }

    static ByteBuffer a(hS hS2) {
        return hS2.d();
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean e() {
        return d;
    }

    public static boolean f() {
        boolean bl = hS.e();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (hS.e()) {
            hS.b(true);
        }
    }
}

