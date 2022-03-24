/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.reflect;

import java.io.PrintStream;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.tools.reflect.CompiledClass;
import javassist.tools.reflect.Reflection;

public class Compiler {
    public static void main(String[] arrstring) throws Exception {
        if (arrstring.length == 0) {
            Compiler.help(System.err);
            return;
        }
        CompiledClass[] arrcompiledClass = new CompiledClass[arrstring.length];
        int n6 = Compiler.parse(arrstring, arrcompiledClass);
        if (n6 < 1) {
            System.err.println("bad parameter.");
            return;
        }
        Compiler.processClasses(arrcompiledClass, n6);
    }

    private static void processClasses(CompiledClass[] arrcompiledClass, int n6) throws Exception {
        int n10;
        Reflection reflection = new Reflection();
        ClassPool classPool = ClassPool.getDefault();
        reflection.start(classPool);
        for (n10 = 0; n10 < n6; ++n10) {
            CtClass ctClass = classPool.get(arrcompiledClass[n10].classname);
            if (arrcompiledClass[n10].metaobject != null || arrcompiledClass[n10].classobject != null) {
                String string = arrcompiledClass[n10].metaobject == null ? "a.uf" : arrcompiledClass[n10].metaobject;
                String string2 = arrcompiledClass[n10].classobject == null ? "a.AT" : arrcompiledClass[n10].classobject;
                if (!reflection.makeReflective(ctClass, classPool.get(string), classPool.get(string2))) {
                    System.err.println("Warning: " + ctClass.getName() + " is reflective.  It was not changed.");
                }
                System.err.println(ctClass.getName() + ": " + string + ", " + string2);
                continue;
            }
            System.err.println(ctClass.getName() + ": not reflective");
        }
        for (n10 = 0; n10 < n6; ++n10) {
            reflection.onLoad(classPool, arrcompiledClass[n10].classname);
            classPool.get(arrcompiledClass[n10].classname).writeFile();
        }
    }

    private static int parse(String[] arrstring, CompiledClass[] arrcompiledClass) {
        int n6 = -1;
        for (int k = 0; k < arrstring.length; ++k) {
            String string = arrstring[k];
            if (string.equals("-m")) {
                if (n6 < 0 || k + 1 > arrstring.length) {
                    return -1;
                }
                arrcompiledClass[n6].metaobject = arrstring[++k];
                continue;
            }
            if (string.equals("-c")) {
                if (n6 < 0 || k + 1 > arrstring.length) {
                    return -1;
                }
                arrcompiledClass[n6].classobject = arrstring[++k];
                continue;
            }
            if (string.charAt(0) == '-') {
                return -1;
            }
            CompiledClass compiledClass = new CompiledClass();
            compiledClass.classname = string;
            compiledClass.metaobject = null;
            compiledClass.classobject = null;
            arrcompiledClass[++n6] = compiledClass;
        }
        return n6 + 1;
    }

    private static void help(PrintStream printStream) {
        printStream.println("Usage: java javassist.tools.reflect.Compiler");
        printStream.println("            (<class> [-m <metaobject>] [-c <class metaobject>])+");
    }
}

