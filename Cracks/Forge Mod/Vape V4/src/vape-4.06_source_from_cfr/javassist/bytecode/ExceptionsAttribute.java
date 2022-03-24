/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;

public class ExceptionsAttribute
extends AttributeInfo {
    public static final String tag = "Exceptions";

    ExceptionsAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    private ExceptionsAttribute(ConstPool constPool, ExceptionsAttribute exceptionsAttribute, Map<String, String> map) {
        super(constPool, tag);
        this.copyFrom(exceptionsAttribute, map);
    }

    public ExceptionsAttribute(ConstPool constPool) {
        super(constPool, tag);
        byte[] arrby = new byte[2];
        arrby[1] = 0;
        arrby[0] = 0;
        this.info = arrby;
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        return new ExceptionsAttribute(constPool, this, map);
    }

    private void copyFrom(ExceptionsAttribute exceptionsAttribute, Map<String, String> map) {
        ConstPool constPool = exceptionsAttribute.constPool;
        ConstPool constPool2 = this.constPool;
        byte[] arrby = exceptionsAttribute.info;
        int n6 = arrby.length;
        byte[] arrby2 = new byte[n6];
        arrby2[0] = arrby[0];
        arrby2[1] = arrby[1];
        for (int k = 2; k < n6; k += 2) {
            int n10 = ByteArray.readU16bit(arrby, k);
            ByteArray.write16bit(constPool.copy(n10, constPool2, map), arrby2, k);
        }
        this.info = arrby2;
    }

    public int[] getExceptionIndexes() {
        byte[] arrby = this.info;
        int n6 = arrby.length;
        if (n6 <= 2) {
            return null;
        }
        int[] arrn = new int[n6 / 2 - 1];
        int n10 = 0;
        for (int k = 2; k < n6; k += 2) {
            arrn[n10++] = (arrby[k] & 0xFF) << 8 | arrby[k + 1] & 0xFF;
        }
        return arrn;
    }

    public String[] getExceptions() {
        byte[] arrby = this.info;
        int n6 = arrby.length;
        if (n6 <= 2) {
            return null;
        }
        String[] arrstring = new String[n6 / 2 - 1];
        int n10 = 0;
        for (int k = 2; k < n6; k += 2) {
            int n11 = (arrby[k] & 0xFF) << 8 | arrby[k + 1] & 0xFF;
            arrstring[n10++] = this.constPool.getClassInfo(n11);
        }
        return arrstring;
    }

    public void setExceptionIndexes(int[] arrn) {
        int n6 = arrn.length;
        byte[] arrby = new byte[n6 * 2 + 2];
        ByteArray.write16bit(n6, arrby, 0);
        for (int k = 0; k < n6; ++k) {
            ByteArray.write16bit(arrn[k], arrby, k * 2 + 2);
        }
        this.info = arrby;
    }

    public void setExceptions(String[] arrstring) {
        int n6 = arrstring.length;
        byte[] arrby = new byte[n6 * 2 + 2];
        ByteArray.write16bit(n6, arrby, 0);
        for (int k = 0; k < n6; ++k) {
            ByteArray.write16bit(this.constPool.addClassInfo(arrstring[k]), arrby, k * 2 + 2);
        }
        this.info = arrby;
    }

    public int tableLength() {
        return this.info.length / 2 - 1;
    }

    public int getException(int n6) {
        int n10 = n6 * 2 + 2;
        return (this.info[n10] & 0xFF) << 8 | this.info[n10 + 1] & 0xFF;
    }
}

