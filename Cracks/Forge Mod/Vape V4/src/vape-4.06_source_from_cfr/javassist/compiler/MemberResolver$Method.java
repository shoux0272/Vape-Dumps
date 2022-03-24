/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.CtClass;
import javassist.bytecode.MethodInfo;

public class MemberResolver$Method {
    public CtClass declaring;
    public MethodInfo info;
    public int notmatch;

    public MemberResolver$Method(CtClass ctClass, MethodInfo methodInfo, int n6) {
        this.declaring = ctClass;
        this.info = methodInfo;
        this.notmatch = n6;
    }

    public boolean isStatic() {
        int n6 = this.info.getAccessFlags();
        return (n6 & 8) != 0;
    }
}

