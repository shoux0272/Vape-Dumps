/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import java.io.Serializable;
import javassist.compiler.CodeGen;
import javassist.compiler.CompileError;
import javassist.compiler.Lex;
import javassist.compiler.SymbolTable;
import javassist.compiler.SyntaxError;
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

public final class Parser
implements TokenId {
    private Lex lex;
    private static final int[] binaryOpPrecedence;

    static {
        int[] arrn = new int[31];
        arrn[4] = 1;
        arrn[5] = 6;
        arrn[9] = 1;
        arrn[10] = 2;
        arrn[12] = 2;
        arrn[14] = 1;
        arrn[27] = 4;
        arrn[29] = 4;
        binaryOpPrecedence = arrn;
    }

    public Parser(Lex lex) {
        this.lex = lex;
    }

    public boolean hasMore() {
        return this.lex.lookAhead() >= 0;
    }

    public ASTList parseMember(SymbolTable symbolTable) throws CompileError {
        ASTList aSTList = this.parseMember1(symbolTable);
        if (aSTList instanceof MethodDecl) {
            return this.parseMethod2(symbolTable, (MethodDecl)aSTList);
        }
        return aSTList;
    }

    public ASTList parseMember1(SymbolTable symbolTable) throws CompileError {
        Declarator declarator;
        ASTList aSTList = this.parseMemberMods();
        boolean bl = false;
        if (this.lex.lookAhead() == 400 && this.lex.lookAhead(1) == 40) {
            declarator = new Declarator(344, 0);
            bl = true;
        } else {
            declarator = this.parseFormalType(symbolTable);
        }
        if (this.lex.get() != 400) {
            throw new SyntaxError(this.lex);
        }
        String string = bl ? "<init>" : this.lex.getString();
        declarator.setVariable(new Symbol(string));
        if (bl || this.lex.lookAhead() == 40) {
            return this.parseMethod1(symbolTable, bl, aSTList, declarator);
        }
        return this.parseField(symbolTable, aSTList, declarator);
    }

    private FieldDecl parseField(SymbolTable symbolTable, ASTList aSTList, Declarator declarator) throws CompileError {
        int n6;
        ASTree aSTree = null;
        if (this.lex.lookAhead() == 61) {
            this.lex.get();
            aSTree = this.parseExpression(symbolTable);
        }
        if ((n6 = this.lex.get()) == 59) {
            return new FieldDecl(aSTList, new ASTList(declarator, new ASTList(aSTree)));
        }
        if (n6 == 44) {
            throw new CompileError("only one field can be declared in one declaration", this.lex);
        }
        throw new SyntaxError(this.lex);
    }

    private MethodDecl parseMethod1(SymbolTable symbolTable, boolean bl, ASTList aSTList, Declarator declarator) throws CompileError {
        if (this.lex.get() != 40) {
            throw new SyntaxError(this.lex);
        }
        ASTList aSTList2 = null;
        if (this.lex.lookAhead() != 41) {
            while (true) {
                aSTList2 = ASTList.append(aSTList2, this.parseFormalParam(symbolTable));
                int n6 = this.lex.lookAhead();
                if (n6 == 44) {
                    this.lex.get();
                    continue;
                }
                if (n6 == 41) break;
            }
        }
        this.lex.get();
        declarator.addArrayDim(this.parseArrayDimension());
        if (bl && declarator.getArrayDim() > 0) {
            throw new SyntaxError(this.lex);
        }
        ASTList aSTList3 = null;
        if (this.lex.lookAhead() == 341) {
            this.lex.get();
            while (true) {
                aSTList3 = ASTList.append(aSTList3, this.parseClassType(symbolTable));
                if (this.lex.lookAhead() != 44) break;
                this.lex.get();
            }
        }
        return new MethodDecl(aSTList, new ASTList(declarator, ASTList.make(aSTList2, aSTList3, null)));
    }

    public MethodDecl parseMethod2(SymbolTable symbolTable, MethodDecl methodDecl) throws CompileError {
        Stmnt stmnt = null;
        if (this.lex.lookAhead() == 59) {
            this.lex.get();
        } else {
            stmnt = this.parseBlock(symbolTable);
            if (stmnt == null) {
                stmnt = new Stmnt(66);
            }
        }
        methodDecl.sublist(4).setHead(stmnt);
        return methodDecl;
    }

    private ASTList parseMemberMods() {
        int n6;
        ASTList aSTList = null;
        while ((n6 = this.lex.lookAhead()) == 300 || n6 == 315 || n6 == 332 || n6 == 331 || n6 == 330 || n6 == 338 || n6 == 335 || n6 == 345 || n6 == 342 || n6 == 347) {
            aSTList = new ASTList(new Keyword(this.lex.get()), aSTList);
        }
        return aSTList;
    }

    private Declarator parseFormalType(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.lookAhead();
        if (Parser.isBuiltinType(n6) || n6 == 344) {
            this.lex.get();
            int n10 = this.parseArrayDimension();
            return new Declarator(n6, n10);
        }
        ASTList aSTList = this.parseClassType(symbolTable);
        int n11 = this.parseArrayDimension();
        return new Declarator(aSTList, n11);
    }

    private static boolean isBuiltinType(int n6) {
        return n6 == 301 || n6 == 303 || n6 == 306 || n6 == 334 || n6 == 324 || n6 == 326 || n6 == 317 || n6 == 312;
    }

    private Declarator parseFormalParam(SymbolTable symbolTable) throws CompileError {
        Declarator declarator = this.parseFormalType(symbolTable);
        if (this.lex.get() != 400) {
            throw new SyntaxError(this.lex);
        }
        String string = this.lex.getString();
        declarator.setVariable(new Symbol(string));
        declarator.addArrayDim(this.parseArrayDimension());
        symbolTable.append(string, declarator);
        return declarator;
    }

    public Stmnt parseStatement(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.lookAhead();
        if (n6 == 123) {
            return this.parseBlock(symbolTable);
        }
        if (n6 == 59) {
            this.lex.get();
            return new Stmnt(66);
        }
        if (n6 == 400 && this.lex.lookAhead(1) == 58) {
            this.lex.get();
            String string = this.lex.getString();
            this.lex.get();
            return Stmnt.make(76, (ASTree)new Symbol(string), (ASTree)this.parseStatement(symbolTable));
        }
        if (n6 == 320) {
            return this.parseIf(symbolTable);
        }
        if (n6 == 346) {
            return this.parseWhile(symbolTable);
        }
        if (n6 == 311) {
            return this.parseDo(symbolTable);
        }
        if (n6 == 318) {
            return this.parseFor(symbolTable);
        }
        if (n6 == 343) {
            return this.parseTry(symbolTable);
        }
        if (n6 == 337) {
            return this.parseSwitch(symbolTable);
        }
        if (n6 == 338) {
            return this.parseSynchronized(symbolTable);
        }
        if (n6 == 333) {
            return this.parseReturn(symbolTable);
        }
        if (n6 == 340) {
            return this.parseThrow(symbolTable);
        }
        if (n6 == 302) {
            return this.parseBreak(symbolTable);
        }
        if (n6 == 309) {
            return this.parseContinue(symbolTable);
        }
        return this.parseDeclarationOrExpression(symbolTable, false);
    }

    private Stmnt parseBlock(SymbolTable symbolTable) throws CompileError {
        if (this.lex.get() != 123) {
            throw new SyntaxError(this.lex);
        }
        Stmnt stmnt = null;
        SymbolTable symbolTable2 = new SymbolTable(symbolTable);
        while (this.lex.lookAhead() != 125) {
            Stmnt stmnt2 = this.parseStatement(symbolTable2);
            if (stmnt2 == null) continue;
            stmnt = (Stmnt)ASTList.concat(stmnt, new Stmnt(66, (ASTree)stmnt2));
        }
        this.lex.get();
        if (stmnt == null) {
            return new Stmnt(66);
        }
        return stmnt;
    }

    private Stmnt parseIf(SymbolTable symbolTable) throws CompileError {
        Stmnt stmnt;
        int n6 = this.lex.get();
        ASTree aSTree = this.parseParExpression(symbolTable);
        Stmnt stmnt2 = this.parseStatement(symbolTable);
        if (this.lex.lookAhead() == 313) {
            this.lex.get();
            stmnt = this.parseStatement(symbolTable);
        } else {
            stmnt = null;
        }
        return new Stmnt(n6, aSTree, new ASTList(stmnt2, new ASTList(stmnt)));
    }

    private Stmnt parseWhile(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.get();
        ASTree aSTree = this.parseParExpression(symbolTable);
        Stmnt stmnt = this.parseStatement(symbolTable);
        return new Stmnt(n6, aSTree, stmnt);
    }

    private Stmnt parseDo(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.get();
        Stmnt stmnt = this.parseStatement(symbolTable);
        if (this.lex.get() != 346 || this.lex.get() != 40) {
            throw new SyntaxError(this.lex);
        }
        ASTree aSTree = this.parseExpression(symbolTable);
        if (this.lex.get() != 41 || this.lex.get() != 59) {
            throw new SyntaxError(this.lex);
        }
        return new Stmnt(n6, aSTree, stmnt);
    }

    private Stmnt parseFor(SymbolTable symbolTable) throws CompileError {
        Stmnt stmnt;
        int n6 = this.lex.get();
        SymbolTable symbolTable2 = new SymbolTable(symbolTable);
        if (this.lex.get() != 40) {
            throw new SyntaxError(this.lex);
        }
        if (this.lex.lookAhead() == 59) {
            this.lex.get();
            stmnt = null;
        } else {
            stmnt = this.parseDeclarationOrExpression(symbolTable2, true);
        }
        ASTree aSTree = this.lex.lookAhead() == 59 ? null : this.parseExpression(symbolTable2);
        if (this.lex.get() != 59) {
            throw new CompileError("; is missing", this.lex);
        }
        Stmnt stmnt2 = this.lex.lookAhead() == 41 ? null : this.parseExprList(symbolTable2);
        if (this.lex.get() != 41) {
            throw new CompileError(") is missing", this.lex);
        }
        Stmnt stmnt3 = this.parseStatement(symbolTable2);
        return new Stmnt(n6, stmnt, new ASTList(aSTree, new ASTList(stmnt2, stmnt3)));
    }

    private Stmnt parseSwitch(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.get();
        ASTree aSTree = this.parseParExpression(symbolTable);
        Stmnt stmnt = this.parseSwitchBlock(symbolTable);
        return new Stmnt(n6, aSTree, stmnt);
    }

    private Stmnt parseSwitchBlock(SymbolTable symbolTable) throws CompileError {
        if (this.lex.get() != 123) {
            throw new SyntaxError(this.lex);
        }
        SymbolTable symbolTable2 = new SymbolTable(symbolTable);
        Stmnt stmnt = this.parseStmntOrCase(symbolTable2);
        if (stmnt == null) {
            throw new CompileError("empty switch block", this.lex);
        }
        int n6 = stmnt.getOperator();
        if (n6 != 304 && n6 != 310) {
            throw new CompileError("no case or default in a switch block", this.lex);
        }
        Stmnt stmnt2 = new Stmnt(66, (ASTree)stmnt);
        while (this.lex.lookAhead() != 125) {
            Stmnt stmnt3 = this.parseStmntOrCase(symbolTable2);
            if (stmnt3 == null) continue;
            int n10 = stmnt3.getOperator();
            if (n10 == 304 || n10 == 310) {
                stmnt2 = (Stmnt)ASTList.concat(stmnt2, new Stmnt(66, (ASTree)stmnt3));
                stmnt = stmnt3;
                continue;
            }
            stmnt = (Stmnt)ASTList.concat(stmnt, new Stmnt(66, (ASTree)stmnt3));
        }
        this.lex.get();
        return stmnt2;
    }

    private Stmnt parseStmntOrCase(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.lookAhead();
        if (n6 != 304 && n6 != 310) {
            return this.parseStatement(symbolTable);
        }
        this.lex.get();
        Stmnt stmnt = n6 == 304 ? new Stmnt(n6, this.parseExpression(symbolTable)) : new Stmnt(310);
        if (this.lex.get() != 58) {
            throw new CompileError(": is missing", this.lex);
        }
        return stmnt;
    }

    private Stmnt parseSynchronized(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.get();
        if (this.lex.get() != 40) {
            throw new SyntaxError(this.lex);
        }
        ASTree aSTree = this.parseExpression(symbolTable);
        if (this.lex.get() != 41) {
            throw new SyntaxError(this.lex);
        }
        Stmnt stmnt = this.parseBlock(symbolTable);
        return new Stmnt(n6, aSTree, stmnt);
    }

    private Stmnt parseTry(SymbolTable symbolTable) throws CompileError {
        Serializable serializable;
        this.lex.get();
        Stmnt stmnt = this.parseBlock(symbolTable);
        ASTList aSTList = null;
        while (this.lex.lookAhead() == 305) {
            this.lex.get();
            if (this.lex.get() != 40) {
                throw new SyntaxError(this.lex);
            }
            serializable = new SymbolTable(symbolTable);
            Declarator declarator = this.parseFormalParam((SymbolTable)serializable);
            if (declarator.getArrayDim() > 0 || declarator.getType() != 307) {
                throw new SyntaxError(this.lex);
            }
            if (this.lex.get() != 41) {
                throw new SyntaxError(this.lex);
            }
            Stmnt stmnt2 = this.parseBlock((SymbolTable)serializable);
            aSTList = ASTList.append(aSTList, new Pair(declarator, stmnt2));
        }
        serializable = null;
        if (this.lex.lookAhead() == 316) {
            this.lex.get();
            serializable = this.parseBlock(symbolTable);
        }
        return Stmnt.make(343, stmnt, aSTList, serializable);
    }

    private Stmnt parseReturn(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.get();
        Stmnt stmnt = new Stmnt(n6);
        if (this.lex.lookAhead() != 59) {
            stmnt.setLeft(this.parseExpression(symbolTable));
        }
        if (this.lex.get() != 59) {
            throw new CompileError("; is missing", this.lex);
        }
        return stmnt;
    }

    private Stmnt parseThrow(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.get();
        ASTree aSTree = this.parseExpression(symbolTable);
        if (this.lex.get() != 59) {
            throw new CompileError("; is missing", this.lex);
        }
        return new Stmnt(n6, aSTree);
    }

    private Stmnt parseBreak(SymbolTable symbolTable) throws CompileError {
        return this.parseContinue(symbolTable);
    }

    private Stmnt parseContinue(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.get();
        Stmnt stmnt = new Stmnt(n6);
        int n10 = this.lex.get();
        if (n10 == 400) {
            stmnt.setLeft(new Symbol(this.lex.getString()));
            n10 = this.lex.get();
        }
        if (n10 != 59) {
            throw new CompileError("; is missing", this.lex);
        }
        return stmnt;
    }

    private Stmnt parseDeclarationOrExpression(SymbolTable symbolTable, boolean bl) throws CompileError {
        int n6;
        int n10 = this.lex.lookAhead();
        while (n10 == 315) {
            this.lex.get();
            n10 = this.lex.lookAhead();
        }
        if (Parser.isBuiltinType(n10)) {
            n10 = this.lex.get();
            int n11 = this.parseArrayDimension();
            return this.parseDeclarators(symbolTable, new Declarator(n10, n11));
        }
        if (n10 == 400 && (n6 = this.nextIsClassType(0)) >= 0 && this.lex.lookAhead(n6) == 400) {
            ASTList aSTList = this.parseClassType(symbolTable);
            int n12 = this.parseArrayDimension();
            return this.parseDeclarators(symbolTable, new Declarator(aSTList, n12));
        }
        Stmnt stmnt = bl ? this.parseExprList(symbolTable) : new Stmnt(69, this.parseExpression(symbolTable));
        if (this.lex.get() != 59) {
            throw new CompileError("; is missing", this.lex);
        }
        return stmnt;
    }

    private Stmnt parseExprList(SymbolTable symbolTable) throws CompileError {
        Stmnt stmnt = null;
        while (true) {
            Stmnt stmnt2 = new Stmnt(69, this.parseExpression(symbolTable));
            stmnt = (Stmnt)ASTList.concat(stmnt, new Stmnt(66, (ASTree)stmnt2));
            if (this.lex.lookAhead() != 44) break;
            this.lex.get();
        }
        return stmnt;
    }

    private Stmnt parseDeclarators(SymbolTable symbolTable, Declarator declarator) throws CompileError {
        int n6;
        Stmnt stmnt = null;
        do {
            stmnt = (Stmnt)ASTList.concat(stmnt, new Stmnt(68, (ASTree)this.parseDeclarator(symbolTable, declarator)));
            n6 = this.lex.get();
            if (n6 != 59) continue;
            return stmnt;
        } while (n6 == 44);
        throw new CompileError("; is missing", this.lex);
    }

    private Declarator parseDeclarator(SymbolTable symbolTable, Declarator declarator) throws CompileError {
        if (this.lex.get() != 400 || declarator.getType() == 344) {
            throw new SyntaxError(this.lex);
        }
        String string = this.lex.getString();
        Symbol symbol = new Symbol(string);
        int n6 = this.parseArrayDimension();
        ASTree aSTree = null;
        if (this.lex.lookAhead() == 61) {
            this.lex.get();
            aSTree = this.parseInitializer(symbolTable);
        }
        Declarator declarator2 = declarator.make(symbol, n6, aSTree);
        symbolTable.append(string, declarator2);
        return declarator2;
    }

    private ASTree parseInitializer(SymbolTable symbolTable) throws CompileError {
        if (this.lex.lookAhead() == 123) {
            return this.parseArrayInitializer(symbolTable);
        }
        return this.parseExpression(symbolTable);
    }

    private ArrayInit parseArrayInitializer(SymbolTable symbolTable) throws CompileError {
        this.lex.get();
        if (this.lex.lookAhead() == 125) {
            this.lex.get();
            return new ArrayInit(null);
        }
        ASTree aSTree = this.parseExpression(symbolTable);
        ArrayInit arrayInit = new ArrayInit(aSTree);
        while (this.lex.lookAhead() == 44) {
            this.lex.get();
            aSTree = this.parseExpression(symbolTable);
            ASTList.append(arrayInit, aSTree);
        }
        if (this.lex.get() != 125) {
            throw new SyntaxError(this.lex);
        }
        return arrayInit;
    }

    private ASTree parseParExpression(SymbolTable symbolTable) throws CompileError {
        if (this.lex.get() != 40) {
            throw new SyntaxError(this.lex);
        }
        ASTree aSTree = this.parseExpression(symbolTable);
        if (this.lex.get() != 41) {
            throw new SyntaxError(this.lex);
        }
        return aSTree;
    }

    public ASTree parseExpression(SymbolTable symbolTable) throws CompileError {
        ASTree aSTree = this.parseConditionalExpr(symbolTable);
        if (!Parser.isAssignOp(this.lex.lookAhead())) {
            return aSTree;
        }
        int n6 = this.lex.get();
        ASTree aSTree2 = this.parseExpression(symbolTable);
        return AssignExpr.makeAssign(n6, aSTree, aSTree2);
    }

    private static boolean isAssignOp(int n6) {
        return n6 == 61 || n6 == 351 || n6 == 352 || n6 == 353 || n6 == 354 || n6 == 355 || n6 == 356 || n6 == 360 || n6 == 361 || n6 == 365 || n6 == 367 || n6 == 371;
    }

    private ASTree parseConditionalExpr(SymbolTable symbolTable) throws CompileError {
        ASTree aSTree = this.parseBinaryExpr(symbolTable);
        if (this.lex.lookAhead() == 63) {
            this.lex.get();
            ASTree aSTree2 = this.parseExpression(symbolTable);
            if (this.lex.get() != 58) {
                throw new CompileError(": is missing", this.lex);
            }
            ASTree aSTree3 = this.parseExpression(symbolTable);
            return new CondExpr(aSTree, aSTree2, aSTree3);
        }
        return aSTree;
    }

    private ASTree parseBinaryExpr(SymbolTable symbolTable) throws CompileError {
        ASTree aSTree = this.parseUnaryExpr(symbolTable);
        int n6;
        int n10;
        while ((n10 = this.getOpPrecedence(n6 = this.lex.lookAhead())) != 0) {
            aSTree = this.binaryExpr2(symbolTable, aSTree, n10);
        }
        return aSTree;
    }

    private ASTree parseInstanceOf(SymbolTable symbolTable, ASTree aSTree) throws CompileError {
        int n6 = this.lex.lookAhead();
        if (Parser.isBuiltinType(n6)) {
            this.lex.get();
            int n10 = this.parseArrayDimension();
            return new InstanceOfExpr(n6, n10, aSTree);
        }
        ASTList aSTList = this.parseClassType(symbolTable);
        int n11 = this.parseArrayDimension();
        return new InstanceOfExpr(aSTList, n11, aSTree);
    }

    private ASTree binaryExpr2(SymbolTable symbolTable, ASTree aSTree, int n6) throws CompileError {
        int n10;
        int n11;
        int n12 = this.lex.get();
        if (n12 == 323) {
            return this.parseInstanceOf(symbolTable, aSTree);
        }
        ASTree aSTree2 = this.parseUnaryExpr(symbolTable);
        while ((n11 = this.getOpPrecedence(n10 = this.lex.lookAhead())) != 0 && n6 > n11) {
            aSTree2 = this.binaryExpr2(symbolTable, aSTree2, n11);
        }
        return BinExpr.makeBin(n12, aSTree, aSTree2);
    }

    private int getOpPrecedence(int n6) {
        if (33 <= n6 && n6 <= 63) {
            return binaryOpPrecedence[n6 - 33];
        }
        if (n6 == 94) {
            return 7;
        }
        if (n6 == 124) {
            return 8;
        }
        if (n6 == 369) {
            return 9;
        }
        if (n6 == 368) {
            return 10;
        }
        if (n6 == 358 || n6 == 350) {
            return 5;
        }
        if (n6 == 357 || n6 == 359 || n6 == 323) {
            return 4;
        }
        if (n6 == 364 || n6 == 366 || n6 == 370) {
            return 3;
        }
        return 0;
    }

    private ASTree parseUnaryExpr(SymbolTable symbolTable) throws CompileError {
        switch (this.lex.lookAhead()) {
            case 33: 
            case 43: 
            case 45: 
            case 126: 
            case 362: 
            case 363: {
                int n6 = this.lex.get();
                if (n6 == 45) {
                    int n10 = this.lex.lookAhead();
                    switch (n10) {
                        case 401: 
                        case 402: 
                        case 403: {
                            this.lex.get();
                            return new IntConst(-this.lex.getLong(), n10);
                        }
                        case 404: 
                        case 405: {
                            this.lex.get();
                            return new DoubleConst(-this.lex.getDouble(), n10);
                        }
                    }
                }
                return Expr.make(n6, this.parseUnaryExpr(symbolTable));
            }
            case 40: {
                return this.parseCast(symbolTable);
            }
        }
        return this.parsePostfix(symbolTable);
    }

    private ASTree parseCast(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.lookAhead(1);
        if (Parser.isBuiltinType(n6) && this.nextIsBuiltinCast()) {
            this.lex.get();
            this.lex.get();
            int n10 = this.parseArrayDimension();
            if (this.lex.get() != 41) {
                throw new CompileError(") is missing", this.lex);
            }
            return new CastExpr(n6, n10, this.parseUnaryExpr(symbolTable));
        }
        if (n6 == 400 && this.nextIsClassCast()) {
            this.lex.get();
            ASTList aSTList = this.parseClassType(symbolTable);
            int n11 = this.parseArrayDimension();
            if (this.lex.get() != 41) {
                throw new CompileError(") is missing", this.lex);
            }
            return new CastExpr(aSTList, n11, this.parseUnaryExpr(symbolTable));
        }
        return this.parsePostfix(symbolTable);
    }

    private boolean nextIsBuiltinCast() {
        int n6;
        int n10 = 2;
        while ((n6 = this.lex.lookAhead(n10++)) == 91) {
            if (this.lex.lookAhead(n10++) == 93) continue;
            return false;
        }
        return this.lex.lookAhead(n10 - 1) == 41;
    }

    private boolean nextIsClassCast() {
        int n6 = this.nextIsClassType(1);
        if (n6 < 0) {
            return false;
        }
        int n10 = this.lex.lookAhead(n6);
        if (n10 != 41) {
            return false;
        }
        n10 = this.lex.lookAhead(n6 + 1);
        return n10 == 40 || n10 == 412 || n10 == 406 || n10 == 400 || n10 == 339 || n10 == 336 || n10 == 328 || n10 == 410 || n10 == 411 || n10 == 403 || n10 == 402 || n10 == 401 || n10 == 405 || n10 == 404;
    }

    private int nextIsClassType(int n6) {
        int n10;
        while (this.lex.lookAhead(++n6) == 46) {
            if (this.lex.lookAhead(++n6) == 400) continue;
            return -1;
        }
        while ((n10 = this.lex.lookAhead(n6++)) == 91) {
            if (this.lex.lookAhead(n6++) == 93) continue;
            return -1;
        }
        return n6 - 1;
    }

    private int parseArrayDimension() throws CompileError {
        int n6 = 0;
        while (this.lex.lookAhead() == 91) {
            ++n6;
            this.lex.get();
            if (this.lex.get() == 93) continue;
            throw new CompileError("] is missing", this.lex);
        }
        return n6;
    }

    private ASTList parseClassType(SymbolTable symbolTable) throws CompileError {
        ASTList aSTList = null;
        while (true) {
            if (this.lex.get() != 400) {
                throw new SyntaxError(this.lex);
            }
            aSTList = ASTList.append(aSTList, new Symbol(this.lex.getString()));
            if (this.lex.lookAhead() != 46) break;
            this.lex.get();
        }
        return aSTList;
    }

    private ASTree parsePostfix(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.lookAhead();
        switch (n6) {
            case 401: 
            case 402: 
            case 403: {
                this.lex.get();
                return new IntConst(this.lex.getLong(), n6);
            }
            case 404: 
            case 405: {
                this.lex.get();
                return new DoubleConst(this.lex.getDouble(), n6);
            }
        }
        ASTree aSTree = this.parsePrimaryExpr(symbolTable);
        block11: while (true) {
            switch (this.lex.lookAhead()) {
                case 40: {
                    aSTree = this.parseMethodCall(symbolTable, aSTree);
                    continue block11;
                }
                case 91: {
                    if (this.lex.lookAhead(1) == 93) {
                        int n10 = this.parseArrayDimension();
                        if (this.lex.get() != 46 || this.lex.get() != 307) {
                            throw new SyntaxError(this.lex);
                        }
                        aSTree = this.parseDotClass(aSTree, n10);
                        continue block11;
                    }
                    ASTree aSTree2 = this.parseArrayIndex(symbolTable);
                    if (aSTree2 == null) {
                        throw new SyntaxError(this.lex);
                    }
                    aSTree = Expr.make(65, aSTree, aSTree2);
                    continue block11;
                }
                case 362: 
                case 363: {
                    int n11 = this.lex.get();
                    aSTree = Expr.make(n11, null, aSTree);
                    continue block11;
                }
                case 46: {
                    String string;
                    this.lex.get();
                    int n11 = this.lex.get();
                    if (n11 == 307) {
                        aSTree = this.parseDotClass(aSTree, 0);
                        continue block11;
                    }
                    if (n11 == 336) {
                        aSTree = Expr.make(46, (ASTree)new Symbol(this.toClassName(aSTree)), (ASTree)new Keyword(n11));
                        continue block11;
                    }
                    if (n11 == 400) {
                        string = this.lex.getString();
                        aSTree = Expr.make(46, aSTree, (ASTree)new Member(string));
                        continue block11;
                    }
                    throw new CompileError("missing member name", this.lex);
                }
                case 35: {
                    this.lex.get();
                    int n11 = this.lex.get();
                    if (n11 != 400) {
                        throw new CompileError("missing static member name", this.lex);
                    }
                    String string = this.lex.getString();
                    aSTree = Expr.make(35, (ASTree)new Symbol(this.toClassName(aSTree)), (ASTree)new Member(string));
                    continue block11;
                }
            }
            break;
        }
        return aSTree;
    }

    private ASTree parseDotClass(ASTree aSTree, int n6) throws CompileError {
        String string = this.toClassName(aSTree);
        if (n6 > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            while (n6-- > 0) {
                stringBuffer.append('[');
            }
            stringBuffer.append('L').append(string.replace('.', '/')).append(';');
            string = stringBuffer.toString();
        }
        return Expr.make(46, (ASTree)new Symbol(string), (ASTree)new Member("class"));
    }

    private ASTree parseDotClass(int n6, int n10) throws CompileError {
        String string;
        if (n10 > 0) {
            String string2 = CodeGen.toJvmTypeName(n6, n10);
            return Expr.make(46, (ASTree)new Symbol(string2), (ASTree)new Member("class"));
        }
        switch (n6) {
            case 301: {
                string = "java.lang.Boolean";
                break;
            }
            case 303: {
                string = "java.lang.Byte";
                break;
            }
            case 306: {
                string = "java.lang.Character";
                break;
            }
            case 334: {
                string = "java.lang.Short";
                break;
            }
            case 324: {
                string = "java.lang.Integer";
                break;
            }
            case 326: {
                string = "java.lang.Long";
                break;
            }
            case 317: {
                string = "java.lang.Float";
                break;
            }
            case 312: {
                string = "java.lang.Double";
                break;
            }
            case 344: {
                string = "java.lang.Void";
                break;
            }
            default: {
                throw new CompileError("invalid builtin type: " + n6);
            }
        }
        return Expr.make(35, (ASTree)new Symbol(string), (ASTree)new Member("TYPE"));
    }

    private ASTree parseMethodCall(SymbolTable symbolTable, ASTree aSTree) throws CompileError {
        int n6;
        int n10;
        if (aSTree instanceof Keyword ? (n10 = ((Keyword)aSTree).get()) != 339 && n10 != 336 : !(aSTree instanceof Symbol) && aSTree instanceof Expr && (n6 = ((Expr)aSTree).getOperator()) != 46 && n6 != 35) {
            throw new SyntaxError(this.lex);
        }
        return CallExpr.makeCall(aSTree, this.parseArgumentList(symbolTable));
    }

    private String toClassName(ASTree aSTree) throws CompileError {
        StringBuffer stringBuffer = new StringBuffer();
        this.toClassName(aSTree, stringBuffer);
        return stringBuffer.toString();
    }

    private void toClassName(ASTree aSTree, StringBuffer stringBuffer) throws CompileError {
        Expr expr;
        if (aSTree instanceof Symbol) {
            stringBuffer.append(((Symbol)aSTree).get());
            return;
        }
        if (aSTree instanceof Expr && (expr = (Expr)aSTree).getOperator() == 46) {
            this.toClassName(expr.oprand1(), stringBuffer);
            stringBuffer.append('.');
            this.toClassName(expr.oprand2(), stringBuffer);
            return;
        }
        throw new CompileError("bad static member access", this.lex);
    }

    private ASTree parsePrimaryExpr(SymbolTable symbolTable) throws CompileError {
        int n6 = this.lex.get();
        switch (n6) {
            case 336: 
            case 339: 
            case 410: 
            case 411: 
            case 412: {
                return new Keyword(n6);
            }
            case 400: {
                String string = this.lex.getString();
                Declarator declarator = symbolTable.lookup(string);
                if (declarator == null) {
                    return new Member(string);
                }
                return new Variable(string, declarator);
            }
            case 406: {
                return new StringL(this.lex.getString());
            }
            case 328: {
                return this.parseNew(symbolTable);
            }
            case 40: {
                ASTree aSTree = this.parseExpression(symbolTable);
                if (this.lex.get() == 41) {
                    return aSTree;
                }
                throw new CompileError(") is missing", this.lex);
            }
        }
        if (Parser.isBuiltinType(n6) || n6 == 344) {
            int n10 = this.parseArrayDimension();
            if (this.lex.get() == 46 && this.lex.get() == 307) {
                return this.parseDotClass(n6, n10);
            }
        }
        throw new SyntaxError(this.lex);
    }

    private NewExpr parseNew(SymbolTable symbolTable) throws CompileError {
        ArrayInit arrayInit = null;
        int n6 = this.lex.lookAhead();
        if (Parser.isBuiltinType(n6)) {
            this.lex.get();
            ASTList aSTList = this.parseArraySize(symbolTable);
            if (this.lex.lookAhead() == 123) {
                arrayInit = this.parseArrayInitializer(symbolTable);
            }
            return new NewExpr(n6, aSTList, arrayInit);
        }
        if (n6 == 400) {
            ASTList aSTList = this.parseClassType(symbolTable);
            n6 = this.lex.lookAhead();
            if (n6 == 40) {
                ASTList aSTList2 = this.parseArgumentList(symbolTable);
                return new NewExpr(aSTList, aSTList2);
            }
            if (n6 == 91) {
                ASTList aSTList3 = this.parseArraySize(symbolTable);
                if (this.lex.lookAhead() == 123) {
                    arrayInit = this.parseArrayInitializer(symbolTable);
                }
                return NewExpr.makeObjectArray(aSTList, aSTList3, arrayInit);
            }
        }
        throw new SyntaxError(this.lex);
    }

    private ASTList parseArraySize(SymbolTable symbolTable) throws CompileError {
        ASTList aSTList = null;
        while (this.lex.lookAhead() == 91) {
            aSTList = ASTList.append(aSTList, this.parseArrayIndex(symbolTable));
        }
        return aSTList;
    }

    private ASTree parseArrayIndex(SymbolTable symbolTable) throws CompileError {
        this.lex.get();
        if (this.lex.lookAhead() == 93) {
            this.lex.get();
            return null;
        }
        ASTree aSTree = this.parseExpression(symbolTable);
        if (this.lex.get() != 93) {
            throw new CompileError("] is missing", this.lex);
        }
        return aSTree;
    }

    private ASTList parseArgumentList(SymbolTable symbolTable) throws CompileError {
        if (this.lex.get() != 40) {
            throw new CompileError("( is missing", this.lex);
        }
        ASTList aSTList = null;
        if (this.lex.lookAhead() != 41) {
            while (true) {
                aSTList = ASTList.append(aSTList, this.parseExpression(symbolTable));
                if (this.lex.lookAhead() != 44) break;
                this.lex.get();
            }
        }
        if (this.lex.get() != 41) {
            throw new CompileError(") is missing", this.lex);
        }
        return aSTList;
    }
}

