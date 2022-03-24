/*
 * Decompiled with CFR 0.150.
 */
package javassist.scopedpool;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import javassist.scopedpool.SoftValueHashMap$SoftValueRef;

public class SoftValueHashMap<K, V>
implements Map<K, V> {
    private Map<K, SoftValueHashMap$SoftValueRef<K, V>> c;
    private ReferenceQueue<V> d = new ReferenceQueue();
    private static boolean b;

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        this.a();
        HashSet<Map.Entry<K, V>> hashSet = new HashSet<Map.Entry<K, V>>();
        for (Map.Entry<K, SoftValueHashMap$SoftValueRef<K, V>> entry : this.c.entrySet()) {
            hashSet.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), entry.getValue().get()));
        }
        return hashSet;
    }

    private void a() {
        if (!this.c.isEmpty()) {
            Reference<V> reference;
            while ((reference = this.d.poll()) != null) {
                if (!(reference instanceof SoftValueHashMap$SoftValueRef)) continue;
                SoftValueHashMap$SoftValueRef softValueHashMap$SoftValueRef = (SoftValueHashMap$SoftValueRef)reference;
                if (reference != this.c.get(softValueHashMap$SoftValueRef.key)) continue;
                this.c.remove(softValueHashMap$SoftValueRef.key);
            }
        }
    }

    public SoftValueHashMap(int n6, float f10) {
        this.c = new ConcurrentHashMap<K, SoftValueHashMap$SoftValueRef<K, V>>(n6, f10);
    }

    public SoftValueHashMap(int n6) {
        this.c = new ConcurrentHashMap<K, SoftValueHashMap$SoftValueRef<K, V>>(n6);
    }

    public SoftValueHashMap() {
        this.c = new ConcurrentHashMap<K, SoftValueHashMap$SoftValueRef<K, V>>();
    }

    public SoftValueHashMap(Map<K, V> map) {
        this(Math.max(2 * map.size(), 11), 0.75f);
        this.putAll(map);
    }

    @Override
    public int size() {
        this.a();
        return this.c.size();
    }

    @Override
    public boolean isEmpty() {
        this.a();
        return this.c.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        this.a();
        return this.c.containsKey(object);
    }

    @Override
    public V get(Object object) {
        this.a();
        return this.a(this.c.get(object));
    }

    @Override
    public V put(K k, V v4) {
        this.a();
        return this.a(this.c.put(k, SoftValueHashMap$SoftValueRef.access$000(k, v4, this.d)));
    }

    @Override
    public V remove(Object object) {
        this.a();
        return this.a(this.c.remove(object));
    }

    @Override
    public void clear() {
        this.a();
        this.c.clear();
    }

    @Override
    public boolean containsValue(Object object) {
        this.a();
        if (null == object) {
            return false;
        }
        for (SoftValueHashMap$SoftValueRef<K, V> softValueHashMap$SoftValueRef : this.c.values()) {
            if (null == softValueHashMap$SoftValueRef || !object.equals(softValueHashMap$SoftValueRef.get())) continue;
            return true;
        }
        return false;
    }

    @Override
    public Set<K> keySet() {
        this.a();
        return this.c.keySet();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        this.a();
        for (K k : map.keySet()) {
            this.put(k, map.get(k));
        }
    }

    @Override
    public Collection<V> values() {
        this.a();
        ArrayList arrayList = new ArrayList();
        for (SoftValueHashMap$SoftValueRef<K, V> softValueHashMap$SoftValueRef : this.c.values()) {
            arrayList.add(softValueHashMap$SoftValueRef.get());
        }
        return arrayList;
    }

    private V a(SoftValueHashMap$SoftValueRef<K, V> softValueHashMap$SoftValueRef) {
        if (null == softValueHashMap$SoftValueRef) {
            return null;
        }
        return (V)softValueHashMap$SoftValueRef.get();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean d() {
        return b;
    }

    public static boolean c() {
        boolean bl = SoftValueHashMap.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!SoftValueHashMap.d()) {
            SoftValueHashMap.b(true);
        }
    }
}

