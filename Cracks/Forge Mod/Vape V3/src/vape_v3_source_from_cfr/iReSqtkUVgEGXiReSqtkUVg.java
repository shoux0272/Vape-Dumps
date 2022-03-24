/*
 * Decompiled with CFR 0.150.
 */
import a.a;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class iReSqtkUVgEGXiReSqtkUVg {
    Class a;
    Class b;
    iReSqtkUVgkgTiReSqtkUVg c;
    iReSqtkUVgkgTiReSqtkUVg d;
    iReSqtkUVgkgTiReSqtkUVg e;
    Set<String> f;
    iReSqtkUVgkgTiReSqtkUVg g;
    iReSqtkUVgkgTiReSqtkUVg h;
    iReSqtkUVgkgTiReSqtkUVg i;
    iReSqtkUVgkgTiReSqtkUVg j;
    iReSqtkUVgkgTiReSqtkUVg k;
    iReSqtkUVgkgTiReSqtkUVg l;

    void a() {
        this.b = a.a.gcj("Lnet/minecraft/launchwrapper/Launch;");
        this.a = a.a.gcj("Lnet/minecraft/launchwrapper/LaunchClassLoader;");
        this.c = new iReSqtkUVgkgTiReSqtkUVg(this.b, "classLoader", false, true, "Lnet/minecraft/launchwrapper/LaunchClassLoader;");
        this.d = new iReSqtkUVgkgTiReSqtkUVg(this.a, "negativeResourceCache", false, false, Set.class);
        this.f = new HashSet<String>();
        this.f.addAll((Set)this.d.h(this.c.h(null)));
        this.e = new iReSqtkUVgkgTiReSqtkUVg(this.a, "invalidClasses", false, false, Set.class);
        this.g = new iReSqtkUVgkgTiReSqtkUVg(ClassLoader.class, "classes", false, false, Vector.class);
        this.h = new iReSqtkUVgkgTiReSqtkUVg(ClassLoader.class, "defaultDomain", false, false, ProtectionDomain.class);
        this.i = new iReSqtkUVgkgTiReSqtkUVg(this.a, "packageManifests", false, false, Map.class);
        this.j = new iReSqtkUVgkgTiReSqtkUVg(Package.class, "loader", false, false, ClassLoader.class);
        this.k = new iReSqtkUVgkgTiReSqtkUVg(ClassLoader.class, "packages", false, false, HashMap.class);
        this.l = new iReSqtkUVgkgTiReSqtkUVg(ClassLoader.class, "domains", false, false, Set.class);
    }

    public void b() {
        Set set = (Set)this.e.h(this.c.h(null));
        set.clear();
        System.gc();
    }

    public void a(ClassLoader classLoader) {
        this.h.a((Object)classLoader, (Object)null);
        this.a(a.class);
    }

    public void a(Class<? extends a> class_) {
        Package package_ = class_.getPackage();
        if (package_ != null) {
            this.j.a((Object)package_, (Object)null);
        }
    }

    public void c() {
        Set set = (Set)this.d.h(this.c.h(null));
        ArrayList arrayList = new ArrayList();
        set.clear();
        System.gc();
    }

    public void d() {
    }

    public void e() {
    }

    public void b(ClassLoader classLoader) {
        Set set = (Set)this.l.h(classLoader);
        set.clear();
    }

    public void f() {
    }

    public void g() {
        Vector vector = (Vector)this.g.h(iReSqtkUVgEGXiReSqtkUVg.class.getClassLoader());
        vector.clear();
    }
}

