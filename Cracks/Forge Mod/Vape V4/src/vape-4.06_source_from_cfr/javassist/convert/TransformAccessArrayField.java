/*
 * Decompiled with CFR 0.150.
 */
package javassist.convert;

import javassist.CannotCompileException;
import javassist.CodeConverter$ArrayAccessReplacementMethodNames;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.CodeIterator$Gap;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.analysis.Analyzer;
import javassist.bytecode.analysis.Frame;
import javassist.convert.Transformer;

public final class TransformAccessArrayField
extends Transformer {
    private final String methodClassname;
    private final CodeConverter$ArrayAccessReplacementMethodNames names;
    private Frame[] frames;
    private int offset;

    public TransformAccessArrayField(Transformer transformer, String string, CodeConverter$ArrayAccessReplacementMethodNames codeConverter$ArrayAccessReplacementMethodNames) throws NotFoundException {
        super(transformer);
        this.methodClassname = string;
        this.names = codeConverter$ArrayAccessReplacementMethodNames;
    }

    @Override
    public void initialize(ConstPool constPool, CtClass ctClass, MethodInfo methodInfo) throws CannotCompileException {
        CodeIterator codeIterator = methodInfo.getCodeAttribute().iterator();
        while (codeIterator.hasNext()) {
            try {
                int n6 = codeIterator.next();
                int n10 = codeIterator.byteAt(n6);
                if (n10 == 50) {
                    this.initFrames(ctClass, methodInfo);
                }
                if (n10 == 50 || n10 == 51 || n10 == 52 || n10 == 49 || n10 == 48 || n10 == 46 || n10 == 47 || n10 == 53) {
                    n6 = this.replace(constPool, codeIterator, n6, n10, this.getLoadReplacementSignature(n10));
                    continue;
                }
                if (n10 != 83 && n10 != 84 && n10 != 85 && n10 != 82 && n10 != 81 && n10 != 79 && n10 != 80 && n10 != 86) continue;
                n6 = this.replace(constPool, codeIterator, n6, n10, this.getStoreReplacementSignature(n10));
            }
            catch (Exception exception) {
                throw new CannotCompileException(exception);
            }
        }
    }

    @Override
    public void clean() {
        this.frames = null;
        this.offset = -1;
    }

    @Override
    public int transform(CtClass ctClass, int n6, CodeIterator codeIterator, ConstPool constPool) throws BadBytecode {
        return n6;
    }

    private Frame getFrame(int n6) throws BadBytecode {
        return this.frames[n6 - this.offset];
    }

    private void initFrames(CtClass ctClass, MethodInfo methodInfo) throws BadBytecode {
        if (this.frames == null) {
            this.frames = new Analyzer().analyze(ctClass, methodInfo);
            this.offset = 0;
        }
    }

    private int updatePos(int n6, int n10) {
        if (this.offset > -1) {
            this.offset += n10;
        }
        return n6 + n10;
    }

    private String getTopType(int n6) throws BadBytecode {
        Frame frame = this.getFrame(n6);
        if (frame == null) {
            return null;
        }
        CtClass ctClass = frame.peek().getCtClass();
        return ctClass != null ? Descriptor.toJvmName(ctClass) : null;
    }

    private int replace(ConstPool constPool, CodeIterator codeIterator, int n6, int n10, String string) throws BadBytecode {
        String string2 = null;
        String string3 = this.getMethodName(n10);
        if (string3 != null) {
            if (n10 == 50) {
                string2 = this.getTopType(codeIterator.lookAhead());
                if (string2 == null) {
                    return n6;
                }
                if ("java/lang/Object".equals(string2)) {
                    string2 = null;
                }
            }
            codeIterator.writeByte(0, n6);
            CodeIterator$Gap codeIterator$Gap = codeIterator.insertGapAt(n6, string2 != null ? 5 : 2, false);
            n6 = codeIterator$Gap.position;
            int n11 = constPool.addClassInfo(this.methodClassname);
            int n12 = constPool.addMethodrefInfo(n11, string3, string);
            codeIterator.writeByte(184, n6);
            codeIterator.write16bit(n12, n6 + 1);
            if (string2 != null) {
                int n13 = constPool.addClassInfo(string2);
                codeIterator.writeByte(192, n6 + 3);
                codeIterator.write16bit(n13, n6 + 4);
            }
            n6 = this.updatePos(n6, codeIterator$Gap.length);
        }
        return n6;
    }

    private String getMethodName(int n6) {
        String string = null;
        switch (n6) {
            case 50: {
                string = this.names.objectRead();
                break;
            }
            case 51: {
                string = this.names.byteOrBooleanRead();
                break;
            }
            case 52: {
                string = this.names.charRead();
                break;
            }
            case 49: {
                string = this.names.doubleRead();
                break;
            }
            case 48: {
                string = this.names.floatRead();
                break;
            }
            case 46: {
                string = this.names.intRead();
                break;
            }
            case 53: {
                string = this.names.shortRead();
                break;
            }
            case 47: {
                string = this.names.longRead();
                break;
            }
            case 83: {
                string = this.names.objectWrite();
                break;
            }
            case 84: {
                string = this.names.byteOrBooleanWrite();
                break;
            }
            case 85: {
                string = this.names.charWrite();
                break;
            }
            case 82: {
                string = this.names.doubleWrite();
                break;
            }
            case 81: {
                string = this.names.floatWrite();
                break;
            }
            case 79: {
                string = this.names.intWrite();
                break;
            }
            case 86: {
                string = this.names.shortWrite();
                break;
            }
            case 80: {
                string = this.names.longWrite();
            }
        }
        if (string.equals("")) {
            string = null;
        }
        return string;
    }

    private String getLoadReplacementSignature(int n6) throws BadBytecode {
        switch (n6) {
            case 50: {
                return "(Ljava/lang/Object;I)Ljava/lang/Object;";
            }
            case 51: {
                return "(Ljava/lang/Object;I)B";
            }
            case 52: {
                return "(Ljava/lang/Object;I)C";
            }
            case 49: {
                return "(Ljava/lang/Object;I)D";
            }
            case 48: {
                return "(Ljava/lang/Object;I)F";
            }
            case 46: {
                return "(Ljava/lang/Object;I)I";
            }
            case 53: {
                return "(Ljava/lang/Object;I)S";
            }
            case 47: {
                return "(Ljava/lang/Object;I)J";
            }
        }
        throw new BadBytecode(n6);
    }

    private String getStoreReplacementSignature(int n6) throws BadBytecode {
        switch (n6) {
            case 83: {
                return "(Ljava/lang/Object;ILjava/lang/Object;)V";
            }
            case 84: {
                return "(Ljava/lang/Object;IB)V";
            }
            case 85: {
                return "(Ljava/lang/Object;IC)V";
            }
            case 82: {
                return "(Ljava/lang/Object;ID)V";
            }
            case 81: {
                return "(Ljava/lang/Object;IF)V";
            }
            case 79: {
                return "(Ljava/lang/Object;II)V";
            }
            case 86: {
                return "(Ljava/lang/Object;IS)V";
            }
            case 80: {
                return "(Ljava/lang/Object;IJ)V";
            }
        }
        throw new BadBytecode(n6);
    }
}

