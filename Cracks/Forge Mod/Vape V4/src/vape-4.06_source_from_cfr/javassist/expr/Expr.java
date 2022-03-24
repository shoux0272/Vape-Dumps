/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import java.util.LinkedList;
import java.util.List;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtPrimitiveType;
import javassist.NotFoundException;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.ExceptionsAttribute;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.Opcode;
import javassist.expr.ExprEditor;
import javassist.expr.ExprEditor$LoopContext;

public abstract class Expr
implements Opcode {
    int currentPos;
    CodeIterator iterator;
    CtClass thisClass;
    MethodInfo thisMethod;
    boolean edited;
    int maxLocals;
    int maxStack;
    static final String javaLangObject = "java.lang.Object";
    private static boolean cL;

    protected Expr(int n6, CodeIterator codeIterator, CtClass ctClass, MethodInfo methodInfo) {
        this.currentPos = n6;
        this.iterator = codeIterator;
        this.thisClass = ctClass;
        this.thisMethod = methodInfo;
    }

    public CtClass getEnclosingClass() {
        return this.thisClass;
    }

    protected final ConstPool getConstPool() {
        return this.thisMethod.getConstPool();
    }

    protected final boolean edited() {
        return this.edited;
    }

    protected final int locals() {
        return this.maxLocals;
    }

    protected final int stack() {
        return this.maxStack;
    }

    protected final boolean withinStatic() {
        return (this.thisMethod.getAccessFlags() & 8) != 0;
    }

    public CtBehavior where() {
        MethodInfo methodInfo = this.thisMethod;
        CtBehavior[] arrctBehavior = this.thisClass.getDeclaredBehaviors();
        for (int k = arrctBehavior.length - 1; k >= 0; --k) {
            if (arrctBehavior[k].getMethodInfo2() != methodInfo) continue;
            return arrctBehavior[k];
        }
        CtConstructor ctConstructor = this.thisClass.getClassInitializer();
        if (ctConstructor != null && ctConstructor.getMethodInfo2() == methodInfo) {
            return ctConstructor;
        }
        for (int k = arrctBehavior.length - 1; k >= 0; --k) {
            if (!this.thisMethod.getName().equals(arrctBehavior[k].getMethodInfo2().getName()) || !this.thisMethod.getDescriptor().equals(arrctBehavior[k].getMethodInfo2().getDescriptor())) continue;
            return arrctBehavior[k];
        }
        throw new RuntimeException("fatal: not found");
    }

    public CtClass[] mayThrow() {
        int n6;
        int n10;
        String[] arrstring;
        AttributeInfo attributeInfo;
        ClassPool classPool = this.thisClass.getClassPool();
        ConstPool constPool = this.thisMethod.getConstPool();
        LinkedList<CtClass> linkedList = new LinkedList<CtClass>();
        try {
            attributeInfo = this.thisMethod.getCodeAttribute();
            arrstring = ((CodeAttribute)attributeInfo).getExceptionTable();
            n10 = this.currentPos;
            n6 = arrstring.size();
            for (int k = 0; k < n6; ++k) {
                int n11;
                if (arrstring.startPc(k) > n10 || n10 >= arrstring.endPc(k) || (n11 = arrstring.catchType(k)) <= 0) continue;
                try {
                    Expr.addClass(linkedList, classPool.get(constPool.getClassInfo(n11)));
                    continue;
                }
                catch (NotFoundException notFoundException) {
                    // empty catch block
                }
            }
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        if ((attributeInfo = this.thisMethod.getExceptionsAttribute()) != null && (arrstring = ((ExceptionsAttribute)attributeInfo).getExceptions()) != null) {
            n10 = arrstring.length;
            for (n6 = 0; n6 < n10; ++n6) {
                try {
                    Expr.addClass(linkedList, classPool.get(arrstring[n6]));
                    continue;
                }
                catch (NotFoundException notFoundException) {
                    // empty catch block
                }
            }
        }
        return linkedList.toArray(new CtClass[linkedList.size()]);
    }

    private static void addClass(List<CtClass> list, CtClass ctClass) {
        if (list.contains(ctClass)) {
            return;
        }
        list.add(ctClass);
    }

    public int indexOfBytecode() {
        return this.currentPos;
    }

    public int getLineNumber() {
        return this.thisMethod.getLineNumber(this.currentPos);
    }

    public String getFileName() {
        ClassFile classFile = this.thisClass.getClassFile2();
        if (classFile == null) {
            return null;
        }
        return classFile.getSourceFile();
    }

    static final boolean checkResultValue(CtClass ctClass, String string) throws CannotCompileException {
        boolean bl;
        boolean bl2 = bl = string.indexOf("$_") >= 0;
        if (!bl && ctClass != CtClass.voidType) {
            throw new CannotCompileException("the resulting value is not stored in $_");
        }
        return bl;
    }

    static final void storeStack(CtClass[] arrctClass, boolean bl, int n6, Bytecode bytecode) {
        Expr.storeStack0(0, arrctClass.length, arrctClass, n6 + 1, bytecode);
        if (bl) {
            bytecode.addOpcode(1);
        }
        bytecode.addAstore(n6);
    }

    private static void storeStack0(int n6, int n10, CtClass[] arrctClass, int n11, Bytecode bytecode) {
        if (n6 >= n10) {
            return;
        }
        CtClass ctClass = arrctClass[n6];
        int n12 = ctClass instanceof CtPrimitiveType ? ((CtPrimitiveType)ctClass).getDataSize() : 1;
        Expr.storeStack0(n6 + 1, n10, arrctClass, n11 + n12, bytecode);
        bytecode.addStore(n11, ctClass);
    }

    public abstract void replace(String var1) throws CannotCompileException;

    public void replace(String string, ExprEditor exprEditor) throws CannotCompileException {
        this.replace(string);
        if (exprEditor != null) {
            this.runEditor(exprEditor, this.iterator);
        }
    }

    protected void replace0(int n6, Bytecode bytecode, int n10) throws BadBytecode {
        byte[] arrby = bytecode.get();
        this.edited = true;
        int n11 = arrby.length - n10;
        for (int k = 0; k < n10; ++k) {
            this.iterator.writeByte(0, n6 + k);
        }
        if (n11 > 0) {
            n6 = this.iterator.insertGapAt((int)n6, (int)n11, (boolean)false).position;
        }
        this.iterator.write(arrby, n6);
        this.iterator.insert(bytecode.getExceptionTable(), n6);
        this.maxLocals = bytecode.getMaxLocals();
        this.maxStack = bytecode.getMaxStack();
    }

    protected void runEditor(ExprEditor exprEditor, CodeIterator codeIterator) throws CannotCompileException {
        CodeAttribute codeAttribute = codeIterator.get();
        int n6 = codeAttribute.getMaxLocals();
        int n10 = codeAttribute.getMaxStack();
        int n11 = this.locals();
        codeAttribute.setMaxStack(this.stack());
        codeAttribute.setMaxLocals(n11);
        ExprEditor$LoopContext exprEditor$LoopContext = new ExprEditor$LoopContext(n11);
        int n12 = codeIterator.getCodeLength();
        int n13 = codeIterator.lookAhead();
        codeIterator.move(this.currentPos);
        if (exprEditor.doit(this.thisClass, this.thisMethod, exprEditor$LoopContext, codeIterator, n13)) {
            this.edited = true;
        }
        codeIterator.move(n13 + codeIterator.getCodeLength() - n12);
        codeAttribute.setMaxLocals(n6);
        codeAttribute.setMaxStack(n10);
        this.maxLocals = exprEditor$LoopContext.maxLocals;
        this.maxStack += exprEditor$LoopContext.maxStack;
    }

    public static void b(boolean bl) {
        cL = bl;
    }

    public static boolean c() {
        return cL;
    }

    public static boolean j() {
        boolean bl = Expr.c();
        return !bl;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    static {
        if (Expr.j()) {
            Expr.b(true);
        }
    }
}

