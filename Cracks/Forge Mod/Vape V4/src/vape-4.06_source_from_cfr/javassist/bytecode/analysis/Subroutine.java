/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subroutine {
    private List<Integer> callers = new ArrayList<Integer>();
    private Set<Integer> access = new HashSet<Integer>();
    private int start;

    public Subroutine(int n6, int n10) {
        this.start = n6;
        this.callers.add(n10);
    }

    public void addCaller(int n6) {
        this.callers.add(n6);
    }

    public int start() {
        return this.start;
    }

    public void access(int n6) {
        this.access.add(n6);
    }

    public boolean isAccessed(int n6) {
        return this.access.contains(n6);
    }

    public Collection<Integer> accessed() {
        return this.access;
    }

    public Collection<Integer> callers() {
        return this.callers;
    }

    public String toString() {
        return "start = " + this.start + " callers = " + this.callers.toString();
    }
}

