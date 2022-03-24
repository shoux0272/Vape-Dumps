/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.DataOutputStream;
import java.io.IOException;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtClassType;
import javassist.CtConstructor;
import javassist.CtNewConstructor;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.ClassFile;

class CtNewClass
extends CtClassType {
    protected boolean hasConstructor;

    CtNewClass(String string, ClassPool classPool, boolean bl, CtClass ctClass) {
        super(string, classPool);
        this.wasChanged = true;
        String string2 = bl || ctClass == null ? null : ctClass.getName();
        this.classfile = new ClassFile(bl, string, string2);
        if (bl && ctClass != null) {
            this.classfile.setInterfaces(new String[]{ctClass.getName()});
        }
        this.setModifiers(Modifier.setPublic(this.getModifiers()));
        this.hasConstructor = bl;
    }

    @Override
    protected void extendToString(StringBuffer stringBuffer) {
        if (this.hasConstructor) {
            stringBuffer.append("hasConstructor ");
        }
        super.extendToString(stringBuffer);
    }

    @Override
    public void addConstructor(CtConstructor ctConstructor) throws CannotCompileException {
        this.hasConstructor = true;
        super.addConstructor(ctConstructor);
    }

    @Override
    public void toBytecode(DataOutputStream dataOutputStream) throws CannotCompileException, IOException {
        if (!this.hasConstructor) {
            try {
                this.inheritAllConstructors();
                this.hasConstructor = true;
            }
            catch (NotFoundException notFoundException) {
                throw new CannotCompileException(notFoundException);
            }
        }
        super.toBytecode(dataOutputStream);
    }

    public void inheritAllConstructors() throws CannotCompileException, NotFoundException {
        CtClass ctClass = this.getSuperclass();
        CtConstructor[] arrctConstructor = ctClass.getDeclaredConstructors();
        int n6 = 0;
        for (int k = 0; k < arrctConstructor.length; ++k) {
            CtConstructor ctConstructor = arrctConstructor[k];
            int n10 = ctConstructor.getModifiers();
            if (!this.isInheritable(n10, ctClass)) continue;
            CtConstructor ctConstructor2 = CtNewConstructor.make(ctConstructor.getParameterTypes(), ctConstructor.getExceptionTypes(), this);
            ctConstructor2.setModifiers(n10 & 7);
            this.addConstructor(ctConstructor2);
            ++n6;
        }
        if (n6 < 1) {
            throw new CannotCompileException("no inheritable constructor in " + ctClass.getName());
        }
    }

    private boolean isInheritable(int n6, CtClass ctClass) {
        if (Modifier.isPrivate(n6)) {
            return false;
        }
        if (Modifier.isPackage(n6)) {
            String string = this.getPackageName();
            String string2 = ctClass.getPackageName();
            if (string == null) {
                return string2 == null;
            }
            return string.equals(string2);
        }
        return true;
    }
}

