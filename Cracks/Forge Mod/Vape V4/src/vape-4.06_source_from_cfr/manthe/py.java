/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Queue;
import manthe.Ab;
import manthe.n3;
import manthe.u3;

class py {
    private final u3 a;
    private final int b;
    private final int c;

    private py(u3 u32, int n6, int n10) {
        this.a = u32;
        this.b = n6;
        this.c = n10;
    }

    public void a(int n6, Queue<n3> queue) {
        if (this.a == u3.MOVE) {
            queue.add(new n3(n6, this.b, 0, 0));
            queue.add(new n3(n6, this.c, 0, 0));
        } else if (this.a == u3.SHIFTCLICK) {
            queue.add(new n3(n6, this.b, 0, 1));
        } else if (this.a == u3.SWAP) {
            queue.add(new n3(n6, this.b, 0, 0));
            queue.add(new n3(n6, this.c, 0, 0));
            queue.add(new n3(n6, this.b, 0, 0));
        } else if (this.a == u3.CLICK) {
            queue.add(new n3(n6, this.b, 0, 0));
        }
    }

    py(u3 u32, int n6, int n10, Ab ab2) {
        this(u32, n6, n10);
    }
}

