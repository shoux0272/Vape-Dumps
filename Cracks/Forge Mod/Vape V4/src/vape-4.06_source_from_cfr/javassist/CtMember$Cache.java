/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CtClassType;
import javassist.CtMember;

class CtMember$Cache
extends CtMember {
    private CtMember methodTail = this;
    private CtMember consTail = this;
    private CtMember fieldTail = this;

    @Override
    protected void extendToString(StringBuffer stringBuffer) {
    }

    @Override
    public boolean hasAnnotation(String string) {
        return false;
    }

    @Override
    public Object getAnnotation(Class<?> class_) throws ClassNotFoundException {
        return null;
    }

    @Override
    public Object[] getAnnotations() throws ClassNotFoundException {
        return null;
    }

    @Override
    public byte[] getAttribute(String string) {
        return null;
    }

    @Override
    public Object[] getAvailableAnnotations() {
        return null;
    }

    @Override
    public int getModifiers() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getSignature() {
        return null;
    }

    @Override
    public void setAttribute(String string, byte[] arrby) {
    }

    @Override
    public void setModifiers(int n6) {
    }

    @Override
    public String getGenericSignature() {
        return null;
    }

    @Override
    public void setGenericSignature(String string) {
    }

    CtMember$Cache(CtClassType ctClassType) {
        super(ctClassType);
        this.fieldTail.next = this;
    }

    CtMember methodHead() {
        return this;
    }

    CtMember lastMethod() {
        return this.methodTail;
    }

    CtMember consHead() {
        return this.methodTail;
    }

    CtMember lastCons() {
        return this.consTail;
    }

    CtMember fieldHead() {
        return this.consTail;
    }

    CtMember lastField() {
        return this.fieldTail;
    }

    void addMethod(CtMember ctMember) {
        ctMember.next = this.methodTail.next;
        this.methodTail.next = ctMember;
        if (this.methodTail == this.consTail) {
            this.consTail = ctMember;
            if (this.methodTail == this.fieldTail) {
                this.fieldTail = ctMember;
            }
        }
        this.methodTail = ctMember;
    }

    void addConstructor(CtMember ctMember) {
        ctMember.next = this.consTail.next;
        this.consTail.next = ctMember;
        if (this.consTail == this.fieldTail) {
            this.fieldTail = ctMember;
        }
        this.consTail = ctMember;
    }

    void addField(CtMember ctMember) {
        ctMember.next = this;
        this.fieldTail.next = ctMember;
        this.fieldTail = ctMember;
    }

    static int count(CtMember ctMember, CtMember ctMember2) {
        int n6 = 0;
        while (ctMember != ctMember2) {
            ++n6;
            ctMember = ctMember.next;
        }
        return n6;
    }

    void remove(CtMember ctMember) {
        CtMember ctMember2;
        CtMember ctMember3 = this;
        while ((ctMember2 = ctMember3.next) != this) {
            if (ctMember2 == ctMember) {
                ctMember3.next = ctMember2.next;
                if (ctMember2 == this.methodTail) {
                    this.methodTail = ctMember3;
                }
                if (ctMember2 == this.consTail) {
                    this.consTail = ctMember3;
                }
                if (ctMember2 != this.fieldTail) break;
                this.fieldTail = ctMember3;
                break;
            }
            ctMember3 = ctMember3.next;
        }
    }
}

