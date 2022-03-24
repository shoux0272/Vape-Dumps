/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.convert.TransformCall;
import javassist.convert.Transformer;

public class TransformBefore
extends TransformCall {
    protected CtClass[] parameterTypes;
    protected int locals;
    protected int maxLocals;
    protected byte[] saveCode;
    protected byte[] loadCode;

    public TransformBefore(Transformer transformer, CtMethod ctMethod, CtMethod ctMethod2) throws NotFoundException {
        super(transformer, ctMethod, ctMethod2);
        this.methodDescriptor = ctMethod.getMethodInfo2().getDescriptor();
        this.parameterTypes = ctMethod.getParameterTypes();
        this.locals = 0;
        this.maxLocals = 0;
        this.loadCode = null;
        this.saveCode = null;
    }

    @Override
    public void initialize(ConstPool constPool, CodeAttribute codeAttribute) {
        super.initialize(constPool, codeAttribute);
        this.locals = 0;
        this.maxLocals = codeAttribute.getMaxLocals();
        this.loadCode = null;
        this.saveCode = null;
    }

    @Override
    protected int match(int n6, int n10, CodeIterator codeIterator, int n11, ConstPool constPool) throws BadBytecode {
        if (this.newIndex == 0) {
            String string = Descriptor.ofParameters(this.parameterTypes) + 'V';
            string = Descriptor.insertParameter(this.classname, string);
            int n12 = constPool.addNameAndTypeInfo(this.newMethodname, string);
            int n13 = constPool.addClassInfo(this.newClassname);
            this.newIndex = constPool.addMethodrefInfo(n13, n12);
            this.constPool = constPool;
        }
        if (this.saveCode == null) {
            this.makeCode(this.parameterTypes, constPool);
        }
        return this.match2(n10, codeIterator);
    }

    protected int match2(int n6, CodeIterator codeIterator) throws BadBytecode {
        codeIterator.move(n6);
        codeIterator.insert(this.saveCode);
        codeIterator.insert(this.loadCode);
        int n10 = codeIterator.insertGap(3);
        codeIterator.writeByte(184, n10);
        codeIterator.write16bit(this.newIndex, n10 + 1);
        codeIterator.insert(this.loadCode);
        return codeIterator.next();
    }

    @Override
    public int extraLocals() {
        return this.locals;
    }

    protected void makeCode(CtClass[] arrctClass, ConstPool constPool) {
        Bytecode bytecode = new Bytecode(constPool, 0, 0);
        Bytecode bytecode2 = new Bytecode(constPool, 0, 0);
        int n6 = this.maxLocals;
        int n10 = arrctClass == null ? 0 : arrctClass.length;
        bytecode2.addAload(n6);
        this.makeCode2(bytecode, bytecode2, 0, n10, arrctClass, n6 + 1);
        bytecode.addAstore(n6);
        this.saveCode = bytecode.get();
        this.loadCode = bytecode2.get();
    }

    private void makeCode2(Bytecode bytecode, Bytecode bytecode2, int n6, int n10, CtClass[] arrctClass, int n11) {
        if (n6 < n10) {
            int n12 = bytecode2.addLoad(n11, arrctClass[n6]);
            this.makeCode2(bytecode, bytecode2, n6 + 1, n10, arrctClass, n11 + n12);
            bytecode.addStore(n11, arrctClass[n6]);
        } else {
            this.locals = n11 - this.maxLocals;
        }
    }
}

