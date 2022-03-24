/*
 * Decompiled with CFR 0.150.
 */
package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.TypeAnnotationNode;

public class TryCatchBlockNode {
    public LabelNode start;
    public LabelNode end;
    public LabelNode handler;
    public String type;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;

    public TryCatchBlockNode(LabelNode start, LabelNode end, LabelNode handler, String type) {
        this.start = start;
        this.end = end;
        this.handler = handler;
        this.type = type;
    }

    public void updateIndex(int index) {
        int i10;
        int n6;
        int newTypeRef = 0x42000000 | index << 8;
        if (this.visibleTypeAnnotations != null) {
            n6 = this.visibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                this.visibleTypeAnnotations.get((int)i10).typeRef = newTypeRef;
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            n6 = this.invisibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                this.invisibleTypeAnnotations.get((int)i10).typeRef = newTypeRef;
            }
        }
    }

    public void accept(MethodVisitor methodVisitor) {
        TypeAnnotationNode typeAnnotation;
        int i10;
        int n6;
        methodVisitor.visitTryCatchBlock(this.start.getLabel(), this.end.getLabel(), this.handler == null ? null : this.handler.getLabel(), this.type);
        if (this.visibleTypeAnnotations != null) {
            n6 = this.visibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                typeAnnotation = this.visibleTypeAnnotations.get(i10);
                typeAnnotation.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            n6 = this.invisibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                typeAnnotation = this.invisibleTypeAnnotations.get(i10);
                typeAnnotation.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
            }
        }
    }
}

