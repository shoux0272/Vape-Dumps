/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.MethodInfo;
import javassist.expr.Cast;
import javassist.expr.ConstructorCall;
import javassist.expr.Expr;
import javassist.expr.ExprEditor$LoopContext;
import javassist.expr.ExprEditor$NewOp;
import javassist.expr.FieldAccess;
import javassist.expr.Handler;
import javassist.expr.Instanceof;
import javassist.expr.MethodCall;
import javassist.expr.NewArray;
import javassist.expr.NewExpr;

public class ExprEditor {
    public boolean doit(CtClass ctClass, MethodInfo methodInfo) throws CannotCompileException {
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            return false;
        }
        CodeIterator codeIterator = codeAttribute.iterator();
        boolean bl = false;
        ExprEditor$LoopContext exprEditor$LoopContext = new ExprEditor$LoopContext(codeAttribute.getMaxLocals());
        while (codeIterator.hasNext()) {
            if (!this.loopBody(codeIterator, ctClass, methodInfo, exprEditor$LoopContext)) continue;
            bl = true;
        }
        ExceptionTable exceptionTable = codeAttribute.getExceptionTable();
        int n6 = exceptionTable.size();
        for (int k = 0; k < n6; ++k) {
            Handler handler = new Handler(exceptionTable, k, codeIterator, ctClass, methodInfo);
            this.edit(handler);
            if (!handler.edited()) continue;
            bl = true;
            exprEditor$LoopContext.updateMax(handler.locals(), handler.stack());
        }
        if (codeAttribute.getMaxLocals() < exprEditor$LoopContext.maxLocals) {
            codeAttribute.setMaxLocals(exprEditor$LoopContext.maxLocals);
        }
        codeAttribute.setMaxStack(codeAttribute.getMaxStack() + exprEditor$LoopContext.maxStack);
        try {
            if (bl) {
                methodInfo.rebuildStackMapIf6(ctClass.getClassPool(), ctClass.getClassFile2());
            }
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode.getMessage(), badBytecode);
        }
        return bl;
    }

    boolean doit(CtClass ctClass, MethodInfo methodInfo, ExprEditor$LoopContext exprEditor$LoopContext, CodeIterator codeIterator, int n6) throws CannotCompileException {
        boolean bl = false;
        while (codeIterator.hasNext() && codeIterator.lookAhead() < n6) {
            int n10 = codeIterator.getCodeLength();
            if (!this.loopBody(codeIterator, ctClass, methodInfo, exprEditor$LoopContext)) continue;
            bl = true;
            int n11 = codeIterator.getCodeLength();
            if (n10 == n11) continue;
            n6 += n11 - n10;
        }
        return bl;
    }

    final boolean loopBody(CodeIterator codeIterator, CtClass ctClass, MethodInfo methodInfo, ExprEditor$LoopContext exprEditor$LoopContext) throws CannotCompileException {
        try {
            Expr expr = null;
            int n6 = codeIterator.next();
            int n10 = codeIterator.byteAt(n6);
            if (n10 >= 178) {
                if (n10 < 188) {
                    if (n10 == 184 || n10 == 185 || n10 == 182) {
                        expr = new MethodCall(n6, codeIterator, ctClass, methodInfo);
                        this.edit((MethodCall)expr);
                    } else if (n10 == 180 || n10 == 178 || n10 == 181 || n10 == 179) {
                        expr = new FieldAccess(n6, codeIterator, ctClass, methodInfo, n10);
                        this.edit((FieldAccess)expr);
                    } else if (n10 == 187) {
                        int n11 = codeIterator.u16bitAt(n6 + 1);
                        exprEditor$LoopContext.newList = new ExprEditor$NewOp(exprEditor$LoopContext.newList, n6, methodInfo.getConstPool().getClassInfo(n11));
                    } else if (n10 == 183) {
                        ExprEditor$NewOp exprEditor$NewOp = exprEditor$LoopContext.newList;
                        if (exprEditor$NewOp != null && methodInfo.getConstPool().isConstructor(exprEditor$NewOp.type, codeIterator.u16bitAt(n6 + 1)) > 0) {
                            expr = new NewExpr(n6, codeIterator, ctClass, methodInfo, exprEditor$NewOp.type, exprEditor$NewOp.pos);
                            this.edit((NewExpr)expr);
                            exprEditor$LoopContext.newList = exprEditor$NewOp.next;
                        } else {
                            MethodCall methodCall = new MethodCall(n6, codeIterator, ctClass, methodInfo);
                            if (methodCall.getMethodName().equals("<init>")) {
                                ConstructorCall constructorCall = new ConstructorCall(n6, codeIterator, ctClass, methodInfo);
                                expr = constructorCall;
                                this.edit(constructorCall);
                            } else {
                                expr = methodCall;
                                this.edit(methodCall);
                            }
                        }
                    }
                } else if (n10 == 188 || n10 == 189 || n10 == 197) {
                    expr = new NewArray(n6, codeIterator, ctClass, methodInfo, n10);
                    this.edit((NewArray)expr);
                } else if (n10 == 193) {
                    expr = new Instanceof(n6, codeIterator, ctClass, methodInfo);
                    this.edit((Instanceof)expr);
                } else if (n10 == 192) {
                    expr = new Cast(n6, codeIterator, ctClass, methodInfo);
                    this.edit((Cast)expr);
                }
            }
            if (expr != null && expr.edited()) {
                exprEditor$LoopContext.updateMax(expr.locals(), expr.stack());
                return true;
            }
            return false;
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
    }

    public void edit(NewExpr newExpr) throws CannotCompileException {
    }

    public void edit(NewArray newArray) throws CannotCompileException {
    }

    public void edit(MethodCall methodCall) throws CannotCompileException {
    }

    public void edit(ConstructorCall constructorCall) throws CannotCompileException {
    }

    public void edit(FieldAccess fieldAccess) throws CannotCompileException {
    }

    public void edit(Instanceof instanceof_) throws CannotCompileException {
    }

    public void edit(Cast cast) throws CannotCompileException {
    }

    public void edit(Handler handler) throws CannotCompileException {
    }
}

