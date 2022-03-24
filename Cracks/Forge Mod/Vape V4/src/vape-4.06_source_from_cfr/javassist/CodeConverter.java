/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CodeConverter$ArrayAccessReplacementMethodNames;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MethodInfo;
import javassist.convert.TransformAccessArrayField;
import javassist.convert.TransformAfter;
import javassist.convert.TransformBefore;
import javassist.convert.TransformCall;
import javassist.convert.TransformCallToStatic;
import javassist.convert.TransformFieldAccess;
import javassist.convert.TransformNew;
import javassist.convert.TransformNewClass;
import javassist.convert.TransformReadField;
import javassist.convert.TransformWriteField;
import javassist.convert.Transformer;

public class CodeConverter {
    protected Transformer transformers = null;

    public void replaceNew(CtClass ctClass, CtClass ctClass2, String string) {
        this.transformers = new TransformNew(this.transformers, ctClass.getName(), ctClass2.getName(), string);
    }

    public void replaceNew(CtClass ctClass, CtClass ctClass2) {
        this.transformers = new TransformNewClass(this.transformers, ctClass.getName(), ctClass2.getName());
    }

    public void redirectFieldAccess(CtField ctField, CtClass ctClass, String string) {
        this.transformers = new TransformFieldAccess(this.transformers, ctField, ctClass.getName(), string);
    }

    public void replaceFieldRead(CtField ctField, CtClass ctClass, String string) {
        this.transformers = new TransformReadField(this.transformers, ctField, ctClass.getName(), string);
    }

    public void replaceFieldWrite(CtField ctField, CtClass ctClass, String string) {
        this.transformers = new TransformWriteField(this.transformers, ctField, ctClass.getName(), string);
    }

    public void replaceArrayAccess(CtClass ctClass, CodeConverter$ArrayAccessReplacementMethodNames codeConverter$ArrayAccessReplacementMethodNames) throws NotFoundException {
        this.transformers = new TransformAccessArrayField(this.transformers, ctClass.getName(), codeConverter$ArrayAccessReplacementMethodNames);
    }

    public void redirectMethodCall(CtMethod ctMethod, CtMethod ctMethod2) throws CannotCompileException {
        String string;
        String string2 = ctMethod.getMethodInfo2().getDescriptor();
        if (!string2.equals(string = ctMethod2.getMethodInfo2().getDescriptor())) {
            throw new CannotCompileException("signature mismatch: " + ctMethod2.getLongName());
        }
        int n6 = ctMethod.getModifiers();
        int n10 = ctMethod2.getModifiers();
        if (Modifier.isStatic(n6) != Modifier.isStatic(n10) || Modifier.isPrivate(n6) && !Modifier.isPrivate(n10) || ctMethod.getDeclaringClass().isInterface() != ctMethod2.getDeclaringClass().isInterface()) {
            throw new CannotCompileException("invoke-type mismatch " + ctMethod2.getLongName());
        }
        this.transformers = new TransformCall(this.transformers, ctMethod, ctMethod2);
    }

    public void redirectMethodCall(String string, CtMethod ctMethod) throws CannotCompileException {
        this.transformers = new TransformCall(this.transformers, string, ctMethod);
    }

    public void redirectMethodCallToStatic(CtMethod ctMethod, CtMethod ctMethod2) {
        this.transformers = new TransformCallToStatic(this.transformers, ctMethod, ctMethod2);
    }

    public void insertBeforeMethod(CtMethod ctMethod, CtMethod ctMethod2) throws CannotCompileException {
        try {
            this.transformers = new TransformBefore(this.transformers, ctMethod, ctMethod2);
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
    }

    public void insertAfterMethod(CtMethod ctMethod, CtMethod ctMethod2) throws CannotCompileException {
        try {
            this.transformers = new TransformAfter(this.transformers, ctMethod, ctMethod2);
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
    }

    protected void doit(CtClass ctClass, MethodInfo methodInfo, ConstPool constPool) throws CannotCompileException {
        int n6;
        Transformer transformer;
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        if (codeAttribute == null || this.transformers == null) {
            return;
        }
        for (transformer = this.transformers; transformer != null; transformer = transformer.d()) {
            transformer.initialize(constPool, ctClass, methodInfo);
        }
        CodeIterator codeIterator = codeAttribute.iterator();
        while (codeIterator.hasNext()) {
            try {
                n6 = codeIterator.next();
                for (transformer = this.transformers; transformer != null; transformer = transformer.d()) {
                    n6 = transformer.transform(ctClass, n6, codeIterator, constPool);
                }
            }
            catch (BadBytecode badBytecode) {
                throw new CannotCompileException(badBytecode);
            }
        }
        n6 = 0;
        int n10 = 0;
        for (transformer = this.transformers; transformer != null; transformer = transformer.d()) {
            int n11 = transformer.extraLocals();
            if (n11 > n6) {
                n6 = n11;
            }
            if ((n11 = transformer.f()) <= n10) continue;
            n10 = n11;
        }
        for (transformer = this.transformers; transformer != null; transformer = transformer.d()) {
            transformer.clean();
        }
        if (n6 > 0) {
            codeAttribute.setMaxLocals(codeAttribute.getMaxLocals() + n6);
        }
        if (n10 > 0) {
            codeAttribute.setMaxStack(codeAttribute.getMaxStack() + n10);
        }
        try {
            methodInfo.rebuildStackMapIf6(ctClass.getClassPool(), ctClass.getClassFile2());
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode.getMessage(), badBytecode);
        }
    }
}

