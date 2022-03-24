/*
 * Decompiled with CFR 0.150.
 */
package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.TypeAnnotationNode;
import org.objectweb.asm.tree.UnsupportedClassVersionException;
import org.objectweb.asm.tree.Util;

public class FieldNode
extends FieldVisitor {
    public int access;
    public String name;
    public String desc;
    public String signature;
    public Object value;
    public List<AnnotationNode> visibleAnnotations;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<Attribute> attrs;

    public FieldNode(int access, String name, String descriptor, String signature, Object value) {
        this(589824, access, name, descriptor, signature, value);
        if (this.getClass() != FieldNode.class) {
            throw new IllegalStateException();
        }
    }

    public FieldNode(int api, int access, String name, String descriptor, String signature, Object value) {
        super(api);
        this.access = access;
        this.name = name;
        this.desc = descriptor;
        this.signature = signature;
        this.value = value;
    }

    public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
        AnnotationNode annotation = new AnnotationNode(descriptor);
        if (visible) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotation);
        } else {
            this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotation);
        }
        return annotation;
    }

    public AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
        TypeAnnotationNode typeAnnotation = new TypeAnnotationNode(typeRef, typePath, descriptor);
        if (visible) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotation);
        } else {
            this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotation);
        }
        return typeAnnotation;
    }

    public void visitAttribute(Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }

    public void visitEnd() {
    }

    public void check(int api) {
        if (api == 262144) {
            if (this.visibleTypeAnnotations != null && !this.visibleTypeAnnotations.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            if (this.invisibleTypeAnnotations != null && !this.invisibleTypeAnnotations.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
        }
    }

    public void accept(ClassVisitor classVisitor) {
        TypeAnnotationNode typeAnnotation;
        AnnotationNode annotation;
        int i10;
        int n6;
        FieldVisitor fieldVisitor = classVisitor.visitField(this.access, this.name, this.desc, this.signature, this.value);
        if (fieldVisitor == null) {
            return;
        }
        if (this.visibleAnnotations != null) {
            n6 = this.visibleAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                annotation = this.visibleAnnotations.get(i10);
                annotation.accept(fieldVisitor.visitAnnotation(annotation.desc, true));
            }
        }
        if (this.invisibleAnnotations != null) {
            n6 = this.invisibleAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                annotation = this.invisibleAnnotations.get(i10);
                annotation.accept(fieldVisitor.visitAnnotation(annotation.desc, false));
            }
        }
        if (this.visibleTypeAnnotations != null) {
            n6 = this.visibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                typeAnnotation = this.visibleTypeAnnotations.get(i10);
                typeAnnotation.accept(fieldVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            n6 = this.invisibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                typeAnnotation = this.invisibleTypeAnnotations.get(i10);
                typeAnnotation.accept(fieldVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
            }
        }
        if (this.attrs != null) {
            n6 = this.attrs.size();
            for (i10 = 0; i10 < n6; ++i10) {
                fieldVisitor.visitAttribute(this.attrs.get(i10));
            }
        }
        fieldVisitor.visitEnd();
    }
}

