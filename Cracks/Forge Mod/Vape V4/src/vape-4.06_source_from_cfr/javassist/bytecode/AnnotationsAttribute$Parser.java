/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.AnnotationsAttribute$Walker;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.AnnotationMemberValue;
import javassist.bytecode.annotation.ArrayMemberValue;
import javassist.bytecode.annotation.BooleanMemberValue;
import javassist.bytecode.annotation.ByteMemberValue;
import javassist.bytecode.annotation.CharMemberValue;
import javassist.bytecode.annotation.ClassMemberValue;
import javassist.bytecode.annotation.DoubleMemberValue;
import javassist.bytecode.annotation.EnumMemberValue;
import javassist.bytecode.annotation.FloatMemberValue;
import javassist.bytecode.annotation.IntegerMemberValue;
import javassist.bytecode.annotation.LongMemberValue;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.ShortMemberValue;
import javassist.bytecode.annotation.StringMemberValue;

class AnnotationsAttribute$Parser
extends AnnotationsAttribute$Walker {
    ConstPool pool;
    Annotation[][] allParams;
    Annotation[] allAnno;
    Annotation currentAnno;
    MemberValue currentMember;

    AnnotationsAttribute$Parser(byte[] arrby, ConstPool constPool) {
        super(arrby);
        this.pool = constPool;
    }

    Annotation[][] parseParameters() throws Exception {
        this.parameters();
        return this.allParams;
    }

    Annotation[] parseAnnotations() throws Exception {
        this.annotationArray();
        return this.allAnno;
    }

    MemberValue parseMemberValue() throws Exception {
        this.memberValue(0);
        return this.currentMember;
    }

    @Override
    void parameters(int n6, int n10) throws Exception {
        Annotation[][] arrarrannotation = new Annotation[n6][];
        for (int k = 0; k < n6; ++k) {
            n10 = this.annotationArray(n10);
            arrarrannotation[k] = this.allAnno;
        }
        this.allParams = arrarrannotation;
    }

    @Override
    int annotationArray(int n6, int n10) throws Exception {
        Annotation[] arrannotation = new Annotation[n10];
        for (int k = 0; k < n10; ++k) {
            n6 = this.annotation(n6);
            arrannotation[k] = this.currentAnno;
        }
        this.allAnno = arrannotation;
        return n6;
    }

    @Override
    int annotation(int n6, int n10, int n11) throws Exception {
        this.currentAnno = new Annotation(n10, this.pool);
        return super.annotation(n6, n10, n11);
    }

    @Override
    int memberValuePair(int n6, int n10) throws Exception {
        n6 = super.memberValuePair(n6, n10);
        this.currentAnno.addMemberValue(n10, this.currentMember);
        return n6;
    }

    @Override
    void constValueMember(int n6, int n10) throws Exception {
        MemberValue memberValue;
        ConstPool constPool = this.pool;
        switch (n6) {
            case 66: {
                memberValue = new ByteMemberValue(n10, constPool);
                break;
            }
            case 67: {
                memberValue = new CharMemberValue(n10, constPool);
                break;
            }
            case 68: {
                memberValue = new DoubleMemberValue(n10, constPool);
                break;
            }
            case 70: {
                memberValue = new FloatMemberValue(n10, constPool);
                break;
            }
            case 73: {
                memberValue = new IntegerMemberValue(n10, constPool);
                break;
            }
            case 74: {
                memberValue = new LongMemberValue(n10, constPool);
                break;
            }
            case 83: {
                memberValue = new ShortMemberValue(n10, constPool);
                break;
            }
            case 90: {
                memberValue = new BooleanMemberValue(n10, constPool);
                break;
            }
            case 115: {
                memberValue = new StringMemberValue(n10, constPool);
                break;
            }
            default: {
                throw new RuntimeException("unknown tag:" + n6);
            }
        }
        this.currentMember = memberValue;
        super.constValueMember(n6, n10);
    }

    @Override
    void enumMemberValue(int n6, int n10, int n11) throws Exception {
        this.currentMember = new EnumMemberValue(n10, n11, this.pool);
        super.enumMemberValue(n6, n10, n11);
    }

    @Override
    void classMemberValue(int n6, int n10) throws Exception {
        this.currentMember = new ClassMemberValue(n10, this.pool);
        super.classMemberValue(n6, n10);
    }

    @Override
    int annotationMemberValue(int n6) throws Exception {
        Annotation annotation = this.currentAnno;
        n6 = super.annotationMemberValue(n6);
        this.currentMember = new AnnotationMemberValue(this.currentAnno, this.pool);
        this.currentAnno = annotation;
        return n6;
    }

    @Override
    int arrayMemberValue(int n6, int n10) throws Exception {
        ArrayMemberValue arrayMemberValue = new ArrayMemberValue(this.pool);
        MemberValue[] arrmemberValue = new MemberValue[n10];
        for (int k = 0; k < n10; ++k) {
            n6 = this.memberValue(n6);
            arrmemberValue[k] = this.currentMember;
        }
        arrayMemberValue.setValue(arrmemberValue);
        this.currentMember = arrayMemberValue;
        return n6;
    }
}

