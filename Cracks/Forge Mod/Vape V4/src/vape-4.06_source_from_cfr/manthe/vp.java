/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import manthe.on;
import manthe.qa;
import manthe.y;
import manthe.yb;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class vp {
    private Class n;
    private ClassNode i;
    private MethodNode q;
    private List<y> g = new ArrayList<y>();
    private LabelNode j = new LabelNode(new Label());
    private boolean c;
    private y e;
    private Class m;
    private int f;
    private InsnList r;
    private boolean k;
    private String l;
    private int a;
    private String p;
    private static String o;
    private static int d;
    private boolean h;
    private static int[] b;

    public vp(int n6, Class class_, ClassNode classNode, qa qa2, boolean bl, y ... arry) {
        for (MethodNode methodNode : classNode.methods) {
            if (!qa2.a(methodNode.name, methodNode.desc)) continue;
            this.q = methodNode;
        }
        if (this.q == null) {
            on.a("Couldnt find method node");
        }
        this.f = n6;
        this.n = class_;
        this.i = classNode;
        for (y y3 : arry) {
            y3.a(classNode, this.q);
            this.g.add(y3);
        }
        this.h = bl;
    }

    public void a() {
        this.p = this.n.getName().replace(".", "/");
        if (this.f == 0) {
            for (y object22 : this.g) {
                if (!(object22 instanceof yb)) continue;
                ((yb)object22).a(this.j);
            }
        }
        InsnList insnList = new InsnList();
        LabelNode labelNode = new LabelNode(new Label());
        this.a = ++this.q.maxLocals;
        TypeInsnNode typeInsnNode = new TypeInsnNode(187, this.p);
        InsnNode insnNode = new InsnNode(89);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (y y3 : this.g) {
            stringBuilder.append(y3.c());
        }
        stringBuilder.append(")V");
        MethodInsnNode methodInsnNode = new MethodInsnNode(183, this.p, "<init>", stringBuilder.toString(), false);
        VarInsnNode varInsnNode = new VarInsnNode(58, this.a);
        VarInsnNode varInsnNode2 = new VarInsnNode(25, this.a);
        MethodInsnNode methodInsnNode2 = new MethodInsnNode(182, this.p, o, "()Z", false);
        insnList.add(this.j);
        if (this.f == 0 && !this.h) {
            for (LocalVariableNode localVariableNode : this.q.localVariables) {
                if (localVariableNode.index != 0) continue;
                localVariableNode.start = this.j;
            }
        }
        insnList.add(typeInsnNode);
        insnList.add(insnNode);
        for (y y10 : this.g) {
            insnList.add(y10.e());
        }
        insnList.add(methodInsnNode);
        insnList.add(methodInsnNode2);
        this.r = insnList;
    }

    public vp b() {
        if (this.f == 0) {
            for (AbstractInsnNode abstractInsnNode : this.q.instructions) {
                if (!(abstractInsnNode instanceof LabelNode)) continue;
                this.q.instructions.insertBefore(abstractInsnNode, this.r);
            }
        } else if (this.f == -1) {
            Iterator iterator = this.q.instructions.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                if (iterator.hasNext()) continue;
                while (iterator.hasPrevious()) {
                    AbstractInsnNode abstractInsnNode = (AbstractInsnNode)iterator.previous();
                    if (!(abstractInsnNode instanceof LineNumberNode)) continue;
                    this.q.instructions.insertBefore(abstractInsnNode, this.r);
                    return this;
                }
            }
        } else {
            for (AbstractInsnNode abstractInsnNode : this.q.instructions) {
                if (!(abstractInsnNode instanceof LineNumberNode)) continue;
                LineNumberNode lineNumberNode = (LineNumberNode)abstractInsnNode;
                if (lineNumberNode.line != this.f) continue;
                this.q.instructions.insertBefore((AbstractInsnNode)lineNumberNode, this.r);
                return this;
            }
        }
        return this;
    }

    public static int b(String string) {
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
            case "J": {
                return 22;
            }
        }
        return 25;
    }

    public static int d(String string) {
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
            case "J": {
                return 55;
            }
        }
        return 58;
    }

    public static int c(String string) {
        int n6 = string.indexOf(")") + 1;
        switch (string = string.substring(n6, n6 + 1)) {
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
            case "J": {
                return 173;
            }
        }
        return 176;
    }

    public static String e(String string) {
        int n6 = string.indexOf(")") + 1;
        string = string.substring(n6, n6 + 1);
        return string;
    }

    public static List<String> a(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        char[] arrc = string.toCharArray();
        for (int k = 0; k < arrc.length; ++k) {
            char c3 = arrc[k];
            if (c3 == '(') continue;
            if (c3 == ')') break;
            if (c3 == 'L') {
                String string2 = "";
                while ((c3 = arrc[k++]) != ';') {
                    string2 = string2 + c3;
                }
                --k;
                arrayList.add(string2);
                continue;
            }
            arrayList.add(Character.toString(c3));
        }
        return arrayList;
    }

    static {
        d = 1;
        o = "fire";
        vp.b(new int[5]);
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public static int[] c() {
        return b;
    }
}

