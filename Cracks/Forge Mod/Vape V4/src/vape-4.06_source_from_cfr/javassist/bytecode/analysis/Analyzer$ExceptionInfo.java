/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.analysis.Analyzer$1;
import javassist.bytecode.analysis.Type;

class Analyzer$ExceptionInfo {
    private int end;
    private int handler;
    private int start;
    private Type type;

    private Analyzer$ExceptionInfo(int n6, int n10, int n11, Type type) {
        this.start = n6;
        this.end = n10;
        this.handler = n11;
        this.type = type;
    }

    Analyzer$ExceptionInfo(int n6, int n10, int n11, Type type, Analyzer$1 analyzer$1) {
        this(n6, n10, n11, type);
    }

    static int access$100(Analyzer$ExceptionInfo analyzer$ExceptionInfo) {
        return analyzer$ExceptionInfo.start;
    }

    static int access$200(Analyzer$ExceptionInfo analyzer$ExceptionInfo) {
        return analyzer$ExceptionInfo.end;
    }

    static Type access$300(Analyzer$ExceptionInfo analyzer$ExceptionInfo) {
        return analyzer$ExceptionInfo.type;
    }

    static int access$400(Analyzer$ExceptionInfo analyzer$ExceptionInfo) {
        return analyzer$ExceptionInfo.handler;
    }
}

