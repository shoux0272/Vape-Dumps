/*
 * Decompiled with CFR 0.150.
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.ModuleVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ModuleNode;
import org.objectweb.asm.tree.RecordComponentNode;
import org.objectweb.asm.tree.TypeAnnotationNode;
import org.objectweb.asm.tree.UnsupportedClassVersionException;
import org.objectweb.asm.tree.Util;

public class ClassNode
extends ClassVisitor {
    public int version;
    public int access;
    public String name;
    public String signature;
    public String superName;
    public List<String> interfaces = new ArrayList<String>();
    public String sourceFile;
    public String sourceDebug;
    public ModuleNode module;
    public String outerClass;
    public String outerMethod;
    public String outerMethodDesc;
    public List<AnnotationNode> visibleAnnotations;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<Attribute> attrs;
    public List<InnerClassNode> innerClasses = new ArrayList<InnerClassNode>();
    public String nestHostClass;
    public List<String> nestMembers;
    public List<String> permittedSubclasses;
    public List<RecordComponentNode> recordComponents;
    public List<FieldNode> fields = new ArrayList<FieldNode>();
    public List<MethodNode> methods = new ArrayList<MethodNode>();

    public ClassNode() {
        this(589824);
        if (this.getClass() != ClassNode.class) {
            throw new IllegalStateException();
        }
    }

    public ClassNode(int api) {
        super(api);
    }

    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        this.version = version;
        this.access = access;
        this.name = name;
        this.signature = signature;
        this.superName = superName;
        this.interfaces = Util.asArrayList(interfaces);
    }

    public void visitSource(String file, String debug) {
        this.sourceFile = file;
        this.sourceDebug = debug;
    }

    public ModuleVisitor visitModule(String name, int access, String version) {
        this.module = new ModuleNode(name, access, version);
        return this.module;
    }

    public void visitNestHost(String nestHost) {
        this.nestHostClass = nestHost;
    }

    public void visitOuterClass(String owner, String name, String descriptor) {
        this.outerClass = owner;
        this.outerMethod = name;
        this.outerMethodDesc = descriptor;
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

    public void visitNestMember(String nestMember) {
        this.nestMembers = Util.add(this.nestMembers, nestMember);
    }

    public void visitPermittedSubclass(String permittedSubclass) {
        this.permittedSubclasses = Util.add(this.permittedSubclasses, permittedSubclass);
    }

    public void visitInnerClass(String name, String outerName, String innerName, int access) {
        InnerClassNode innerClass = new InnerClassNode(name, outerName, innerName, access);
        this.innerClasses.add(innerClass);
    }

    public RecordComponentVisitor visitRecordComponent(String name, String descriptor, String signature) {
        RecordComponentNode recordComponent = new RecordComponentNode(name, descriptor, signature);
        this.recordComponents = Util.add(this.recordComponents, recordComponent);
        return recordComponent;
    }

    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        FieldNode field = new FieldNode(access, name, descriptor, signature, value);
        this.fields.add(field);
        return field;
    }

    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodNode method = new MethodNode(access, name, descriptor, signature, exceptions);
        this.methods.add(method);
        return method;
    }

    public void visitEnd() {
    }

    public void check(int api) {
        int i10;
        if (api < 589824 && this.permittedSubclasses != null) {
            throw new UnsupportedClassVersionException();
        }
        if (api < 524288 && ((this.access & 0x10000) != 0 || this.recordComponents != null)) {
            throw new UnsupportedClassVersionException();
        }
        if (api < 458752 && (this.nestHostClass != null || this.nestMembers != null)) {
            throw new UnsupportedClassVersionException();
        }
        if (api < 393216 && this.module != null) {
            throw new UnsupportedClassVersionException();
        }
        if (api < 327680) {
            if (this.visibleTypeAnnotations != null && !this.visibleTypeAnnotations.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            if (this.invisibleTypeAnnotations != null && !this.invisibleTypeAnnotations.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
        }
        if (this.visibleAnnotations != null) {
            for (i10 = this.visibleAnnotations.size() - 1; i10 >= 0; --i10) {
                this.visibleAnnotations.get(i10).check(api);
            }
        }
        if (this.invisibleAnnotations != null) {
            for (i10 = this.invisibleAnnotations.size() - 1; i10 >= 0; --i10) {
                this.invisibleAnnotations.get(i10).check(api);
            }
        }
        if (this.visibleTypeAnnotations != null) {
            for (i10 = this.visibleTypeAnnotations.size() - 1; i10 >= 0; --i10) {
                this.visibleTypeAnnotations.get(i10).check(api);
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            for (i10 = this.invisibleTypeAnnotations.size() - 1; i10 >= 0; --i10) {
                this.invisibleTypeAnnotations.get(i10).check(api);
            }
        }
        if (this.recordComponents != null) {
            for (i10 = this.recordComponents.size() - 1; i10 >= 0; --i10) {
                this.recordComponents.get(i10).check(api);
            }
        }
        for (i10 = this.fields.size() - 1; i10 >= 0; --i10) {
            this.fields.get(i10).check(api);
        }
        for (i10 = this.methods.size() - 1; i10 >= 0; --i10) {
            this.methods.get(i10).check(api);
        }
    }

    public void accept(ClassVisitor classVisitor) {
        TypeAnnotationNode typeAnnotation;
        AnnotationNode annotation;
        int i10;
        int n6;
        String[] interfacesArray = new String[this.interfaces.size()];
        this.interfaces.toArray(interfacesArray);
        classVisitor.visit(this.version, this.access, this.name, this.signature, this.superName, interfacesArray);
        if (this.sourceFile != null || this.sourceDebug != null) {
            classVisitor.visitSource(this.sourceFile, this.sourceDebug);
        }
        if (this.module != null) {
            this.module.accept(classVisitor);
        }
        if (this.nestHostClass != null) {
            classVisitor.visitNestHost(this.nestHostClass);
        }
        if (this.outerClass != null) {
            classVisitor.visitOuterClass(this.outerClass, this.outerMethod, this.outerMethodDesc);
        }
        if (this.visibleAnnotations != null) {
            n6 = this.visibleAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                annotation = this.visibleAnnotations.get(i10);
                annotation.accept(classVisitor.visitAnnotation(annotation.desc, true));
            }
        }
        if (this.invisibleAnnotations != null) {
            n6 = this.invisibleAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                annotation = this.invisibleAnnotations.get(i10);
                annotation.accept(classVisitor.visitAnnotation(annotation.desc, false));
            }
        }
        if (this.visibleTypeAnnotations != null) {
            n6 = this.visibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                typeAnnotation = this.visibleTypeAnnotations.get(i10);
                typeAnnotation.accept(classVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            n6 = this.invisibleTypeAnnotations.size();
            for (i10 = 0; i10 < n6; ++i10) {
                typeAnnotation = this.invisibleTypeAnnotations.get(i10);
                typeAnnotation.accept(classVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
            }
        }
        if (this.attrs != null) {
            n6 = this.attrs.size();
            for (i10 = 0; i10 < n6; ++i10) {
                classVisitor.visitAttribute(this.attrs.get(i10));
            }
        }
        if (this.nestMembers != null) {
            n6 = this.nestMembers.size();
            for (i10 = 0; i10 < n6; ++i10) {
                classVisitor.visitNestMember(this.nestMembers.get(i10));
            }
        }
        if (this.permittedSubclasses != null) {
            n6 = this.permittedSubclasses.size();
            for (i10 = 0; i10 < n6; ++i10) {
                classVisitor.visitPermittedSubclass(this.permittedSubclasses.get(i10));
            }
        }
        n6 = this.innerClasses.size();
        for (i10 = 0; i10 < n6; ++i10) {
            this.innerClasses.get(i10).accept(classVisitor);
        }
        if (this.recordComponents != null) {
            n6 = this.recordComponents.size();
            for (i10 = 0; i10 < n6; ++i10) {
                this.recordComponents.get(i10).accept(classVisitor);
            }
        }
        n6 = this.fields.size();
        for (i10 = 0; i10 < n6; ++i10) {
            this.fields.get(i10).accept(classVisitor);
        }
        n6 = this.methods.size();
        for (i10 = 0; i10 < n6; ++i10) {
            this.methods.get(i10).accept(classVisitor);
        }
        classVisitor.visitEnd();
    }
}

