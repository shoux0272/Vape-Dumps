/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtPrimitiveType;
import javassist.NotFoundException;
import javassist.bytecode.Bytecode;
import javassist.bytecode.Descriptor;
import javassist.compiler.CompileError;
import javassist.compiler.JvstTypeChecker;
import javassist.compiler.MemberCodeGen;
import javassist.compiler.MemberResolver;
import javassist.compiler.ProceedHandler;
import javassist.compiler.SymbolTable;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.CallExpr;
import javassist.compiler.ast.CastExpr;
import javassist.compiler.ast.Declarator;
import javassist.compiler.ast.Expr;
import javassist.compiler.ast.Member;
import javassist.compiler.ast.Stmnt;
import javassist.compiler.ast.Symbol;

public class JvstCodeGen
extends MemberCodeGen {
    String paramArrayName = null;
    String paramListName = null;
    CtClass[] paramTypeList = null;
    private int paramVarBase = 0;
    private boolean useParam0 = false;
    private String param0Type = null;
    public static final String sigName = "$sig";
    public static final String dollarTypeName = "$type";
    public static final String clazzName = "$class";
    private CtClass dollarType = null;
    CtClass returnType = null;
    String returnCastName = null;
    private String returnVarName = null;
    public static final String wrapperCastName = "$w";
    String proceedName = null;
    public static final String cflowName = "$cflow";
    ProceedHandler procHandler = null;

    public JvstCodeGen(Bytecode bytecode, CtClass ctClass, ClassPool classPool) {
        super(bytecode, ctClass, classPool);
        this.setTypeChecker(new JvstTypeChecker(ctClass, classPool, this));
    }

    private int indexOfParam1() {
        return this.paramVarBase + (this.useParam0 ? 1 : 0);
    }

    public void setProceedHandler(ProceedHandler proceedHandler, String string) {
        this.proceedName = string;
        this.procHandler = proceedHandler;
    }

    public void addNullIfVoid() {
        if (this.exprType == 344) {
            this.bytecode.addOpcode(1);
            this.exprType = 307;
            this.arrayDim = 0;
            this.className = "java/lang/Object";
        }
    }

    @Override
    public void atMember(Member member) throws CompileError {
        String string = member.get();
        if (string.equals(this.paramArrayName)) {
            JvstCodeGen.compileParameterList(this.bytecode, this.paramTypeList, this.indexOfParam1());
            this.exprType = 307;
            this.arrayDim = 1;
            this.className = "java/lang/Object";
        } else if (string.equals(sigName)) {
            this.bytecode.addLdc(Descriptor.ofMethod(this.returnType, this.paramTypeList));
            this.bytecode.addInvokestatic("a/vU", "getParams", "(Ljava/lang/String;)[Ljava/lang/Class;");
            this.exprType = 307;
            this.arrayDim = 1;
            this.className = "java/lang/Class";
        } else if (string.equals(dollarTypeName)) {
            if (this.dollarType == null) {
                throw new CompileError("$type is not available");
            }
            this.bytecode.addLdc(Descriptor.of(this.dollarType));
            this.callGetType("getType");
        } else if (string.equals(clazzName)) {
            if (this.param0Type == null) {
                throw new CompileError("$class is not available");
            }
            this.bytecode.addLdc(this.param0Type);
            this.callGetType("getClazz");
        } else {
            super.atMember(member);
        }
    }

    private void callGetType(String string) {
        this.bytecode.addInvokestatic("a/vU", string, "(Ljava/lang/String;)Ljava/lang/Class;");
        this.exprType = 307;
        this.arrayDim = 0;
        this.className = "java/lang/Class";
    }

    @Override
    protected void atFieldAssign(Expr expr, int n6, ASTree aSTree, ASTree aSTree2, boolean bl) throws CompileError {
        if (aSTree instanceof Member && ((Member)aSTree).get().equals(this.paramArrayName)) {
            if (n6 != 61) {
                throw new CompileError("bad operator for " + this.paramArrayName);
            }
            aSTree2.accept(this);
            if (this.arrayDim != 1 || this.exprType != 307) {
                throw new CompileError("invalid type for " + this.paramArrayName);
            }
            this.atAssignParamList(this.paramTypeList, this.bytecode);
            if (!bl) {
                this.bytecode.addOpcode(87);
            }
        } else {
            super.atFieldAssign(expr, n6, aSTree, aSTree2, bl);
        }
    }

    protected void atAssignParamList(CtClass[] arrctClass, Bytecode bytecode) throws CompileError {
        if (arrctClass == null) {
            return;
        }
        int n6 = this.indexOfParam1();
        int n10 = arrctClass.length;
        for (int k = 0; k < n10; ++k) {
            bytecode.addOpcode(89);
            bytecode.addIconst(k);
            bytecode.addOpcode(50);
            this.compileUnwrapValue(arrctClass[k], bytecode);
            bytecode.addStore(n6, arrctClass[k]);
            n6 += JvstCodeGen.is2word(this.exprType, this.arrayDim) ? 2 : 1;
        }
    }

    @Override
    public void atCastExpr(CastExpr castExpr) throws CompileError {
        ASTree aSTree;
        ASTList aSTList = castExpr.getClassName();
        if (aSTList != null && castExpr.getArrayDim() == 0 && (aSTree = aSTList.head()) instanceof Symbol && aSTList.tail() == null) {
            String string = ((Symbol)aSTree).get();
            if (string.equals(this.returnCastName)) {
                this.atCastToRtype(castExpr);
                return;
            }
            if (string.equals(wrapperCastName)) {
                this.atCastToWrapper(castExpr);
                return;
            }
        }
        super.atCastExpr(castExpr);
    }

    protected void atCastToRtype(CastExpr castExpr) throws CompileError {
        castExpr.getOprand().accept(this);
        if (this.exprType == 344 || JvstCodeGen.isRefType(this.exprType) || this.arrayDim > 0) {
            this.compileUnwrapValue(this.returnType, this.bytecode);
        } else if (this.returnType instanceof CtPrimitiveType) {
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)this.returnType;
            int n6 = MemberResolver.descToType(ctPrimitiveType.getDescriptor());
            this.atNumCastExpr(this.exprType, n6);
            this.exprType = n6;
            this.arrayDim = 0;
            this.className = null;
        } else {
            throw new CompileError("invalid cast");
        }
    }

    protected void atCastToWrapper(CastExpr castExpr) throws CompileError {
        castExpr.getOprand().accept(this);
        if (JvstCodeGen.isRefType(this.exprType) || this.arrayDim > 0) {
            return;
        }
        CtClass ctClass = this.resolver.lookupClass(this.exprType, this.arrayDim, this.className);
        if (ctClass instanceof CtPrimitiveType) {
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
            String string = ctPrimitiveType.getWrapperName();
            this.bytecode.addNew(string);
            this.bytecode.addOpcode(89);
            if (ctPrimitiveType.getDataSize() > 1) {
                this.bytecode.addOpcode(94);
            } else {
                this.bytecode.addOpcode(93);
            }
            this.bytecode.addOpcode(88);
            this.bytecode.addInvokespecial(string, "<init>", "(" + ctPrimitiveType.getDescriptor() + ")V");
            this.exprType = 307;
            this.arrayDim = 0;
            this.className = "java/lang/Object";
        }
    }

    @Override
    public void atCallExpr(CallExpr callExpr) throws CompileError {
        ASTree aSTree = callExpr.oprand1();
        if (aSTree instanceof Member) {
            String string = ((Member)aSTree).get();
            if (this.procHandler != null && string.equals(this.proceedName)) {
                this.procHandler.doit(this, this.bytecode, (ASTList)callExpr.oprand2());
                return;
            }
            if (string.equals(cflowName)) {
                this.atCflow((ASTList)callExpr.oprand2());
                return;
            }
        }
        super.atCallExpr(callExpr);
    }

    protected void atCflow(ASTList aSTList) throws CompileError {
        StringBuffer stringBuffer = new StringBuffer();
        if (aSTList == null || aSTList.tail() != null) {
            throw new CompileError("bad $cflow");
        }
        JvstCodeGen.makeCflowName(stringBuffer, aSTList.head());
        String string = stringBuffer.toString();
        Object[] arrobject = this.resolver.getClassPool().lookupCflow(string);
        if (arrobject == null) {
            throw new CompileError("no such $cflow: " + string);
        }
        this.bytecode.addGetstatic((String)arrobject[0], (String)arrobject[1], "La/Bl;");
        this.bytecode.addInvokevirtual("a.Bl", "value", "()I");
        this.exprType = 324;
        this.arrayDim = 0;
        this.className = null;
    }

    private static void makeCflowName(StringBuffer stringBuffer, ASTree aSTree) throws CompileError {
        Expr expr;
        if (aSTree instanceof Symbol) {
            stringBuffer.append(((Symbol)aSTree).get());
            return;
        }
        if (aSTree instanceof Expr && (expr = (Expr)aSTree).getOperator() == 46) {
            JvstCodeGen.makeCflowName(stringBuffer, expr.oprand1());
            stringBuffer.append('.');
            JvstCodeGen.makeCflowName(stringBuffer, expr.oprand2());
            return;
        }
        throw new CompileError("bad $cflow");
    }

    public boolean isParamListName(ASTList aSTList) {
        if (this.paramTypeList != null && aSTList != null && aSTList.tail() == null) {
            ASTree aSTree = aSTList.head();
            return aSTree instanceof Member && ((Member)aSTree).get().equals(this.paramListName);
        }
        return false;
    }

    @Override
    public int getMethodArgsLength(ASTList aSTList) {
        String string = this.paramListName;
        int n6 = 0;
        while (aSTList != null) {
            ASTree aSTree = aSTList.head();
            if (aSTree instanceof Member && ((Member)aSTree).get().equals(string)) {
                if (this.paramTypeList != null) {
                    n6 += this.paramTypeList.length;
                }
            } else {
                ++n6;
            }
            aSTList = aSTList.tail();
        }
        return n6;
    }

    @Override
    public void atMethodArgs(ASTList aSTList, int[] arrn, int[] arrn2, String[] arrstring) throws CompileError {
        CtClass[] arrctClass = this.paramTypeList;
        String string = this.paramListName;
        int n6 = 0;
        while (aSTList != null) {
            ASTree aSTree = aSTList.head();
            if (aSTree instanceof Member && ((Member)aSTree).get().equals(string)) {
                if (arrctClass != null) {
                    int n10 = arrctClass.length;
                    int n11 = this.indexOfParam1();
                    for (int k = 0; k < n10; ++k) {
                        CtClass ctClass = arrctClass[k];
                        n11 += this.bytecode.addLoad(n11, ctClass);
                        this.setType(ctClass);
                        arrn[n6] = this.exprType;
                        arrn2[n6] = this.arrayDim;
                        arrstring[n6] = this.className;
                        ++n6;
                    }
                }
            } else {
                aSTree.accept(this);
                arrn[n6] = this.exprType;
                arrn2[n6] = this.arrayDim;
                arrstring[n6] = this.className;
                ++n6;
            }
            aSTList = aSTList.tail();
        }
    }

    void compileInvokeSpecial(ASTree aSTree, int n6, String string, ASTList aSTList) throws CompileError {
        aSTree.accept(this);
        int n10 = this.getMethodArgsLength(aSTList);
        this.atMethodArgs(aSTList, new int[n10], new int[n10], new String[n10]);
        this.bytecode.addInvokespecial(n6, string);
        this.setReturnType(string, false, false);
        this.addNullIfVoid();
    }

    @Override
    protected void atReturnStmnt(Stmnt stmnt) throws CompileError {
        ASTree aSTree = stmnt.getLeft();
        if (aSTree != null && this.returnType == CtClass.voidType) {
            this.compileExpr(aSTree);
            if (JvstCodeGen.is2word(this.exprType, this.arrayDim)) {
                this.bytecode.addOpcode(88);
            } else if (this.exprType != 344) {
                this.bytecode.addOpcode(87);
            }
            aSTree = null;
        }
        this.atReturnStmnt2(aSTree);
    }

    public int recordReturnType(CtClass ctClass, String string, String string2, SymbolTable symbolTable) throws CompileError {
        this.returnType = ctClass;
        this.returnCastName = string;
        this.returnVarName = string2;
        if (string2 == null) {
            return -1;
        }
        int n6 = this.getMaxLocals();
        int n10 = n6 + this.recordVar(ctClass, string2, n6, symbolTable);
        this.setMaxLocals(n10);
        return n6;
    }

    public void recordType(CtClass ctClass) {
        this.dollarType = ctClass;
    }

    public int recordParams(CtClass[] arrctClass, boolean bl, String string, String string2, String string3, SymbolTable symbolTable) throws CompileError {
        return this.recordParams(arrctClass, bl, string, string2, string3, !bl, 0, this.getThisName(), symbolTable);
    }

    public int recordParams(CtClass[] arrctClass, boolean bl, String string, String string2, String string3, boolean bl2, int n6, String string4, SymbolTable symbolTable) throws CompileError {
        this.paramTypeList = arrctClass;
        this.paramArrayName = string2;
        this.paramListName = string3;
        this.paramVarBase = n6;
        this.useParam0 = bl2;
        if (string4 != null) {
            this.param0Type = MemberResolver.jvmToJavaName(string4);
        }
        this.inStaticMethod = bl;
        int n10 = n6;
        if (bl2) {
            String string5 = String.valueOf(string) + "0";
            Declarator declarator = new Declarator(307, MemberResolver.javaToJvmName(string4), 0, n10++, new Symbol(string5));
            symbolTable.append(string5, declarator);
        }
        for (int k = 0; k < arrctClass.length; ++k) {
            n10 += this.recordVar(arrctClass[k], String.valueOf(string) + (k + 1), n10, symbolTable);
        }
        if (this.getMaxLocals() < n10) {
            this.setMaxLocals(n10);
        }
        return n10;
    }

    public int recordVariable(CtClass ctClass, String string, SymbolTable symbolTable) throws CompileError {
        if (string == null) {
            return -1;
        }
        int n6 = this.getMaxLocals();
        int n10 = n6 + this.recordVar(ctClass, string, n6, symbolTable);
        this.setMaxLocals(n10);
        return n6;
    }

    private int recordVar(CtClass ctClass, String string, int n6, SymbolTable symbolTable) throws CompileError {
        if (ctClass == CtClass.voidType) {
            this.exprType = 307;
            this.arrayDim = 0;
            this.className = "java/lang/Object";
        } else {
            this.setType(ctClass);
        }
        Declarator declarator = new Declarator(this.exprType, this.className, this.arrayDim, n6, new Symbol(string));
        symbolTable.append(string, declarator);
        return JvstCodeGen.is2word(this.exprType, this.arrayDim) ? 2 : 1;
    }

    public void recordVariable(String string, String string2, int n6, SymbolTable symbolTable) throws CompileError {
        char c3;
        int n10 = 0;
        while ((c3 = string.charAt(n10)) == '[') {
            ++n10;
        }
        int n11 = MemberResolver.descToType(c3);
        String string3 = null;
        if (n11 == 307) {
            string3 = n10 == 0 ? string.substring(1, string.length() - 1) : string.substring(n10 + 1, string.length() - 1);
        }
        Declarator declarator = new Declarator(n11, string3, n10, n6, new Symbol(string2));
        symbolTable.append(string2, declarator);
    }

    public static int compileParameterList(Bytecode bytecode, CtClass[] arrctClass, int n6) {
        if (arrctClass == null) {
            bytecode.addIconst(0);
            bytecode.addAnewarray("java.lang.Object");
            return 1;
        }
        CtClass[] arrctClass2 = new CtClass[1];
        int n10 = arrctClass.length;
        bytecode.addIconst(n10);
        bytecode.addAnewarray("java.lang.Object");
        for (int k = 0; k < n10; ++k) {
            bytecode.addOpcode(89);
            bytecode.addIconst(k);
            if (arrctClass[k].isPrimitive()) {
                CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)arrctClass[k];
                String string = ctPrimitiveType.getWrapperName();
                bytecode.addNew(string);
                bytecode.addOpcode(89);
                int n11 = bytecode.addLoad(n6, ctPrimitiveType);
                n6 += n11;
                arrctClass2[0] = ctPrimitiveType;
                bytecode.addInvokespecial(string, "<init>", Descriptor.ofMethod(CtClass.voidType, arrctClass2));
            } else {
                bytecode.addAload(n6);
                ++n6;
            }
            bytecode.addOpcode(83);
        }
        return 8;
    }

    protected void compileUnwrapValue(CtClass ctClass, Bytecode bytecode) throws CompileError {
        if (ctClass == CtClass.voidType) {
            this.addNullIfVoid();
            return;
        }
        if (this.exprType == 344) {
            throw new CompileError("invalid type for " + this.returnCastName);
        }
        if (ctClass instanceof CtPrimitiveType) {
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
            String string = ctPrimitiveType.getWrapperName();
            bytecode.addCheckcast(string);
            bytecode.addInvokevirtual(string, ctPrimitiveType.getGetMethodName(), ctPrimitiveType.getGetMethodDescriptor());
            this.setType(ctClass);
        } else {
            bytecode.addCheckcast(ctClass);
            this.setType(ctClass);
        }
    }

    public void setType(CtClass ctClass) throws CompileError {
        this.setType(ctClass, 0);
    }

    private void setType(CtClass ctClass, int n6) throws CompileError {
        if (ctClass.isPrimitive()) {
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
            this.exprType = MemberResolver.descToType(ctPrimitiveType.getDescriptor());
            this.arrayDim = n6;
            this.className = null;
        } else if (ctClass.isArray()) {
            try {
                this.setType(ctClass.getComponentType(), n6 + 1);
            }
            catch (NotFoundException notFoundException) {
                throw new CompileError("undefined type: " + ctClass.getName());
            }
        } else {
            this.exprType = 307;
            this.arrayDim = n6;
            this.className = MemberResolver.javaToJvmName(ctClass.getName());
        }
    }

    public void doNumCast(CtClass ctClass) throws CompileError {
        if (this.arrayDim == 0 && !JvstCodeGen.isRefType(this.exprType)) {
            if (ctClass instanceof CtPrimitiveType) {
                CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
                this.atNumCastExpr(this.exprType, MemberResolver.descToType(ctPrimitiveType.getDescriptor()));
            } else {
                throw new CompileError("type mismatch");
            }
        }
    }
}

