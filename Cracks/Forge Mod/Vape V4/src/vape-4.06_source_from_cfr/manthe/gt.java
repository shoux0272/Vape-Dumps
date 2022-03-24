/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import manthe.BG;

public class gt {
    Class k;
    Class c;
    BG j;
    BG i;
    BG a;
    Set<String> f;
    BG d;
    BG g;
    BG e;
    BG l;
    BG b;
    BG h;

    void a() {
        this.c = a.a.gcj("Lnet/minecraft/launchwrapper/Launch;");
        this.k = a.a.gcj("Lnet/minecraft/launchwrapper/LaunchClassLoader;");
        this.j = new BG(this.c, "classLoader", false, true, "Lnet/minecraft/launchwrapper/LaunchClassLoader;");
        this.i = new BG(this.k, "negativeResourceCache", false, false, Set.class);
        this.f = new HashSet<String>();
        this.f.addAll((Set)this.i.f(this.j.f(null)));
        this.a = new BG(this.k, "invalidClasses", false, false, Set.class);
        this.d = new BG(ClassLoader.class, "classes", false, false, Vector.class);
        this.g = new BG(ClassLoader.class, "defaultDomain", false, false, ProtectionDomain.class);
        this.e = new BG(this.k, "packageManifests", false, false, Map.class);
        this.l = new BG(Package.class, "loader", false, false, ClassLoader.class);
        this.b = new BG(ClassLoader.class, "packages", false, false, HashMap.class);
        this.h = new BG(ClassLoader.class, "domains", false, false, Set.class);
    }

    public void d() throws Exception {
        Set set = (Set)this.a.f(this.j.f(null));
        set.clear();
        System.gc();
    }

    public void b(ClassLoader classLoader) throws Exception {
        this.g.a((Object)classLoader, (Object)null);
        this.a(a.class);
    }

    public void a(Class<? extends a> class_) throws Exception {
        Package package_ = class_.getPackage();
        if (package_ != null) {
            this.l.a((Object)package_, (Object)null);
        }
    }

    public void b() throws Exception {
        Set set = (Set)this.i.f(this.j.f(null));
        ArrayList arrayList = new ArrayList();
        set.clear();
        System.gc();
    }

    public void g() throws Exception {
    }

    public void f() throws Exception {
    }

    public void a(ClassLoader classLoader) throws Exception {
        Set set = (Set)this.h.f(classLoader);
        set.clear();
    }

    public void c() throws Exception {
    }

    public void e() throws Exception {
        Vector vector = (Vector)this.d.f(gt.class.getClassLoader());
        vector.clear();
    }
}

