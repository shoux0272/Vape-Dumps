/*
 * Decompiled with CFR 0.150.
 */
package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.TypeAnnotationNode;
import org.objectweb.asm.tree.UnsupportedClassVersionException;
import org.objectweb.asm.tree.Util;

public class RecordComponentNode
extends RecordComponentVisitor {
    public String name;
    public String descriptor;
    public String signature;
    public List<AnnotationNode> visibleAnnotations;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<Attribute> attrs;

    public RecordComponentNode(String name, String descriptor, String signature) {
        this(589824, name, descriptor, signature);
        if (this.getClass() != RecordComponentNode.class) {
            throw new IllegalStateException();
        }
    }

    public RecordComponentNode(int api, String name, String descriptor, String signature) {
        super(api);
        this.name = name;
        this.descriptor = descriptor;
        this.signature = signature;
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
        if (api < 524288) {
            throw new UnsupportedClassVersionException();
        }
    }

    public void accept(ClassVisitor classVisitor) {
        TypeAnnotationNode typeAnnotation;
        AnnotationNode annotation;
        int i10;
        int n6;
        RecordComponentVisitor recordComponentVisitor = classVisitor.visitRecordComponent(this.name, this.descriptor, this.signature);
        if (recordComponentVisitor == null) {
            return;
        }
        if (this.visibleAnnotations != null) {
            n6 = this.visibleAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                annotation = this.visibleAnnotations.get(i10);
                annotation.accept(recordComponentVisitor.visitAnnotation(annotation.desc, true));
            }
        }
        if (this.invisibleAnnotations != null) {
            n6 = this.invisibleAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                annotation = this.invisibleAnnotations.get(i10);
                annotation.accept(recordComponentVisitor.visitAnnotation(annotation.desc, false));
            }
        }
        if (this.visibleTypeAnnotations != null) {
            n6 = this.visibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                typeAnnotation = this.visibleTypeAnnotations.get(i10);
                typeAnnotation.accept(recordComponentVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            n6 = this.invisibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                typeAnnotation = this.invisibleTypeAnnotations.get(i10);
                typeAnnotation.accept(recordComponentVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
            }
        }
        if (this.attrs != null) {
            n6 = this.attrs.size();
            for (i10 = 0; i10 < n6; ++i10) {
                recordComponentVisitor.visitAttribute(this.attrs.get(i10));
            }
        }
        recordComponentVisitor.visitEnd();
    }
}

