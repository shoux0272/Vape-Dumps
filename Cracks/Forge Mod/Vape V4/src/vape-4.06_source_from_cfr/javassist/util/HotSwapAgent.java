/*
 * Decompiled with CFR 0.150.
 */
package javassist.util;

import com.sun.tools.attach.VirtualMachine;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.management.ManagementFactory;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipOutputStream;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

public class HotSwapAgent {
    private static Instrumentation instrumentation = null;

    public Instrumentation instrumentation() {
        return instrumentation;
    }

    public static void premain(String string, Instrumentation instrumentation) throws Throwable {
        HotSwapAgent.agentmain(string, instrumentation);
    }

    public static void agentmain(String string, Instrumentation instrumentation) throws Throwable {
        if (!instrumentation.isRedefineClassesSupported()) {
            throw new RuntimeException("this JVM does not support redefinition of classes");
        }
        HotSwapAgent.instrumentation = instrumentation;
    }

    public static void redefine(Class<?> class_, CtClass ctClass) throws NotFoundException, IOException, CannotCompileException {
        Class[] arrclass = new Class[]{class_};
        CtClass[] arrctClass = new CtClass[]{ctClass};
        HotSwapAgent.redefine(arrclass, arrctClass);
    }

    public static void redefine(Class<?>[] arrclass, CtClass[] arrctClass) throws NotFoundException, IOException, CannotCompileException {
        HotSwapAgent.startAgent();
        ClassDefinition[] arrclassDefinition = new ClassDefinition[arrclass.length];
        for (int k = 0; k < arrclass.length; ++k) {
            arrclassDefinition[k] = new ClassDefinition(arrclass[k], arrctClass[k].toBytecode());
        }
        try {
            instrumentation.redefineClasses(arrclassDefinition);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NotFoundException(classNotFoundException.getMessage(), classNotFoundException);
        }
        catch (UnmodifiableClassException unmodifiableClassException) {
            throw new CannotCompileException(unmodifiableClassException.getMessage(), unmodifiableClassException);
        }
    }

    private static void startAgent() throws NotFoundException {
        if (instrumentation != null) {
            return;
        }
        try {
            File file = HotSwapAgent.createJarFile();
            String string = ManagementFactory.getRuntimeMXBean().getName();
            String string2 = string.substring(0, string.indexOf(64));
            VirtualMachine virtualMachine = VirtualMachine.attach(string2);
            virtualMachine.loadAgent(file.getAbsolutePath(), null);
            virtualMachine.detach();
        }
        catch (Exception exception) {
            throw new NotFoundException("hotswap agent", exception);
        }
        for (int k = 0; k < 10; ++k) {
            if (instrumentation != null) {
                return;
            }
            try {
                Thread.sleep(1000L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        throw new NotFoundException("hotswap agent (timeout)");
    }

    public static File createAgentJarFile(String string) throws IOException, CannotCompileException, NotFoundException {
        return HotSwapAgent.createJarFile(new File(string));
    }

    private static File createJarFile() throws IOException, CannotCompileException, NotFoundException {
        File file = File.createTempFile("agent", ".jar");
        file.deleteOnExit();
        return HotSwapAgent.createJarFile(file);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static File createJarFile(File file) throws IOException, CannotCompileException, NotFoundException {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getMainAttributes();
        attributes.put(Attributes.Name.MANIFEST_VERSION, "1.0");
        attributes.put(new Attributes.Name("Premain-Class"), HotSwapAgent.class.getName());
        attributes.put(new Attributes.Name("Agent-Class"), HotSwapAgent.class.getName());
        attributes.put(new Attributes.Name("Can-Retransform-Classes"), "true");
        attributes.put(new Attributes.Name("Can-Redefine-Classes"), "true");
        try (ZipOutputStream zipOutputStream = null;){
            zipOutputStream = new JarOutputStream((OutputStream)new FileOutputStream(file), manifest);
            String string = HotSwapAgent.class.getName();
            JarEntry jarEntry = new JarEntry(string.replace('.', '/') + ".class");
            ((JarOutputStream)zipOutputStream).putNextEntry(jarEntry);
            ClassPool classPool = ClassPool.getDefault();
            CtClass ctClass = classPool.get(string);
            zipOutputStream.write(ctClass.toBytecode());
            zipOutputStream.closeEntry();
        }
        return file;
    }
}

