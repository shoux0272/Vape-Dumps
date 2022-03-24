/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BootstrapMethodsAttribute$BootstrapMethod;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;

public class BootstrapMethodsAttribute
extends AttributeInfo {
    public static final String tag = "BootstrapMethods";

    BootstrapMethodsAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public BootstrapMethodsAttribute(ConstPool constPool, BootstrapMethodsAttribute$BootstrapMethod[] arrbootstrapMethodsAttribute$BootstrapMethod) {
        super(constPool, tag);
        int n6 = 2;
        for (int k = 0; k < arrbootstrapMethodsAttribute$BootstrapMethod.length; ++k) {
            n6 += 4 + arrbootstrapMethodsAttribute$BootstrapMethod[k].arguments.length * 2;
        }
        byte[] arrby = new byte[n6];
        ByteArray.write16bit(arrbootstrapMethodsAttribute$BootstrapMethod.length, arrby, 0);
        int n10 = 2;
        for (int k = 0; k < arrbootstrapMethodsAttribute$BootstrapMethod.length; ++k) {
            ByteArray.write16bit(arrbootstrapMethodsAttribute$BootstrapMethod[k].methodRef, arrby, n10);
            ByteArray.write16bit(arrbootstrapMethodsAttribute$BootstrapMethod[k].arguments.length, arrby, n10 + 2);
            int[] arrn = arrbootstrapMethodsAttribute$BootstrapMethod[k].arguments;
            n10 += 4;
            for (int i10 = 0; i10 < arrn.length; ++i10) {
                ByteArray.write16bit(arrn[i10], arrby, n10);
                n10 += 2;
            }
        }
        this.set(arrby);
    }

    public BootstrapMethodsAttribute$BootstrapMethod[] getMethods() {
        byte[] arrby = this.get();
        int n6 = ByteArray.readU16bit(arrby, 0);
        BootstrapMethodsAttribute$BootstrapMethod[] arrbootstrapMethodsAttribute$BootstrapMethod = new BootstrapMethodsAttribute$BootstrapMethod[n6];
        int n10 = 2;
        for (int k = 0; k < n6; ++k) {
            int n11 = ByteArray.readU16bit(arrby, n10);
            int n12 = ByteArray.readU16bit(arrby, n10 + 2);
            int[] arrn = new int[n12];
            n10 += 4;
            for (int i10 = 0; i10 < n12; ++i10) {
                arrn[i10] = ByteArray.readU16bit(arrby, n10);
                n10 += 2;
            }
            arrbootstrapMethodsAttribute$BootstrapMethod[k] = new BootstrapMethodsAttribute$BootstrapMethod(n11, arrn);
        }
        return arrbootstrapMethodsAttribute$BootstrapMethod;
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        BootstrapMethodsAttribute$BootstrapMethod[] arrbootstrapMethodsAttribute$BootstrapMethod = this.getMethods();
        ConstPool constPool2 = this.getConstPool();
        for (int k = 0; k < arrbootstrapMethodsAttribute$BootstrapMethod.length; ++k) {
            BootstrapMethodsAttribute$BootstrapMethod bootstrapMethodsAttribute$BootstrapMethod = arrbootstrapMethodsAttribute$BootstrapMethod[k];
            bootstrapMethodsAttribute$BootstrapMethod.methodRef = constPool2.copy(bootstrapMethodsAttribute$BootstrapMethod.methodRef, constPool, map);
            for (int i10 = 0; i10 < bootstrapMethodsAttribute$BootstrapMethod.arguments.length; ++i10) {
                bootstrapMethodsAttribute$BootstrapMethod.arguments[i10] = constPool2.copy(bootstrapMethodsAttribute$BootstrapMethod.arguments[i10], constPool, map);
            }
        }
        return new BootstrapMethodsAttribute(constPool, arrbootstrapMethodsAttribute$BootstrapMethod);
    }
}

