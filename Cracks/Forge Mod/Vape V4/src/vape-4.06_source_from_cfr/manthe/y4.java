/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.vp;
import manthe.yb;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class y4
extends yb {
    int k;

    public y4(int n6) {
        super("");
        this.k = n6;
    }

    @Override
    public void a(ClassNode classNode, MethodNode methodNode) {
        int n6 = 0;
        for (LocalVariableNode localVariableNode : methodNode.localVariables) {
            if (this.k == n6) {
                this.b = localVariableNode;
                this.d = new VarInsnNode(vp.b(localVariableNode.desc), localVariableNode.index);
                this.g.add(this.d);
                this.h = new VarInsnNode(vp.d(localVariableNode.desc), localVariableNode.index);
                this.a.add(this.h);
                this.f = this.b.desc;
            }
            ++n6;
        }
    }
}

