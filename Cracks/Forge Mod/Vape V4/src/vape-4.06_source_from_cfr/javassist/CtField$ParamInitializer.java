/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField$Initializer;
import javassist.bytecode.Bytecode;
import javassist.bytecode.Descriptor;
import javassist.compiler.Javac;

class CtField$ParamInitializer
extends CtField$Initializer {
    int nthParam;

    CtField$ParamInitializer() {
    }

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        if (arrctClass != null && this.nthParam < arrctClass.length) {
            bytecode.addAload(0);
            int n6 = CtField$ParamInitializer.nthParamToLocal(this.nthParam, arrctClass, false);
            int n10 = bytecode.addLoad(n6, ctClass) + 1;
            bytecode.addPutfield(Bytecode.THIS, string, Descriptor.of(ctClass));
            return n10;
        }
        return 0;
    }

    static int nthParamToLocal(int n6, CtClass[] arrctClass, boolean bl) {
        CtClass ctClass = CtClass.longType;
        CtClass ctClass2 = CtClass.doubleType;
        int n10 = bl ? 0 : 1;
        for (int k = 0; k < n6; ++k) {
            CtClass ctClass3 = arrctClass[k];
            if (ctClass3 == ctClass || ctClass3 == ctClass2) {
                n10 += 2;
                continue;
            }
            ++n10;
        }
        return n10;
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        return 0;
    }
}

