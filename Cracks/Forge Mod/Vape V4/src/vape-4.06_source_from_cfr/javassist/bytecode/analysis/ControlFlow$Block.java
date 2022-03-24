/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import java.util.ArrayList;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.analysis.ControlFlow$Catcher;
import javassist.bytecode.stackmap.BasicBlock;
import javassist.bytecode.stackmap.BasicBlock$Catch;

public class ControlFlow$Block
extends BasicBlock {
    public Object k = null;
    int j;
    MethodInfo i;
    ControlFlow$Block[] g;
    private static int h;

    ControlFlow$Block(int n6, MethodInfo methodInfo) {
        super(n6);
        this.i = methodInfo;
    }

    @Override
    protected void toString2(StringBuffer stringBuffer) {
        super.toString2(stringBuffer);
        stringBuffer.append(", incoming{");
        for (int k = 0; k < this.g.length; ++k) {
            stringBuffer.append(this.g[k].position).append(", ");
        }
        stringBuffer.append("}");
    }

    BasicBlock[] b() {
        return this.exit;
    }

    public int f() {
        return this.j;
    }

    public int e() {
        return this.position;
    }

    public int g() {
        return this.length;
    }

    public int h() {
        return this.incoming;
    }

    public ControlFlow$Block a(int n6) {
        return this.g[n6];
    }

    public int i() {
        return this.exit == null ? 0 : this.exit.length;
    }

    public ControlFlow$Block c(int n6) {
        return (ControlFlow$Block)this.exit[n6];
    }

    public ControlFlow$Catcher[] a() {
        ArrayList<ControlFlow$Catcher> arrayList = new ArrayList<ControlFlow$Catcher>();
        BasicBlock$Catch basicBlock$Catch = this.toCatch;
        while (basicBlock$Catch != null) {
            arrayList.add(new ControlFlow$Catcher(basicBlock$Catch));
            basicBlock$Catch = basicBlock$Catch.next;
        }
        return arrayList.toArray(new ControlFlow$Catcher[arrayList.size()]);
    }

    public static void b(int n6) {
        h = n6;
    }

    public static int c() {
        return h;
    }

    public static int d() {
        int n6 = ControlFlow$Block.c();
        if (n6 == 0) {
            return 96;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (ControlFlow$Block.c() != 0) {
            ControlFlow$Block.b(31);
        }
    }
}

