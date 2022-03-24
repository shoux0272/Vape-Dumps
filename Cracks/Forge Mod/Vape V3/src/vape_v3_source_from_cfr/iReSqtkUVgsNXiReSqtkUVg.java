/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.Label
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.FieldInsnNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.InsnNode
 *  org.objectweb.asm.tree.JumpInsnNode
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.LineNumberNode
 *  org.objectweb.asm.tree.LocalVariableNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.TypeInsnNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
import a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class iReSqtkUVgsNXiReSqtkUVg {
    private Class a;
    private ClassNode b;
    private MethodNode c;
    private List<iReSqtkUVgDwjiReSqtkUVg> d = new ArrayList<iReSqtkUVgDwjiReSqtkUVg>();
    private LabelNode e = new LabelNode(new Label());
    private LabelNode f = new LabelNode(new Label());
    private boolean g;
    private iReSqtkUVgDwjiReSqtkUVg h;
    private Class i;
    private int j;
    private InsnList k;
    private boolean l;
    private String m;
    private int n;
    private String o;
    private static String p;
    private static int q;

    public iReSqtkUVgsNXiReSqtkUVg(int n, Class class_, ClassNode classNode, iReSqtkUVgtuCiReSqtkUVg iReSqtkUVgtuCiReSqtkUVg2, iReSqtkUVgDwjiReSqtkUVg ... arriReSqtkUVgDwjiReSqtkUVg) {
        for (MethodNode methodNode : classNode.methods) {
            if (!iReSqtkUVgtuCiReSqtkUVg2.a(methodNode.name, methodNode.desc)) continue;
            this.c = methodNode;
        }
        this.j = n;
        this.a = class_;
        this.b = classNode;
        for (iReSqtkUVgDwjiReSqtkUVg iReSqtkUVgDwjiReSqtkUVg2 : arriReSqtkUVgDwjiReSqtkUVg) {
            iReSqtkUVgDwjiReSqtkUVg2.a(classNode, this.c);
            this.d.add(iReSqtkUVgDwjiReSqtkUVg2);
        }
        a.a.gcb(class_);
        iReSqtkUVgDCbiReSqtkUVg.d().e().put(class_.getName(), class_);
    }

    public iReSqtkUVgsNXiReSqtkUVg a() {
        iReSqtkUVgDwjiReSqtkUVg iReSqtkUVgDwjiReSqtkUVg222;
        iReSqtkUVgDwjiReSqtkUVg iReSqtkUVgDwjiReSqtkUVg322;
        this.o = this.a.getName().replace(".", "/");
        if (this.j == 0) {
            for (iReSqtkUVgDwjiReSqtkUVg iReSqtkUVgDwjiReSqtkUVg322 : this.d) {
                if (!(iReSqtkUVgDwjiReSqtkUVg322 instanceof iReSqtkUVgMvkiReSqtkUVg)) continue;
                ((iReSqtkUVgMvkiReSqtkUVg)iReSqtkUVgDwjiReSqtkUVg322).a(this.e);
            }
        }
        InsnList insnList = new InsnList();
        iReSqtkUVgDwjiReSqtkUVg322 = new LabelNode(new Label());
        this.n = ++this.c.maxLocals;
        LocalVariableNode localVariableNode = new LocalVariableNode("event" + q++, iReSqtkUVgxfhiReSqtkUVg.a(this.a), null, this.e, this.f, this.n);
        this.c.localVariables.add(localVariableNode);
        TypeInsnNode typeInsnNode = new TypeInsnNode(187, this.o);
        InsnNode insnNode = new InsnNode(89);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (iReSqtkUVgDwjiReSqtkUVg iReSqtkUVgDwjiReSqtkUVg222 : this.d) {
            stringBuilder.append(iReSqtkUVgDwjiReSqtkUVg222.c());
        }
        stringBuilder.append(")V");
        MethodInsnNode methodInsnNode = new MethodInsnNode(183, this.o, "<init>", stringBuilder.toString(), false);
        iReSqtkUVgDwjiReSqtkUVg222 = new VarInsnNode(58, this.n);
        VarInsnNode varInsnNode = new VarInsnNode(25, this.n);
        MethodInsnNode methodInsnNode2 = new MethodInsnNode(182, this.o, p, "()Z", false);
        JumpInsnNode jumpInsnNode = new JumpInsnNode(153, (LabelNode)iReSqtkUVgDwjiReSqtkUVg322);
        insnList.add((AbstractInsnNode)this.e);
        if (this.g) {
            insnList.add(this.h.a());
            insnList.add((AbstractInsnNode)new TypeInsnNode(193, this.i.getName().replace(".", "/")));
            insnList.add((AbstractInsnNode)new JumpInsnNode(153, this.f));
        }
        if (this.j == 0) {
            for (LocalVariableNode object : this.c.localVariables) {
                if (object.index != 0) continue;
                object.start = this.e;
            }
        }
        insnList.add((AbstractInsnNode)typeInsnNode);
        insnList.add((AbstractInsnNode)insnNode);
        for (iReSqtkUVgDwjiReSqtkUVg iReSqtkUVgDwjiReSqtkUVg2 : this.d) {
            insnList.add(iReSqtkUVgDwjiReSqtkUVg2.a());
        }
        insnList.add((AbstractInsnNode)methodInsnNode);
        insnList.add((AbstractInsnNode)iReSqtkUVgDwjiReSqtkUVg222);
        insnList.add((AbstractInsnNode)new LabelNode(new Label()));
        insnList.add((AbstractInsnNode)varInsnNode);
        insnList.add((AbstractInsnNode)methodInsnNode2);
        insnList.add((AbstractInsnNode)jumpInsnNode);
        insnList.add((AbstractInsnNode)new LabelNode(new Label()));
        if (this.l) {
            insnList.add((AbstractInsnNode)new VarInsnNode(25, this.n));
            insnList.add((AbstractInsnNode)new MethodInsnNode(182, this.o, this.m, this.c.desc, false));
        }
        insnList.add((AbstractInsnNode)new InsnNode(iReSqtkUVgsNXiReSqtkUVg.c(this.c.desc)));
        insnList.add((AbstractInsnNode)iReSqtkUVgDwjiReSqtkUVg322);
        insnList.add((AbstractInsnNode)this.f);
        this.k = insnList;
        return this;
    }

    public iReSqtkUVgsNXiReSqtkUVg a(iReSqtkUVgDwjiReSqtkUVg iReSqtkUVgDwjiReSqtkUVg2, Class class_) {
        this.g = true;
        iReSqtkUVgDwjiReSqtkUVg2.a(this.b, this.c);
        this.h = iReSqtkUVgDwjiReSqtkUVg2;
        this.i = class_;
        return this;
    }

    public iReSqtkUVgsNXiReSqtkUVg a(iReSqtkUVgDwjiReSqtkUVg iReSqtkUVgDwjiReSqtkUVg2, String string) {
        InsnList insnList = new InsnList();
        insnList.add((AbstractInsnNode)new VarInsnNode(25, this.n));
        insnList.add((AbstractInsnNode)new MethodInsnNode(182, this.o, string, "()" + iReSqtkUVgDwjiReSqtkUVg2.c(), false));
        if (iReSqtkUVgDwjiReSqtkUVg2.d()) {
            insnList.add((AbstractInsnNode)new TypeInsnNode(192, iReSqtkUVgDwjiReSqtkUVg2.e()));
        }
        insnList.add(iReSqtkUVgDwjiReSqtkUVg2.b());
        this.k.insertBefore((AbstractInsnNode)this.f, insnList);
        return this;
    }

    public iReSqtkUVgsNXiReSqtkUVg a(int n) {
        InsnList insnList = this.c.instructions;
        ListIterator listIterator = insnList.iterator();
        InsnList insnList2 = new InsnList();
        boolean bl = false;
        boolean bl2 = false;
        LabelNode labelNode = null;
        LineNumberNode lineNumberNode = null;
        while (listIterator.hasNext()) {
            LineNumberNode lineNumberNode2;
            AbstractInsnNode abstractInsnNode = (AbstractInsnNode)listIterator.next();
            if (abstractInsnNode instanceof LineNumberNode) {
                lineNumberNode2 = (LineNumberNode)abstractInsnNode;
                int n2 = lineNumberNode2.line;
                if (n2 == n) {
                    bl = true;
                }
            }
            if (bl && abstractInsnNode instanceof JumpInsnNode) {
                lineNumberNode2 = (JumpInsnNode)abstractInsnNode;
                bl2 = true;
                labelNode = lineNumberNode2.label;
                lineNumberNode = lineNumberNode2;
            }
            if (bl2 && abstractInsnNode instanceof LabelNode && abstractInsnNode.equals((Object)labelNode)) {
                lineNumberNode.label = this.e;
                lineNumberNode2 = new JumpInsnNode(167, labelNode);
                insnList2.add((AbstractInsnNode)lineNumberNode2);
                insnList2.add(this.k);
                bl = false;
                bl2 = false;
            }
            insnList2.add(abstractInsnNode);
        }
        this.c.instructions = insnList2;
        return this;
    }

    public iReSqtkUVgsNXiReSqtkUVg b() {
        if (this.j == 0) {
            this.c.instructions.insertBefore(this.c.instructions.get(0), this.k);
        } else if (this.j == -1) {
            ListIterator listIterator = this.c.instructions.iterator();
            while (listIterator.hasNext()) {
                listIterator.next();
                if (listIterator.hasNext()) continue;
                while (listIterator.hasPrevious()) {
                    AbstractInsnNode abstractInsnNode = (AbstractInsnNode)listIterator.previous();
                    if (!(abstractInsnNode instanceof LineNumberNode)) continue;
                    this.c.instructions.insertBefore(abstractInsnNode, this.k);
                    return this;
                }
            }
        } else {
            for (AbstractInsnNode abstractInsnNode : this.c.instructions) {
                if (!(abstractInsnNode instanceof LineNumberNode)) continue;
                LineNumberNode lineNumberNode = (LineNumberNode)abstractInsnNode;
                if (lineNumberNode.line != this.j) continue;
                this.c.instructions.insertBefore((AbstractInsnNode)lineNumberNode, this.k);
                return this;
            }
        }
        return this;
    }

    public iReSqtkUVgsNXiReSqtkUVg b(int n) {
        this.l = true;
        a.a.gcb(this.a);
        String[] arrstring = a.a.gcm(this.a);
        int n2 = 0;
        for (String string : arrstring) {
            if (n2 == n) {
                this.m = string;
                break;
            }
            ++n2;
        }
        return this;
    }

    public iReSqtkUVgsNXiReSqtkUVg a(int n, String string) {
        InsnList insnList = new InsnList();
        LineNumberNode lineNumberNode = null;
        for (AbstractInsnNode abstractInsnNode : this.c.instructions) {
            if (abstractInsnNode instanceof LineNumberNode) {
                LineNumberNode lineNumberNode2 = (LineNumberNode)abstractInsnNode;
                if (lineNumberNode2.line == n) {
                    lineNumberNode = lineNumberNode2;
                }
            }
            if (lineNumberNode == null || !(abstractInsnNode instanceof LabelNode)) continue;
            insnList.add((AbstractInsnNode)new VarInsnNode(25, this.n));
            insnList.add((AbstractInsnNode)new MethodInsnNode(182, this.o, string, "()Z", false));
            insnList.add((AbstractInsnNode)new JumpInsnNode(154, (LabelNode)abstractInsnNode));
            break;
        }
        this.c.instructions.insert(lineNumberNode, insnList);
        return this;
    }

    public iReSqtkUVgsNXiReSqtkUVg a(int n, String string, String string2) {
        ListIterator listIterator = this.c.instructions.iterator();
        VarInsnNode varInsnNode = null;
        InsnList insnList = new InsnList();
        boolean bl = false;
        while (listIterator.hasNext()) {
            AbstractInsnNode abstractInsnNode = (AbstractInsnNode)listIterator.next();
            insnList.add(abstractInsnNode);
            if (!(abstractInsnNode instanceof LineNumberNode)) continue;
            LineNumberNode lineNumberNode = (LineNumberNode)abstractInsnNode;
            if (lineNumberNode.line != n) continue;
            while (listIterator.hasNext()) {
                abstractInsnNode = (AbstractInsnNode)listIterator.next();
                if (abstractInsnNode instanceof VarInsnNode) {
                    varInsnNode = (VarInsnNode)abstractInsnNode;
                }
                if (abstractInsnNode instanceof FieldInsnNode && !bl) {
                    FieldInsnNode fieldInsnNode = (FieldInsnNode)abstractInsnNode;
                    if (fieldInsnNode.name.equals(string)) {
                        bl = true;
                        varInsnNode.var = this.n;
                        MethodInsnNode methodInsnNode = new MethodInsnNode(182, this.o, string2, "()" + fieldInsnNode.desc, false);
                        insnList.add((AbstractInsnNode)methodInsnNode);
                        insnList.insert((AbstractInsnNode)varInsnNode, (AbstractInsnNode)methodInsnNode);
                        insnList.add((AbstractInsnNode)fieldInsnNode);
                        insnList.remove((AbstractInsnNode)fieldInsnNode);
                        continue;
                    }
                }
                insnList.add(abstractInsnNode);
            }
        }
        this.c.instructions.clear();
        this.c.instructions = insnList;
        return this;
    }

    public static int a(String string) {
        switch (string) {
            case "D": {
                return 24;
            }
            case "I": {
                return 21;
            }
            case "F": {
                return 23;
            }
            case "Z": {
                return 21;
            }
        }
        return 25;
    }

    public static int b(String string) {
        switch (string) {
            case "D": {
                return 57;
            }
            case "I": {
                return 21;
            }
            case "F": {
                return 56;
            }
            case "Z": {
                return 54;
            }
        }
        return 58;
    }

    public static int c(String string) {
        int n = string.indexOf(")") + 1;
        switch (string = string.substring(n, n + 1)) {
            case "I": 
            case "Z": {
                return 172;
            }
            case "F": {
                return 174;
            }
            case "D": {
                return 175;
            }
            case "V": {
                return 177;
            }
        }
        return 176;
    }

    static {
        q = 1;
        p = "fire";
    }
}

