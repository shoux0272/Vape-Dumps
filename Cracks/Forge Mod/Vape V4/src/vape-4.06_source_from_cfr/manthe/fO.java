/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import manthe.cy;
import manthe.f1;
import manthe.fn;
import manthe.gN;
import manthe.jQ;

public class fO
extends cy {
    public fO(Object object) {
        super(object);
    }

    public gN j() {
        return new gN(jQ.e(fO.a.M().ao, this.b));
    }

    public f1 k() {
        return new f1(jQ.b(fO.a.M().ao, this.b));
    }

    public Queue f() {
        return jQ.a(fO.a.M().ao, this.b);
    }

    public Queue i() {
        return jQ.d(fO.a.M().ao, this.b);
    }

    public void h() {
        jQ.f(fO.a.M().ao, this.b);
    }

    public void a(fn fn2, Object[] arrobject) {
        jQ.a(fO.a.M().ao, this.b, fn2.a(), arrobject);
    }

    public ReentrantReadWriteLock g() {
        return jQ.c(fO.a.M().ao, this.b);
    }
}

