/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtPrimitiveType;
import javassist.NotFoundException;
import javassist.compiler.CodeGen;
import javassist.compiler.CompileError;
import javassist.compiler.JvstCodeGen;
import javassist.compiler.MemberResolver;
import javassist.compiler.TypeChecker;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.CallExpr;
import javassist.compiler.ast.CastExpr;
import javassist.compiler.ast.Expr;
import javassist.compiler.ast.Member;
import javassist.compiler.ast.Symbol;

public class JvstTypeChecker
extends TypeChecker {
    private JvstCodeGen codeGen;

    public JvstTypeChecker(CtClass ctClass, ClassPool classPool, JvstCodeGen jvstCodeGen) {
        super(ctClass, classPool);
        this.codeGen = jvstCodeGen;
    }

    public void addNullIfVoid() {
        if (this.exprType == 344) {
            this.exprType = 307;
            this.arrayDim = 0;
            this.className = "java/lang/Object";
        }
    }

    @Override
    public void atMember(Member member) throws CompileError {
        String string = member.get();
        if (string.equals(this.codeGen.paramArrayName)) {
            this.exprType = 307;
            this.arrayDim = 1;
            this.className = "java/lang/Object";
        } else if (string.equals("$sig")) {
            this.exprType = 307;
            this.arrayDim = 1;
            this.className = "java/lang/Class";
        } else if (string.equals("$type") || string.equals("$class")) {
            this.exprType = 307;
            this.arrayDim = 0;
            this.className = "java/lang/Class";
        } else {
            super.atMember(member);
        }
    }

    @Override
    protected void atFieldAssign(Expr expr, int n6, ASTree aSTree, ASTree aSTree2) throws CompileError {
        if (aSTree instanceof Member && ((Member)aSTree).get().equals(this.codeGen.paramArrayName)) {
            aSTree2.accept(this);
            CtClass[] arrctClass = this.codeGen.paramTypeList;
            if (arrctClass == null) {
                return;
            }
            int n10 = arrctClass.length;
            for (int k = 0; k < n10; ++k) {
                this.compileUnwrapValue(arrctClass[k]);
            }
        } else {
            super.atFieldAssign(expr, n6, aSTree, aSTree2);
        }
    }

    @Override
    public void atCastExpr(CastExpr castExpr) throws CompileError {
        ASTree aSTree;
        ASTList aSTList = castExpr.getClassName();
        if (aSTList != null && castExpr.getArrayDim() == 0 && (aSTree = aSTList.head()) instanceof Symbol && aSTList.tail() == null) {
            String string = ((Symbol)aSTree).get();
            if (string.equals(this.codeGen.returnCastName)) {
                this.atCastToRtype(castExpr);
                return;
            }
            if (string.equals("$w")) {
                this.atCastToWrapper(castExpr);
                return;
            }
        }
        super.atCastExpr(castExpr);
    }

    protected void atCastToRtype(CastExpr castExpr) throws CompileError {
        CtClass ctClass = this.codeGen.returnType;
        castExpr.getOprand().accept(this);
        if (this.exprType == 344 || CodeGen.isRefType(this.exprType) || this.arrayDim > 0) {
            this.compileUnwrapValue(ctClass);
        } else if (ctClass instanceof CtPrimitiveType) {
            int n6;
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
            this.exprType = n6 = MemberResolver.descToType(ctPrimitiveType.getDescriptor());
            this.arrayDim = 0;
            this.className = null;
        }
    }

    protected void atCastToWrapper(CastExpr castExpr) throws CompileError {
        castExpr.getOprand().accept(this);
        if (CodeGen.isRefType(this.exprType) || this.arrayDim > 0) {
            return;
        }
        CtClass ctClass = this.resolver.lookupClass(this.exprType, this.arrayDim, this.className);
        if (ctClass instanceof CtPrimitiveType) {
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
            if (this.codeGen.procHandler != null && string.equals(this.codeGen.proceedName)) {
                this.codeGen.procHandler.setReturnType(this, (ASTList)callExpr.oprand2());
                return;
            }
            if (string.equals("$cflow")) {
                this.atCflow((ASTList)callExpr.oprand2());
                return;
            }
        }
        super.atCallExpr(callExpr);
    }

    protected void atCflow(ASTList aSTList) throws CompileError {
        this.exprType = 324;
        this.arrayDim = 0;
        this.className = null;
    }

    public boolean isParamListName(ASTList aSTList) {
        if (this.codeGen.paramTypeList != null && aSTList != null && aSTList.tail() == null) {
            ASTree aSTree = aSTList.head();
            return aSTree instanceof Member && ((Member)aSTree).get().equals(this.codeGen.paramListName);
        }
        return false;
    }

    @Override
    public int getMethodArgsLength(ASTList aSTList) {
        String string = this.codeGen.paramListName;
        int n6 = 0;
        while (aSTList != null) {
            ASTree aSTree = aSTList.head();
            if (aSTree instanceof Member && ((Member)aSTree).get().equals(string)) {
                if (this.codeGen.paramTypeList != null) {
                    n6 += this.codeGen.paramTypeList.length;
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
        CtClass[] arrctClass = this.codeGen.paramTypeList;
        String string = this.codeGen.paramListName;
        int n6 = 0;
        while (aSTList != null) {
            ASTree aSTree = aSTList.head();
            if (aSTree instanceof Member && ((Member)aSTree).get().equals(string)) {
                if (arrctClass != null) {
                    int n10 = arrctClass.length;
                    for (int k = 0; k < n10; ++k) {
                        CtClass ctClass = arrctClass[k];
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

    void compileInvokeSpecial(ASTree aSTree, String string, String string2, String string3, ASTList aSTList) throws CompileError {
        aSTree.accept(this);
        int n6 = this.getMethodArgsLength(aSTList);
        this.atMethodArgs(aSTList, new int[n6], new int[n6], new String[n6]);
        this.setReturnType(string3);
        this.addNullIfVoid();
    }

    protected void compileUnwrapValue(CtClass ctClass) throws CompileError {
        if (ctClass == CtClass.voidType) {
            this.addNullIfVoid();
        } else {
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
}

