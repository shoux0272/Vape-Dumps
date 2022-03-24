/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.CtClass;
import javassist.CtPrimitiveType;
import javassist.bytecode.ByteVector;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.Opcode;

public class Bytecode
extends ByteVector
implements Cloneable,
Opcode {
    public static final CtClass THIS = ConstPool.THIS;
    ConstPool constPool;
    int maxStack;
    int maxLocals;
    ExceptionTable tryblocks;
    private int stackDepth;

    public Bytecode(ConstPool constPool, int n6, int n10) {
        this.constPool = constPool;
        this.maxStack = n6;
        this.maxLocals = n10;
        this.tryblocks = new ExceptionTable(constPool);
        this.stackDepth = 0;
    }

    public Bytecode(ConstPool constPool) {
        this(constPool, 0, 0);
    }

    @Override
    public Object clone() {
        try {
            Bytecode bytecode = (Bytecode)super.clone();
            bytecode.tryblocks = (ExceptionTable)this.tryblocks.clone();
            return bytecode;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public ConstPool getConstPool() {
        return this.constPool;
    }

    public ExceptionTable getExceptionTable() {
        return this.tryblocks;
    }

    public CodeAttribute toCodeAttribute() {
        return new CodeAttribute(this.constPool, this.maxStack, this.maxLocals, this.get(), this.tryblocks);
    }

    public int length() {
        return this.getSize();
    }

    public byte[] get() {
        return this.copy();
    }

    public int getMaxStack() {
        return this.maxStack;
    }

    public void setMaxStack(int n6) {
        this.maxStack = n6;
    }

    public int getMaxLocals() {
        return this.maxLocals;
    }

    public void setMaxLocals(int n6) {
        this.maxLocals = n6;
    }

    public void setMaxLocals(boolean bl, CtClass[] arrctClass, int n6) {
        if (!bl) {
            ++n6;
        }
        if (arrctClass != null) {
            CtClass ctClass = CtClass.doubleType;
            CtClass ctClass2 = CtClass.longType;
            for (CtClass ctClass3 : arrctClass) {
                if (ctClass3 == ctClass || ctClass3 == ctClass2) {
                    n6 += 2;
                    continue;
                }
                ++n6;
            }
        }
        this.maxLocals = n6;
    }

    public void incMaxLocals(int n6) {
        this.maxLocals += n6;
    }

    public void addExceptionHandler(int n6, int n10, int n11, CtClass ctClass) {
        this.addExceptionHandler(n6, n10, n11, this.constPool.addClassInfo(ctClass));
    }

    public void addExceptionHandler(int n6, int n10, int n11, String string) {
        this.addExceptionHandler(n6, n10, n11, this.constPool.addClassInfo(string));
    }

    public void addExceptionHandler(int n6, int n10, int n11, int n12) {
        this.tryblocks.add(n6, n10, n11, n12);
    }

    public int currentPc() {
        return this.getSize();
    }

    @Override
    public int read(int n6) {
        return super.read(n6);
    }

    public int read16bit(int n6) {
        int n10 = this.read(n6);
        int n11 = this.read(n6 + 1);
        return (n10 << 8) + (n11 & 0xFF);
    }

    public int read32bit(int n6) {
        int n10 = this.read16bit(n6);
        int n11 = this.read16bit(n6 + 2);
        return (n10 << 16) + (n11 & 0xFFFF);
    }

    @Override
    public void write(int n6, int n10) {
        super.write(n6, n10);
    }

    public void write16bit(int n6, int n10) {
        this.write(n6, n10 >> 8);
        this.write(n6 + 1, n10);
    }

    public void write32bit(int n6, int n10) {
        this.write16bit(n6, n10 >> 16);
        this.write16bit(n6 + 2, n10);
    }

    @Override
    public void add(int n6) {
        super.add(n6);
    }

    public void add32bit(int n6) {
        this.add(n6 >> 24, n6 >> 16, n6 >> 8, n6);
    }

    @Override
    public void addGap(int n6) {
        super.addGap(n6);
    }

    public void addOpcode(int n6) {
        this.add(n6);
        this.growStack(STACK_GROW[n6]);
    }

    public void growStack(int n6) {
        this.setStackDepth(this.stackDepth + n6);
    }

    public int getStackDepth() {
        return this.stackDepth;
    }

    public void setStackDepth(int n6) {
        this.stackDepth = n6;
        if (this.stackDepth > this.maxStack) {
            this.maxStack = this.stackDepth;
        }
    }

    public void addIndex(int n6) {
        this.add(n6 >> 8, n6);
    }

    public void addAload(int n6) {
        if (n6 < 4) {
            this.addOpcode(42 + n6);
        } else if (n6 < 256) {
            this.addOpcode(25);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(25);
            this.addIndex(n6);
        }
    }

    public void addAstore(int n6) {
        if (n6 < 4) {
            this.addOpcode(75 + n6);
        } else if (n6 < 256) {
            this.addOpcode(58);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(58);
            this.addIndex(n6);
        }
    }

    public void addIconst(int n6) {
        if (n6 < 6 && -2 < n6) {
            this.addOpcode(3 + n6);
        } else if (n6 <= 127 && -128 <= n6) {
            this.addOpcode(16);
            this.add(n6);
        } else if (n6 <= 32767 && -32768 <= n6) {
            this.addOpcode(17);
            this.add(n6 >> 8);
            this.add(n6);
        } else {
            this.addLdc(this.constPool.addIntegerInfo(n6));
        }
    }

    public void addConstZero(CtClass ctClass) {
        if (ctClass.isPrimitive()) {
            if (ctClass == CtClass.longType) {
                this.addOpcode(9);
            } else if (ctClass == CtClass.floatType) {
                this.addOpcode(11);
            } else if (ctClass == CtClass.doubleType) {
                this.addOpcode(14);
            } else {
                if (ctClass == CtClass.voidType) {
                    throw new RuntimeException("void type?");
                }
                this.addOpcode(3);
            }
        } else {
            this.addOpcode(1);
        }
    }

    public void addIload(int n6) {
        if (n6 < 4) {
            this.addOpcode(26 + n6);
        } else if (n6 < 256) {
            this.addOpcode(21);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(21);
            this.addIndex(n6);
        }
    }

    public void addIstore(int n6) {
        if (n6 < 4) {
            this.addOpcode(59 + n6);
        } else if (n6 < 256) {
            this.addOpcode(54);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(54);
            this.addIndex(n6);
        }
    }

    public void addLconst(long l) {
        if (l == 0L || l == 1L) {
            this.addOpcode(9 + (int)l);
        } else {
            this.addLdc2w(l);
        }
    }

    public void addLload(int n6) {
        if (n6 < 4) {
            this.addOpcode(30 + n6);
        } else if (n6 < 256) {
            this.addOpcode(22);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(22);
            this.addIndex(n6);
        }
    }

    public void addLstore(int n6) {
        if (n6 < 4) {
            this.addOpcode(63 + n6);
        } else if (n6 < 256) {
            this.addOpcode(55);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(55);
            this.addIndex(n6);
        }
    }

    public void addDconst(double d10) {
        if (d10 == 0.0 || d10 == 1.0) {
            this.addOpcode(14 + (int)d10);
        } else {
            this.addLdc2w(d10);
        }
    }

    public void addDload(int n6) {
        if (n6 < 4) {
            this.addOpcode(38 + n6);
        } else if (n6 < 256) {
            this.addOpcode(24);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(24);
            this.addIndex(n6);
        }
    }

    public void addDstore(int n6) {
        if (n6 < 4) {
            this.addOpcode(71 + n6);
        } else if (n6 < 256) {
            this.addOpcode(57);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(57);
            this.addIndex(n6);
        }
    }

    public void addFconst(float f10) {
        if (f10 == 0.0f || f10 == 1.0f || f10 == 2.0f) {
            this.addOpcode(11 + (int)f10);
        } else {
            this.addLdc(this.constPool.addFloatInfo(f10));
        }
    }

    public void addFload(int n6) {
        if (n6 < 4) {
            this.addOpcode(34 + n6);
        } else if (n6 < 256) {
            this.addOpcode(23);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(23);
            this.addIndex(n6);
        }
    }

    public void addFstore(int n6) {
        if (n6 < 4) {
            this.addOpcode(67 + n6);
        } else if (n6 < 256) {
            this.addOpcode(56);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(56);
            this.addIndex(n6);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int addLoad(int n6, CtClass ctClass) {
        if (!ctClass.isPrimitive()) {
            this.addAload(n6);
            return 1;
        }
        if (ctClass == CtClass.booleanType || ctClass == CtClass.charType || ctClass == CtClass.byteType || ctClass == CtClass.shortType || ctClass == CtClass.intType) {
            this.addIload(n6);
            return 1;
        }
        if (ctClass == CtClass.longType) {
            this.addLload(n6);
            return 2;
        }
        if (ctClass == CtClass.floatType) {
            this.addFload(n6);
            return 1;
        }
        if (ctClass != CtClass.doubleType) throw new RuntimeException("void type?");
        this.addDload(n6);
        return 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int addStore(int n6, CtClass ctClass) {
        if (!ctClass.isPrimitive()) {
            this.addAstore(n6);
            return 1;
        }
        if (ctClass == CtClass.booleanType || ctClass == CtClass.charType || ctClass == CtClass.byteType || ctClass == CtClass.shortType || ctClass == CtClass.intType) {
            this.addIstore(n6);
            return 1;
        }
        if (ctClass == CtClass.longType) {
            this.addLstore(n6);
            return 2;
        }
        if (ctClass == CtClass.floatType) {
            this.addFstore(n6);
            return 1;
        }
        if (ctClass != CtClass.doubleType) throw new RuntimeException("void type?");
        this.addDstore(n6);
        return 2;
    }

    public int addLoadParameters(CtClass[] arrctClass, int n6) {
        int n10 = 0;
        if (arrctClass != null) {
            int n11 = arrctClass.length;
            for (int k = 0; k < n11; ++k) {
                n10 += this.addLoad(n10 + n6, arrctClass[k]);
            }
        }
        return n10;
    }

    public void addCheckcast(CtClass ctClass) {
        this.addOpcode(192);
        this.addIndex(this.constPool.addClassInfo(ctClass));
    }

    public void addCheckcast(String string) {
        this.addOpcode(192);
        this.addIndex(this.constPool.addClassInfo(string));
    }

    public void addInstanceof(String string) {
        this.addOpcode(193);
        this.addIndex(this.constPool.addClassInfo(string));
    }

    public void addGetfield(CtClass ctClass, String string, String string2) {
        this.add(180);
        int n6 = this.constPool.addClassInfo(ctClass);
        this.addIndex(this.constPool.addFieldrefInfo(n6, string, string2));
        this.growStack(Descriptor.dataSize(string2) - 1);
    }

    public void addGetfield(String string, String string2, String string3) {
        this.add(180);
        int n6 = this.constPool.addClassInfo(string);
        this.addIndex(this.constPool.addFieldrefInfo(n6, string2, string3));
        this.growStack(Descriptor.dataSize(string3) - 1);
    }

    public void addGetstatic(CtClass ctClass, String string, String string2) {
        this.add(178);
        int n6 = this.constPool.addClassInfo(ctClass);
        this.addIndex(this.constPool.addFieldrefInfo(n6, string, string2));
        this.growStack(Descriptor.dataSize(string2));
    }

    public void addGetstatic(String string, String string2, String string3) {
        this.add(178);
        int n6 = this.constPool.addClassInfo(string);
        this.addIndex(this.constPool.addFieldrefInfo(n6, string2, string3));
        this.growStack(Descriptor.dataSize(string3));
    }

    public void b(CtClass ctClass, String string, CtClass ctClass2, CtClass[] arrctClass) {
        String string2 = Descriptor.ofMethod(ctClass2, arrctClass);
        this.addInvokespecial(ctClass, string, string2);
    }

    public void addInvokespecial(CtClass ctClass, String string, String string2) {
        boolean bl = ctClass == null ? false : ctClass.isInterface();
        this.addInvokespecial(bl, this.constPool.addClassInfo(ctClass), string, string2);
    }

    public void addInvokespecial(String string, String string2, String string3) {
        this.addInvokespecial(false, this.constPool.addClassInfo(string), string2, string3);
    }

    public void addInvokespecial(int n6, String string, String string2) {
        this.addInvokespecial(false, n6, string, string2);
    }

    public void addInvokespecial(boolean bl, int n6, String string, String string2) {
        int n10 = bl ? this.constPool.addInterfaceMethodrefInfo(n6, string, string2) : this.constPool.addMethodrefInfo(n6, string, string2);
        this.addInvokespecial(n10, string2);
    }

    public void addInvokespecial(int n6, String string) {
        this.add(183);
        this.addIndex(n6);
        this.growStack(Descriptor.dataSize(string) - 1);
    }

    public void a(CtClass ctClass, String string, CtClass ctClass2, CtClass[] arrctClass) {
        String string2 = Descriptor.ofMethod(ctClass2, arrctClass);
        this.addInvokestatic(ctClass, string, string2);
    }

    public void addInvokestatic(CtClass ctClass, String string, String string2) {
        boolean bl = ctClass == THIS ? false : ctClass.isInterface();
        this.addInvokestatic(this.constPool.addClassInfo(ctClass), string, string2, bl);
    }

    public void addInvokestatic(String string, String string2, String string3) {
        this.addInvokestatic(this.constPool.addClassInfo(string), string2, string3);
    }

    public void addInvokestatic(int n6, String string, String string2) {
        this.addInvokestatic(n6, string, string2, false);
    }

    private void addInvokestatic(int n6, String string, String string2, boolean bl) {
        this.add(184);
        int n10 = bl ? this.constPool.addInterfaceMethodrefInfo(n6, string, string2) : this.constPool.addMethodrefInfo(n6, string, string2);
        this.addIndex(n10);
        this.growStack(Descriptor.dataSize(string2));
    }

    public void c(CtClass ctClass, String string, CtClass ctClass2, CtClass[] arrctClass) {
        String string2 = Descriptor.ofMethod(ctClass2, arrctClass);
        this.addInvokevirtual(ctClass, string, string2);
    }

    public void addInvokevirtual(CtClass ctClass, String string, String string2) {
        this.addInvokevirtual(this.constPool.addClassInfo(ctClass), string, string2);
    }

    public void addInvokevirtual(String string, String string2, String string3) {
        this.addInvokevirtual(this.constPool.addClassInfo(string), string2, string3);
    }

    public void addInvokevirtual(int n6, String string, String string2) {
        this.add(182);
        this.addIndex(this.constPool.addMethodrefInfo(n6, string, string2));
        this.growStack(Descriptor.dataSize(string2) - 1);
    }

    public void addInvokeinterface(CtClass ctClass, String string, CtClass ctClass2, CtClass[] arrctClass, int n6) {
        String string2 = Descriptor.ofMethod(ctClass2, arrctClass);
        this.addInvokeinterface(ctClass, string, string2, n6);
    }

    public void addInvokeinterface(CtClass ctClass, String string, String string2, int n6) {
        this.addInvokeinterface(this.constPool.addClassInfo(ctClass), string, string2, n6);
    }

    public void addInvokeinterface(String string, String string2, String string3, int n6) {
        this.addInvokeinterface(this.constPool.addClassInfo(string), string2, string3, n6);
    }

    public void addInvokeinterface(int n6, String string, String string2, int n10) {
        this.add(185);
        this.addIndex(this.constPool.addInterfaceMethodrefInfo(n6, string, string2));
        this.add(n10);
        this.add(0);
        this.growStack(Descriptor.dataSize(string2) - 1);
    }

    public void addInvokedynamic(int n6, String string, String string2) {
        int n10 = this.constPool.addNameAndTypeInfo(string, string2);
        int n11 = this.constPool.addInvokeDynamicInfo(n6, n10);
        this.add(186);
        this.addIndex(n11);
        this.add(0, 0);
        this.growStack(Descriptor.dataSize(string2));
    }

    public void addLdc(String string) {
        this.addLdc(this.constPool.addStringInfo(string));
    }

    public void addLdc(int n6) {
        if (n6 > 255) {
            this.addOpcode(19);
            this.addIndex(n6);
        } else {
            this.addOpcode(18);
            this.add(n6);
        }
    }

    public void addLdc2w(long l) {
        this.addOpcode(20);
        this.addIndex(this.constPool.addLongInfo(l));
    }

    public void addLdc2w(double d10) {
        this.addOpcode(20);
        this.addIndex(this.constPool.addDoubleInfo(d10));
    }

    public void addNew(CtClass ctClass) {
        this.addOpcode(187);
        this.addIndex(this.constPool.addClassInfo(ctClass));
    }

    public void addNew(String string) {
        this.addOpcode(187);
        this.addIndex(this.constPool.addClassInfo(string));
    }

    public void addAnewarray(String string) {
        this.addOpcode(189);
        this.addIndex(this.constPool.addClassInfo(string));
    }

    public void addAnewarray(CtClass ctClass, int n6) {
        this.addIconst(n6);
        this.addOpcode(189);
        this.addIndex(this.constPool.addClassInfo(ctClass));
    }

    public void addNewarray(int n6, int n10) {
        this.addIconst(n10);
        this.addOpcode(188);
        this.add(n6);
    }

    public int addMultiNewarray(CtClass ctClass, int[] arrn) {
        int n6 = arrn.length;
        for (int k = 0; k < n6; ++k) {
            this.addIconst(arrn[k]);
        }
        this.growStack(n6);
        return this.addMultiNewarray(ctClass, n6);
    }

    public int addMultiNewarray(CtClass ctClass, int n6) {
        this.add(197);
        this.addIndex(this.constPool.addClassInfo(ctClass));
        this.add(n6);
        this.growStack(1 - n6);
        return n6;
    }

    public int addMultiNewarray(String string, int n6) {
        this.add(197);
        this.addIndex(this.constPool.addClassInfo(string));
        this.add(n6);
        this.growStack(1 - n6);
        return n6;
    }

    public void addPutfield(CtClass ctClass, String string, String string2) {
        this.addPutfield0(ctClass, null, string, string2);
    }

    public void addPutfield(String string, String string2, String string3) {
        this.addPutfield0(null, string, string2, string3);
    }

    private void addPutfield0(CtClass ctClass, String string, String string2, String string3) {
        this.add(181);
        int n6 = string == null ? this.constPool.addClassInfo(ctClass) : this.constPool.addClassInfo(string);
        this.addIndex(this.constPool.addFieldrefInfo(n6, string2, string3));
        this.growStack(-1 - Descriptor.dataSize(string3));
    }

    public void addPutstatic(CtClass ctClass, String string, String string2) {
        this.addPutstatic0(ctClass, null, string, string2);
    }

    public void addPutstatic(String string, String string2, String string3) {
        this.addPutstatic0(null, string, string2, string3);
    }

    private void addPutstatic0(CtClass ctClass, String string, String string2, String string3) {
        this.add(179);
        int n6 = string == null ? this.constPool.addClassInfo(ctClass) : this.constPool.addClassInfo(string);
        this.addIndex(this.constPool.addFieldrefInfo(n6, string2, string3));
        this.growStack(-Descriptor.dataSize(string3));
    }

    public void addReturn(CtClass ctClass) {
        if (ctClass == null) {
            this.addOpcode(177);
        } else if (ctClass.isPrimitive()) {
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
            this.addOpcode(ctPrimitiveType.getReturnOp());
        } else {
            this.addOpcode(176);
        }
    }

    public void addRet(int n6) {
        if (n6 < 256) {
            this.addOpcode(169);
            this.add(n6);
        } else {
            this.addOpcode(196);
            this.addOpcode(169);
            this.addIndex(n6);
        }
    }

    public void addPrintln(String string) {
        this.addGetstatic("java.lang.System", "err", "Ljava/io/PrintStream;");
        this.addLdc(string);
        this.addInvokevirtual("java.io.PrintStream", "println", "(Ljava/lang/String;)V");
    }
}

