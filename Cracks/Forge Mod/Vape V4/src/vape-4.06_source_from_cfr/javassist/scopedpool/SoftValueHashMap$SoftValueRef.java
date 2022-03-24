/*
 * Decompiled with CFR 0.150.
 */
package javassist.scopedpool;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class SoftValueHashMap$SoftValueRef<K, V>
extends SoftReference<V> {
    public K key;

    private SoftValueHashMap$SoftValueRef(K k, V v4, ReferenceQueue<V> referenceQueue) {
        super(v4, referenceQueue);
        this.key = k;
    }

    private static <K, V> SoftValueHashMap$SoftValueRef<K, V> create(K k, V v4, ReferenceQueue<V> referenceQueue) {
        if (v4 == null) {
            return null;
        }
        return new SoftValueHashMap$SoftValueRef<K, V>(k, v4, referenceQueue);
    }

    static SoftValueHashMap$SoftValueRef access$000(Object object, Object object2, ReferenceQueue referenceQueue) {
        return SoftValueHashMap$SoftValueRef.create(object, object2, referenceQueue);
    }
}

