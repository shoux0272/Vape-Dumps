/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.LocalVariableNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
import java.util.ListIterator;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class iReSqtkUVgMvkiReSqtkUVg
implements iReSqtkUVgDwjiReSqtkUVg {
    private String a;
    private InsnList b = new InsnList();
    private InsnList c = new InsnList();
    private LocalVariableNode d;
    private VarInsnNode e;
    private VarInsnNode f;
    private String g;
    private String h = null;
    private boolean i;
    private String j;

    public iReSqtkUVgMvkiReSqtkUVg(String string) {
        this.a = string;
    }

    void a(LabelNode labelNode) {
        if (this.d != null) {
            this.d.start = labelNode;
        }
    }

    @Override
    public InsnList a() {
        return this.b;
    }

    @Override
    public InsnList b() {
        return this.c;
    }

    @Override
    public void a(ClassNode classNode, MethodNode methodNode) {
        if (this.a.equals("this") && methodNode.localVariables.size() == 0) {
            AbstractInsnNode abstractInsnNode;
            String string = "L" + classNode.name + ";";
            LabelNode labelNode = null;
            LabelNode labelNode2 = null;
            ListIterator listIterator = methodNode.instructions.iterator();
            block0: while (listIterator.hasNext()) {
                abstractInsnNode = (AbstractInsnNode)listIterator.next();
                if (!(abstractInsnNode instanceof LabelNode)) continue;
                labelNode = (LabelNode)abstractInsnNode;
                while (listIterator.hasNext()) {
                    listIterator.next();
                    if (listIterator.hasNext()) continue;
                    while (listIterator.hasPrevious()) {
                        abstractInsnNode = (AbstractInsnNode)listIterator.previous();
                        if (!(abstractInsnNode instanceof LabelNode)) continue;
                        labelNode2 = (LabelNode)abstractInsnNode;
                        break block0;
                    }
                }
            }
            abstractInsnNode = new LocalVariableNode("this", string, null, labelNode, labelNode2, 0);
            methodNode.localVariables.add(abstractInsnNode);
            this.d = abstractInsnNode;
            this.e = new VarInsnNode(25, 0);
            this.b.add((AbstractInsnNode)this.e);
            this.f = new VarInsnNode(58, 0);
            this.c.add((AbstractInsnNode)this.f);
            this.g = string;
            return;
        }
        for (LocalVariableNode localVariableNode : methodNode.localVariables) {
            if (!localVariableNode.name.equals(this.a)) continue;
            this.d = localVariableNode;
            this.e = new VarInsnNode(iReSqtkUVgsNXiReSqtkUVg.a(localVariableNode.desc), localVariableNode.index);
            this.b.add((AbstractInsnNode)this.e);
            this.f = new VarInsnNode(iReSqtkUVgsNXiReSqtkUVg.b(localVariableNode.desc), localVariableNode.index);
            this.c.add((AbstractInsnNode)this.f);
            this.g = this.d.desc;
        }
    }

    @Override
    public String c() {
        if (this.h != null) {
            return this.h;
        }
        return this.g;
    }

    @Override
    public boolean d() {
        return this.i;
    }

    @Override
    public iReSqtkUVgDwjiReSqtkUVg a(Class class_) {
        this.i = true;
        this.j = class_.getName().replace(".", "/");
        return this;
    }

    @Override
    public String e() {
        return this.j;
    }

    public iReSqtkUVgMvkiReSqtkUVg b(Class class_) {
        this.h = iReSqtkUVgxfhiReSqtkUVg.a(class_);
        return this;
    }
}

