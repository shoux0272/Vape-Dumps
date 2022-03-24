/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.Opcode;
import javassist.bytecode.analysis.Analyzer$ExceptionInfo;
import javassist.bytecode.analysis.Executor;
import javassist.bytecode.analysis.Frame;
import javassist.bytecode.analysis.IntQueue;
import javassist.bytecode.analysis.Subroutine;
import javassist.bytecode.analysis.SubroutineScanner;
import javassist.bytecode.analysis.Type;
import javassist.bytecode.analysis.Util;

public class Analyzer
implements Opcode {
    private final SubroutineScanner scanner = new SubroutineScanner();
    private CtClass clazz;
    private Analyzer$ExceptionInfo[] exceptions;
    private Frame[] frames;
    private Subroutine[] subroutines;

    public Frame[] analyze(CtClass ctClass, MethodInfo methodInfo) throws BadBytecode {
        this.clazz = ctClass;
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            return null;
        }
        int n6 = codeAttribute.getMaxLocals();
        int n10 = codeAttribute.getMaxStack();
        int n11 = codeAttribute.getCodeLength();
        CodeIterator codeIterator = codeAttribute.iterator();
        IntQueue intQueue = new IntQueue();
        this.exceptions = this.buildExceptionInfo(methodInfo);
        this.subroutines = this.scanner.scan(methodInfo);
        Executor executor = new Executor(ctClass.getClassPool(), methodInfo.getConstPool());
        this.frames = new Frame[n11];
        this.frames[codeIterator.lookAhead()] = this.firstFrame(methodInfo, n6, n10);
        intQueue.add(codeIterator.next());
        while (!intQueue.isEmpty()) {
            this.analyzeNextEntry(methodInfo, codeIterator, intQueue, executor);
        }
        return this.frames;
    }

    public Frame[] analyze(CtMethod ctMethod) throws BadBytecode {
        return this.analyze(ctMethod.getDeclaringClass(), ctMethod.getMethodInfo2());
    }

    private void analyzeNextEntry(MethodInfo methodInfo, CodeIterator codeIterator, IntQueue intQueue, Executor executor) throws BadBytecode {
        int n6 = intQueue.take();
        codeIterator.move(n6);
        codeIterator.next();
        Frame frame = this.frames[n6].copy();
        Subroutine subroutine = this.subroutines[n6];
        try {
            executor.execute(methodInfo, n6, codeIterator, frame, subroutine);
        }
        catch (RuntimeException runtimeException) {
            throw new BadBytecode(runtimeException.getMessage() + "[pos = " + n6 + "]", (Throwable)runtimeException);
        }
        int n10 = codeIterator.byteAt(n6);
        if (n10 == 170) {
            this.mergeTableSwitch(intQueue, n6, codeIterator, frame);
        } else if (n10 == 171) {
            this.mergeLookupSwitch(intQueue, n6, codeIterator, frame);
        } else if (n10 == 169) {
            this.mergeRet(intQueue, codeIterator, n6, frame, subroutine);
        } else if (Util.isJumpInstruction(n10)) {
            int n11 = Util.getJumpTarget(n6, codeIterator);
            if (Util.isJsr(n10)) {
                this.mergeJsr(intQueue, this.frames[n6], this.subroutines[n11], n6, this.lookAhead(codeIterator, n6));
            } else if (!Util.isGoto(n10)) {
                this.merge(intQueue, frame, this.lookAhead(codeIterator, n6));
            }
            this.merge(intQueue, frame, n11);
        } else if (n10 != 191 && !Util.isReturn(n10)) {
            this.merge(intQueue, frame, this.lookAhead(codeIterator, n6));
        }
        this.mergeExceptionHandlers(intQueue, methodInfo, n6, frame);
    }

    private Analyzer$ExceptionInfo[] buildExceptionInfo(MethodInfo methodInfo) {
        ConstPool constPool = methodInfo.getConstPool();
        ClassPool classPool = this.clazz.getClassPool();
        ExceptionTable exceptionTable = methodInfo.getCodeAttribute().getExceptionTable();
        Analyzer$ExceptionInfo[] arranalyzer$ExceptionInfo = new Analyzer$ExceptionInfo[exceptionTable.size()];
        for (int k = 0; k < exceptionTable.size(); ++k) {
            Type type;
            int n6 = exceptionTable.catchType(k);
            try {
                type = n6 == 0 ? Type.THROWABLE : Type.get(classPool.get(constPool.getClassInfo(n6)));
            }
            catch (NotFoundException notFoundException) {
                throw new IllegalStateException(notFoundException.getMessage());
            }
            arranalyzer$ExceptionInfo[k] = new Analyzer$ExceptionInfo(exceptionTable.startPc(k), exceptionTable.endPc(k), exceptionTable.handlerPc(k), type, null);
        }
        return arranalyzer$ExceptionInfo;
    }

    private Frame firstFrame(MethodInfo methodInfo, int n6, int n10) {
        CtClass[] arrctClass;
        int n11 = 0;
        Frame frame = new Frame(n6, n10);
        if ((methodInfo.getAccessFlags() & 8) == 0) {
            frame.setLocal(n11++, Type.get(this.clazz));
        }
        try {
            arrctClass = Descriptor.getParameterTypes(methodInfo.getDescriptor(), this.clazz.getClassPool());
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException);
        }
        for (int k = 0; k < arrctClass.length; ++k) {
            Type type = this.zeroExtend(Type.get(arrctClass[k]));
            frame.setLocal(n11++, type);
            if (type.getSize() != 2) continue;
            frame.setLocal(n11++, Type.TOP);
        }
        return frame;
    }

    private int getNext(CodeIterator codeIterator, int n6, int n10) throws BadBytecode {
        codeIterator.move(n6);
        codeIterator.next();
        int n11 = codeIterator.lookAhead();
        codeIterator.move(n10);
        codeIterator.next();
        return n11;
    }

    private int lookAhead(CodeIterator codeIterator, int n6) throws BadBytecode {
        if (!codeIterator.hasNext()) {
            throw new BadBytecode("Execution falls off end! [pos = " + n6 + "]");
        }
        return codeIterator.lookAhead();
    }

    private void merge(IntQueue intQueue, Frame frame, int n6) {
        boolean bl;
        Frame frame2 = this.frames[n6];
        if (frame2 == null) {
            this.frames[n6] = frame.copy();
            bl = true;
        } else {
            bl = frame2.merge(frame);
        }
        if (bl) {
            intQueue.add(n6);
        }
    }

    private void mergeExceptionHandlers(IntQueue intQueue, MethodInfo methodInfo, int n6, Frame frame) {
        for (int k = 0; k < this.exceptions.length; ++k) {
            Analyzer$ExceptionInfo analyzer$ExceptionInfo = this.exceptions[k];
            if (n6 < Analyzer$ExceptionInfo.access$100(analyzer$ExceptionInfo) || n6 >= Analyzer$ExceptionInfo.access$200(analyzer$ExceptionInfo)) continue;
            Frame frame2 = frame.copy();
            frame2.clearStack();
            frame2.push(Analyzer$ExceptionInfo.access$300(analyzer$ExceptionInfo));
            this.merge(intQueue, frame2, Analyzer$ExceptionInfo.access$400(analyzer$ExceptionInfo));
        }
    }

    private void mergeJsr(IntQueue intQueue, Frame frame, Subroutine subroutine, int n6, int n10) throws BadBytecode {
        if (subroutine == null) {
            throw new BadBytecode("No subroutine at jsr target! [pos = " + n6 + "]");
        }
        Frame frame2 = this.frames[n10];
        boolean bl = false;
        if (frame2 == null) {
            frame2 = this.frames[n10] = frame.copy();
            bl = true;
        } else {
            for (int k = 0; k < frame.localsLength(); ++k) {
                if (subroutine.isAccessed(k)) continue;
                Type type = frame2.getLocal(k);
                Type type2 = frame.getLocal(k);
                if (type == null) {
                    frame2.setLocal(k, type2);
                    bl = true;
                    continue;
                }
                type2 = type.merge(type2);
                frame2.setLocal(k, type2);
                if (type2.equals(type) && !type2.popChanged()) continue;
                bl = true;
            }
        }
        if (!frame2.isJsrMerged()) {
            frame2.setJsrMerged(true);
            bl = true;
        }
        if (bl && frame2.isRetMerged()) {
            intQueue.add(n10);
        }
    }

    private void mergeLookupSwitch(IntQueue intQueue, int n6, CodeIterator codeIterator, Frame frame) throws BadBytecode {
        int n10 = (n6 & 0xFFFFFFFC) + 4;
        this.merge(intQueue, frame, n6 + codeIterator.s32bitAt(n10));
        int n11 = codeIterator.s32bitAt(n10 += 4);
        int n12 = n11 * 8 + (n10 += 4);
        n10 += 4;
        while (n10 < n12) {
            int n13 = codeIterator.s32bitAt(n10) + n6;
            this.merge(intQueue, frame, n13);
            n10 += 8;
        }
    }

    private void mergeRet(IntQueue intQueue, CodeIterator codeIterator, int n6, Frame frame, Subroutine subroutine) throws BadBytecode {
        if (subroutine == null) {
            throw new BadBytecode("Ret on no subroutine! [pos = " + n6 + "]");
        }
        for (int n10 : subroutine.callers()) {
            int n11 = this.getNext(codeIterator, n10, n6);
            boolean bl = false;
            Frame frame2 = this.frames[n11];
            if (frame2 == null) {
                frame2 = this.frames[n11] = frame.copyStack();
                bl = true;
            } else {
                bl = frame2.mergeStack(frame);
            }
            for (int n12 : subroutine.accessed()) {
                Type type;
                Type type2 = frame2.getLocal(n12);
                if (type2 == (type = frame.getLocal(n12))) continue;
                frame2.setLocal(n12, type);
                bl = true;
            }
            if (!frame2.isRetMerged()) {
                frame2.setRetMerged(true);
                bl = true;
            }
            if (!bl || !frame2.isJsrMerged()) continue;
            intQueue.add(n11);
        }
    }

    private void mergeTableSwitch(IntQueue intQueue, int n6, CodeIterator codeIterator, Frame frame) throws BadBytecode {
        int n10 = (n6 & 0xFFFFFFFC) + 4;
        this.merge(intQueue, frame, n6 + codeIterator.s32bitAt(n10));
        int n11 = codeIterator.s32bitAt(n10 += 4);
        int n12 = codeIterator.s32bitAt(n10 += 4);
        int n13 = (n12 - n11 + 1) * 4 + (n10 += 4);
        while (n10 < n13) {
            int n14 = codeIterator.s32bitAt(n10) + n6;
            this.merge(intQueue, frame, n14);
            n10 += 4;
        }
    }

    private Type zeroExtend(Type type) {
        if (type == Type.SHORT || type == Type.BYTE || type == Type.CHAR || type == Type.BOOLEAN) {
            return Type.INTEGER;
        }
        return type;
    }
}

