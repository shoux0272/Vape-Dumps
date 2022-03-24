/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.Opcode;
import javassist.compiler.CodeGen;
import javassist.compiler.CompileError;
import javassist.compiler.MemberResolver;
import javassist.compiler.MemberResolver$Method;
import javassist.compiler.NoFieldException;
import javassist.compiler.TokenId;
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
import javassist.compiler.ast.InstanceOfExpr;
import javassist.compiler.ast.IntConst;
import javassist.compiler.ast.Keyword;
import javassist.compiler.ast.Member;
import javassist.compiler.ast.NewExpr;
import javassist.compiler.ast.StringL;
import javassist.compiler.ast.Symbol;
import javassist.compiler.ast.Variable;
import javassist.compiler.ast.Visitor;

public class TypeChecker
extends Visitor
implements Opcode,
TokenId {
    static final String javaLangObject = "java.lang.Object";
    static final String jvmJavaLangObject = "java/lang/Object";
    static final String jvmJavaLangString = "java/lang/String";
    static final String jvmJavaLangClass = "java/lang/Class";
    protected int exprType;
    protected int arrayDim;
    protected String className;
    protected MemberResolver resolver;
    protected CtClass thisClass;
    protected MethodInfo thisMethod;

    public TypeChecker(CtClass ctClass, ClassPool classPool) {
        this.resolver = new MemberResolver(classPool);
        this.thisClass = ctClass;
        this.thisMethod = null;
    }

    protected static String argTypesToString(int[] arrn, int[] arrn2, String[] arrstring) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        int n6 = arrn.length;
        if (n6 > 0) {
            int n10 = 0;
            while (true) {
                TypeChecker.typeToString(stringBuffer, arrn[n10], arrn2[n10], arrstring[n10]);
                if (++n10 >= n6) break;
                stringBuffer.append(',');
            }
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    protected static StringBuffer typeToString(StringBuffer stringBuffer, int n6, int n10, String string) {
        String string2;
        if (n6 == 307) {
            string2 = MemberResolver.jvmToJavaName(string);
        } else if (n6 == 412) {
            string2 = "Object";
        } else {
            try {
                string2 = MemberResolver.getTypeName(n6);
            }
            catch (CompileError compileError) {
                string2 = "?";
            }
        }
        stringBuffer.append(string2);
        while (n10-- > 0) {
            stringBuffer.append("[]");
        }
        return stringBuffer;
    }

    public void setThisMethod(MethodInfo methodInfo) {
        this.thisMethod = methodInfo;
    }

    protected static void fatal() throws CompileError {
        throw new CompileError("fatal");
    }

    protected String getThisName() {
        return MemberResolver.javaToJvmName(this.thisClass.getName());
    }

    protected String getSuperName() throws CompileError {
        return MemberResolver.javaToJvmName(MemberResolver.getSuperclass(this.thisClass).getName());
    }

    protected String resolveClassName(ASTList aSTList) throws CompileError {
        return this.resolver.resolveClassName(aSTList);
    }

    protected String resolveClassName(String string) throws CompileError {
        return this.resolver.resolveJvmClassName(string);
    }

    @Override
    public void atNewExpr(NewExpr newExpr) throws CompileError {
        if (newExpr.isArray()) {
            this.atNewArrayExpr(newExpr);
        } else {
            CtClass ctClass = this.resolver.lookupClassByName(newExpr.getClassName());
            String string = ctClass.getName();
            ASTList aSTList = newExpr.getArguments();
            this.atMethodCallCore(ctClass, "<init>", aSTList);
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
        if (arrayInit != null) {
            ((ASTree)arrayInit).accept(this);
        }
        if (aSTList.length() > 1) {
            this.atMultiNewArray(n6, aSTList2, aSTList);
        } else {
            ASTree aSTree = aSTList.head();
            if (aSTree != null) {
                aSTree.accept(this);
            }
            this.exprType = n6;
            this.arrayDim = 1;
            this.className = n6 == 307 ? this.resolveClassName(aSTList2) : null;
        }
    }

    @Override
    public void atArrayInit(ArrayInit arrayInit) throws CompileError {
        for (ASTList aSTList = arrayInit; aSTList != null; aSTList = aSTList.tail()) {
            ASTree aSTree = aSTList.head();
            if (aSTree == null) continue;
            aSTree.accept(this);
        }
    }

    protected void atMultiNewArray(int n6, ASTList aSTList, ASTList aSTList2) throws CompileError {
        int n10 = aSTList2.length();
        int n11 = 0;
        while (aSTList2 != null) {
            ASTree aSTree = aSTList2.head();
            if (aSTree == null) break;
            ++n11;
            aSTree.accept(this);
            aSTList2 = aSTList2.tail();
        }
        this.exprType = n6;
        this.arrayDim = n10;
        this.className = n6 == 307 ? this.resolveClassName(aSTList) : null;
    }

    @Override
    public void atAssignExpr(AssignExpr assignExpr) throws CompileError {
        int n6 = assignExpr.getOperator();
        ASTree aSTree = assignExpr.oprand1();
        ASTree aSTree2 = assignExpr.oprand2();
        if (aSTree instanceof Variable) {
            this.atVariableAssign(assignExpr, n6, (Variable)aSTree, ((Variable)aSTree).getDeclarator(), aSTree2);
        } else {
            Expr expr;
            if (aSTree instanceof Expr && (expr = (Expr)aSTree).getOperator() == 65) {
                this.atArrayAssign(assignExpr, n6, (Expr)aSTree, aSTree2);
                return;
            }
            this.atFieldAssign(assignExpr, n6, aSTree, aSTree2);
        }
    }

    private void atVariableAssign(Expr expr, int n6, Variable variable, Declarator declarator, ASTree aSTree) throws CompileError {
        int n10 = declarator.getType();
        int n11 = declarator.getArrayDim();
        String string = declarator.getClassName();
        if (n6 != 61) {
            this.atVariable(variable);
        }
        aSTree.accept(this);
        this.exprType = n10;
        this.arrayDim = n11;
        this.className = string;
    }

    private void atArrayAssign(Expr expr, int n6, Expr expr2, ASTree aSTree) throws CompileError {
        this.atArrayRead(expr2.oprand1(), expr2.oprand2());
        int n10 = this.exprType;
        int n11 = this.arrayDim;
        String string = this.className;
        aSTree.accept(this);
        this.exprType = n10;
        this.arrayDim = n11;
        this.className = string;
    }

    protected void atFieldAssign(Expr expr, int n6, ASTree aSTree, ASTree aSTree2) throws CompileError {
        CtField ctField = this.fieldAccess(aSTree);
        this.atFieldRead(ctField);
        int n10 = this.exprType;
        int n11 = this.arrayDim;
        String string = this.className;
        aSTree2.accept(this);
        this.exprType = n10;
        this.arrayDim = n11;
        this.className = string;
    }

    @Override
    public void atCondExpr(CondExpr condExpr) throws CompileError {
        this.booleanExpr(condExpr.condExpr());
        condExpr.thenExpr().accept(this);
        int n6 = this.exprType;
        int n10 = this.arrayDim;
        String string = this.className;
        condExpr.elseExpr().accept(this);
        if (n10 == 0 && n10 == this.arrayDim) {
            if (CodeGen.rightIsStrong(n6, this.exprType)) {
                condExpr.setThen(new CastExpr(this.exprType, 0, condExpr.thenExpr()));
            } else if (CodeGen.rightIsStrong(this.exprType, n6)) {
                condExpr.setElse(new CastExpr(n6, 0, condExpr.elseExpr()));
                this.exprType = n6;
            }
        }
    }

    @Override
    public void atBinExpr(BinExpr binExpr) throws CompileError {
        int n6 = binExpr.getOperator();
        int n10 = CodeGen.lookupBinOp(n6);
        if (n10 >= 0) {
            if (n6 == 43) {
                Expr expr = this.atPlusExpr(binExpr);
                if (expr != null) {
                    expr = CallExpr.makeCall(Expr.make(46, (ASTree)expr, (ASTree)new Member("toString")), null);
                    binExpr.setOprand1(expr);
                    binExpr.setOprand2(null);
                    this.className = jvmJavaLangString;
                }
            } else {
                ASTree aSTree = binExpr.oprand1();
                ASTree aSTree2 = binExpr.oprand2();
                aSTree.accept(this);
                int n11 = this.exprType;
                aSTree2.accept(this);
                if (!this.isConstant(binExpr, n6, aSTree, aSTree2)) {
                    this.computeBinExprType(binExpr, n6, n11);
                }
            }
        } else {
            this.booleanExpr(binExpr);
        }
    }

    private Expr atPlusExpr(BinExpr binExpr) throws CompileError {
        ASTree aSTree = binExpr.oprand1();
        ASTree aSTree2 = binExpr.oprand2();
        if (aSTree2 == null) {
            aSTree.accept(this);
            return null;
        }
        if (TypeChecker.isPlusExpr(aSTree)) {
            Expr expr = this.atPlusExpr((BinExpr)aSTree);
            if (expr != null) {
                aSTree2.accept(this);
                this.exprType = 307;
                this.arrayDim = 0;
                this.className = "java/lang/StringBuffer";
                return TypeChecker.makeAppendCall(expr, aSTree2);
            }
        } else {
            aSTree.accept(this);
        }
        int n6 = this.exprType;
        int n10 = this.arrayDim;
        String string = this.className;
        aSTree2.accept(this);
        if (this.isConstant(binExpr, 43, aSTree, aSTree2)) {
            return null;
        }
        if (n6 == 307 && n10 == 0 && jvmJavaLangString.equals(string) || this.exprType == 307 && this.arrayDim == 0 && jvmJavaLangString.equals(this.className)) {
            ASTList aSTList = ASTList.make(new Symbol("java"), new Symbol("lang"), new Symbol("StringBuffer"));
            NewExpr newExpr = new NewExpr(aSTList, null);
            this.exprType = 307;
            this.arrayDim = 0;
            this.className = "java/lang/StringBuffer";
            return TypeChecker.makeAppendCall(TypeChecker.makeAppendCall(newExpr, aSTree), aSTree2);
        }
        this.computeBinExprType(binExpr, 43, n6);
        return null;
    }

    private boolean isConstant(BinExpr binExpr, int n6, ASTree aSTree, ASTree aSTree2) throws CompileError {
        aSTree = TypeChecker.stripPlusExpr(aSTree);
        aSTree2 = TypeChecker.stripPlusExpr(aSTree2);
        ASTree aSTree3 = null;
        if (aSTree instanceof StringL && aSTree2 instanceof StringL && n6 == 43) {
            aSTree3 = new StringL(String.valueOf(((StringL)aSTree).get()) + ((StringL)aSTree2).get());
        } else if (aSTree instanceof IntConst) {
            aSTree3 = ((IntConst)aSTree).compute(n6, aSTree2);
        } else if (aSTree instanceof DoubleConst) {
            aSTree3 = ((DoubleConst)aSTree).compute(n6, aSTree2);
        }
        if (aSTree3 == null) {
            return false;
        }
        binExpr.setOperator(43);
        binExpr.setOprand1(aSTree3);
        binExpr.setOprand2(null);
        aSTree3.accept(this);
        return true;
    }

    static ASTree stripPlusExpr(ASTree aSTree) {
        ASTree aSTree2;
        if (aSTree instanceof BinExpr) {
            BinExpr binExpr = (BinExpr)aSTree;
            if (binExpr.getOperator() == 43 && binExpr.oprand2() == null) {
                return binExpr.getLeft();
            }
        } else if (aSTree instanceof Expr) {
            Expr expr = (Expr)aSTree;
            int n6 = expr.getOperator();
            if (n6 == 35) {
                ASTree aSTree3 = TypeChecker.getConstantFieldValue((Member)expr.oprand2());
                if (aSTree3 != null) {
                    return aSTree3;
                }
            } else if (n6 == 43 && expr.getRight() == null) {
                return expr.getLeft();
            }
        } else if (aSTree instanceof Member && (aSTree2 = TypeChecker.getConstantFieldValue((Member)aSTree)) != null) {
            return aSTree2;
        }
        return aSTree;
    }

    private static ASTree getConstantFieldValue(Member member) {
        return TypeChecker.getConstantFieldValue(member.getField());
    }

    public static ASTree getConstantFieldValue(CtField ctField) {
        if (ctField == null) {
            return null;
        }
        Object object = ctField.getConstantValue();
        if (object == null) {
            return null;
        }
        if (object instanceof String) {
            return new StringL((String)object);
        }
        if (object instanceof Double || object instanceof Float) {
            int n6 = object instanceof Double ? 405 : 404;
            return new DoubleConst(((Number)object).doubleValue(), n6);
        }
        if (object instanceof Number) {
            int n10 = object instanceof Long ? 403 : 402;
            return new IntConst(((Number)object).longValue(), n10);
        }
        if (object instanceof Boolean) {
            return new Keyword((Boolean)object != false ? 410 : 411);
        }
        return null;
    }

    private static boolean isPlusExpr(ASTree aSTree) {
        if (aSTree instanceof BinExpr) {
            BinExpr binExpr = (BinExpr)aSTree;
            int n6 = binExpr.getOperator();
            return n6 == 43;
        }
        return false;
    }

    private static Expr makeAppendCall(ASTree aSTree, ASTree aSTree2) {
        return CallExpr.makeCall(Expr.make(46, aSTree, (ASTree)new Member("append")), new ASTList(aSTree2));
    }

    private void computeBinExprType(BinExpr binExpr, int n6, int n10) throws CompileError {
        int n11 = this.exprType;
        if (n6 == 364 || n6 == 366 || n6 == 370) {
            this.exprType = n10;
        } else {
            this.insertCast(binExpr, n10, n11);
        }
        if (CodeGen.isP_INT(this.exprType) && this.exprType != 301) {
            this.exprType = 324;
        }
    }

    private void booleanExpr(ASTree aSTree) throws CompileError {
        int n6 = CodeGen.getCompOperator(aSTree);
        if (n6 == 358) {
            BinExpr binExpr = (BinExpr)aSTree;
            binExpr.oprand1().accept(this);
            int n10 = this.exprType;
            int n11 = this.arrayDim;
            binExpr.oprand2().accept(this);
            if (n11 == 0 && this.arrayDim == 0) {
                this.insertCast(binExpr, n10, this.exprType);
            }
        } else if (n6 == 33) {
            ((Expr)aSTree).oprand1().accept(this);
        } else if (n6 == 369 || n6 == 368) {
            BinExpr binExpr = (BinExpr)aSTree;
            binExpr.oprand1().accept(this);
            binExpr.oprand2().accept(this);
        } else {
            aSTree.accept(this);
        }
        this.exprType = 301;
        this.arrayDim = 0;
    }

    private void insertCast(BinExpr binExpr, int n6, int n10) throws CompileError {
        if (CodeGen.rightIsStrong(n6, n10)) {
            binExpr.setLeft(new CastExpr(n10, 0, binExpr.oprand1()));
        } else {
            this.exprType = n6;
        }
    }

    @Override
    public void atCastExpr(CastExpr castExpr) throws CompileError {
        String string = this.resolveClassName(castExpr.getClassName());
        castExpr.getOprand().accept(this);
        this.exprType = castExpr.getType();
        this.arrayDim = castExpr.getArrayDim();
        this.className = string;
    }

    @Override
    public void atInstanceOfExpr(InstanceOfExpr instanceOfExpr) throws CompileError {
        instanceOfExpr.getOprand().accept(this);
        this.exprType = 301;
        this.arrayDim = 0;
    }

    @Override
    public void atExpr(Expr expr) throws CompileError {
        int n6 = expr.getOperator();
        ASTree aSTree = expr.oprand1();
        if (n6 == 46) {
            String string = ((Symbol)expr.oprand2()).get();
            if (string.equals("length")) {
                try {
                    this.atArrayLength(expr);
                }
                catch (NoFieldException noFieldException) {
                    this.atFieldRead(expr);
                }
            } else if (string.equals("class")) {
                this.atClassObject(expr);
            } else {
                this.atFieldRead(expr);
            }
        } else if (n6 == 35) {
            String string = ((Symbol)expr.oprand2()).get();
            if (string.equals("class")) {
                this.atClassObject(expr);
            } else {
                this.atFieldRead(expr);
            }
        } else if (n6 == 65) {
            this.atArrayRead(aSTree, expr.oprand2());
        } else if (n6 == 362 || n6 == 363) {
            this.atPlusPlus(n6, aSTree, expr);
        } else if (n6 == 33) {
            this.booleanExpr(expr);
        } else if (n6 == 67) {
            TypeChecker.fatal();
        } else {
            aSTree.accept(this);
            if (!this.isConstant(expr, n6, aSTree) && (n6 == 45 || n6 == 126) && CodeGen.isP_INT(this.exprType)) {
                this.exprType = 324;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isConstant(Expr expr, int n6, ASTree aSTree) {
        if ((aSTree = TypeChecker.stripPlusExpr(aSTree)) instanceof IntConst) {
            IntConst intConst = (IntConst)aSTree;
            long l = intConst.get();
            if (n6 == 45) {
                l = -l;
            } else {
                if (n6 != 126) return false;
                l ^= 0xFFFFFFFFFFFFFFFFL;
            }
            intConst.set(l);
        } else {
            if (!(aSTree instanceof DoubleConst)) return false;
            DoubleConst doubleConst = (DoubleConst)aSTree;
            if (n6 != 45) return false;
            doubleConst.set(-doubleConst.get());
        }
        expr.setOperator(43);
        return true;
    }

    @Override
    public void atCallExpr(CallExpr callExpr) throws CompileError {
        Object object;
        String string = null;
        CtClass ctClass = null;
        ASTree aSTree = callExpr.oprand1();
        ASTList aSTList = (ASTList)callExpr.oprand2();
        if (aSTree instanceof Member) {
            string = ((Member)aSTree).get();
            ctClass = this.thisClass;
        } else if (aSTree instanceof Keyword) {
            string = "<init>";
            ctClass = ((Keyword)aSTree).get() == 336 ? MemberResolver.getSuperclass(this.thisClass) : this.thisClass;
        } else if (aSTree instanceof Expr) {
            object = (Expr)aSTree;
            string = ((Symbol)((Expr)object).oprand2()).get();
            int n6 = ((Expr)object).getOperator();
            if (n6 == 35) {
                ctClass = this.resolver.lookupClass(((Symbol)((Expr)object).oprand1()).get(), false);
            } else if (n6 == 46) {
                ASTree aSTree2 = ((Expr)object).oprand1();
                String string2 = TypeChecker.isDotSuper(aSTree2);
                if (string2 != null) {
                    ctClass = MemberResolver.getSuperInterface(this.thisClass, string2);
                } else {
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
                        ((Expr)object).setOperator(35);
                        ((Expr)object).setOprand1(new Symbol(MemberResolver.jvmToJavaName(this.className)));
                    }
                    if (this.arrayDim > 0) {
                        ctClass = this.resolver.lookupClass(javaLangObject, true);
                    } else if (this.exprType == 307) {
                        ctClass = this.resolver.lookupClassByJvmName(this.className);
                    } else {
                        TypeChecker.badMethod();
                    }
                }
            } else {
                TypeChecker.badMethod();
            }
        } else {
            TypeChecker.fatal();
        }
        object = this.atMethodCallCore(ctClass, string, aSTList);
        callExpr.setMethod((MemberResolver$Method)object);
    }

    private static void badMethod() throws CompileError {
        throw new CompileError("bad method");
    }

    static String isDotSuper(ASTree aSTree) {
        ASTree aSTree2;
        Expr expr;
        if (aSTree instanceof Expr && (expr = (Expr)aSTree).getOperator() == 46 && (aSTree2 = expr.oprand2()) instanceof Keyword && ((Keyword)aSTree2).get() == 336) {
            return ((Symbol)expr.oprand1()).get();
        }
        return null;
    }

    public MemberResolver$Method atMethodCallCore(CtClass ctClass, String string, ASTList aSTList) throws CompileError {
        int n6 = this.getMethodArgsLength(aSTList);
        int[] arrn = new int[n6];
        int[] arrn2 = new int[n6];
        String[] arrstring = new String[n6];
        this.atMethodArgs(aSTList, arrn, arrn2, arrstring);
        MemberResolver$Method memberResolver$Method = this.resolver.lookupMethod(ctClass, this.thisClass, this.thisMethod, string, arrn, arrn2, arrstring);
        if (memberResolver$Method == null) {
            String string2 = ctClass.getName();
            String string3 = TypeChecker.argTypesToString(arrn, arrn2, arrstring);
            String string4 = string.equals("<init>") ? "cannot find constructor " + string2 + string3 : String.valueOf(string) + string3 + " not found in " + string2;
            throw new CompileError(string4);
        }
        String string5 = memberResolver$Method.info.getDescriptor();
        this.setReturnType(string5);
        return memberResolver$Method;
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

    void setReturnType(String string) throws CompileError {
        int n6 = string.indexOf(41);
        if (n6 < 0) {
            TypeChecker.badMethod();
        }
        char c3 = string.charAt(++n6);
        int n10 = 0;
        while (c3 == '[') {
            ++n10;
            c3 = string.charAt(++n6);
        }
        this.arrayDim = n10;
        if (c3 == 'L') {
            int n11 = string.indexOf(59, n6 + 1);
            if (n11 < 0) {
                TypeChecker.badMethod();
            }
            this.exprType = 307;
            this.className = string.substring(n6 + 1, n11);
        } else {
            this.exprType = MemberResolver.descToType(c3);
            this.className = null;
        }
    }

    private void atFieldRead(ASTree aSTree) throws CompileError {
        this.atFieldRead(this.fieldAccess(aSTree));
    }

    private void atFieldRead(CtField ctField) throws CompileError {
        FieldInfo fieldInfo = ctField.getFieldInfo2();
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
    }

    protected CtField fieldAccess(ASTree aSTree) throws CompileError {
        if (aSTree instanceof Member) {
            Member member = (Member)aSTree;
            String string = member.get();
            try {
                CtField ctField = this.thisClass.getField(string);
                if (Modifier.isStatic(ctField.getModifiers())) {
                    member.setField(ctField);
                }
                return ctField;
            }
            catch (NotFoundException notFoundException) {
                throw new NoFieldException(string, aSTree);
            }
        }
        if (aSTree instanceof Expr) {
            Expr expr = (Expr)aSTree;
            int n6 = expr.getOperator();
            if (n6 == 35) {
                Member member = (Member)expr.oprand2();
                CtField ctField = this.resolver.lookupField(((Symbol)expr.oprand1()).get(), member);
                member.setField(ctField);
                return ctField;
            }
            if (n6 == 46) {
                try {
                    expr.oprand1().accept(this);
                }
                catch (NoFieldException noFieldException) {
                    if (noFieldException.getExpr() != expr.oprand1()) {
                        throw noFieldException;
                    }
                    return this.fieldAccess2(expr, noFieldException.getField());
                }
                CompileError compileError = null;
                try {
                    if (this.exprType == 307 && this.arrayDim == 0) {
                        return this.resolver.lookupFieldByJvmName(this.className, (Symbol)expr.oprand2());
                    }
                }
                catch (CompileError compileError2) {
                    compileError = compileError2;
                }
                ASTree aSTree2 = expr.oprand1();
                if (aSTree2 instanceof Symbol) {
                    return this.fieldAccess2(expr, ((Symbol)aSTree2).get());
                }
                if (compileError != null) {
                    throw compileError;
                }
            }
        }
        throw new CompileError("bad filed access");
    }

    private CtField fieldAccess2(Expr expr, String string) throws CompileError {
        Member member = (Member)expr.oprand2();
        CtField ctField = this.resolver.lookupFieldByJvmName2(string, member, expr);
        expr.setOperator(35);
        expr.setOprand1(new Symbol(MemberResolver.jvmToJavaName(string)));
        member.setField(ctField);
        return ctField;
    }

    public void atClassObject(Expr expr) throws CompileError {
        this.exprType = 307;
        this.arrayDim = 0;
        this.className = jvmJavaLangClass;
    }

    public void atArrayLength(Expr expr) throws CompileError {
        expr.oprand1().accept(this);
        if (this.arrayDim == 0) {
            throw new NoFieldException("length", expr);
        }
        this.exprType = 324;
        this.arrayDim = 0;
    }

    public void atArrayRead(ASTree aSTree, ASTree aSTree2) throws CompileError {
        aSTree.accept(this);
        int n6 = this.exprType;
        int n10 = this.arrayDim;
        String string = this.className;
        aSTree2.accept(this);
        this.exprType = n6;
        this.arrayDim = n10 - 1;
        this.className = string;
    }

    private void atPlusPlus(int n6, ASTree aSTree, Expr expr) throws CompileError {
        boolean bl;
        boolean bl2 = bl = aSTree == null;
        if (bl) {
            aSTree = expr.oprand2();
        }
        if (aSTree instanceof Variable) {
            Declarator declarator = ((Variable)aSTree).getDeclarator();
            this.exprType = declarator.getType();
            this.arrayDim = declarator.getArrayDim();
        } else {
            Expr expr2;
            if (aSTree instanceof Expr && (expr2 = (Expr)aSTree).getOperator() == 65) {
                this.atArrayRead(expr2.oprand1(), expr2.oprand2());
                int n10 = this.exprType;
                if (n10 == 324 || n10 == 303 || n10 == 306 || n10 == 334) {
                    this.exprType = 324;
                }
                return;
            }
            this.atFieldPlusPlus(aSTree);
        }
    }

    protected void atFieldPlusPlus(ASTree aSTree) throws CompileError {
        CtField ctField = this.fieldAccess(aSTree);
        this.atFieldRead(ctField);
        int n6 = this.exprType;
        if (n6 == 324 || n6 == 303 || n6 == 306 || n6 == 334) {
            this.exprType = 324;
        }
    }

    @Override
    public void atMember(Member member) throws CompileError {
        this.atFieldRead(member);
    }

    @Override
    public void atVariable(Variable variable) throws CompileError {
        Declarator declarator = variable.getDeclarator();
        this.exprType = declarator.getType();
        this.arrayDim = declarator.getArrayDim();
        this.className = declarator.getClassName();
    }

    @Override
    public void atKeyword(Keyword keyword) throws CompileError {
        this.arrayDim = 0;
        int n6 = keyword.get();
        switch (n6) {
            case 410: 
            case 411: {
                this.exprType = 301;
                break;
            }
            case 412: {
                this.exprType = 412;
                break;
            }
            case 336: 
            case 339: {
                this.exprType = 307;
                if (n6 == 339) {
                    this.className = this.getThisName();
                    break;
                }
                this.className = this.getSuperName();
                break;
            }
            default: {
                TypeChecker.fatal();
            }
        }
    }

    @Override
    public void atStringL(StringL stringL) throws CompileError {
        this.exprType = 307;
        this.arrayDim = 0;
        this.className = jvmJavaLangString;
    }

    @Override
    public void atIntConst(IntConst intConst) throws CompileError {
        this.arrayDim = 0;
        int n6 = intConst.getType();
        this.exprType = n6 == 402 || n6 == 401 ? (n6 == 402 ? 324 : 306) : 326;
    }

    @Override
    public void atDoubleConst(DoubleConst doubleConst) throws CompileError {
        this.arrayDim = 0;
        this.exprType = doubleConst.getType() == 405 ? 312 : 317;
    }
}

