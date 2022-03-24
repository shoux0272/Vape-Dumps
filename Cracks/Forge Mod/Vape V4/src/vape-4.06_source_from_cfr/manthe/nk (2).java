/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import manthe.Bb;
import manthe.n5;
import manthe.to;

class nk {
    n5 b;
    HashMap<Integer, HashMap<to, Integer>> a = new HashMap();

    public nk(n5 n52) {
        this.b = n52;
    }

    private void a(int n6, int n10, int n11) {
        this.a.computeIfAbsent(n6, this::lambda$addBlockToLayer$0);
        HashMap<to, Integer> hashMap = this.a.get(n6);
        to to2 = new to(n10, n11, null);
        hashMap.computeIfAbsent(to2, arg_0 -> nk.lambda$addBlockToLayer$1(hashMap, arg_0));
        hashMap.merge(to2, 1, Integer::sum);
    }

    public List<to> a(int n6) {
        ArrayList<to> arrayList = new ArrayList<to>();
        if (!this.a.containsKey(n6)) {
            return arrayList;
        }
        Object[] arrobject = this.a.get(n6).entrySet().toArray();
        Arrays.sort(arrobject, new Bb(this));
        for (Object object : arrobject) {
            arrayList.add((to)((Map.Entry)object).getKey());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public int a(int n6, to to2) {
        return this.a.get(n6).get(to2);
    }

    public int b() {
        int n6 = 0;
        for (int n10 : this.a.keySet()) {
            n6 += this.a.get(n10).size();
        }
        return n6;
    }

    public int b(int n6) {
        HashMap<to, Integer> hashMap = this.a.get(n6);
        int n10 = 0;
        for (to to2 : hashMap.keySet()) {
            n10 += hashMap.get(to2).intValue();
        }
        return n10;
    }

    public n5 a() {
        return this.b;
    }

    public String toString() {
        return "BedData{position=" + this.b + ", layers=" + this.a + '}';
    }

    public void c() {
        this.a.clear();
    }

    private static Integer lambda$addBlockToLayer$1(HashMap hashMap, to to2) {
        return hashMap.put(to2, 0);
    }

    private HashMap lambda$addBlockToLayer$0(Integer n6) {
        return this.a.put(n6, new HashMap());
    }

    static void a(nk nk2, int n6, int n10, int n11) {
        nk2.a(n6, n10, n11);
    }
}

