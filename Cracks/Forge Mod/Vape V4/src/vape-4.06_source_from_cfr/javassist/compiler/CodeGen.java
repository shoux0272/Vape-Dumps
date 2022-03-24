/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javassist.bytecode.Bytecode;
import javassist.bytecode.Opcode;
import javassist.compiler.CodeGen$1;
import javassist.compiler.CodeGen$ReturnHook;
import javassist.compiler.CompileError;
import javassist.compiler.MemberResolver;
import javassist.compiler.TokenId;
import javassist.compiler.TypeChecker;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.ArrayInit;
import javassist.compiler.ast.AssignExpr;
import javassist.compiler.ast.BinExpr;
import javassist.compiler.ast.CallExpr;
import javassist.compiler.ast.CastExpr;
import javassist.compiler.ast.CondExpr;
import javassist.compiler.ast.Declarator;
import javassist.compiler.ast.DoubleConst;
import javassist.compiler.ast.Expr;
import javassist.compiler.ast.FieldDecl;
import javassist.compiler.ast.InstanceOfExpr;
import javassist.compiler.ast.IntConst;
import javassist.compiler.ast.Keyword;
import javassist.compiler.ast.Member;
import javassist.compiler.ast.MethodDecl;
import javassist.compiler.ast.NewExpr;
import javassist.compiler.ast.Pair;
import javassist.compiler.ast.Stmnt;
import javassist.compiler.ast.StringL;
import javassist.compiler.ast.Symbol;
import javassist.compiler.ast.Variable;
import javassist.compiler.ast.Visitor;

public abstract class CodeGen
extends Visitor
implements Opcode,
TokenId {
    static final String javaLangObject = "java.lang.Object";
    static final String jvmJavaLangObject = "java/lang/Object";
    static final String javaLangString = "java.lang.String";
    static final String jvmJavaLangString = "java/lang/String";
    protected Bytecode bytecode;
    private int tempVar;
    TypeChecker typeChecker;
    protected boolean hasReturned;
    public boolean inStaticMethod;
    protected List<Integer> breakList;
    protected List<Integer> continueList;
    protected CodeGen$ReturnHook returnHooks;
    protected int exprType;
    protected int arrayDim;
    protected String className;
    static final int[] binOp;
    private static final int[] ifOp;
    private static final int[] ifOp2;
    private static final int P_DOUBLE = 0;
    private static final int P_FLOAT = 1;
    private static final int P_LONG = 2;
    private static final int P_INT = 3;
    private static final int P_OTHER = -1;
    private static final int[] castOp;

    static {
        int[] arrn = new int[55];
        arrn[0] = 43;
        arrn[1] = 99;
        arrn[2] = 98;
        arrn[3] = 97;
        arrn[4] = 96;
        arrn[5] = 45;
        arrn[6] = 103;
        arrn[7] = 102;
        arrn[8] = 101;
        arrn[9] = 100;
        arrn[10] = 42;
        arrn[11] = 107;
        arrn[12] = 106;
        arrn[13] = 105;
        arrn[14] = 104;
        arrn[15] = 47;
        arrn[16] = 111;
        arrn[17] = 110;
        arrn[18] = 109;
        arrn[19] = 108;
        arrn[20] = 37;
        arrn[21] = 115;
        arrn[22] = 114;
        arrn[23] = 113;
        arrn[24] = 112;
        arrn[25] = 124;
        arrn[28] = 129;
        arrn[29] = 128;
        arrn[30] = 94;
        arrn[33] = 131;
        arrn[34] = 130;
        arrn[35] = 38;
        arrn[38] = 127;
        arrn[39] = 126;
        arrn[40] = 364;
        arrn[43] = 121;
        arrn[44] = 120;
        arrn[45] = 366;
        arrn[48] = 123;
        arrn[49] = 122;
        arrn[50] = 370;
        arrn[53] = 125;
        arrn[54] = 124;
        binOp = arrn;
        ifOp = new int[]{358, 159, 160, 350, 160, 159, 357, 164, 163, 359, 162, 161, 60, 161, 162, 62, 163, 164};
        ifOp2 = new int[]{358, 153, 154, 350, 154, 153, 357, 158, 157, 359, 156, 155, 60, 155, 156, 62, 157, 158};
        int[] arrn2 = new int[16];
        arrn2[1] = 144;
        arrn2[2] = 143;
        arrn2[3] = 142;
        arrn2[4] = 141;
        arrn2[6] = 140;
        arrn2[7] = 139;
        arrn2[8] = 138;
        arrn2[9] = 137;
        arrn2[11] = 136;
        arrn2[12] = 135;
        arrn2[13] = 134;
        arrn2[14] = 133;
        castOp = arrn2;
    }

    public CodeGen(Bytecode bytecode) {
        this.bytecode = bytecode;
        this.tempVar = -1;
        this.typeChecker = null;
        this.hasReturned = false;
        this.inStaticMethod = false;
        this.breakList = null;
        this.continueList = null;
        this.returnHooks = null;
    }

    public void setTypeChecker(TypeChecker typeChecker) {
        this.typeChecker = typeChecker;
    }

    protected static void fatal() throws CompileError {
        throw new CompileError("fatal");
    }

    public static boolean is2word(int n6, int n10) {
        return n10 == 0 && (n6 == 312 || n6 == 326);
    }

    public int getMaxLocals() {
        return this.bytecode.getMaxLocals();
    }

    public void setMaxLocals(int n6) {
        this.bytecode.setMaxLocals(n6);
    }

    protected void incMaxLocals(int n6) {
        this.bytecode.incMaxLocals(n6);
    }

    protected int getTempVar() {
        if (this.tempVar < 0) {
            this.tempVar = this.getMaxLocals();
            this.incMaxLocals(2);
        }
        return this.tempVar;
    }

    protected int getLocalVar(Declarator declarator) {
        int n6 = declarator.getLocalVar();
        if (n6 < 0) {
            n6 = this.getMaxLocals();
            declarator.setLocalVar(n6);
            this.incMaxLocals(1);
        }
        return n6;
    }

    protected abstract String getThisName();

    protected abstract String getSuperName() throws CompileError;

    protected abstract String resolveClassName(ASTList var1) throws CompileError;

    protected abstract String resolveClassName(String var1) throws CompileError;

    protected static String toJvmArrayName(String string, int n6) {
        if (string == null) {
            return null;
        }
        if (n6 == 0) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n10 = n6;
        while (n10-- > 0) {
            stringBuffer.append('[');
        }
        stringBuffer.append('L');
        stringBuffer.append(string);
        stringBuffer.append(';');
        return stringBuffer.toString();
    }

    protected static String toJvmTypeName(int n6, int n10) {
        char c3 = 'I';
        switch (n6) {
            case 301: {
                c3 = 'Z';
                break;
            }
            case 303: {
                c3 = 'B';
                break;
            }
            case 306: {
                c3 = 'C';
                break;
            }
            case 334: {
                c3 = 'S';
                break;
            }
            case 324: {
                c3 = 'I';
                break;
            }
            case 326: {
                c3 = 'J';
                break;
            }
            case 317: {
                c3 = 'F';
                break;
            }
            case 312: {
                c3 = 'D';
                break;
            }
            case 344: {
                c3 = 'V';
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (n10-- > 0) {
            stringBuffer.append('[');
        }
        stringBuffer.append(c3);
        return stringBuffer.toString();
    }

    public void compileExpr(ASTree aSTree) throws CompileError {
        this.doTypeCheck(aSTree);
        aSTree.accept(this);
    }

    public boolean compileBooleanExpr(boolean bl, ASTree aSTree) throws CompileError {
        this.doTypeCheck(aSTree);
        return this.booleanExpr(bl, aSTree);
    }

    public void doTypeCheck(ASTree aSTree) throws CompileError {
        if (this.typeChecker != null) {
            aSTree.accept(this.typeChecker);
        }
    }

    @Override
    public void atASTList(ASTList aSTList) throws CompileError {
        CodeGen.fatal();
    }

    @Override
    public void atPair(Pair pair) throws CompileError {
        CodeGen.fatal();
    }

    @Override
    public void atSymbol(Symbol symbol) throws CompileError {
        CodeGen.fatal();
    }

    @Override
    public void atFieldDecl(FieldDecl fieldDecl) throws CompileError {
        fieldDecl.getInit().accept(this);
    }

    @Override
    public void atMethodDecl(MethodDecl methodDecl) throws CompileError {
        ASTree aSTree;
        this.setMaxLocals(1);
        for (ASTList aSTList = methodDecl.getModifiers(); aSTList != null; aSTList = aSTList.tail()) {
            aSTree = (Keyword)aSTList.head();
            if (((Keyword)aSTree).get() != 335) continue;
            this.setMaxLocals(0);
            this.inStaticMethod = true;
        }
        for (aSTree = methodDecl.getParams(); aSTree != null; aSTree = ((ASTList)aSTree).tail()) {
            this.atDeclarator((Declarator)((ASTList)aSTree).head());
        }
        Stmnt stmnt = methodDecl.getBody();
        this.atMethodBody(stmnt, methodDecl.isConstructor(), methodDecl.getReturn().getType() == 344);
    }

    public void atMethodBody(Stmnt stmnt, boolean bl, boolean bl2) throws CompileError {
        if (stmnt == null) {
            return;
        }
        if (bl && this.needsSuperCall(stmnt)) {
            this.insertDefaultSuperCall();
        }
        this.hasReturned = false;
        stmnt.accept(this);
        if (!this.hasReturned) {
            if (bl2) {
                this.bytecode.addOpcode(177);
                this.hasReturned = true;
            } else {
                throw new CompileError("no return statement");
            }
        }
    }

    private boolean needsSuperCall(Stmnt stmnt) throws CompileError {
        ASTree aSTree;
        ASTree aSTree2;
        if (stmnt.getOperator() == 66) {
            stmnt = (Stmnt)stmnt.head();
        }
        if (stmnt != null && stmnt.getOperator() == 69 && (aSTree2 = stmnt.head()) != null && aSTree2 instanceof Expr && ((Expr)aSTree2).getOperator() == 67 && (aSTree = ((Expr)aSTree2).head()) instanceof Keyword) {
            int n6 = ((Keyword)aSTree).get();
            return n6 != 339 && n6 != 336;
        }
        return true;
    }

    protected abstract void insertDefaultSuperCall() throws CompileError;

    @Override
    public void atStmnt(Stmnt stmnt) throws CompileError {
        if (stmnt == null) {
            return;
        }
        int n6 = stmnt.getOperator();
        if (n6 == 69) {
            ASTree aSTree = stmnt.getLeft();
            this.doTypeCheck(aSTree);
            if (aSTree instanceof AssignExpr) {
                this.atAssignExpr((AssignExpr)aSTree, false);
            } else if (CodeGen.isPlusPlusExpr(aSTree)) {
                Expr expr = (Expr)aSTree;
                this.atPlusPlus(expr.getOperator(), expr.oprand1(), expr, false);
            } else {
                aSTree.accept(this);
                if (CodeGen.is2word(this.exprType, this.arrayDim)) {
                    this.bytecode.addOpcode(88);
                } else if (this.exprType != 344) {
                    this.bytecode.addOpcode(87);
                }
            }
        } else if (n6 == 68 || n6 == 66) {
            for (ASTList aSTList = stmnt; aSTList != null; aSTList = aSTList.tail()) {
                ASTree aSTree = aSTList.head();
                if (aSTree == null) continue;
                aSTree.accept(this);
            }
        } else if (n6 == 320) {
            this.atIfStmnt(stmnt);
        } else if (n6 == 346 || n6 == 311) {
            this.atWhileStmnt(stmnt, n6 == 346);
        } else if (n6 == 318) {
            this.atForStmnt(stmnt);
        } else if (n6 == 302 || n6 == 309) {
            this.atBreakStmnt(stmnt, n6 == 302);
        } else if (n6 == 333) {
            this.atReturnStmnt(stmnt);
        } else if (n6 == 340) {
            this.atThrowStmnt(stmnt);
        } else if (n6 == 343) {
            this.atTryStmnt(stmnt);
        } else if (n6 == 337) {
            this.atSwitchStmnt(stmnt);
        } else if (n6 == 338) {
            this.atSyncStmnt(stmnt);
        } else {
            this.hasReturned = false;
            throw new CompileError("sorry, not supported statement: TokenId " + n6);
        }
    }

    private void atIfStmnt(Stmnt stmnt) throws CompileError {
        ASTree aSTree = stmnt.head();
        Stmnt stmnt2 = (Stmnt)stmnt.tail().head();
        Stmnt stmnt3 = (Stmnt)stmnt.tail().tail().head();
        if (this.compileBooleanExpr(false, aSTree)) {
            this.hasReturned = false;
            if (stmnt3 != null) {
                stmnt3.accept(this);
            }
            return;
        }
        int n6 = this.bytecode.currentPc();
        int n10 = 0;
        this.bytecode.addIndex(0);
        this.hasReturned = false;
        if (stmnt2 != null) {
            stmnt2.accept(this);
        }
        boolean bl = this.hasReturned;
        this.hasReturned = false;
        if (stmnt3 != null && !bl) {
            this.bytecode.addOpcode(167);
            n10 = this.bytecode.currentPc();
            this.bytecode.addIndex(0);
        }
        this.bytecode.write16bit(n6, this.bytecode.currentPc() - n6 + 1);
        if (stmnt3 != null) {
            stmnt3.accept(this);
            if (!bl) {
                this.bytecode.write16bit(n10, this.bytecode.currentPc() - n10 + 1);
            }
            this.hasReturned = bl && this.hasReturned;
        }
    }

    private void atWhileStmnt(Stmnt stmnt, boolean bl) throws CompileError {
        boolean bl2;
        List<Integer> list = this.breakList;
        List<Integer> list2 = this.continueList;
        this.breakList = new ArrayList<Integer>();
        this.continueList = new ArrayList<Integer>();
        ASTree aSTree = stmnt.head();
        Stmnt stmnt2 = (Stmnt)stmnt.tail();
        int n6 = 0;
        if (bl) {
            this.bytecode.addOpcode(167);
            n6 = this.bytecode.currentPc();
            this.bytecode.addIndex(0);
        }
        int n10 = this.bytecode.currentPc();
        if (stmnt2 != null) {
            stmnt2.accept(this);
        }
        int n11 = this.bytecode.currentPc();
        if (bl) {
            this.bytecode.write16bit(n6, n11 - n6 + 1);
        }
        if (bl2 = this.compileBooleanExpr(true, aSTree)) {
            this.bytecode.addOpcode(167);
            bl2 = this.breakList.size() == 0;
        }
        this.bytecode.addIndex(n10 - this.bytecode.currentPc() + 1);
        this.patchGoto(this.breakList, this.bytecode.currentPc());
        this.patchGoto(this.continueList, n11);
        this.continueList = list2;
        this.breakList = list;
        this.hasReturned = bl2;
    }

    protected void patchGoto(List<Integer> list, int n6) {
        for (int n10 : list) {
            this.bytecode.write16bit(n10, n6 - n10 + 1);
        }
    }

    private void atForStmnt(Stmnt stmnt) throws CompileError {
        List<Integer> list = this.breakList;
        List<Integer> list2 = this.continueList;
        this.breakList = new ArrayList<Integer>();
        this.continueList = new ArrayList<Integer>();
        Stmnt stmnt2 = (Stmnt)stmnt.head();
        ASTList aSTList = stmnt.tail();
        ASTree aSTree = aSTList.head();
        aSTList = aSTList.tail();
        Stmnt stmnt3 = (Stmnt)aSTList.head();
        Stmnt stmnt4 = (Stmnt)aSTList.tail();
        if (stmnt2 != null) {
            stmnt2.accept(this);
        }
        int n6 = this.bytecode.currentPc();
        int n10 = 0;
        if (aSTree != null) {
            if (this.compileBooleanExpr(false, aSTree)) {
                this.continueList = list2;
                this.breakList = list;
                this.hasReturned = false;
                return;
            }
            n10 = this.bytecode.currentPc();
            this.bytecode.addIndex(0);
        }
        if (stmnt4 != null) {
            stmnt4.accept(this);
        }
        int n11 = this.bytecode.currentPc();
        if (stmnt3 != null) {
            stmnt3.accept(this);
        }
        this.bytecode.addOpcode(167);
        this.bytecode.addIndex(n6 - this.bytecode.currentPc() + 1);
        int n12 = this.bytecode.currentPc();
        if (aSTree != null) {
            this.bytecode.write16bit(n10, n12 - n10 + 1);
        }
        this.patchGoto(this.breakList, n12);
        this.patchGoto(this.continueList, n11);
        this.continueList = list2;
        this.breakList = list;
        this.hasReturned = false;
    }

    private void atSwitchStmnt(Stmnt stmnt) throws CompileError {
        int n6;
        boolean bl = false;
        if (this.typeChecker != null) {
            this.doTypeCheck(stmnt.head());
            bl = this.typeChecker.exprType == 307 && this.typeChecker.arrayDim == 0 && "java/lang/String".equals(this.typeChecker.className);
        }
        this.compileExpr(stmnt.head());
        int n10 = -1;
        if (bl) {
            n10 = this.getMaxLocals();
            this.incMaxLocals(1);
            this.bytecode.addAstore(n10);
            this.bytecode.addAload(n10);
            this.bytecode.addInvokevirtual("java/lang/String", "hashCode", "()I");
        }
        List<Integer> list = this.breakList;
        this.breakList = new ArrayList<Integer>();
        int n11 = this.bytecode.currentPc();
        this.bytecode.addOpcode(171);
        int n12 = 3 - (n11 & 3);
        while (n12-- > 0) {
            this.bytecode.add(0);
        }
        Stmnt stmnt2 = (Stmnt)stmnt.tail();
        int n13 = 0;
        for (ASTList aSTList = stmnt2; aSTList != null; aSTList = aSTList.tail()) {
            if (((Stmnt)aSTList.head()).getOperator() != 304) continue;
            ++n13;
        }
        int n14 = this.bytecode.currentPc();
        this.bytecode.addGap(4);
        this.bytecode.add32bit(n13);
        this.bytecode.addGap(n13 * 8);
        long[] arrl = new long[n13];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n15 = 0;
        int n16 = -1;
        for (ASTList aSTList = stmnt2; aSTList != null; aSTList = aSTList.tail()) {
            Stmnt stmnt3 = (Stmnt)aSTList.head();
            int n17 = stmnt3.getOperator();
            if (n17 == 310) {
                n16 = this.bytecode.currentPc();
            } else if (n17 != 304) {
                CodeGen.fatal();
            } else {
                int n18 = this.bytecode.currentPc();
                long l = bl ? (long)this.computeStringLabel(stmnt3.head(), n10, arrayList) : (long)this.computeLabel(stmnt3.head());
                arrl[n15++] = (l << 32) + ((long)(n18 - n11) & 0xFFFFFFFFFFFFFFFFL);
            }
            this.hasReturned = false;
            ((Stmnt)stmnt3.tail()).accept(this);
        }
        Arrays.sort(arrl);
        int n19 = n14 + 8;
        for (n6 = 0; n6 < n13; ++n6) {
            this.bytecode.write32bit(n19, (int)(arrl[n6] >>> 32));
            this.bytecode.write32bit(n19 + 4, (int)arrl[n6]);
            n19 += 8;
        }
        if (n16 < 0 || this.breakList.size() > 0) {
            this.hasReturned = false;
        }
        n6 = this.bytecode.currentPc();
        if (n16 < 0) {
            n16 = n6;
        }
        this.bytecode.write32bit(n14, n16 - n11);
        for (int n17 : arrayList) {
            this.bytecode.write16bit(n17, n16 - n17 + 1);
        }
        this.patchGoto(this.breakList, n6);
        this.breakList = list;
    }

    private int computeLabel(ASTree aSTree) throws CompileError {
        this.doTypeCheck(aSTree);
        aSTree = TypeChecker.stripPlusExpr(aSTree);
        if (aSTree instanceof IntConst) {
            return (int)((IntConst)aSTree).get();
        }
        throw new CompileError("bad case label");
    }

    private int computeStringLabel(ASTree aSTree, int n6, List<Integer> list) throws CompileError {
        this.doTypeCheck(aSTree);
        aSTree = TypeChecker.stripPlusExpr(aSTree);
        if (aSTree instanceof StringL) {
            String string = ((StringL)aSTree).get();
            this.bytecode.addAload(n6);
            this.bytecode.addLdc(string);
            this.bytecode.addInvokevirtual("java/lang/String", "equals", "(Ljava/lang/Object;)Z");
            this.bytecode.addOpcode(153);
            Integer n10 = this.bytecode.currentPc();
            this.bytecode.addIndex(0);
            list.add(n10);
            return string.hashCode();
        }
        throw new CompileError("bad case label");
    }

    private void atBreakStmnt(Stmnt stmnt, boolean bl) throws CompileError {
        if (stmnt.head() != null) {
            throw new CompileError("sorry, not support labeled break or continue");
        }
        this.bytecode.addOpcode(167);
        Integer n6 = this.bytecode.currentPc();
        this.bytecode.addIndex(0);
        if (bl) {
            this.breakList.add(n6);
        } else {
            this.continueList.add(n6);
        }
    }

    protected void atReturnStmnt(Stmnt stmnt) throws CompileError {
        this.atReturnStmnt2(stmnt.getLeft());
    }

    protected final void atReturnStmnt2(ASTree aSTree) throws CompileError {
        int n6;
        if (aSTree == null) {
            n6 = 177;
        } else {
            int n10;
            this.compileExpr(aSTree);
            n6 = this.arrayDim > 0 ? 176 : ((n10 = this.exprType) == 312 ? 175 : (n10 == 317 ? 174 : (n10 == 326 ? 173 : (CodeGen.isRefType(n10) ? 176 : 172))));
        }
        CodeGen$ReturnHook codeGen$ReturnHook = this.returnHooks;
        while (codeGen$ReturnHook != null) {
            if (codeGen$ReturnHook.doit(this.bytecode, n6)) {
                this.hasReturned = true;
                return;
            }
            codeGen$ReturnHook = codeGen$ReturnHook.next;
        }
        this.bytecode.addOpcode(n6);
        this.hasReturned = true;
    }

    private void atThrowStmnt(Stmnt stmnt) throws CompileError {
        ASTree aSTree = stmnt.getLeft();
        this.compileExpr(aSTree);
        if (this.exprType != 307 || this.arrayDim > 0) {
            throw new CompileError("bad throw statement");
        }
        this.bytecode.addOpcode(191);
        this.hasReturned = true;
    }

    protected void atTryStmnt(Stmnt stmnt) throws CompileError {
        this.hasReturned = false;
    }

    private void atSyncStmnt(Stmnt stmnt) throws CompileError {
        int n6 = CodeGen.getListSize(this.breakList);
        int n10 = CodeGen.getListSize(this.continueList);
        this.compileExpr(stmnt.head());
        if (this.exprType != 307 && this.arrayDim == 0) {
            throw new CompileError("bad type expr for synchronized block");
        }
        Bytecode bytecode = this.bytecode;
        int n11 = bytecode.getMaxLocals();
        bytecode.incMaxLocals(1);
        bytecode.addOpcode(89);
        bytecode.addAstore(n11);
        bytecode.addOpcode(194);
        CodeGen$1 codeGen$1 = new CodeGen$1(this, this, n11);
        int n12 = bytecode.currentPc();
        Stmnt stmnt2 = (Stmnt)stmnt.tail();
        if (stmnt2 != null) {
            stmnt2.accept(this);
        }
        int n13 = bytecode.currentPc();
        int n14 = 0;
        if (!this.hasReturned) {
            ((CodeGen$ReturnHook)codeGen$1).doit(bytecode, 0);
            bytecode.addOpcode(167);
            n14 = bytecode.currentPc();
            bytecode.addIndex(0);
        }
        if (n12 < n13) {
            int n15 = bytecode.currentPc();
            ((CodeGen$ReturnHook)codeGen$1).doit(bytecode, 0);
            bytecode.addOpcode(191);
            bytecode.addExceptionHandler(n12, n13, n15, 0);
        }
        if (!this.hasReturned) {
            bytecode.write16bit(n14, bytecode.currentPc() - n14 + 1);
        }
        codeGen$1.remove(this);
        if (CodeGen.getListSize(this.breakList) != n6 || CodeGen.getListSize(this.continueList) != n10) {
            throw new CompileError("sorry, cannot break/continue in synchronized block");
        }
    }

    private static int getListSize(List<Integer> list) {
        return list == null ? 0 : list.size();
    }

    private static boolean isPlusPlusExpr(ASTree aSTree) {
        if (aSTree instanceof Expr) {
            int n6 = ((Expr)aSTree).getOperator();
            return n6 == 362 || n6 == 363;
        }
        return false;
    }

    @Override
    public void atDeclarator(Declarator declarator) throws CompileError {
        declarator.setLocalVar(this.getMaxLocals());
        declarator.setClassName(this.resolveClassName(declarator.getClassName()));
        int n6 = CodeGen.is2word(declarator.getType(), declarator.getArrayDim()) ? 2 : 1;
        this.incMaxLocals(n6);
        ASTree aSTree = declarator.getInitializer();
        if (aSTree != null) {
            this.doTypeCheck(aSTree);
            this.atVariableAssign(null, 61, null, declarator, aSTree, false);
        }
    }

    @Override
    public abstract void atNewExpr(NewExpr var1) throws CompileError;

    @Override
    public abstract void atArrayInit(ArrayInit var1) throws CompileError;

    @Override
    public void atAssignExpr(AssignExpr assignExpr) throws CompileError {
        this.atAssignExpr(assignExpr, true);
    }

    protected void atAssignExpr(AssignExpr assignExpr, boolean bl) throws CompileError {
        int n6 = assignExpr.getOperator();
        ASTree aSTree = assignExpr.oprand1();
        ASTree aSTree2 = assignExpr.oprand2();
        if (aSTree instanceof Variable) {
            this.atVariableAssign(assignExpr, n6, (Variable)aSTree, ((Variable)aSTree).getDeclarator(), aSTree2, bl);
        } else {
            Expr expr;
            if (aSTree instanceof Expr && (expr = (Expr)aSTree).getOperator() == 65) {
                this.atArrayAssign(assignExpr, n6, (Expr)aSTree, aSTree2, bl);
                return;
            }
            this.atFieldAssign(assignExpr, n6, aSTree, aSTree2, bl);
        }
    }

    protected static void badAssign(Expr expr) throws CompileError {
        String string = expr == null ? "incompatible type for assignment" : "incompatible type for " + expr.getName();
        throw new CompileError(string);
    }

    private void atVariableAssign(Expr expr, int n6, Variable variable, Declarator declarator, ASTree aSTree, boolean bl) throws CompileError {
        int n10 = declarator.getType();
        int n11 = declarator.getArrayDim();
        String string = declarator.getClassName();
        int n12 = this.getLocalVar(declarator);
        if (n6 != 61) {
            this.atVariable(variable);
        }
        if (expr == null && aSTree instanceof ArrayInit) {
            this.atArrayVariableAssign((ArrayInit)aSTree, n10, n11, string);
        } else {
            this.atAssignCore(expr, n6, aSTree, n10, n11, string);
        }
        if (bl) {
            if (CodeGen.is2word(n10, n11)) {
                this.bytecode.addOpcode(92);
            } else {
                this.bytecode.addOpcode(89);
            }
        }
        if (n11 > 0) {
            this.bytecode.addAstore(n12);
        } else if (n10 == 312) {
            this.bytecode.addDstore(n12);
        } else if (n10 == 317) {
            this.bytecode.addFstore(n12);
        } else if (n10 == 326) {
            this.bytecode.addLstore(n12);
        } else if (CodeGen.isRefType(n10)) {
            this.bytecode.addAstore(n12);
        } else {
            this.bytecode.addIstore(n12);
        }
        this.exprType = n10;
        this.arrayDim = n11;
        this.className = string;
    }

    protected abstract void atArrayVariableAssign(ArrayInit var1, int var2, int var3, String var4) throws CompileError;

    private void atArrayAssign(Expr expr, int n6, Expr expr2, ASTree aSTree, boolean bl) throws CompileError {
        this.arrayAccess(expr2.oprand1(), expr2.oprand2());
        if (n6 != 61) {
            this.bytecode.addOpcode(92);
            this.bytecode.addOpcode(CodeGen.getArrayReadOp(this.exprType, this.arrayDim));
        }
        int n10 = this.exprType;
        int n11 = this.arrayDim;
        String string = this.className;
        this.atAssignCore(expr, n6, aSTree, n10, n11, string);
        if (bl) {
            if (CodeGen.is2word(n10, n11)) {
                this.bytecode.addOpcode(94);
            } else {
                this.bytecode.addOpcode(91);
            }
        }
        this.bytecode.addOpcode(CodeGen.getArrayWriteOp(n10, n11));
        this.exprType = n10;
        this.arrayDim = n11;
        this.className = string;
    }

    protected abstract void atFieldAssign(Expr var1, int var2, ASTree var3, ASTree var4, boolean var5) throws CompileError;

    protected void atAssignCore(Expr expr, int n6, ASTree aSTree, int n10, int n11, String string) throws CompileError {
        if (n6 == 354 && n11 == 0 && n10 == 307) {
            this.atStringPlusEq(expr, n10, n11, string, aSTree);
        } else {
            aSTree.accept(this);
            if (this.invalidDim(this.exprType, this.arrayDim, this.className, n10, n11, string, false) || n6 != 61 && n11 > 0) {
                CodeGen.badAssign(expr);
            }
            if (n6 != 61) {
                int n12 = assignOps[n6 - 351];
                int n13 = CodeGen.lookupBinOp(n12);
                if (n13 < 0) {
                    CodeGen.fatal();
                }
                this.atArithBinExpr(expr, n12, n13, n10);
            }
        }
        if (n6 != 61 || n11 == 0 && !CodeGen.isRefType(n10)) {
            this.atNumCastExpr(this.exprType, n10);
        }
    }

    private void atStringPlusEq(Expr expr, int n6, int n10, String string, ASTree aSTree) throws CompileError {
        if (!"java/lang/String".equals(string)) {
            CodeGen.badAssign(expr);
        }
        this.convToString(n6, n10);
        aSTree.accept(this);
        this.convToString(this.exprType, this.arrayDim);
        this.bytecode.addInvokevirtual("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
        this.exprType = 307;
        this.arrayDim = 0;
        this.className = "java/lang/String";
    }

    private boolean invalidDim(int n6, int n10, String string, int n11, int n12, String string2, boolean bl) {
        if (n10 != n12) {
            if (n6 == 412) {
                return false;
            }
            if (n12 == 0 && n11 == 307 && "java/lang/Object".equals(string2)) {
                return false;
            }
            return !bl || n10 != 0 || n6 != 307 || !"java/lang/Object".equals(string);
        }
        return false;
    }

    @Override
    public void atCondExpr(CondExpr condExpr) throws CompileError {
        if (this.booleanExpr(false, condExpr.condExpr())) {
            condExpr.elseExpr().accept(this);
        } else {
            int n6 = this.bytecode.currentPc();
            this.bytecode.addIndex(0);
            condExpr.thenExpr().accept(this);
            int n10 = this.arrayDim;
            this.bytecode.addOpcode(167);
            int n11 = this.bytecode.currentPc();
            this.bytecode.addIndex(0);
            this.bytecode.write16bit(n6, this.bytecode.currentPc() - n6 + 1);
            condExpr.elseExpr().accept(this);
            if (n10 != this.arrayDim) {
                throw new CompileError("type mismatch in ?:");
            }
            this.bytecode.write16bit(n11, this.bytecode.currentPc() - n11 + 1);
        }
    }

    static int lookupBinOp(int n6) {
        int[] arrn = binOp;
        int n10 = arrn.length;
        for (int k = 0; k < n10; k += 5) {
            if (arrn[k] != n6) continue;
            return k;
        }
        return -1;
    }

    @Override
    public void atBinExpr(BinExpr binExpr) throws CompileError {
        int n6 = binExpr.getOperator();
        int n10 = CodeGen.lookupBinOp(n6);
        if (n10 >= 0) {
            binExpr.oprand1().accept(this);
            ASTree aSTree = binExpr.oprand2();
            if (aSTree == null) {
                return;
            }
            int n11 = this.exprType;
            int n12 = this.arrayDim;
            String string = this.className;
            aSTree.accept(this);
            if (n12 != this.arrayDim) {
                throw new CompileError("incompatible array types");
            }
            if (n6 == 43 && n12 == 0 && (n11 == 307 || this.exprType == 307)) {
                this.atStringConcatExpr(binExpr, n11, n12, string);
            } else {
                this.atArithBinExpr(binExpr, n6, n10, n11);
            }
        } else {
            if (!this.booleanExpr(true, binExpr)) {
                this.bytecode.addIndex(7);
                this.bytecode.addIconst(0);
                this.bytecode.addOpcode(167);
                this.bytecode.addIndex(4);
            }
            this.bytecode.addIconst(1);
        }
    }

    private void atArithBinExpr(Expr expr, int n6, int n10, int n11) throws CompileError {
        int n12;
        if (this.arrayDim != 0) {
            CodeGen.badTypes(expr);
        }
        int n13 = this.exprType;
        if (n6 == 364 || n6 == 366 || n6 == 370) {
            if (n13 == 324 || n13 == 334 || n13 == 306 || n13 == 303) {
                this.exprType = n11;
            } else {
                CodeGen.badTypes(expr);
            }
        } else {
            this.convertOprandTypes(n11, n13, expr);
        }
        int n14 = CodeGen.typePrecedence(this.exprType);
        if (n14 >= 0 && (n12 = binOp[n10 + n14 + 1]) != 0) {
            if (n14 == 3 && this.exprType != 301) {
                this.exprType = 324;
            }
            this.bytecode.addOpcode(n12);
            return;
        }
        CodeGen.badTypes(expr);
    }

    private void atStringConcatExpr(Expr expr, int n6, int n10, String string) throws CompileError {
        boolean bl;
        int n11 = this.exprType;
        int n12 = this.arrayDim;
        boolean bl2 = CodeGen.is2word(n11, n12);
        boolean bl3 = bl = n11 == 307 && "java/lang/String".equals(this.className);
        if (bl2) {
            this.convToString(n11, n12);
        }
        if (CodeGen.is2word(n6, n10)) {
            this.bytecode.addOpcode(91);
            this.bytecode.addOpcode(87);
        } else {
            this.bytecode.addOpcode(95);
        }
        this.convToString(n6, n10);
        this.bytecode.addOpcode(95);
        if (!bl2 && !bl) {
            this.convToString(n11, n12);
        }
        this.bytecode.addInvokevirtual("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
        this.exprType = 307;
        this.arrayDim = 0;
        this.className = "java/lang/String";
    }

    private void convToString(int n6, int n10) throws CompileError {
        String string = "valueOf";
        if (CodeGen.isRefType(n6) || n10 > 0) {
            this.bytecode.addInvokestatic("java.lang.String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;");
        } else if (n6 == 312) {
            this.bytecode.addInvokestatic("java.lang.String", "valueOf", "(D)Ljava/lang/String;");
        } else if (n6 == 317) {
            this.bytecode.addInvokestatic("java.lang.String", "valueOf", "(F)Ljava/lang/String;");
        } else if (n6 == 326) {
            this.bytecode.addInvokestatic("java.lang.String", "valueOf", "(J)Ljava/lang/String;");
        } else if (n6 == 301) {
            this.bytecode.addInvokestatic("java.lang.String", "valueOf", "(Z)Ljava/lang/String;");
        } else if (n6 == 306) {
            this.bytecode.addInvokestatic("java.lang.String", "valueOf", "(C)Ljava/lang/String;");
        } else {
            if (n6 == 344) {
                throw new CompileError("void type expression");
            }
            this.bytecode.addInvokestatic("java.lang.String", "valueOf", "(I)Ljava/lang/String;");
        }
    }

    private boolean booleanExpr(boolean bl, ASTree aSTree) throws CompileError {
        int n6 = CodeGen.getCompOperator(aSTree);
        if (n6 == 358) {
            BinExpr binExpr = (BinExpr)aSTree;
            int n10 = this.compileOprands(binExpr);
            this.compareExpr(bl, binExpr.getOperator(), n10, binExpr);
        } else {
            if (n6 == 33) {
                return this.booleanExpr(!bl, ((Expr)aSTree).oprand1());
            }
            boolean bl2 = n6 == 369;
            if (bl2 || n6 == 368) {
                BinExpr binExpr;
                if (this.booleanExpr(!bl2, (binExpr = (BinExpr)aSTree).oprand1())) {
                    this.exprType = 301;
                    this.arrayDim = 0;
                    return true;
                }
                int n11 = this.bytecode.currentPc();
                this.bytecode.addIndex(0);
                if (this.booleanExpr(bl2, binExpr.oprand2())) {
                    this.bytecode.addOpcode(167);
                }
                this.bytecode.write16bit(n11, this.bytecode.currentPc() - n11 + 3);
                if (bl != bl2) {
                    this.bytecode.addIndex(6);
                    this.bytecode.addOpcode(167);
                }
            } else {
                if (CodeGen.isAlwaysBranch(aSTree, bl)) {
                    this.exprType = 301;
                    this.arrayDim = 0;
                    return true;
                }
                aSTree.accept(this);
                if (this.exprType != 301 || this.arrayDim != 0) {
                    throw new CompileError("boolean expr is required");
                }
                this.bytecode.addOpcode(bl ? 154 : 153);
            }
        }
        this.exprType = 301;
        this.arrayDim = 0;
        return false;
    }

    private static boolean isAlwaysBranch(ASTree aSTree, boolean bl) {
        if (aSTree instanceof Keyword) {
            int n6 = ((Keyword)aSTree).get();
            return bl ? n6 == 410 : n6 == 411;
        }
        return false;
    }

    static int getCompOperator(ASTree aSTree) throws CompileError {
        if (aSTree instanceof Expr) {
            Expr expr = (Expr)aSTree;
            int n6 = expr.getOperator();
            if (n6 == 33) {
                return 33;
            }
            if (expr instanceof BinExpr && n6 != 368 && n6 != 369 && n6 != 38 && n6 != 124) {
                return 358;
            }
            return n6;
        }
        return 32;
    }

    private int compileOprands(BinExpr binExpr) throws CompileError {
        binExpr.oprand1().accept(this);
        int n6 = this.exprType;
        int n10 = this.arrayDim;
        binExpr.oprand2().accept(this);
        if (n10 != this.arrayDim) {
            if (n6 != 412 && this.exprType != 412) {
                throw new CompileError("incompatible array types");
            }
            if (this.exprType == 412) {
                this.arrayDim = n10;
            }
        }
        if (n6 == 412) {
            return this.exprType;
        }
        return n6;
    }

    private void compareExpr(boolean bl, int n6, int n10, BinExpr binExpr) throws CompileError {
        int n11;
        if (this.arrayDim == 0) {
            this.convertOprandTypes(n10, this.exprType, binExpr);
        }
        if ((n11 = CodeGen.typePrecedence(this.exprType)) == -1 || this.arrayDim > 0) {
            if (n6 == 358) {
                this.bytecode.addOpcode(bl ? 165 : 166);
            } else if (n6 == 350) {
                this.bytecode.addOpcode(bl ? 166 : 165);
            } else {
                CodeGen.badTypes(binExpr);
            }
        } else if (n11 == 3) {
            int[] arrn = ifOp;
            for (int k = 0; k < arrn.length; k += 3) {
                if (arrn[k] != n6) continue;
                this.bytecode.addOpcode(arrn[k + (bl ? 1 : 2)]);
                return;
            }
            CodeGen.badTypes(binExpr);
        } else {
            if (n11 == 0) {
                if (n6 == 60 || n6 == 357) {
                    this.bytecode.addOpcode(152);
                } else {
                    this.bytecode.addOpcode(151);
                }
            } else if (n11 == 1) {
                if (n6 == 60 || n6 == 357) {
                    this.bytecode.addOpcode(150);
                } else {
                    this.bytecode.addOpcode(149);
                }
            } else if (n11 == 2) {
                this.bytecode.addOpcode(148);
            } else {
                CodeGen.fatal();
            }
            int[] arrn = ifOp2;
            for (int k = 0; k < arrn.length; k += 3) {
                if (arrn[k] != n6) continue;
                this.bytecode.addOpcode(arrn[k + (bl ? 1 : 2)]);
                return;
            }
            CodeGen.badTypes(binExpr);
        }
    }

    protected static void badTypes(Expr expr) throws CompileError {
        throw new CompileError("invalid types for " + expr.getName());
    }

    protected static boolean isRefType(int n6) {
        return n6 == 307 || n6 == 412;
    }

    private static int typePrecedence(int n6) {
        if (n6 == 312) {
            return 0;
        }
        if (n6 == 317) {
            return 1;
        }
        if (n6 == 326) {
            return 2;
        }
        if (CodeGen.isRefType(n6)) {
            return -1;
        }
        if (n6 == 344) {
            return -1;
        }
        return 3;
    }

    static boolean isP_INT(int n6) {
        return CodeGen.typePrecedence(n6) == 3;
    }

    static boolean rightIsStrong(int n6, int n10) {
        int n11 = CodeGen.typePrecedence(n6);
        int n12 = CodeGen.typePrecedence(n10);
        return n11 >= 0 && n12 >= 0 && n11 > n12;
    }

    private void convertOprandTypes(int n6, int n10, Expr expr) throws CompileError {
        int n11;
        int n12;
        boolean bl;
        int n13 = CodeGen.typePrecedence(n6);
        int n14 = CodeGen.typePrecedence(n10);
        if (n14 < 0 && n13 < 0) {
            return;
        }
        if (n14 < 0 || n13 < 0) {
            CodeGen.badTypes(expr);
        }
        if (n13 <= n14) {
            bl = false;
            this.exprType = n6;
            n12 = castOp[n14 * 4 + n13];
            n11 = n13;
        } else {
            bl = true;
            n12 = castOp[n13 * 4 + n14];
            n11 = n14;
        }
        if (bl) {
            if (n11 == 0 || n11 == 2) {
                if (n13 == 0 || n13 == 2) {
                    this.bytecode.addOpcode(94);
                } else {
                    this.bytecode.addOpcode(93);
                }
                this.bytecode.addOpcode(88);
                this.bytecode.addOpcode(n12);
                this.bytecode.addOpcode(94);
                this.bytecode.addOpcode(88);
            } else if (n11 == 1) {
                if (n13 == 2) {
                    this.bytecode.addOpcode(91);
                    this.bytecode.addOpcode(87);
                } else {
                    this.bytecode.addOpcode(95);
                }
                this.bytecode.addOpcode(n12);
                this.bytecode.addOpcode(95);
            } else {
                CodeGen.fatal();
            }
        } else if (n12 != 0) {
            this.bytecode.addOpcode(n12);
        }
    }

    @Override
    public void atCastExpr(CastExpr castExpr) throws CompileError {
        String string = this.resolveClassName(castExpr.getClassName());
        String string2 = this.checkCastExpr(castExpr, string);
        int n6 = this.exprType;
        this.exprType = castExpr.getType();
        this.arrayDim = castExpr.getArrayDim();
        this.className = string;
        if (string2 == null) {
            this.atNumCastExpr(n6, this.exprType);
        } else {
            this.bytecode.addCheckcast(string2);
        }
    }

    @Override
    public void atInstanceOfExpr(InstanceOfExpr instanceOfExpr) throws CompileError {
        String string = this.resolveClassName(instanceOfExpr.getClassName());
        String string2 = this.checkCastExpr(instanceOfExpr, string);
        this.bytecode.addInstanceof(string2);
        this.exprType = 301;
        this.arrayDim = 0;
    }

    private String checkCastExpr(CastExpr castExpr, String string) throws CompileError {
        String string2 = "invalid cast";
        ASTree aSTree = castExpr.getOprand();
        int n6 = castExpr.getArrayDim();
        int n10 = castExpr.getType();
        aSTree.accept(this);
        int n11 = this.exprType;
        int n12 = this.arrayDim;
        if (this.invalidDim(n11, this.arrayDim, this.className, n10, n6, string, true) || n11 == 344 || n10 == 344) {
            throw new CompileError("invalid cast");
        }
        if (n10 == 307) {
            if (!CodeGen.isRefType(n11) && n12 == 0) {
                throw new CompileError("invalid cast");
            }
            return CodeGen.toJvmArrayName(string, n6);
        }
        if (n6 > 0) {
            return CodeGen.toJvmTypeName(n10, n6);
        }
        return null;
    }

    void atNumCastExpr(int n6, int n10) throws CompileError {
        if (n6 == n10) {
            return;
        }
        int n11 = CodeGen.typePrecedence(n6);
        int n12 = CodeGen.typePrecedence(n10);
        int n13 = n11 >= 0 && n11 < 3 ? castOp[n11 * 4 + n12] : 0;
        int n14 = n10 == 312 ? 135 : (n10 == 317 ? 134 : (n10 == 326 ? 133 : (n10 == 334 ? 147 : (n10 == 306 ? 146 : (n10 == 303 ? 145 : 0)))));
        if (n13 != 0) {
            this.bytecode.addOpcode(n13);
        }
        if ((n13 == 0 || n13 == 136 || n13 == 139 || n13 == 142) && n14 != 0) {
            this.bytecode.addOpcode(n14);
        }
    }

    @Override
    public void atExpr(Expr expr) throws CompileError {
        int n6 = expr.getOperator();
        ASTree aSTree = expr.oprand1();
        if (n6 == 46) {
            String string = ((Symbol)expr.oprand2()).get();
            if (string.equals("class")) {
                this.atClassObject(expr);
            } else {
                this.atFieldRead(expr);
            }
        } else if (n6 == 35) {
            this.atFieldRead(expr);
        } else if (n6 == 65) {
            this.atArrayRead(aSTree, expr.oprand2());
        } else if (n6 == 362 || n6 == 363) {
            this.atPlusPlus(n6, aSTree, expr, true);
        } else if (n6 == 33) {
            if (!this.booleanExpr(false, expr)) {
                this.bytecode.addIndex(7);
                this.bytecode.addIconst(1);
                this.bytecode.addOpcode(167);
                this.bytecode.addIndex(4);
            }
            this.bytecode.addIconst(0);
        } else if (n6 == 67) {
            CodeGen.fatal();
        } else {
            expr.oprand1().accept(this);
            int n10 = CodeGen.typePrecedence(this.exprType);
            if (this.arrayDim > 0) {
                CodeGen.badType(expr);
            }
            if (n6 == 45) {
                if (n10 == 0) {
                    this.bytecode.addOpcode(119);
                } else if (n10 == 1) {
                    this.bytecode.addOpcode(118);
                } else if (n10 == 2) {
                    this.bytecode.addOpcode(117);
                } else if (n10 == 3) {
                    this.bytecode.addOpcode(116);
                    this.exprType = 324;
                } else {
                    CodeGen.badType(expr);
                }
            } else if (n6 == 126) {
                if (n10 == 3) {
                    this.bytecode.addIconst(-1);
                    this.bytecode.addOpcode(130);
                    this.exprType = 324;
                } else if (n10 == 2) {
                    this.bytecode.addLconst(-1L);
                    this.bytecode.addOpcode(131);
                } else {
                    CodeGen.badType(expr);
                }
            } else if (n6 == 43) {
                if (n10 == -1) {
                    CodeGen.badType(expr);
                }
            } else {
                CodeGen.fatal();
            }
        }
    }

    protected static void badType(Expr expr) throws CompileError {
        throw new CompileError("invalid type for " + expr.getName());
    }

    @Override
    public abstract void atCallExpr(CallExpr var1) throws CompileError;

    protected abstract void atFieldRead(ASTree var1) throws CompileError;

    public void atClassObject(Expr expr) throws CompileError {
        ASTree aSTree = expr.oprand1();
        if (!(aSTree instanceof Symbol)) {
            throw new CompileError("fatal error: badly parsed .class expr");
        }
        String string = ((Symbol)aSTree).get();
        if (string.startsWith("[")) {
            String string2;
            String string3;
            int n6 = string.indexOf("[L");
            if (n6 >= 0 && !(string3 = string.substring(n6 + 2, string.length() - 1)).equals(string2 = this.resolveClassName(string3))) {
                string2 = MemberResolver.jvmToJavaName(string2);
                StringBuffer stringBuffer = new StringBuffer();
                while (n6-- >= 0) {
                    stringBuffer.append('[');
                }
                stringBuffer.append('L').append(string2).append(';');
                string = stringBuffer.toString();
            }
        } else {
            string = this.resolveClassName(MemberResolver.javaToJvmName(string));
            string = MemberResolver.jvmToJavaName(string);
        }
        this.atClassObject2(string);
        this.exprType = 307;
        this.arrayDim = 0;
        this.className = "java/lang/Class";
    }

    protected void atClassObject2(String string) throws CompileError {
        int n6 = this.bytecode.currentPc();
        this.bytecode.addLdc(string);
        this.bytecode.addInvokestatic("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
        int n10 = this.bytecode.currentPc();
        this.bytecode.addOpcode(167);
        int n11 = this.bytecode.currentPc();
        this.bytecode.addIndex(0);
        this.bytecode.addExceptionHandler(n6, n10, this.bytecode.currentPc(), "java.lang.ClassNotFoundException");
        this.bytecode.growStack(1);
        this.bytecode.addInvokestatic("a.ci", "fail", "(Ljava/lang/ClassNotFoundException;)Ljava/lang/NoClassDefFoundError;");
        this.bytecode.addOpcode(191);
        this.bytecode.write16bit(n11, this.bytecode.currentPc() - n11 + 1);
    }

    public void atArrayRead(ASTree aSTree, ASTree aSTree2) throws CompileError {
        this.arrayAccess(aSTree, aSTree2);
        this.bytecode.addOpcode(CodeGen.getArrayReadOp(this.exprType, this.arrayDim));
    }

    protected void arrayAccess(ASTree aSTree, ASTree aSTree2) throws CompileError {
        aSTree.accept(this);
        int n6 = this.exprType;
        int n10 = this.arrayDim;
        if (n10 == 0) {
            throw new CompileError("bad array access");
        }
        String string = this.className;
        aSTree2.accept(this);
        if (CodeGen.typePrecedence(this.exprType) != 3 || this.arrayDim > 0) {
            throw new CompileError("bad array index");
        }
        this.exprType = n6;
        this.arrayDim = n10 - 1;
        this.className = string;
    }

    protected static int getArrayReadOp(int n6, int n10) {
        if (n10 > 0) {
            return 50;
        }
        switch (n6) {
            case 312: {
                return 49;
            }
            case 317: {
                return 48;
            }
            case 326: {
                return 47;
            }
            case 324: {
                return 46;
            }
            case 334: {
                return 53;
            }
            case 306: {
                return 52;
            }
            case 301: 
            case 303: {
                return 51;
            }
        }
        return 50;
    }

    protected static int getArrayWriteOp(int n6, int n10) {
        if (n10 > 0) {
            return 83;
        }
        switch (n6) {
            case 312: {
                return 82;
            }
            case 317: {
                return 81;
            }
            case 326: {
                return 80;
            }
            case 324: {
                return 79;
            }
            case 334: {
                return 86;
            }
            case 306: {
                return 85;
            }
            case 301: 
            case 303: {
                return 84;
            }
        }
        return 83;
    }

    private void atPlusPlus(int n6, ASTree aSTree, Expr expr, boolean bl) throws CompileError {
        boolean bl2;
        boolean bl3 = bl2 = aSTree == null;
        if (bl2) {
            aSTree = expr.oprand2();
        }
        if (aSTree instanceof Variable) {
            Declarator declarator = ((Variable)aSTree).getDeclarator();
            int n10 = this.exprType = declarator.getType();
            this.arrayDim = declarator.getArrayDim();
            int n11 = this.getLocalVar(declarator);
            if (this.arrayDim > 0) {
                CodeGen.badType(expr);
            }
            if (n10 == 312) {
                this.bytecode.addDload(n11);
                if (bl && bl2) {
                    this.bytecode.addOpcode(92);
                }
                this.bytecode.addDconst(1.0);
                this.bytecode.addOpcode(n6 == 362 ? 99 : 103);
                if (bl && !bl2) {
                    this.bytecode.addOpcode(92);
                }
                this.bytecode.addDstore(n11);
            } else if (n10 == 326) {
                this.bytecode.addLload(n11);
                if (bl && bl2) {
                    this.bytecode.addOpcode(92);
                }
                this.bytecode.addLconst(1L);
                this.bytecode.addOpcode(n6 == 362 ? 97 : 101);
                if (bl && !bl2) {
                    this.bytecode.addOpcode(92);
                }
                this.bytecode.addLstore(n11);
            } else if (n10 == 317) {
                this.bytecode.addFload(n11);
                if (bl && bl2) {
                    this.bytecode.addOpcode(89);
                }
                this.bytecode.addFconst(1.0f);
                this.bytecode.addOpcode(n6 == 362 ? 98 : 102);
                if (bl && !bl2) {
                    this.bytecode.addOpcode(89);
                }
                this.bytecode.addFstore(n11);
            } else if (n10 == 303 || n10 == 306 || n10 == 334 || n10 == 324) {
                int n12;
                if (bl && bl2) {
                    this.bytecode.addIload(n11);
                }
                int n13 = n12 = n6 == 362 ? 1 : -1;
                if (n11 > 255) {
                    this.bytecode.addOpcode(196);
                    this.bytecode.addOpcode(132);
                    this.bytecode.addIndex(n11);
                    this.bytecode.addIndex(n12);
                } else {
                    this.bytecode.addOpcode(132);
                    this.bytecode.add(n11);
                    this.bytecode.add(n12);
                }
                if (bl && !bl2) {
                    this.bytecode.addIload(n11);
                }
            } else {
                CodeGen.badType(expr);
            }
        } else {
            Expr expr2;
            if (aSTree instanceof Expr && (expr2 = (Expr)aSTree).getOperator() == 65) {
                this.atArrayPlusPlus(n6, bl2, expr2, bl);
                return;
            }
            this.atFieldPlusPlus(n6, bl2, aSTree, expr, bl);
        }
    }

    public void atArrayPlusPlus(int n6, boolean bl, Expr expr, boolean bl2) throws CompileError {
        this.arrayAccess(expr.oprand1(), expr.oprand2());
        int n10 = this.exprType;
        int n11 = this.arrayDim;
        if (n11 > 0) {
            CodeGen.badType(expr);
        }
        this.bytecode.addOpcode(92);
        this.bytecode.addOpcode(CodeGen.getArrayReadOp(n10, this.arrayDim));
        int n12 = CodeGen.is2word(n10, n11) ? 94 : 91;
        this.atPlusPlusCore(n12, bl2, n6, bl, expr);
        this.bytecode.addOpcode(CodeGen.getArrayWriteOp(n10, n11));
    }

    protected void atPlusPlusCore(int n6, boolean bl, int n10, boolean bl2, Expr expr) throws CompileError {
        int n11 = this.exprType;
        if (bl && bl2) {
            this.bytecode.addOpcode(n6);
        }
        if (n11 == 324 || n11 == 303 || n11 == 306 || n11 == 334) {
            this.bytecode.addIconst(1);
            this.bytecode.addOpcode(n10 == 362 ? 96 : 100);
            this.exprType = 324;
        } else if (n11 == 326) {
            this.bytecode.addLconst(1L);
            this.bytecode.addOpcode(n10 == 362 ? 97 : 101);
        } else if (n11 == 317) {
            this.bytecode.addFconst(1.0f);
            this.bytecode.addOpcode(n10 == 362 ? 98 : 102);
        } else if (n11 == 312) {
            this.bytecode.addDconst(1.0);
            this.bytecode.addOpcode(n10 == 362 ? 99 : 103);
        } else {
            CodeGen.badType(expr);
        }
        if (bl && !bl2) {
            this.bytecode.addOpcode(n6);
        }
    }

    protected abstract void atFieldPlusPlus(int var1, boolean var2, ASTree var3, Expr var4, boolean var5) throws CompileError;

    @Override
    public abstract void atMember(Member var1) throws CompileError;

    @Override
    public void atVariable(Variable variable) throws CompileError {
        Declarator declarator = variable.getDeclarator();
        this.exprType = declarator.getType();
        this.arrayDim = declarator.getArrayDim();
        this.className = declarator.getClassName();
        int n6 = this.getLocalVar(declarator);
        if (this.arrayDim > 0) {
            this.bytecode.addAload(n6);
        } else {
            switch (this.exprType) {
                case 307: {
                    this.bytecode.addAload(n6);
                    break;
                }
                case 326: {
                    this.bytecode.addLload(n6);
                    break;
                }
                case 317: {
                    this.bytecode.addFload(n6);
                    break;
                }
                case 312: {
                    this.bytecode.addDload(n6);
                    break;
                }
                default: {
                    this.bytecode.addIload(n6);
                }
            }
        }
    }

    @Override
    public void atKeyword(Keyword keyword) throws CompileError {
        this.arrayDim = 0;
        int n6 = keyword.get();
        switch (n6) {
            case 410: {
                this.bytecode.addIconst(1);
                this.exprType = 301;
                break;
            }
            case 411: {
                this.bytecode.addIconst(0);
                this.exprType = 301;
                break;
            }
            case 412: {
                this.bytecode.addOpcode(1);
                this.exprType = 412;
                break;
            }
            case 336: 
            case 339: {
                if (this.inStaticMethod) {
                    throw new CompileError("not-available: " + (n6 == 339 ? "this" : "super"));
                }
                this.bytecode.addAload(0);
                this.exprType = 307;
                if (n6 == 339) {
                    this.className = this.getThisName();
                    break;
                }
                this.className = this.getSuperName();
                break;
            }
            default: {
                CodeGen.fatal();
            }
        }
    }

    @Override
    public void atStringL(StringL stringL) throws CompileError {
        this.exprType = 307;
        this.arrayDim = 0;
        this.className = "java/lang/String";
        this.bytecode.addLdc(stringL.get());
    }

    @Override
    public void atIntConst(IntConst intConst) throws CompileError {
        this.arrayDim = 0;
        long l = intConst.get();
        int n6 = intConst.getType();
        if (n6 == 402 || n6 == 401) {
            this.exprType = n6 == 402 ? 324 : 306;
            this.bytecode.addIconst((int)l);
        } else {
            this.exprType = 326;
            this.bytecode.addLconst(l);
        }
    }

    @Override
    public void atDoubleConst(DoubleConst doubleConst) throws CompileError {
        this.arrayDim = 0;
        if (doubleConst.getType() == 405) {
            this.exprType = 312;
            this.bytecode.addDconst(doubleConst.get());
        } else {
            this.exprType = 317;
            this.bytecode.addFconst((float)doubleConst.get());
        }
    }
}

