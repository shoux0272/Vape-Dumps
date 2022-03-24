/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.SerialVersionUID$1;
import javassist.SerialVersionUID$2;
import javassist.SerialVersionUID$3;
import javassist.bytecode.ClassFile;
import javassist.bytecode.Descriptor;

public class SerialVersionUID {
    public static void setSerialVersionUID(CtClass ctClass) throws CannotCompileException, NotFoundException {
        try {
            ctClass.getDeclaredField("serialVersionUID");
            return;
        }
        catch (NotFoundException notFoundException) {
            if (!SerialVersionUID.isSerializable(ctClass)) {
                return;
            }
            CtField ctField = new CtField(CtClass.longType, "serialVersionUID", ctClass);
            ctField.setModifiers(26);
            ctClass.addField(ctField, SerialVersionUID.calculateDefault(ctClass) + "L");
            return;
        }
    }

    private static boolean isSerializable(CtClass ctClass) throws NotFoundException {
        ClassPool classPool = ctClass.getClassPool();
        return ctClass.subtypeOf(classPool.get("java.io.Serializable"));
    }

    public static long calculateDefault(CtClass ctClass) throws CannotCompileException {
        try {
            int n6;
            int n10;
            int n11;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            ClassFile classFile = ctClass.getClassFile();
            String string = SerialVersionUID.javaName(ctClass);
            dataOutputStream.writeUTF(string);
            CtMethod[] arrctMethod = ctClass.getDeclaredMethods();
            int n12 = ctClass.getModifiers();
            if ((n12 & 0x200) != 0) {
                n12 = arrctMethod.length > 0 ? (n12 |= 0x400) : (n12 &= 0xFFFFFBFF);
            }
            dataOutputStream.writeInt(n12);
            Object[] arrobject = classFile.getInterfaces();
            for (n11 = 0; n11 < arrobject.length; ++n11) {
                arrobject[n11] = SerialVersionUID.javaName((String)arrobject[n11]);
            }
            Arrays.sort(arrobject);
            for (n11 = 0; n11 < arrobject.length; ++n11) {
                dataOutputStream.writeUTF((String)arrobject[n11]);
            }
            CtField[] arrctField = ctClass.getDeclaredFields();
            Arrays.sort(arrctField, new SerialVersionUID$1());
            for (int k = 0; k < arrctField.length; ++k) {
                CtField ctField = arrctField[k];
                int n13 = ctField.getModifiers();
                if ((n13 & 2) != 0 && (n13 & 0x88) != 0) continue;
                dataOutputStream.writeUTF(ctField.getName());
                dataOutputStream.writeInt(n13);
                dataOutputStream.writeUTF(ctField.getFieldInfo2().getDescriptor());
            }
            if (classFile.getStaticInitializer() != null) {
                dataOutputStream.writeUTF("<clinit>");
                dataOutputStream.writeInt(8);
                dataOutputStream.writeUTF("()V");
            }
            CtConstructor[] arrctConstructor = ctClass.getDeclaredConstructors();
            Arrays.sort(arrctConstructor, new SerialVersionUID$2());
            for (n10 = 0; n10 < arrctConstructor.length; ++n10) {
                CtConstructor ctConstructor = arrctConstructor[n10];
                n6 = ctConstructor.getModifiers();
                if ((n6 & 2) != 0) continue;
                dataOutputStream.writeUTF("<init>");
                dataOutputStream.writeInt(n6);
                dataOutputStream.writeUTF(ctConstructor.getMethodInfo2().getDescriptor().replace('/', '.'));
            }
            Arrays.sort(arrctMethod, new SerialVersionUID$3());
            for (n10 = 0; n10 < arrctMethod.length; ++n10) {
                CtMethod ctMethod = arrctMethod[n10];
                n6 = ctMethod.getModifiers() & 0xD3F;
                if ((n6 & 2) != 0) continue;
                dataOutputStream.writeUTF(ctMethod.getName());
                dataOutputStream.writeInt(n6);
                dataOutputStream.writeUTF(ctMethod.getMethodInfo2().getDescriptor().replace('/', '.'));
            }
            dataOutputStream.flush();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            byte[] arrby = messageDigest.digest(byteArrayOutputStream.toByteArray());
            long l = 0L;
            for (int k = Math.min(arrby.length, 8) - 1; k >= 0; --k) {
                l = l << 8 | (long)(arrby[k] & 0xFF);
            }
            return l;
        }
        catch (IOException iOException) {
            throw new CannotCompileException(iOException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new CannotCompileException(noSuchAlgorithmException);
        }
    }

    private static String javaName(CtClass ctClass) {
        return Descriptor.toJavaName(Descriptor.toJvmName(ctClass));
    }

    private static String javaName(String string) {
        return Descriptor.toJavaName(Descriptor.toJvmName(string));
    }
}

