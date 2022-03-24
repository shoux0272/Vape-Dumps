/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import java.io.File;
import java.io.FileOutputStream;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.fw;
import manthe.g2;
import manthe.on;
import manthe.qa;
import manthe.vp;
import manthe.y;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public abstract class u2
implements g2 {
    protected Class b;
    protected byte[] c;
    protected byte[] d;
    private boolean a;
    protected ClassNode e;
    private static cy[] f;

    public u2(Class class_) {
        if (!on.p.h()) {
            fw.f().h().put(class_.getName(), class_);
        }
        this.b = class_;
        this.c = a.a.gcb(class_);
        this.d = new byte[this.c.length];
        System.arraycopy(this.c, 0, this.d, 0, this.c.length);
        ClassReader classReader = new ClassReader(this.c);
        this.e = new ClassNode();
        classReader.accept(this.e, 0);
    }

    @Override
    public abstract void c();

    @Override
    public void d() {
    }

    public void h() {
        int n6 = 3;
        if (V.c() >= 23) {
            n6 = 2;
        }
        ClassWriter classWriter = new ClassWriter(n6);
        this.e.accept(classWriter);
        this.d = classWriter.toByteArray();
    }

    public void a(String string) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(string));
            fileOutputStream.write(this.d);
            fileOutputStream.close();
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    @Override
    public void a() {
        this.h();
        int n6 = a.a.scb(this.b, this.d);
    }

    @Override
    public void b() {
        a.a.scb(this.b, this.c);
    }

    @Override
    public boolean e() {
        return this.a;
    }

    @Override
    public Class f() {
        return this.b;
    }

    public void a(bP bP2, Class class_, y ... arry) {
        vp vp2 = new vp(0, class_, this.e, new qa(bP2.d(), bP2.b()), bP2.c(), arry);
        vp2.a();
        vp2.b();
    }

    public void b(bP bP2, Class class_, y ... arry) {
        vp vp2 = new vp(-1, class_, this.e, new qa(bP2.d(), bP2.b()), bP2.c(), arry);
        vp2.a();
        vp2.b();
    }

    public static void b(cy[] arrcy) {
        f = arrcy;
    }

    public static cy[] g() {
        return f;
    }

    static {
        if (u2.g() != null) {
            u2.b(new cy[4]);
        }
    }
}

