/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javassist.ByteArrayClassPath;
import javassist.CannotCompileException;
import javassist.ClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.LoaderClassPath;
import javassist.NotFoundException;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.bP;
import manthe.cg;
import manthe.cy;
import manthe.fw;
import manthe.g2;
import manthe.on;
import manthe.u2;

public abstract class th
implements g2 {
    static ClassPool a = ClassPool.getDefault();
    static List<Class> d = new ArrayList<Class>();
    static int g = 0;
    protected Class b;
    protected byte[] e;
    protected byte[] f;
    private CtClass c;
    private boolean h;

    public th(Class class_) {
        block2: {
            this.b = class_;
            cy[] arrcy = u2.g();
            this.e = a.a.gcb(class_);
            if (arrcy == null) {
                if (!on.p.h()) {
                    fw.f().h().put(class_.getName(), class_);
                }
                this.h();
                this.c.defrost();
                th.a(new LoaderClassPath(class_.getClassLoader()), class_);
            }
            if (!cy.b()) break block2;
            u2.b(new cy[1]);
        }
    }

    public static void a(ClassPath classPath, Class class_) {
        if (d.contains(class_)) {
            return;
        }
        d.add(class_);
        a.insertClassPath(classPath);
    }

    public static void b(Class class_) {
        if (class_ == null) {
            return;
        }
        if (d.contains(class_)) {
            return;
        }
        th.a(new ByteArrayClassPath(class_.getName(), a.a.gcb(class_)), class_);
        if (class_.getSuperclass() != null && class_.getSuperclass() != Object.class) {
            th.b(class_.getSuperclass());
        }
    }

    public static void a(Class class_) {
        if (class_ == null) {
            return;
        }
        if (d.contains(class_)) {
            return;
        }
        th.a(new ByteArrayClassPath(class_.getName(), a.a.gcb(class_)), class_);
        if (class_.getSuperclass() != null && class_.getSuperclass() != Object.class) {
            th.a(class_.getSuperclass());
        }
    }

    public static void c(Class class_) {
        if (!on.p.h()) {
            a.a.gcb(class_);
            String string = class_.getName();
            Set set = fw.f().g();
            set.remove(string);
            fw.f().h().put(string, class_);
            if (class_.getSuperclass() != null && class_.getSuperclass() != Object.class) {
                th.c(class_.getSuperclass());
            }
        }
    }

    @Override
    public abstract void c();

    public void a(String string) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(string));
            fileOutputStream.write(this.f);
            fileOutputStream.close();
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    public void g() {
    }

    @Override
    public boolean e() {
        return this.h;
    }

    @Override
    public void a() {
        block3: {
            int n6;
            cy[] arrcy = u2.g();
            th th2 = this;
            if (arrcy == null) {
                if (th2.f == null) {
                    return;
                }
                th2 = this;
            }
            if ((n6 = a.a.scb(th2.b, this.f)) != 0) {
                // empty if block
            }
            if (n6 != 0) break block3;
            this.h = true;
        }
    }

    @Override
    public void b() {
        int n6 = a.a.scb(this.b, this.e);
    }

    @Override
    public Class f() {
        return this.b;
    }

    public CtClass h() {
        try {
            this.c = a.makeClass(new ByteArrayInputStream(this.e), false);
            return this.c;
        }
        catch (IOException iOException) {
            on.a(iOException);
            return null;
        }
    }

    public CtClass d(Class class_) {
        try {
            return a.get(class_.getName());
        }
        catch (NotFoundException notFoundException) {
            on.a(notFoundException);
            return null;
        }
    }

    public String a(Class class_, String string, String string2, String string3, String string4) {
        String string5 = class_.getName() + " " + string + " = new " + class_.getName() + "(" + string2 + ");\n";
        string5 = string5 + "if(" + string + ".fire()) { return " + string3 + "; } " + string4;
        string5 = "{ " + string5 + " }";
        cy[] arrcy = u2.g();
        if (arrcy != null) {
            cy.b(!cy.b());
        }
        return string5;
    }

    public CtMethod b(bP bP2) {
        try {
            return this.c.getMethod(bP2.d(), bP2.b());
        }
        catch (NotFoundException notFoundException) {
            on.a(notFoundException);
            return null;
        }
    }

    public String a(CtMethod ctMethod, Class class_, String string, boolean bl, String string2, String string3) {
        th.c(class_);
        th.a(class_);
        String string4 = "";
        try {
            string4 = "event" + ++g;
            string3 = string3.replace("$event", string4);
            ctMethod.addLocalVariable(string4, this.d(class_));
            String string5 = this.a(class_, string4, string, string2, string3);
            if (bl) {
                ctMethod.insertBefore(string5);
            } else {
                ctMethod.insertAfter(string5);
            }
        }
        catch (CannotCompileException cannotCompileException) {
            on.a(cannotCompileException);
        }
        this.c.defrost();
        return string4;
    }

    public void a(cg cg2) {
        th.c(cg2.e());
        th.a(cg2.e());
        try {
            CtMethod ctMethod = this.b(cg2.a());
            if (cg2.c()) {
                ctMethod.insertBefore(cg2.b());
            } else {
                ctMethod.insertAfter(cg2.b());
            }
        }
        catch (CannotCompileException cannotCompileException) {
            on.a(cannotCompileException);
        }
        this.c.defrost();
    }

    public void c(bP bP2) {
        CtMethod ctMethod = this.b(bP2);
        try {
            ctMethod.insertBefore("System.out.println(\"test\");");
        }
        catch (CannotCompileException cannotCompileException) {
            on.a(cannotCompileException);
        }
    }

    public String b(CtMethod ctMethod, Class class_, String string, String string2, String string3) {
        return this.a(ctMethod, class_, string, true, string2, string3);
    }

    public String a(CtMethod ctMethod, Class class_, String string, String string2, String string3) {
        return this.a(ctMethod, class_, string, false, string2, string3);
    }

    public String a(bP bP2, Class class_, String string) {
        return this.b(this.b(bP2), class_, string, "", "");
    }

    public String b(bP bP2, Class class_, String string) {
        return this.a(this.b(bP2), class_, string, "", "");
    }

    public String b(bP bP2, Class class_, String string, String string2) {
        return this.b(this.b(bP2), class_, string, string2, "");
    }

    public String a(bP bP2, Class class_, String string, String string2) {
        return this.a(this.b(bP2), class_, string, string2, "");
    }

    public String b(bP bP2, Class class_, String string, String string2, String string3) {
        return this.b(this.b(bP2), class_, string, string2, string3);
    }

    public String a(bP bP2, Class class_, String string, String string2, String string3) {
        return this.a(this.b(bP2), class_, string, string2, string3);
    }

    public void a(bP bP2) {
        try {
            CtClass ctClass = ClassPool.getDefault().get("java.lang.Exception");
            this.b(bP2).addCatch("{ return; }", ctClass);
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    @Override
    public void d() {
        try {
            this.f = this.c.toBytecode();
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

