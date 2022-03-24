/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.ClassPoolTail;
import javassist.NotFoundException;
import javassist.Translator;
import javassist.bytecode.ClassFile;

public class Loader
extends ClassLoader {
    private HashMap<String, ClassLoader> notDefinedHere;
    private Vector<String> notDefinedPackages;
    private ClassPool source;
    private Translator translator;
    private ProtectionDomain domain;
    public boolean doDelegation = true;

    public Loader() {
        this((ClassPool)null);
    }

    public Loader(ClassPool classPool) {
        this.init(classPool);
    }

    public Loader(ClassLoader classLoader, ClassPool classPool) {
        super(classLoader);
        this.init(classPool);
    }

    private void init(ClassPool classPool) {
        this.notDefinedHere = new HashMap();
        this.notDefinedPackages = new Vector();
        this.source = classPool;
        this.translator = null;
        this.domain = null;
        this.delegateLoadingOf("a.p8");
    }

    public void delegateLoadingOf(String string) {
        if (string.endsWith(".")) {
            this.notDefinedPackages.addElement(string);
        } else {
            this.notDefinedHere.put(string, this);
        }
    }

    public void setDomain(ProtectionDomain protectionDomain) {
        this.domain = protectionDomain;
    }

    public void setClassPool(ClassPool classPool) {
        this.source = classPool;
    }

    public void addTranslator(ClassPool classPool, Translator translator) throws NotFoundException, CannotCompileException {
        this.source = classPool;
        this.translator = translator;
        translator.start(classPool);
    }

    public static void main(String[] arrstring) throws Throwable {
        Loader loader = new Loader();
        loader.run(arrstring);
    }

    public void run(String[] arrstring) throws Throwable {
        if (arrstring.length >= 1) {
            this.run(arrstring[0], Arrays.copyOfRange(arrstring, 1, arrstring.length));
        }
    }

    public void run(String string, String[] arrstring) throws Throwable {
        Class<?> class_ = this.loadClass(string);
        try {
            class_.getDeclaredMethod("main", String[].class).invoke(null, new Object[]{arrstring});
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected Class<?> loadClass(String string, boolean bl) throws ClassFormatError, ClassNotFoundException {
        String string2 = string = string.intern();
        synchronized (string2) {
            Class<?> class_ = this.findLoadedClass(string);
            if (class_ == null) {
                class_ = this.loadClassByDelegation(string);
            }
            if (class_ == null) {
                class_ = this.findClass(string);
            }
            if (class_ == null) {
                class_ = this.delegateToParent(string);
            }
            if (bl) {
                this.resolveClass(class_);
            }
            return class_;
        }
    }

    @Override
    protected Class<?> findClass(String string) throws ClassNotFoundException {
        Object object;
        byte[] arrby;
        block11: {
            try {
                if (this.source != null) {
                    if (this.translator != null) {
                        this.translator.onLoad(this.source, string);
                    }
                    try {
                        arrby = this.source.get(string).toBytecode();
                        break block11;
                    }
                    catch (NotFoundException notFoundException) {
                        return null;
                    }
                }
                String string2 = "/" + string.replace('.', '/') + ".class";
                object = this.getClass().getResourceAsStream(string2);
                if (object == null) {
                    return null;
                }
                arrby = ClassPoolTail.readStream((InputStream)object);
            }
            catch (Exception exception) {
                throw new ClassNotFoundException("caught an exception while obtaining a class file for " + string, exception);
            }
        }
        int n6 = string.lastIndexOf(46);
        if (n6 != -1 && this.isDefinedPackage((String)(object = string.substring(0, n6)))) {
            try {
                this.definePackage((String)object, null, null, null, null, null, null, null);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (this.domain == null) {
            return this.defineClass(string, arrby, 0, arrby.length);
        }
        return this.defineClass(string, arrby, 0, arrby.length, this.domain);
    }

    private boolean isDefinedPackage(String string) {
        if (ClassFile.MAJOR_VERSION >= 53) {
            return this.getDefinedPackage(string) == null;
        }
        return this.getPackage(string) == null;
    }

    protected Class<?> loadClassByDelegation(String string) throws ClassNotFoundException {
        Class<?> class_ = null;
        if (this.doDelegation && (string.startsWith("java.") || string.startsWith("javax.") || string.startsWith("sun.") || string.startsWith("com.sun.") || string.startsWith("org.w3c.") || string.startsWith("org.xml.") || this.notDelegated(string))) {
            class_ = this.delegateToParent(string);
        }
        return class_;
    }

    private boolean notDelegated(String string) {
        if (this.notDefinedHere.containsKey(string)) {
            return true;
        }
        for (String string2 : this.notDefinedPackages) {
            if (!string.startsWith(string2)) continue;
            return true;
        }
        return false;
    }

    protected Class<?> delegateToParent(String string) throws ClassNotFoundException {
        ClassLoader classLoader = this.getParent();
        if (classLoader != null) {
            return classLoader.loadClass(string);
        }
        return this.findSystemClass(string);
    }
}

