/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.ProtectionDomain;
import javassist.CannotCompileException;
import javassist.bytecode.ClassFile;
import javassist.util.proxy.DefineClassHelper;
import javassist.util.proxy.ProxyFactory;

public class FactoryHelper {
    public static final Class<?>[] primitiveTypes = new Class[]{Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
    public static final String[] wrapperTypes = new String[]{"java.lang.Boolean", "java.lang.Byte", "java.lang.Character", "java.lang.Short", "java.lang.Integer", "java.lang.Long", "java.lang.Float", "java.lang.Double", "java.lang.Void"};
    public static final String[] wrapperDesc = new String[]{"(Z)V", "(B)V", "(C)V", "(S)V", "(I)V", "(J)V", "(F)V", "(D)V"};
    public static final String[] unwarpMethods = new String[]{"booleanValue", "byteValue", "charValue", "shortValue", "intValue", "longValue", "floatValue", "doubleValue"};
    public static final String[] unwrapDesc = new String[]{"()Z", "()B", "()C", "()S", "()I", "()J", "()F", "()D"};
    public static final int[] dataSize = new int[]{1, 1, 1, 1, 1, 2, 1, 2};

    public static final int typeIndex(Class<?> class_) {
        for (int k = 0; k < primitiveTypes.length; ++k) {
            if (primitiveTypes[k] != class_) continue;
            return k;
        }
        throw new RuntimeException("bad type:" + class_.getName());
    }

    public static Class<?> toClass(ClassFile classFile, ClassLoader classLoader) throws CannotCompileException {
        return FactoryHelper.toClass(classFile, null, classLoader, null);
    }

    public static Class<?> toClass(ClassFile classFile, ClassLoader classLoader, ProtectionDomain protectionDomain) throws CannotCompileException {
        return FactoryHelper.toClass(classFile, null, classLoader, protectionDomain);
    }

    public static Class<?> toClass(ClassFile classFile, Class<?> class_, ClassLoader classLoader, ProtectionDomain protectionDomain) throws CannotCompileException {
        try {
            byte[] arrby = FactoryHelper.toBytecode(classFile);
            if (ProxyFactory.onlyPublicMethods) {
                return DefineClassHelper.toPublicClass(classFile.getName(), arrby);
            }
            return DefineClassHelper.toClass(classFile.getName(), class_, classLoader, protectionDomain, arrby);
        }
        catch (IOException iOException) {
            throw new CannotCompileException(iOException);
        }
    }

    public static Class<?> toClass(ClassFile classFile, MethodHandles.Lookup lookup) throws CannotCompileException {
        try {
            byte[] arrby = FactoryHelper.toBytecode(classFile);
            return DefineClassHelper.toClass(lookup, arrby);
        }
        catch (IOException iOException) {
            throw new CannotCompileException(iOException);
        }
    }

    private static byte[] toBytecode(ClassFile classFile) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
            classFile.write(dataOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void writeFile(ClassFile classFile, String string) throws CannotCompileException {
        try {
            FactoryHelper.writeFile0(classFile, string);
        }
        catch (IOException iOException) {
            throw new CannotCompileException(iOException);
        }
    }

    private static void writeFile0(ClassFile classFile, String string) throws CannotCompileException, IOException {
        Object object;
        String string2 = classFile.getName();
        String string3 = string + File.separatorChar + string2.replace('.', File.separatorChar) + ".class";
        int n6 = string3.lastIndexOf(File.separatorChar);
        if (n6 > 0 && !((String)(object = string3.substring(0, n6))).equals(".")) {
            new File((String)object).mkdirs();
        }
        object = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(string3)));
        try {
            classFile.write((DataOutputStream)object);
        }
        catch (IOException iOException) {
            throw iOException;
        }
        finally {
            ((FilterOutputStream)object).close();
        }
    }
}

