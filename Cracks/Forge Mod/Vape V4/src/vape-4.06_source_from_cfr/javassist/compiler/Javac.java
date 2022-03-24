/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.CannotCompileException;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMember;
import javassist.CtMethod;
import javassist.CtPrimitiveType;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.compiler.CompileError;
import javassist.compiler.Javac$1;
import javassist.compiler.Javac$2;
import javassist.compiler.Javac$3;
import javassist.compiler.Javac$CtFieldWithInit;
import javassist.compiler.JvstCodeGen;
import javassist.compiler.Lex;
import javassist.compiler.MemberResolver;
import javassist.compiler.Parser;
import javassist.compiler.ProceedHandler;
import javassist.compiler.SymbolTable;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Declarator;
import javassist.compiler.ast.FieldDecl;
import javassist.compiler.ast.MethodDecl;
import javassist.compiler.ast.Stmnt;

public class Javac {
    JvstCodeGen gen;
    SymbolTable stable;
    private Bytecode bytecode;
    public static final String param0Name = "$0";
    public static final String resultVarName = "$_";
    public static final String proceedName = "$proceed";

    public Javac(CtClass ctClass) {
        this(new Bytecode(ctClass.getClassFile2().getConstPool(), 0, 0), ctClass);
    }

    public Javac(Bytecode bytecode, CtClass ctClass) {
        this.gen = new JvstCodeGen(bytecode, ctClass, ctClass.getClassPool());
        this.stable = new SymbolTable();
        this.bytecode = bytecode;
    }

    public Bytecode getBytecode() {
        return this.bytecode;
    }

    public CtMember compile(String string) throws CompileError {
        Parser parser = new Parser(new Lex(string));
        ASTList aSTList = parser.parseMember1(this.stable);
        try {
            if (aSTList instanceof FieldDecl) {
                return this.compileField((FieldDecl)aSTList);
            }
            CtBehavior ctBehavior = this.compileMethod(parser, (MethodDecl)aSTList);
            CtClass ctClass = ctBehavior.getDeclaringClass();
            ctBehavior.getMethodInfo2().rebuildStackMapIf6(ctClass.getClassPool(), ctClass.getClassFile2());
            return ctBehavior;
        }
        catch (BadBytecode badBytecode) {
            throw new CompileError(badBytecode.getMessage());
        }
        catch (CannotCompileException cannotCompileException) {
            throw new CompileError(cannotCompileException.getMessage());
        }
    }

    private CtField compileField(FieldDecl fieldDecl) throws CompileError, CannotCompileException {
        Declarator declarator = fieldDecl.getDeclarator();
        Javac$CtFieldWithInit javac$CtFieldWithInit = new Javac$CtFieldWithInit(this.gen.resolver.lookupClass(declarator), declarator.getVariable().get(), this.gen.getThisClass());
        javac$CtFieldWithInit.setModifiers(MemberResolver.getModifiers(fieldDecl.getModifiers()));
        if (fieldDecl.getInit() != null) {
            javac$CtFieldWithInit.setInit(fieldDecl.getInit());
        }
        return javac$CtFieldWithInit;
    }

    private CtBehavior compileMethod(Parser parser, MethodDecl methodDecl) throws CompileError {
        int n6 = MemberResolver.getModifiers(methodDecl.getModifiers());
        CtClass[] arrctClass = this.gen.makeParamList(methodDecl);
        CtClass[] arrctClass2 = this.gen.makeThrowsList(methodDecl);
        this.recordParams(arrctClass, Modifier.isStatic(n6));
        methodDecl = parser.parseMethod2(this.stable, methodDecl);
        try {
            if (methodDecl.isConstructor()) {
                CtConstructor ctConstructor = new CtConstructor(arrctClass, this.gen.getThisClass());
                ctConstructor.setModifiers(n6);
                methodDecl.accept(this.gen);
                ctConstructor.getMethodInfo().setCodeAttribute(this.bytecode.toCodeAttribute());
                ctConstructor.setExceptionTypes(arrctClass2);
                return ctConstructor;
            }
            Declarator declarator = methodDecl.getReturn();
            CtClass ctClass = this.gen.resolver.lookupClass(declarator);
            this.recordReturnType(ctClass, false);
            CtMethod ctMethod = new CtMethod(ctClass, declarator.getVariable().get(), arrctClass, this.gen.getThisClass());
            ctMethod.setModifiers(n6);
            this.gen.setThisMethod(ctMethod);
            methodDecl.accept(this.gen);
            if (methodDecl.getBody() != null) {
                ctMethod.getMethodInfo().setCodeAttribute(this.bytecode.toCodeAttribute());
            } else {
                ctMethod.setModifiers(n6 | 0x400);
            }
            ctMethod.setExceptionTypes(arrctClass2);
            return ctMethod;
        }
        catch (NotFoundException notFoundException) {
            throw new CompileError(notFoundException.toString());
        }
    }

    public Bytecode compileBody(CtBehavior ctBehavior, String string) throws CompileError {
        try {
            boolean bl;
            CtClass ctClass;
            int n6 = ctBehavior.getModifiers();
            this.recordParams(ctBehavior.getParameterTypes(), Modifier.isStatic(n6));
            if (ctBehavior instanceof CtMethod) {
                this.gen.setThisMethod((CtMethod)ctBehavior);
                ctClass = ((CtMethod)ctBehavior).getReturnType();
            } else {
                ctClass = CtClass.voidType;
            }
            this.recordReturnType(ctClass, false);
            boolean bl2 = bl = ctClass == CtClass.voidType;
            if (string == null) {
                Javac.makeDefaultBody(this.bytecode, ctClass);
            } else {
                Parser parser = new Parser(new Lex(string));
                SymbolTable symbolTable = new SymbolTable(this.stable);
                Stmnt stmnt = parser.parseStatement(symbolTable);
                if (parser.hasMore()) {
                    throw new CompileError("the method/constructor body must be surrounded by {}");
                }
                boolean bl3 = false;
                if (ctBehavior instanceof CtConstructor) {
                    bl3 = !((CtConstructor)ctBehavior).isClassInitializer();
                }
                this.gen.atMethodBody(stmnt, bl3, bl);
            }
            return this.bytecode;
        }
        catch (NotFoundException notFoundException) {
            throw new CompileError(notFoundException.toString());
        }
    }

    private static void makeDefaultBody(Bytecode bytecode, CtClass ctClass) {
        int n6;
        int n10;
        if (ctClass instanceof CtPrimitiveType) {
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
            n10 = ctPrimitiveType.getReturnOp();
            n6 = n10 == 175 ? 14 : (n10 == 174 ? 11 : (n10 == 173 ? 9 : (n10 == 177 ? 0 : 3)));
        } else {
            n10 = 176;
            n6 = 1;
        }
        if (n6 != 0) {
            bytecode.addOpcode(n6);
        }
        bytecode.addOpcode(n10);
    }

    public boolean recordLocalVariables(CodeAttribute codeAttribute, int n6) throws CompileError {
        LocalVariableAttribute localVariableAttribute = (LocalVariableAttribute)codeAttribute.getAttribute("LocalVariableTable");
        if (localVariableAttribute == null) {
            return false;
        }
        int n10 = localVariableAttribute.tableLength();
        for (int k = 0; k < n10; ++k) {
            int n11 = localVariableAttribute.startPc(k);
            int n12 = localVariableAttribute.codeLength(k);
            if (n11 > n6 || n6 >= n11 + n12) continue;
            this.gen.recordVariable(localVariableAttribute.descriptor(k), localVariableAttribute.variableName(k), localVariableAttribute.index(k), this.stable);
        }
        return true;
    }

    public boolean recordParamNames(CodeAttribute codeAttribute, int n6) throws CompileError {
        LocalVariableAttribute localVariableAttribute = (LocalVariableAttribute)codeAttribute.getAttribute("LocalVariableTable");
        if (localVariableAttribute == null) {
            return false;
        }
        int n10 = localVariableAttribute.tableLength();
        for (int k = 0; k < n10; ++k) {
            int n11 = localVariableAttribute.index(k);
            if (n11 >= n6) continue;
            this.gen.recordVariable(localVariableAttribute.descriptor(k), localVariableAttribute.variableName(k), n11, this.stable);
        }
        return true;
    }

    public int recordParams(CtClass[] arrctClass, boolean bl) throws CompileError {
        return this.gen.recordParams(arrctClass, bl, "$", "$args", "$$", this.stable);
    }

    public int recordParams(String string, CtClass[] arrctClass, boolean bl, int n6, boolean bl2) throws CompileError {
        return this.gen.recordParams(arrctClass, bl2, "$", "$args", "$$", bl, n6, string, this.stable);
    }

    public void setMaxLocals(int n6) {
        this.gen.setMaxLocals(n6);
    }

    public int recordReturnType(CtClass ctClass, boolean bl) throws CompileError {
        this.gen.recordType(ctClass);
        return this.gen.recordReturnType(ctClass, "$r", bl ? resultVarName : null, this.stable);
    }

    public void recordType(CtClass ctClass) {
        this.gen.recordType(ctClass);
    }

    public int recordVariable(CtClass ctClass, String string) throws CompileError {
        return this.gen.recordVariable(ctClass, string, this.stable);
    }

    public void recordProceed(String string, String string2) throws CompileError {
        Parser parser = new Parser(new Lex(string));
        ASTree aSTree = parser.parseExpression(this.stable);
        String string3 = string2;
        Javac$1 javac$1 = new Javac$1(this, string3, aSTree);
        this.gen.setProceedHandler(javac$1, proceedName);
    }

    public void recordStaticProceed(String string, String string2) throws CompileError {
        String string3 = string;
        String string4 = string2;
        Javac$2 javac$2 = new Javac$2(this, string3, string4);
        this.gen.setProceedHandler(javac$2, proceedName);
    }

    public void recordSpecialProceed(String string, String string2, String string3, String string4, int n6) throws CompileError {
        Parser parser = new Parser(new Lex(string));
        ASTree aSTree = parser.parseExpression(this.stable);
        Javac$3 javac$3 = new Javac$3(this, aSTree, n6, string4, string2, string3);
        this.gen.setProceedHandler(javac$3, proceedName);
    }

    public void recordProceed(ProceedHandler proceedHandler) {
        this.gen.setProceedHandler(proceedHandler, proceedName);
    }

    public void compileStmnt(String string) throws CompileError {
        Parser parser = new Parser(new Lex(string));
        SymbolTable symbolTable = new SymbolTable(this.stable);
        while (parser.hasMore()) {
            Stmnt stmnt = parser.parseStatement(symbolTable);
            if (stmnt == null) continue;
            stmnt.accept(this.gen);
        }
    }

    public void compileExpr(String string) throws CompileError {
        ASTree aSTree = Javac.parseExpr(string, this.stable);
        this.compileExpr(aSTree);
    }

    public static ASTree parseExpr(String string, SymbolTable symbolTable) throws CompileError {
        Parser parser = new Parser(new Lex(string));
        return parser.parseExpression(symbolTable);
    }

    public void compileExpr(ASTree aSTree) throws CompileError {
        if (aSTree != null) {
            this.gen.compileExpr(aSTree);
        }
    }
}

