/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.analysis.IntQueue$1;

class IntQueue$Entry {
    private IntQueue$Entry next;
    private int value;

    private IntQueue$Entry(int n6) {
        this.value = n6;
    }

    IntQueue$Entry(int n6, IntQueue$1 intQueue$1) {
        this(n6);
    }

    static IntQueue$Entry access$102(IntQueue$Entry intQueue$Entry, IntQueue$Entry intQueue$Entry2) {
        intQueue$Entry.next = intQueue$Entry2;
        return intQueue$Entry.next;
    }

    static int access$200(IntQueue$Entry intQueue$Entry) {
        return intQueue$Entry.value;
    }

    static IntQueue$Entry access$100(IntQueue$Entry intQueue$Entry) {
        return intQueue$Entry.next;
    }
}

