/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.convert.Transformer;

public class TransformCall
extends Transformer {
    protected String classname;
    protected String methodname;
    protected String methodDescriptor;
    protected String newClassname;
    protected String newMethodname;
    protected boolean newMethodIsPrivate;
    protected int newIndex;
    protected ConstPool constPool;

    public TransformCall(Transformer transformer, CtMethod ctMethod, CtMethod ctMethod2) {
        this(transformer, ctMethod.getName(), ctMethod2);
        this.classname = ctMethod.getDeclaringClass().getName();
    }

    public TransformCall(Transformer transformer, String string, CtMethod ctMethod) {
        super(transformer);
        this.methodname = string;
        this.methodDescriptor = ctMethod.getMethodInfo2().getDescriptor();
        this.classname = this.newClassname = ctMethod.getDeclaringClass().getName();
        this.newMethodname = ctMethod.getName();
        this.constPool = null;
        this.newMethodIsPrivate = Modifier.isPrivate(ctMethod.getModifiers());
    }

    @Override
    public void initialize(ConstPool constPool, CodeAttribute codeAttribute) {
        if (this.constPool != constPool) {
            this.newIndex = 0;
        }
    }

    @Override
    public int transform(CtClass ctClass, int n6, CodeIterator codeIterator, ConstPool constPool) throws BadBytecode {
        int n10;
        String string;
        int n11 = codeIterator.byteAt(n6);
        if ((n11 == 185 || n11 == 183 || n11 == 184 || n11 == 182) && (string = constPool.eqMember(this.methodname, this.methodDescriptor, n10 = codeIterator.u16bitAt(n6 + 1))) != null && this.matchClass(string, ctClass.getClassPool())) {
            int n12 = constPool.getMemberNameAndType(n10);
            n6 = this.match(n11, n6, codeIterator, constPool.getNameAndTypeDescriptor(n12), constPool);
        }
        return n6;
    }

    private boolean matchClass(String string, ClassPool classPool) {
        if (this.classname.equals(string)) {
            return true;
        }
        try {
            CtClass ctClass = classPool.get(string);
            CtClass ctClass2 = classPool.get(this.classname);
            if (ctClass.subtypeOf(ctClass2)) {
                try {
                    CtMethod ctMethod = ctClass.getMethod(this.methodname, this.methodDescriptor);
                    return ctMethod.getDeclaringClass().getName().equals(this.classname);
                }
                catch (NotFoundException notFoundException) {
                    return true;
                }
            }
        }
        catch (NotFoundException notFoundException) {
            return false;
        }
        return false;
    }

    protected int match(int n6, int n10, CodeIterator codeIterator, int n11, ConstPool constPool) throws BadBytecode {
        if (this.newIndex == 0) {
            int n12 = constPool.addNameAndTypeInfo(constPool.addUtf8Info(this.newMethodname), n11);
            int n13 = constPool.addClassInfo(this.newClassname);
            if (n6 == 185) {
                this.newIndex = constPool.addInterfaceMethodrefInfo(n13, n12);
            } else {
                if (this.newMethodIsPrivate && n6 == 182) {
                    codeIterator.writeByte(183, n10);
                }
                this.newIndex = constPool.addMethodrefInfo(n13, n12);
            }
            this.constPool = constPool;
        }
        codeIterator.write16bit(this.newIndex, n10 + 1);
        return n10;
    }
}

