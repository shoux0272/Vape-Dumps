/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.analysis.Analyzer;
import javassist.bytecode.analysis.ControlFlow$1;
import javassist.bytecode.analysis.ControlFlow$2;
import javassist.bytecode.analysis.ControlFlow$3;
import javassist.bytecode.analysis.ControlFlow$Block;
import javassist.bytecode.analysis.ControlFlow$Catcher;
import javassist.bytecode.analysis.ControlFlow$Node;
import javassist.bytecode.analysis.Frame;

public class ControlFlow {
    private CtClass clazz;
    private MethodInfo methodInfo;
    private ControlFlow$Block[] basicBlocks;
    private Frame[] frames;

    public ControlFlow(CtMethod ctMethod) throws BadBytecode {
        this(ctMethod.getDeclaringClass(), ctMethod.getMethodInfo2());
    }

    public ControlFlow(CtClass ctClass, MethodInfo methodInfo) throws BadBytecode {
        ControlFlow$Block controlFlow$Block;
        this.clazz = ctClass;
        this.methodInfo = methodInfo;
        this.frames = null;
        this.basicBlocks = (ControlFlow$Block[])new ControlFlow$1(this).make(methodInfo);
        if (this.basicBlocks == null) {
            this.basicBlocks = new ControlFlow$Block[0];
        }
        int n6 = this.basicBlocks.length;
        int[] arrn = new int[n6];
        int n10 = 0;
        while (n10 < n6) {
            controlFlow$Block = this.basicBlocks[n10];
            controlFlow$Block.j = n10++;
            controlFlow$Block.g = new ControlFlow$Block[controlFlow$Block.h()];
            arrn[n10] = 0;
        }
        for (n10 = 0; n10 < n6; ++n10) {
            controlFlow$Block = this.basicBlocks[n10];
            for (int k = 0; k < controlFlow$Block.i(); ++k) {
                ControlFlow$Block controlFlow$Block2 = controlFlow$Block.c(k);
                int n11 = controlFlow$Block2.j;
                int n12 = arrn[n11];
                arrn[n11] = n12 + 1;
                controlFlow$Block2.g[n12] = controlFlow$Block;
            }
            ControlFlow$Catcher[] arrcontrolFlow$Catcher = controlFlow$Block.a();
            for (int k = 0; k < arrcontrolFlow$Catcher.length; ++k) {
                ControlFlow$Block controlFlow$Block3 = ControlFlow$Catcher.access$100(arrcontrolFlow$Catcher[k]);
                int n13 = controlFlow$Block3.j;
                int n14 = arrn[n13];
                arrn[n13] = n14 + 1;
                controlFlow$Block3.g[n14] = controlFlow$Block;
            }
        }
    }

    public ControlFlow$Block[] basicBlocks() {
        return this.basicBlocks;
    }

    public Frame frameAt(int n6) throws BadBytecode {
        if (this.frames == null) {
            this.frames = new Analyzer().analyze(this.clazz, this.methodInfo);
        }
        return this.frames[n6];
    }

    public ControlFlow$Node[] dominatorTree() {
        int n6 = this.basicBlocks.length;
        if (n6 == 0) {
            return null;
        }
        ControlFlow$Node[] arrcontrolFlow$Node = new ControlFlow$Node[n6];
        boolean[] arrbl = new boolean[n6];
        int[] arrn = new int[n6];
        for (int k = 0; k < n6; ++k) {
            arrcontrolFlow$Node[k] = new ControlFlow$Node(this.basicBlocks[k]);
            arrbl[k] = false;
        }
        ControlFlow$2 controlFlow$2 = new ControlFlow$2(this, arrcontrolFlow$Node);
        arrcontrolFlow$Node[0].makeDepth1stTree(null, arrbl, 0, arrn, controlFlow$2);
        do {
            for (int k = 0; k < n6; ++k) {
                arrbl[k] = false;
            }
        } while (arrcontrolFlow$Node[0].makeDominatorTree(arrbl, arrn, controlFlow$2));
        ControlFlow$Node.access$300(arrcontrolFlow$Node);
        return arrcontrolFlow$Node;
    }

    public ControlFlow$Node[] postDominatorTree() {
        int n6;
        int n10 = this.basicBlocks.length;
        if (n10 == 0) {
            return null;
        }
        ControlFlow$Node[] arrcontrolFlow$Node = new ControlFlow$Node[n10];
        boolean[] arrbl = new boolean[n10];
        int[] arrn = new int[n10];
        for (int k = 0; k < n10; ++k) {
            arrcontrolFlow$Node[k] = new ControlFlow$Node(this.basicBlocks[k]);
            arrbl[k] = false;
        }
        ControlFlow$3 controlFlow$3 = new ControlFlow$3(this, arrcontrolFlow$Node);
        int n11 = 0;
        for (n6 = 0; n6 < n10; ++n6) {
            if (ControlFlow$Node.access$200(arrcontrolFlow$Node[n6]).i() != 0) continue;
            n11 = arrcontrolFlow$Node[n6].makeDepth1stTree(null, arrbl, n11, arrn, controlFlow$3);
        }
        do {
            int n12;
            for (n12 = 0; n12 < n10; ++n12) {
                arrbl[n12] = false;
            }
            n6 = 0;
            for (n12 = 0; n12 < n10; ++n12) {
                if (ControlFlow$Node.access$200(arrcontrolFlow$Node[n12]).i() != 0 || !arrcontrolFlow$Node[n12].makeDominatorTree(arrbl, arrn, controlFlow$3)) continue;
                n6 = 1;
            }
        } while (n6 != 0);
        ControlFlow$Node.access$300(arrcontrolFlow$Node);
        return arrcontrolFlow$Node;
    }

    static MethodInfo access$000(ControlFlow controlFlow) {
        return controlFlow.methodInfo;
    }
}

