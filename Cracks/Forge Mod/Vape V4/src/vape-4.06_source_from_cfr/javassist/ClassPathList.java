/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.ClassPath;

final class ClassPathList {
    ClassPathList next;
    ClassPath path;

    ClassPathList(ClassPath classPath, ClassPathList classPathList) {
        this.next = classPathList;
        this.path = classPath;
    }
}

