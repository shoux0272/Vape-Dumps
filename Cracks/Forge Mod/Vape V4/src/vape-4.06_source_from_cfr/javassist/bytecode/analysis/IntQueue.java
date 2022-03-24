/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import java.util.NoSuchElementException;
import javassist.bytecode.analysis.IntQueue$Entry;

class IntQueue {
    private IntQueue$Entry head;
    private IntQueue$Entry tail;

    IntQueue() {
    }

    void add(int n6) {
        IntQueue$Entry intQueue$Entry = new IntQueue$Entry(n6, null);
        if (this.tail != null) {
            IntQueue$Entry.access$102(this.tail, intQueue$Entry);
        }
        this.tail = intQueue$Entry;
        if (this.head == null) {
            this.head = intQueue$Entry;
        }
    }

    boolean isEmpty() {
        return this.head == null;
    }

    int take() {
        if (this.head == null) {
            throw new NoSuchElementException();
        }
        int n6 = IntQueue$Entry.access$200(this.head);
        this.head = IntQueue$Entry.access$100(this.head);
        if (this.head == null) {
            this.tail = null;
        }
        return n6;
    }
}

