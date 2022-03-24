/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import java.util.ArrayList;
import java.util.List;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.AccessFlag;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.MethodInfo;
import javassist.compiler.AccessorMaker;
import javassist.compiler.CodeGen;
import javassist.compiler.CompileError;
import javassist.compiler.MemberCodeGen$JsrHook;
import javassist.compiler.MemberCodeGen$JsrHook2;
import javassist.compiler.MemberResolver;
import javassist.compiler.MemberResolver$Method;
import javassist.compiler.NoFieldException;
import javassist.compiler.TypeChecker;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.ArrayInit;
import javassist.compiler.ast.CallExpr;
import javassist.compiler.ast.Declarator;
import javassist.compiler.ast.Expr;
import javassist.compiler.ast.Keyword;
import javassist.compiler.ast.Member;
import javassist.compiler.ast.MethodDecl;
import javassist.compiler.ast.NewExpr;
import javassist.compiler.ast.Pair;
import javassist.compiler.ast.Stmnt;
import javassist.compiler.ast.Symbol;

public class MemberCodeGen
extends CodeGen {
    protected MemberResolver resolver;
    protected CtClass thisClass;
    protected MethodInfo thisMethod;
    protected boolean resultStatic;

    public MemberCodeGen(Bytecode bytecode, CtClass ctClass, ClassPool classPool) {
        super(bytecode);
        this.resolver = new MemberResolver(classPool);
        this.thisClass = ctClass;
        this.thisMethod = null;
    }

    public int getMajorVersion() {
        ClassFile classFile = this.thisClass.getClassFile2();
        if (classFile == null) {
            return ClassFile.MAJOR_VERSION;
        }
        return classFile.getMajorVersion();
    }

    public void setThisMethod(CtMethod ctMethod) {
        this.thisMethod = ctMethod.getMethodInfo2();
        if (this.typeChecker != null) {
            this.typeChecker.setThisMethod(this.thisMethod);
        }
    }

    public CtClass getThisClass() {
        return this.thisClass;
    }

    @Override
    protected String getThisName() {
        return MemberResolver.javaToJvmName(this.thisClass.getName());
    }

    @Override
    protected String getSuperName() throws CompileError {
        return MemberResolver.javaToJvmName(MemberResolver.getSuperclass(this.thisClass).getName());
    }

    @Override
    protected void insertDefaultSuperCall() throws CompileError {
        this.bytecode.addAload(0);
        this.bytecode.addInvokespecial(MemberResolver.getSuperclass(this.thisClass), "<init>", "()V");
    }

    @Override
    protected void atTryStmnt(Stmnt stmnt) throws CompileError {
        boolean bl;
        Bytecode bytecode = this.bytecode;
        Stmnt stmnt2 = (Stmnt)stmnt.getLeft();
        if (stmnt2 == null) {
            return;
        }
        ASTList aSTList = (ASTList)stmnt.getRight().getLeft();
        Stmnt stmnt3 = (Stmnt)stmnt.getRight().getRight().getLeft();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        MemberCodeGen$JsrHook memberCodeGen$JsrHook = null;
        if (stmnt3 != null) {
            memberCodeGen$JsrHook = new MemberCodeGen$JsrHook(this);
        }
        int n6 = bytecode.currentPc();
        stmnt2.accept(this);
        int n10 = bytecode.currentPc();
        if (n6 == n10) {
            throw new CompileError("empty try block");
        }
        boolean bl2 = bl = !this.hasReturned;
        if (bl) {
            bytecode.addOpcode(167);
            arrayList.add(bytecode.currentPc());
            bytecode.addIndex(0);
        }
        int n11 = this.getMaxLocals();
        this.incMaxLocals(1);
        while (aSTList != null) {
            Pair pair = (Pair)aSTList.head();
            aSTList = aSTList.tail();
            Declarator declarator = (Declarator)pair.getLeft();
            Stmnt stmnt4 = (Stmnt)pair.getRight();
            declarator.setLocalVar(n11);
            CtClass ctClass = this.resolver.lookupClassByJvmName(declarator.getClassName());
            declarator.setClassName(MemberResolver.javaToJvmName(ctClass.getName()));
            bytecode.addExceptionHandler(n6, n10, bytecode.currentPc(), ctClass);
            bytecode.growStack(1);
            bytecode.addAstore(n11);
            this.hasReturned = false;
            if (stmnt4 != null) {
                stmnt4.accept(this);
            }
            if (this.hasReturned) continue;
            bytecode.addOpcode(167);
            arrayList.add(bytecode.currentPc());
            bytecode.addIndex(0);
            bl = true;
        }
        if (stmnt3 != null) {
            memberCodeGen$JsrHook.remove(this);
            int n12 = bytecode.currentPc();
            bytecode.addExceptionHandler(n6, n12, n12, 0);
            bytecode.growStack(1);
            bytecode.addAstore(n11);
            this.hasReturned = false;
            stmnt3.accept(this);
            if (!this.hasReturned) {
                bytecode.addAload(n11);
                bytecode.addOpcode(191);
            }
            this.addFinally(memberCodeGen$JsrHook.jsrList, stmnt3);
        }
        int n13 = bytecode.currentPc();
        this.patchGoto(arrayList, n13);
        boolean bl3 = this.hasReturned = !bl;
        if (stmnt3 != null && bl) {
            stmnt3.accept(this);
        }
    }

    private void addFinally(List<int[]> list, Stmnt stmnt) throws CompileError {
        Bytecode bytecode = this.bytecode;
        for (int[] arrn : list) {
            int n6 = arrn[0];
            bytecode.write16bit(n6, bytecode.currentPc() - n6 + 1);
            MemberCodeGen$JsrHook2 memberCodeGen$JsrHook2 = new MemberCodeGen$JsrHook2(this, arrn);
            stmnt.accept(this);
            memberCodeGen$JsrHook2.remove(this);
            if (this.hasReturned) continue;
            bytecode.addOpcode(167);
            bytecode.addIndex(n6 + 3 - bytecode.currentPc());
        }
    }

    @Override
    public void atNewExpr(NewExpr newExpr) throws CompileError {
        if (newExpr.isArray()) {
            this.atNewArrayExpr(newExpr);
        } else {
            CtClass ctClass = this.resolver.lookupClassByName(newExpr.getClassName());
            String string = ctClass.getName();
            ASTList aSTList = newExpr.getArguments();
            this.bytecode.addNew(string);
            this.bytecode.addOpcode(89);
            this.atMethodCallCore(ctClass, "<init>", aSTList, false, true, -1, null);
            this.exprType = 307;
            this.arrayDim = 0;
            this.className = MemberResolver.javaToJvmName(string);
        }
    }

    public void atNewArrayExpr(NewExpr newExpr) throws CompileError {
        int n6 = newExpr.getArrayType();
        ASTList aSTList = newExpr.getArraySize();
        ASTList aSTList2 = newExpr.getClassName();
        ArrayInit arrayInit = newExpr.getInitializer();
        if (aSTList.length() > 1) {
            if (arrayInit != null) {
                throw new CompileError("sorry, multi-dimensional array initializer for new is not supported");
            }
            this.atMultiNewArray(n6, aSTList2, aSTList);
            return;
        }
        ASTree aSTree = aSTList.head();
        this.atNewArrayExpr2(n6, aSTree, Declarator.astToClassName(aSTList2, '/'), arrayInit);
    }

    private void atNewArrayExpr2(int n6, ASTree aSTree, String string, ArrayInit arrayInit) throws CompileError {
        int n10;
        String string2;
        if (arrayInit == null) {
            if (aSTree == null) {
                throw new CompileError("no array size");
            }
            aSTree.accept(this);
        } else if (aSTree == null) {
            int n11 = arrayInit.h();
            this.bytecode.addIconst(n11);
        } else {
            throw new CompileError("unnecessary array size specified for new");
        }
        if (n6 == 307) {
            string2 = this.resolveClassName(string);
            this.bytecode.addAnewarray(MemberResolver.jvmToJavaName(string2));
        } else {
            string2 = null;
            n10 = 0;
            switch (n6) {
                case 301: {
                    n10 = 4;
                    break;
                }
                case 306: {
                    n10 = 5;
                    break;
                }
                case 317: {
                    n10 = 6;
                    break;
                }
                case 312: {
                    n10 = 7;
                    break;
                }
                case 303: {
                    n10 = 8;
                    break;
                }
                case 334: {
                    n10 = 9;
                    break;
                }
                case 324: {
                    n10 = 10;
                    break;
                }
                case 326: {
                    n10 = 11;
                    break;
                }
                default: {
                    MemberCodeGen.badNewExpr();
                }
            }
            this.bytecode.addOpcode(188);
            this.bytecode.add(n10);
        }
        if (arrayInit != null) {
            n10 = arrayInit.h();
            ASTList aSTList = arrayInit;
            for (int k = 0; k < n10; ++k) {
                this.bytecode.addOpcode(89);
                this.bytecode.addIconst(k);
                aSTList.head().accept(this);
                if (!MemberCodeGen.isRefType(n6)) {
                    this.atNumCastExpr(this.exprType, n6);
                }
                this.bytecode.addOpcode(MemberCodeGen.getArrayWriteOp(n6, 0));
                aSTList = aSTList.tail();
            }
        }
        this.exprType = n6;
        this.arrayDim = 1;
        this.className = string2;
    }

    private static void badNewExpr() throws CompileError {
        throw new CompileError("bad new expression");
    }

    @Override
    protected void atArrayVariableAssign(ArrayInit arrayInit, int n6, int n10, String string) throws CompileError {
        this.atNewArrayExpr2(n6, null, string, arrayInit);
    }

    @Override
    public void atArrayInit(ArrayInit arrayInit) throws CompileError {
        throw new CompileError("array initializer is not supported");
    }

    protected void atMultiNewArray(int n6, ASTList aSTList, ASTList aSTList2) throws CompileError {
        Object object;
        int n10 = aSTList2.length();
        int n11 = 0;
        while (aSTList2 != null) {
            object = aSTList2.head();
            if (object == null) break;
            ++n11;
            ((ASTree)object).accept(this);
            if (this.exprType != 324) {
                throw new CompileError("bad type for array size");
            }
            aSTList2 = aSTList2.tail();
        }
        this.exprType = n6;
        this.arrayDim = n10;
        if (n6 == 307) {
            this.className = this.resolveClassName(aSTList);
            object = MemberCodeGen.toJvmArrayName(this.className, n10);
        } else {
            object = MemberCodeGen.toJvmTypeName(n6, n10);
        }
        this.bytecode.addMultiNewarray((String)object, n11);
    }

    @Override
    public void atCallExpr(CallExpr callExpr) throws CompileError {
        String string = null;
        CtClass ctClass = null;
        ASTree aSTree = callExpr.oprand1();
        ASTList aSTList = (ASTList)callExpr.oprand2();
        boolean bl = false;
        boolean bl2 = false;
        int n6 = -1;
        MemberResolver$Method memberResolver$Method = callExpr.getMethod();
        if (aSTree instanceof Member) {
            string = ((Member)aSTree).get();
            ctClass = this.thisClass;
            if (this.inStaticMethod || memberResolver$Method != null && memberResolver$Method.isStatic()) {
                bl = true;
            } else {
                n6 = this.bytecode.currentPc();
                this.bytecode.addAload(0);
            }
        } else if (aSTree instanceof Keyword) {
            bl2 = true;
            string = "<init>";
            ctClass = this.thisClass;
            if (this.inStaticMethod) {
                throw new CompileError("a constructor cannot be static");
            }
            this.bytecode.addAload(0);
            if (((Keyword)aSTree).get() == 336) {
                ctClass = MemberResolver.getSuperclass(ctClass);
            }
        } else if (aSTree instanceof Expr) {
            Expr expr = (Expr)aSTree;
            string = ((Symbol)expr.oprand2()).get();
            int n10 = expr.getOperator();
            if (n10 == 35) {
                ctClass = this.resolver.lookupClass(((Symbol)expr.oprand1()).get(), false);
                bl = true;
            } else if (n10 == 46) {
                ASTree aSTree2 = expr.oprand1();
                String string2 = TypeChecker.isDotSuper(aSTree2);
                if (string2 != null) {
                    bl2 = true;
                    ctClass = MemberResolver.getSuperInterface(this.thisClass, string2);
                    if (this.inStaticMethod || memberResolver$Method != null && memberResolver$Method.isStatic()) {
                        bl = true;
                    } else {
                        n6 = this.bytecode.currentPc();
                        this.bytecode.addAload(0);
                    }
                } else {
                    if (aSTree2 instanceof Keyword && ((Keyword)aSTree2).get() == 336) {
                        bl2 = true;
                    }
                    try {
                        aSTree2.accept(this);
                    }
                    catch (NoFieldException noFieldException) {
                        if (noFieldException.getExpr() != aSTree2) {
                            throw noFieldException;
                        }
                        this.exprType = 307;
                        this.arrayDim = 0;
                        this.className = noFieldException.getField();
                        bl = true;
                    }
                    if (this.arrayDim > 0) {
                        ctClass = this.resolver.lookupClass("java.lang.Object", true);
                    } else if (this.exprType == 307) {
                        ctClass = this.resolver.lookupClassByJvmName(this.className);
                    } else {
                        MemberCodeGen.badMethod();
                    }
                }
            } else {
                MemberCodeGen.badMethod();
            }
        } else {
            MemberCodeGen.fatal();
        }
        this.atMethodCallCore(ctClass, string, aSTList, bl, bl2, n6, memberResolver$Method);
    }

    private static void badMethod() throws CompileError {
        throw new CompileError("bad method");
    }

    public void atMethodCallCore(CtClass ctClass, String string, ASTList aSTList, boolean bl, boolean bl2, int n6, MemberResolver$Method memberResolver$Method) throws CompileError {
        int n10 = this.getMethodArgsLength(aSTList);
        int[] arrn = new int[n10];
        int[] arrn2 = new int[n10];
        String[] arrstring = new String[n10];
        if (!bl && memberResolver$Method != null && memberResolver$Method.isStatic()) {
            this.bytecode.addOpcode(87);
            bl = true;
        }
        int n11 = this.bytecode.getStackDepth();
        this.atMethodArgs(aSTList, arrn, arrn2, arrstring);
        if (memberResolver$Method == null) {
            memberResolver$Method = this.resolver.lookupMethod(ctClass, this.thisClass, this.thisMethod, string, arrn, arrn2, arrstring);
        }
        if (memberResolver$Method == null) {
            String string2 = string.equals("<init>") ? "constructor not found" : "Method " + string + " not found in " + ctClass.getName();
            throw new CompileError(string2);
        }
        this.atMethodCallCore2(ctClass, string, bl, bl2, n6, memberResolver$Method);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean isFromSameDeclaringClass(CtClass ctClass, CtClass ctClass2) {
        try {
            while (true) {
                if (ctClass == null) {
                    return false;
                }
                if (this.isEnclosing(ctClass, ctClass2)) {
                    return true;
                }
                ctClass = ctClass.getDeclaringClass();
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        return false;
    }

    private void atMethodCallCore2(CtClass ctClass, String string, boolean bl, boolean bl2, int n6, MemberResolver$Method memberResolver$Method) throws CompileError {
        CtClass ctClass2 = memberResolver$Method.declaring;
        MethodInfo methodInfo = memberResolver$Method.info;
        String string2 = methodInfo.getDescriptor();
        int n10 = methodInfo.getAccessFlags();
        if (string.equals("<init>")) {
            bl2 = true;
            if (ctClass2 != ctClass) {
                throw new CompileError("no such constructor: " + ctClass.getName());
            }
            if (ctClass2 != this.thisClass && AccessFlag.isPrivate(n10) && (ctClass2.getClassFile().getMajorVersion() < 55 || !this.isFromSameDeclaringClass(ctClass2, this.thisClass))) {
                string2 = this.getAccessibleConstructor(string2, ctClass2, methodInfo);
                this.bytecode.addOpcode(1);
            }
        } else if (AccessFlag.isPrivate(n10)) {
            if (ctClass2 == this.thisClass) {
                bl2 = true;
            } else {
                bl2 = false;
                bl = true;
                String string3 = string2;
                if ((n10 & 8) == 0) {
                    string2 = Descriptor.insertParameter(ctClass2.getName(), string3);
                }
                n10 = AccessFlag.setPackage(n10) | 8;
                string = this.getAccessiblePrivate(string, string3, string2, methodInfo, ctClass2);
            }
        }
        boolean bl3 = false;
        if ((n10 & 8) != 0) {
            if (!bl) {
                bl = true;
                if (n6 >= 0) {
                    this.bytecode.write(n6, 0);
                } else {
                    bl3 = true;
                }
            }
            this.bytecode.addInvokestatic(ctClass2, string, string2);
        } else if (bl2) {
            this.bytecode.addInvokespecial(ctClass, string, string2);
        } else {
            if (!Modifier.isPublic(ctClass2.getModifiers()) || ctClass2.isInterface() != ctClass.isInterface()) {
                ctClass2 = ctClass;
            }
            if (ctClass2.isInterface()) {
                int n11 = Descriptor.paramSize(string2) + 1;
                this.bytecode.addInvokeinterface(ctClass2, string, string2, n11);
            } else {
                if (bl) {
                    throw new CompileError(String.valueOf(string) + " is not static");
                }
                this.bytecode.addInvokevirtual(ctClass2, string, string2);
            }
        }
        this.setReturnType(string2, bl, bl3);
    }

    protected String getAccessiblePrivate(String string, String string2, String string3, MethodInfo methodInfo, CtClass ctClass) throws CompileError {
        AccessorMaker accessorMaker;
        if (this.isEnclosing(ctClass, this.thisClass) && (accessorMaker = ctClass.getAccessorMaker()) != null) {
            return accessorMaker.getMethodAccessor(string, string2, string3, methodInfo);
        }
        throw new CompileError("Method " + string + " is private");
    }

    protected String getAccessibleConstructor(String string, CtClass ctClass, MethodInfo methodInfo) throws CompileError {
        AccessorMaker accessorMaker;
        if (this.isEnclosing(ctClass, this.thisClass) && (accessorMaker = ctClass.getAccessorMaker()) != null) {
            return accessorMaker.getConstructor(ctClass, string, methodInfo);
        }
        throw new CompileError("the called constructor is private in " + ctClass.getName());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean isEnclosing(CtClass ctClass, CtClass ctClass2) {
        try {
            do {
                if (ctClass2 != null) continue;
                return false;
            } while ((ctClass2 = ctClass2.getDeclaringClass()) != ctClass);
            return true;
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        return false;
    }

    public int getMethodArgsLength(ASTList aSTList) {
        return ASTList.length(aSTList);
    }

    public void atMethodArgs(ASTList aSTList, int[] arrn, int[] arrn2, String[] arrstring) throws CompileError {
        int n6 = 0;
        while (aSTList != null) {
            ASTree aSTree = aSTList.head();
            aSTree.accept(this);
            arrn[n6] = this.exprType;
            arrn2[n6] = this.arrayDim;
            arrstring[n6] = this.className;
            ++n6;
            aSTList = aSTList.tail();
        }
    }

    void setReturnType(String string, boolean bl, boolean bl2) throws CompileError {
        int n6;
        int n10 = string.indexOf(41);
        if (n10 < 0) {
            MemberCodeGen.badMethod();
        }
        char c3 = string.charAt(++n10);
        int n11 = 0;
        while (c3 == '[') {
            ++n11;
            c3 = string.charAt(++n10);
        }
        this.arrayDim = n11;
        if (c3 == 'L') {
            n6 = string.indexOf(59, n10 + 1);
            if (n6 < 0) {
                MemberCodeGen.badMethod();
            }
            this.exprType = 307;
            this.className = string.substring(n10 + 1, n6);
        } else {
            this.exprType = MemberResolver.descToType(c3);
            this.className = null;
        }
        n6 = this.exprType;
        if (bl && bl2) {
            if (MemberCodeGen.is2word(n6, n11)) {
                this.bytecode.addOpcode(93);
                this.bytecode.addOpcode(88);
                this.bytecode.addOpcode(87);
            } else if (n6 == 344) {
                this.bytecode.addOpcode(87);
            } else {
                this.bytecode.addOpcode(95);
                this.bytecode.addOpcode(87);
            }
        }
    }

    @Override
    protected void atFieldAssign(Expr expr, int n6, ASTree aSTree, ASTree aSTree2, boolean bl) throws CompileError {
        int n10;
        CtField ctField = this.fieldAccess(aSTree, false);
        boolean bl2 = this.resultStatic;
        if (n6 != 61 && !bl2) {
            this.bytecode.addOpcode(89);
        }
        if (n6 == 61) {
            FieldInfo fieldInfo = ctField.getFieldInfo2();
            this.setFieldType(fieldInfo);
            AccessorMaker accessorMaker = this.isAccessibleField(ctField, fieldInfo);
            n10 = accessorMaker == null ? this.addFieldrefInfo(ctField, fieldInfo) : 0;
        } else {
            n10 = this.atFieldRead(ctField, bl2);
        }
        int n11 = this.exprType;
        int n12 = this.arrayDim;
        String string = this.className;
        this.atAssignCore(expr, n6, aSTree2, n11, n12, string);
        boolean bl3 = MemberCodeGen.is2word(n11, n12);
        if (bl) {
            int n13 = bl2 ? (bl3 ? 92 : 89) : (bl3 ? 93 : 90);
            this.bytecode.addOpcode(n13);
        }
        this.atFieldAssignCore(ctField, bl2, n10, bl3);
        this.exprType = n11;
        this.arrayDim = n12;
        this.className = string;
    }

    private void atFieldAssignCore(CtField ctField, boolean bl, int n6, boolean bl2) throws CompileError {
        if (n6 != 0) {
            if (bl) {
                this.bytecode.add(179);
                this.bytecode.growStack(bl2 ? -2 : -1);
            } else {
                this.bytecode.add(181);
                this.bytecode.growStack(bl2 ? -3 : -2);
            }
            this.bytecode.addIndex(n6);
        } else {
            CtClass ctClass = ctField.getDeclaringClass();
            AccessorMaker accessorMaker = ctClass.getAccessorMaker();
            FieldInfo fieldInfo = ctField.getFieldInfo2();
            MethodInfo methodInfo = accessorMaker.getFieldSetter(fieldInfo, bl);
            this.bytecode.addInvokestatic(ctClass, methodInfo.getName(), methodInfo.getDescriptor());
        }
    }

    @Override
    public void atMember(Member member) throws CompileError {
        this.atFieldRead(member);
    }

    @Override
    protected void atFieldRead(ASTree aSTree) throws CompileError {
        CtField ctField = this.fieldAccess(aSTree, true);
        if (ctField == null) {
            this.atArrayLength(aSTree);
            return;
        }
        boolean bl = this.resultStatic;
        ASTree aSTree2 = TypeChecker.getConstantFieldValue(ctField);
        if (aSTree2 == null) {
            this.atFieldRead(ctField, bl);
        } else {
            aSTree2.accept(this);
            this.setFieldType(ctField.getFieldInfo2());
        }
    }

    private void atArrayLength(ASTree aSTree) throws CompileError {
        if (this.arrayDim == 0) {
            throw new CompileError(".length applied to a non array");
        }
        this.bytecode.addOpcode(190);
        this.exprType = 324;
        this.arrayDim = 0;
    }

    private int atFieldRead(CtField ctField, boolean bl) throws CompileError {
        FieldInfo fieldInfo = ctField.getFieldInfo2();
        boolean bl2 = this.setFieldType(fieldInfo);
        AccessorMaker accessorMaker = this.isAccessibleField(ctField, fieldInfo);
        if (accessorMaker != null) {
            MethodInfo methodInfo = accessorMaker.getFieldGetter(fieldInfo, bl);
            this.bytecode.addInvokestatic(ctField.getDeclaringClass(), methodInfo.getName(), methodInfo.getDescriptor());
            return 0;
        }
        int n6 = this.addFieldrefInfo(ctField, fieldInfo);
        if (bl) {
            this.bytecode.add(178);
            this.bytecode.growStack(bl2 ? 2 : 1);
        } else {
            this.bytecode.add(180);
            this.bytecode.growStack(bl2 ? 1 : 0);
        }
        this.bytecode.addIndex(n6);
        return n6;
    }

    private AccessorMaker isAccessibleField(CtField ctField, FieldInfo fieldInfo) throws CompileError {
        if (AccessFlag.isPrivate(fieldInfo.getAccessFlags()) && ctField.getDeclaringClass() != this.thisClass) {
            AccessorMaker accessorMaker;
            CtClass ctClass = ctField.getDeclaringClass();
            if (this.isEnclosing(ctClass, this.thisClass) && (accessorMaker = ctClass.getAccessorMaker()) != null) {
                return accessorMaker;
            }
            throw new CompileError("Field " + ctField.getName() + " in " + ctClass.getName() + " is private.");
        }
        return null;
    }

    private boolean setFieldType(FieldInfo fieldInfo) throws CompileError {
        String string = fieldInfo.getDescriptor();
        int n6 = 0;
        int n10 = 0;
        char c3 = string.charAt(n6);
        while (c3 == '[') {
            ++n10;
            c3 = string.charAt(++n6);
        }
        this.arrayDim = n10;
        this.exprType = MemberResolver.descToType(c3);
        this.className = c3 == 'L' ? string.substring(n6 + 1, string.indexOf(59, n6 + 1)) : null;
        boolean bl = n10 == 0 && (c3 == 'J' || c3 == 'D');
        return bl;
    }

    private int addFieldrefInfo(CtField ctField, FieldInfo fieldInfo) {
        ConstPool constPool = this.bytecode.getConstPool();
        String string = ctField.getDeclaringClass().getName();
        int n6 = constPool.addClassInfo(string);
        String string2 = fieldInfo.getName();
        String string3 = fieldInfo.getDescriptor();
        return constPool.addFieldrefInfo(n6, string2, string3);
    }

    @Override
    protected void atClassObject2(String string) throws CompileError {
        if (this.getMajorVersion() < 49) {
            super.atClassObject2(string);
        } else {
            this.bytecode.addLdc(this.bytecode.getConstPool().addClassInfo(string));
        }
    }

    @Override
    protected void atFieldPlusPlus(int n6, boolean bl, ASTree aSTree, Expr expr, boolean bl2) throws CompileError {
        CtField ctField = this.fieldAccess(aSTree, false);
        boolean bl3 = this.resultStatic;
        if (!bl3) {
            this.bytecode.addOpcode(89);
        }
        int n10 = this.atFieldRead(ctField, bl3);
        int n11 = this.exprType;
        boolean bl4 = MemberCodeGen.is2word(n11, this.arrayDim);
        int n12 = bl3 ? (bl4 ? 92 : 89) : (bl4 ? 93 : 90);
        this.atPlusPlusCore(n12, bl2, n6, bl, expr);
        this.atFieldAssignCore(ctField, bl3, n10, bl4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected CtField fieldAccess(ASTree aSTree, boolean bl) throws CompileError {
        if (aSTree instanceof Member) {
            String string = ((Member)aSTree).get();
            CtField ctField = null;
            try {
                ctField = this.thisClass.getField(string);
            }
            catch (NotFoundException notFoundException) {
                throw new NoFieldException(string, aSTree);
            }
            boolean bl2 = Modifier.isStatic(ctField.getModifiers());
            if (!bl2) {
                if (this.inStaticMethod) {
                    throw new CompileError("not available in a static method: " + string);
                }
                this.bytecode.addAload(0);
            }
            this.resultStatic = bl2;
            return ctField;
        }
        if (aSTree instanceof Expr) {
            Expr expr = (Expr)aSTree;
            int n6 = expr.getOperator();
            if (n6 == 35) {
                CtField ctField = this.resolver.lookupField(((Symbol)expr.oprand1()).get(), (Symbol)expr.oprand2());
                this.resultStatic = true;
                return ctField;
            }
            if (n6 == 46) {
                CtField ctField = null;
                try {
                    expr.oprand1().accept(this);
                    if (this.exprType == 307 && this.arrayDim == 0) {
                        ctField = this.resolver.lookupFieldByJvmName(this.className, (Symbol)expr.oprand2());
                    } else {
                        if (bl && this.arrayDim > 0 && ((Symbol)expr.oprand2()).get().equals("length")) {
                            return null;
                        }
                        MemberCodeGen.badLvalue();
                    }
                    boolean bl3 = Modifier.isStatic(ctField.getModifiers());
                    if (bl3) {
                        this.bytecode.addOpcode(87);
                    }
                    this.resultStatic = bl3;
                    return ctField;
                }
                catch (NoFieldException noFieldException) {
                    if (noFieldException.getExpr() != expr.oprand1()) {
                        throw noFieldException;
                    }
                    Symbol symbol = (Symbol)expr.oprand2();
                    String string = noFieldException.getField();
                    ctField = this.resolver.lookupFieldByJvmName2(string, symbol, aSTree);
                    this.resultStatic = true;
                    return ctField;
                }
            }
            MemberCodeGen.badLvalue();
        } else {
            MemberCodeGen.badLvalue();
        }
        this.resultStatic = false;
        return null;
    }

    private static void badLvalue() throws CompileError {
        throw new CompileError("bad l-value");
    }

    public CtClass[] makeParamList(MethodDecl methodDecl) throws CompileError {
        CtClass[] arrctClass;
        ASTList aSTList = methodDecl.getParams();
        if (aSTList == null) {
            arrctClass = new CtClass[]{};
        } else {
            int n6 = 0;
            arrctClass = new CtClass[aSTList.length()];
            while (aSTList != null) {
                arrctClass[n6++] = this.resolver.lookupClass((Declarator)aSTList.head());
                aSTList = aSTList.tail();
            }
        }
        return arrctClass;
    }

    public CtClass[] makeThrowsList(MethodDecl methodDecl) throws CompileError {
        ASTList aSTList = methodDecl.getThrows();
        if (aSTList == null) {
            return null;
        }
        int n6 = 0;
        CtClass[] arrctClass = new CtClass[aSTList.length()];
        while (aSTList != null) {
            arrctClass[n6++] = this.resolver.lookupClassByName((ASTList)aSTList.head());
            aSTList = aSTList.tail();
        }
        return arrctClass;
    }

    @Override
    protected String resolveClassName(ASTList aSTList) throws CompileError {
        return this.resolver.resolveClassName(aSTList);
    }

    @Override
    protected String resolveClassName(String string) throws CompileError {
        return this.resolver.resolveJvmClassName(string);
    }
}

