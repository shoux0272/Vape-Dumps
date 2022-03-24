/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Iterator;
import manthe.cM;
import manthe.vp;
import manthe.y;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class yb
implements y {
    private String e;
    protected InsnList g = new InsnList();
    protected InsnList a = new InsnList();
    protected LocalVariableNode b;
    protected VarInsnNode d;
    protected VarInsnNode h;
    protected String f;
    private String j = null;
    private boolean c;
    private String i;

    public yb(String string) {
        this.e = string;
    }

    void a(LabelNode labelNode) {
        if (this.b != null) {
            this.b.start = labelNode;
        }
    }

    @Override
    public InsnList e() {
        return this.g;
    }

    @Override
    public InsnList b() {
        return this.a;
    }

    @Override
    public void a(ClassNode classNode, MethodNode methodNode) {
        if (this.e.equals("this") && methodNode.localVariables.size() == 0) {
            Object object;
            String string = "L" + classNode.name + ";";
            LabelNode labelNode = null;
            LabelNode labelNode2 = null;
            Iterator iterator = methodNode.instructions.iterator();
            block0: while (iterator.hasNext()) {
                object = (AbstractInsnNode)iterator.next();
                if (!(object instanceof LabelNode)) continue;
                labelNode = (LabelNode)object;
                while (iterator.hasNext()) {
                    iterator.next();
                    if (iterator.hasNext()) continue;
                    while (iterator.hasPrevious()) {
                        object = (AbstractInsnNode)iterator.previous();
                        if (!(object instanceof LabelNode)) continue;
                        labelNode2 = (LabelNode)object;
                        break block0;
                    }
                }
            }
            object = new LocalVariableNode("this", string, null, labelNode, labelNode2, 0);
            methodNode.localVariables.add((LocalVariableNode)object);
            this.b = object;
            this.d = new VarInsnNode(25, 0);
            this.g.add(this.d);
            this.h = new VarInsnNode(58, 0);
            this.a.add(this.h);
            this.f = string;
            return;
        }
        for (LocalVariableNode localVariableNode : methodNode.localVariables) {
            if (!localVariableNode.name.equals(this.e)) continue;
            this.b = localVariableNode;
            this.d = new VarInsnNode(vp.b(localVariableNode.desc), localVariableNode.index);
            this.g.add(this.d);
            this.h = new VarInsnNode(vp.d(localVariableNode.desc), localVariableNode.index);
            this.a.add(this.h);
            this.f = this.b.desc;
        }
    }

    @Override
    public String c() {
        if (this.j != null) {
            return this.j;
        }
        return this.f;
    }

    @Override
    public boolean a() {
        return this.c;
    }

    @Override
    public y a(Class class_) {
        this.c = true;
        this.i = class_.getName().replace(".", "/");
        return this;
    }

    @Override
    public String d() {
        return this.i;
    }

    public yb b(Class class_) {
        this.j = cM.a(class_);
        return this;
    }
}

