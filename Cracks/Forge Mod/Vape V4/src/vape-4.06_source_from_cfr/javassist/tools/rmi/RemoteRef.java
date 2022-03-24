/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.rmi;

import java.io.Serializable;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;

public class RemoteRef
implements Serializable {
    private static final long serialVersionUID = 1L;
    public int c;
    public String a;
    private static int b;

    public RemoteRef(int n6) {
        this.c = n6;
        this.a = null;
    }

    public RemoteRef(int n6, String string) {
        this.c = n6;
        this.a = string;
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int b() {
        return b;
    }

    public static int a() {
        int n6 = RemoteRef.b();
        if (n6 == 0) {
            return 50;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (RemoteRef.b() != 0) {
            RemoteRef.b(108);
        }
    }
}

