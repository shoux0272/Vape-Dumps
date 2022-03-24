/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.util.List;
import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtClassType;
import javassist.CtField$Initializer;
import javassist.CtMember;
import javassist.NotFoundException;
import javassist.bytecode.AccessFlag;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ClassFile;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.SignatureAttribute;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.compiler.ast.ASTree;

public class CtField
extends CtMember {
    static final String javaLangString = "java.lang.String";
    protected FieldInfo fieldInfo;

    public CtField(CtClass ctClass, String string, CtClass ctClass2) throws CannotCompileException {
        this(Descriptor.of(ctClass), string, ctClass2);
    }

    public CtField(CtField ctField, CtClass ctClass) throws CannotCompileException {
        this(ctField.fieldInfo.getDescriptor(), ctField.fieldInfo.getName(), ctClass);
        FieldInfo fieldInfo = this.fieldInfo;
        fieldInfo.setAccessFlags(ctField.fieldInfo.getAccessFlags());
        ConstPool constPool = fieldInfo.getConstPool();
        List<AttributeInfo> list = ctField.fieldInfo.getAttributes();
        for (AttributeInfo attributeInfo : list) {
            fieldInfo.addAttribute(attributeInfo.copy(constPool, null));
        }
    }

    private CtField(String string, String string2, CtClass ctClass) throws CannotCompileException {
        super(ctClass);
        ClassFile classFile = ctClass.getClassFile2();
        if (classFile == null) {
            throw new CannotCompileException("bad declaring class: " + ctClass.getName());
        }
        this.fieldInfo = new FieldInfo(classFile.getConstPool(), string2, string);
    }

    CtField(FieldInfo fieldInfo, CtClass ctClass) {
        super(ctClass);
        this.fieldInfo = fieldInfo;
    }

    @Override
    public String toString() {
        return this.getDeclaringClass().getName() + "." + this.getName() + ":" + this.fieldInfo.getDescriptor();
    }

    @Override
    protected void extendToString(StringBuffer stringBuffer) {
        stringBuffer.append(' ');
        stringBuffer.append(this.getName());
        stringBuffer.append(' ');
        stringBuffer.append(this.fieldInfo.getDescriptor());
    }

    protected ASTree getInitAST() {
        return null;
    }

    CtField$Initializer getInit() {
        ASTree aSTree = this.getInitAST();
        if (aSTree == null) {
            return null;
        }
        return CtField$Initializer.byExpr(aSTree);
    }

    public static CtField make(String string, CtClass ctClass) throws CannotCompileException {
        Javac javac = new Javac(ctClass);
        try {
            CtMember ctMember = javac.compile(string);
            if (ctMember instanceof CtField) {
                return (CtField)ctMember;
            }
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        throw new CannotCompileException("not a field");
    }

    public FieldInfo getFieldInfo() {
        this.b.checkModify();
        return this.fieldInfo;
    }

    public FieldInfo getFieldInfo2() {
        return this.fieldInfo;
    }

    @Override
    public CtClass getDeclaringClass() {
        return super.getDeclaringClass();
    }

    @Override
    public String getName() {
        return this.fieldInfo.getName();
    }

    public void setName(String string) {
        this.b.checkModify();
        this.fieldInfo.setName(string);
    }

    @Override
    public int getModifiers() {
        return AccessFlag.toModifier(this.fieldInfo.getAccessFlags());
    }

    @Override
    public void setModifiers(int n6) {
        this.b.checkModify();
        this.fieldInfo.setAccessFlags(AccessFlag.of(n6));
    }

    @Override
    public boolean hasAnnotation(String string) {
        FieldInfo fieldInfo = this.getFieldInfo2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)fieldInfo.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)fieldInfo.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.hasAnnotationType(string, this.getDeclaringClass().getClassPool(), annotationsAttribute, annotationsAttribute2);
    }

    @Override
    public Object getAnnotation(Class<?> class_) throws ClassNotFoundException {
        FieldInfo fieldInfo = this.getFieldInfo2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)fieldInfo.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)fieldInfo.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.getAnnotationType(class_, this.getDeclaringClass().getClassPool(), annotationsAttribute, annotationsAttribute2);
    }

    @Override
    public Object[] getAnnotations() throws ClassNotFoundException {
        return this.getAnnotations(false);
    }

    @Override
    public Object[] getAvailableAnnotations() {
        try {
            return this.getAnnotations(true);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("Unexpected exception", classNotFoundException);
        }
    }

    private Object[] getAnnotations(boolean bl) throws ClassNotFoundException {
        FieldInfo fieldInfo = this.getFieldInfo2();
        AnnotationsAttribute annotationsAttribute = (AnnotationsAttribute)fieldInfo.getAttribute("RuntimeInvisibleAnnotations");
        AnnotationsAttribute annotationsAttribute2 = (AnnotationsAttribute)fieldInfo.getAttribute("RuntimeVisibleAnnotations");
        return CtClassType.toAnnotationType(bl, this.getDeclaringClass().getClassPool(), annotationsAttribute, annotationsAttribute2);
    }

    @Override
    public String getSignature() {
        return this.fieldInfo.getDescriptor();
    }

    @Override
    public String getGenericSignature() {
        SignatureAttribute signatureAttribute = (SignatureAttribute)this.fieldInfo.getAttribute("Signature");
        return signatureAttribute == null ? null : signatureAttribute.getSignature();
    }

    @Override
    public void setGenericSignature(String string) {
        this.b.checkModify();
        this.fieldInfo.addAttribute(new SignatureAttribute(this.fieldInfo.getConstPool(), string));
    }

    public CtClass getType() throws NotFoundException {
        return Descriptor.toCtClass(this.fieldInfo.getDescriptor(), this.b.getClassPool());
    }

    public void setType(CtClass ctClass) {
        this.b.checkModify();
        this.fieldInfo.setDescriptor(Descriptor.of(ctClass));
    }

    public Object getConstantValue() {
        int n6 = this.fieldInfo.getConstantValue();
        if (n6 == 0) {
            return null;
        }
        ConstPool constPool = this.fieldInfo.getConstPool();
        switch (constPool.getTag(n6)) {
            case 5: {
                return constPool.getLongInfo(n6);
            }
            case 4: {
                return Float.valueOf(constPool.getFloatInfo(n6));
            }
            case 6: {
                return constPool.getDoubleInfo(n6);
            }
            case 3: {
                int n10 = constPool.getIntegerInfo(n6);
                if ("Z".equals(this.fieldInfo.getDescriptor())) {
                    return n10 != 0;
                }
                return n10;
            }
            case 8: {
                return constPool.getStringInfo(n6);
            }
        }
        throw new RuntimeException("bad tag: " + constPool.getTag(n6) + " at " + n6);
    }

    @Override
    public byte[] getAttribute(String string) {
        AttributeInfo attributeInfo = this.fieldInfo.getAttribute(string);
        if (attributeInfo == null) {
            return null;
        }
        return attributeInfo.get();
    }

    @Override
    public void setAttribute(String string, byte[] arrby) {
        this.b.checkModify();
        this.fieldInfo.addAttribute(new AttributeInfo(this.fieldInfo.getConstPool(), string, arrby));
    }
}

