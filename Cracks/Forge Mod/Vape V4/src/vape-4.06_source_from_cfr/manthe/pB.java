/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.y;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class pB
implements y {
    private String b;
    private InsnList a = new InsnList();
    private InsnList d = new InsnList();
    private FieldNode c;

    public pB(String string) {
        this.b = string;
    }

    @Override
    public InsnList e() {
        return this.a;
    }

    @Override
    public InsnList b() {
        return this.d;
    }

    @Override
    public void a(ClassNode classNode, MethodNode methodNode) {
        for (FieldNode fieldNode : classNode.fields) {
            if (!fieldNode.name.equals(this.b)) continue;
            this.c = fieldNode;
            this.a.add(new VarInsnNode(25, 0));
            this.a.add(new FieldInsnNode(180, classNode.name, fieldNode.name, fieldNode.desc));
            this.d.add(new VarInsnNode(25, 0));
            this.d.add(new FieldInsnNode(181, classNode.name, fieldNode.name, fieldNode.desc));
        }
    }

    @Override
    public String c() {
        return this.c.desc;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public y a(Class class_) {
        return this;
    }

    @Override
    public String d() {
        return null;
    }
}

