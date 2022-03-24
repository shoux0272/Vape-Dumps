/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;

public interface ClassFileWriter$AttributeWriter {
    public int size();

    public void write(DataOutputStream var1) throws IOException;
}

