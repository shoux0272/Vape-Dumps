/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.ClassFile;
import javassist.bytecode.Descriptor;
import javassist.bytecode.MethodInfo;
import javassist.compiler.CompileError;
import javassist.compiler.MemberResolver$Method;
import javassist.compiler.NoFieldException;
import javassist.compiler.TokenId;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Declarator;
import javassist.compiler.ast.Keyword;
import javassist.compiler.ast.Symbol;

public class MemberResolver
implements TokenId {
    private ClassPool classPool;
    private static final int YES = 0;
    private static final int NO = -1;
    private static final String INVALID = "<invalid>";
    private static Map<ClassPool, Reference<Map<String, String>>> invalidNamesMap = new WeakHashMap<ClassPool, Reference<Map<String, String>>>();
    private Map<String, String> invalidNames = null;

    public MemberResolver(ClassPool classPool) {
        this.classPool = classPool;
    }

    public ClassPool getClassPool() {
        return this.classPool;
    }

    private static void fatal() throws CompileError {
        throw new CompileError("fatal");
    }

    public MemberResolver$Method lookupMethod(CtClass ctClass, CtClass ctClass2, MethodInfo methodInfo, String string, int[] arrn, int[] arrn2, String[] arrstring) throws CompileError {
        MemberResolver$Method memberResolver$Method;
        int n6;
        MemberResolver$Method memberResolver$Method2 = null;
        if (methodInfo != null && ctClass == ctClass2 && methodInfo.getName().equals(string) && (n6 = this.compareSignature(methodInfo.getDescriptor(), arrn, arrn2, arrstring)) != -1) {
            MemberResolver$Method memberResolver$Method3 = new MemberResolver$Method(ctClass, methodInfo, n6);
            if (n6 == 0) {
                return memberResolver$Method3;
            }
            memberResolver$Method2 = memberResolver$Method3;
        }
        if ((memberResolver$Method = this.lookupMethod(ctClass, string, arrn, arrn2, arrstring, memberResolver$Method2 != null)) != null) {
            return memberResolver$Method;
        }
        return memberResolver$Method2;
    }

    private MemberResolver$Method lookupMethod(CtClass ctClass, String string, int[] arrn, int[] arrn2, String[] arrstring, boolean bl) throws CompileError {
        MemberResolver$Method memberResolver$Method = null;
        ClassFile classFile = ctClass.getClassFile2();
        if (classFile != null) {
            List<MethodInfo> list = classFile.getMethods();
            for (MethodInfo object2 : list) {
                int n6;
                if (!object2.getName().equals(string) || (object2.getAccessFlags() & 0x40) != 0 || (n6 = this.compareSignature(object2.getDescriptor(), arrn, arrn2, arrstring)) == -1) continue;
                MemberResolver$Method memberResolver$Method2 = new MemberResolver$Method(ctClass, object2, n6);
                if (n6 == 0) {
                    return memberResolver$Method2;
                }
                if (memberResolver$Method != null && memberResolver$Method.notmatch <= n6) continue;
                memberResolver$Method = memberResolver$Method2;
            }
        }
        if (bl) {
            memberResolver$Method = null;
        } else if (memberResolver$Method != null) {
            return memberResolver$Method;
        }
        int n10 = ctClass.getModifiers();
        boolean bl2 = Modifier.isInterface(n10);
        try {
            MemberResolver$Method memberResolver$Method3;
            CtClass notFoundException;
            if (!bl2 && (notFoundException = ctClass.getSuperclass()) != null && (memberResolver$Method3 = this.lookupMethod(notFoundException, string, arrn, arrn2, arrstring, bl)) != null) {
                return memberResolver$Method3;
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        try {
            MemberResolver$Method memberResolver$Method4;
            CtClass[] arrctClass;
            Object object = arrctClass = ctClass.getInterfaces();
            int n11 = ((CtClass[])object).length;
            for (int k = 0; k < n11; ++k) {
                CtClass ctClass2 = object[k];
                MemberResolver$Method memberResolver$Method5 = this.lookupMethod(ctClass2, string, arrn, arrn2, arrstring, bl);
                if (memberResolver$Method5 == null) continue;
                return memberResolver$Method5;
            }
            if (bl2 && (object = ctClass.getSuperclass()) != null && (memberResolver$Method4 = this.lookupMethod((CtClass)object, string, arrn, arrn2, arrstring, bl)) != null) {
                return memberResolver$Method4;
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        return memberResolver$Method;
    }

    private int compareSignature(String string, int[] arrn, int[] arrn2, String[] arrstring) throws CompileError {
        int n6 = 0;
        int n10 = 1;
        int n11 = arrn.length;
        if (n11 != Descriptor.numOfParameters(string)) {
            return -1;
        }
        int n12 = string.length();
        int n13 = 0;
        while (n10 < n12) {
            int n14;
            char c3;
            if ((c3 = string.charAt(n10++)) == ')') {
                return n13 == n11 ? n6 : -1;
            }
            if (n13 >= n11) {
                return -1;
            }
            int n15 = 0;
            while (c3 == '[') {
                ++n15;
                c3 = string.charAt(n10++);
            }
            if (arrn[n13] == 412) {
                if (n15 == 0 && c3 != 'L') {
                    return -1;
                }
                if (c3 == 'L') {
                    n10 = string.indexOf(59, n10) + 1;
                }
            } else if (arrn2[n13] != n15) {
                if (n15 != 0 || c3 != 'L' || !string.startsWith("java/lang/Object;", n10)) {
                    return -1;
                }
                n10 = string.indexOf(59, n10) + 1;
                ++n6;
                if (n10 <= 0) {
                    return -1;
                }
            } else if (c3 == 'L') {
                block23: {
                    n14 = string.indexOf(59, n10);
                    if (n14 < 0 || arrn[n13] != 307) {
                        return -1;
                    }
                    String string2 = string.substring(n10, n14);
                    if (!string2.equals(arrstring[n13])) {
                        CtClass ctClass = this.lookupClassByJvmName(arrstring[n13]);
                        try {
                            if (ctClass.subtypeOf(this.lookupClassByJvmName(string2))) {
                                ++n6;
                                break block23;
                            }
                            return -1;
                        }
                        catch (NotFoundException notFoundException) {
                            ++n6;
                        }
                    }
                }
                n10 = n14 + 1;
            } else {
                int n16;
                n14 = MemberResolver.descToType(c3);
                if (n14 != (n16 = arrn[n13])) {
                    if (n14 == 324 && (n16 == 334 || n16 == 303 || n16 == 306)) {
                        ++n6;
                    } else {
                        return -1;
                    }
                }
            }
            ++n13;
        }
        return -1;
    }

    public CtField lookupFieldByJvmName2(String string, Symbol symbol, ASTree aSTree) throws NoFieldException {
        String string2 = symbol.get();
        CtClass ctClass = null;
        try {
            ctClass = this.lookupClass(MemberResolver.jvmToJavaName(string), true);
        }
        catch (CompileError compileError) {
            throw new NoFieldException(string + "/" + string2, aSTree);
        }
        try {
            return ctClass.getField(string2);
        }
        catch (NotFoundException notFoundException) {
            string = MemberResolver.javaToJvmName(ctClass.getName());
            throw new NoFieldException(string + "$" + string2, aSTree);
        }
    }

    public CtField lookupFieldByJvmName(String string, Symbol symbol) throws CompileError {
        return this.lookupField(MemberResolver.jvmToJavaName(string), symbol);
    }

    public CtField lookupField(String string, Symbol symbol) throws CompileError {
        CtClass ctClass = this.lookupClass(string, false);
        try {
            return ctClass.getField(symbol.get());
        }
        catch (NotFoundException notFoundException) {
            throw new CompileError("no such field: " + symbol.get());
        }
    }

    public CtClass lookupClassByName(ASTList aSTList) throws CompileError {
        return this.lookupClass(Declarator.astToClassName(aSTList, '.'), false);
    }

    public CtClass lookupClassByJvmName(String string) throws CompileError {
        return this.lookupClass(MemberResolver.jvmToJavaName(string), false);
    }

    public CtClass lookupClass(Declarator declarator) throws CompileError {
        return this.lookupClass(declarator.getType(), declarator.getArrayDim(), declarator.getClassName());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public CtClass lookupClass(int n6, int n10, String string) throws CompileError {
        String string2 = "";
        if (n6 == 307) {
            CtClass ctClass = this.lookupClassByJvmName(string);
            if (n10 <= 0) return ctClass;
            string2 = ctClass.getName();
        } else {
            string2 = MemberResolver.getTypeName(n6);
        }
        while (n10-- > 0) {
            string2 = string2 + "[]";
        }
        return this.lookupClass(string2, false);
    }

    static String getTypeName(int n6) throws CompileError {
        String string = "";
        switch (n6) {
            case 301: {
                string = "boolean";
                break;
            }
            case 306: {
                string = "char";
                break;
            }
            case 303: {
                string = "byte";
                break;
            }
            case 334: {
                string = "short";
                break;
            }
            case 324: {
                string = "int";
                break;
            }
            case 326: {
                string = "long";
                break;
            }
            case 317: {
                string = "float";
                break;
            }
            case 312: {
                string = "double";
                break;
            }
            case 344: {
                string = "void";
                break;
            }
            default: {
                MemberResolver.fatal();
            }
        }
        return string;
    }

    public CtClass lookupClass(String string, boolean bl) throws CompileError {
        Map<String, String> map = this.getInvalidNames();
        String string2 = map.get(string);
        if (string2 == INVALID) {
            throw new CompileError("no such class: " + string);
        }
        if (string2 != null) {
            try {
                return this.classPool.get(string2);
            }
            catch (NotFoundException notFoundException) {
                // empty catch block
            }
        }
        CtClass ctClass = null;
        try {
            ctClass = this.lookupClass0(string, bl);
        }
        catch (NotFoundException notFoundException) {
            ctClass = this.searchImports(string);
        }
        map.put(string, ctClass.getName());
        return ctClass;
    }

    public static int getInvalidMapSize() {
        return invalidNamesMap.size();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Map<String, String> getInvalidNames() {
        Map<String, String> map = this.invalidNames;
        if (map != null) return map;
        Class<MemberResolver> class_ = MemberResolver.class;
        synchronized (MemberResolver.class) {
            Reference<Map<String, String>> reference = invalidNamesMap.get(this.classPool);
            if (reference != null) {
                map = reference.get();
            }
            if (map == null) {
                map = new Hashtable<String, String>();
                invalidNamesMap.put(this.classPool, new WeakReference<Map<String, String>>(map));
            }
            // ** MonitorExit[var2_2] (shouldn't be in output)
            this.invalidNames = map;
            return map;
        }
    }

    private CtClass searchImports(String string) throws CompileError {
        if (string.indexOf(46) < 0) {
            Iterator<String> iterator = this.classPool.getImportedPackages();
            while (iterator.hasNext()) {
                String string2 = iterator.next();
                String string3 = string2.replaceAll("\\.$", "") + "." + string;
                try {
                    return this.classPool.get(string3);
                }
                catch (NotFoundException notFoundException) {
                    try {
                        if (!string2.endsWith("." + string)) continue;
                        return this.classPool.get(string2);
                    }
                    catch (NotFoundException notFoundException2) {
                    }
                }
            }
        }
        this.getInvalidNames().put(string, INVALID);
        throw new CompileError("no such class: " + string);
    }

    private CtClass lookupClass0(String string, boolean bl) throws NotFoundException {
        CtClass ctClass = null;
        do {
            try {
                ctClass = this.classPool.get(string);
            }
            catch (NotFoundException notFoundException) {
                int n6 = string.lastIndexOf(46);
                if (bl || n6 < 0) {
                    throw notFoundException;
                }
                StringBuffer stringBuffer = new StringBuffer(string);
                stringBuffer.setCharAt(n6, '$');
                string = stringBuffer.toString();
            }
        } while (ctClass == null);
        return ctClass;
    }

    public String resolveClassName(ASTList aSTList) throws CompileError {
        if (aSTList == null) {
            return null;
        }
        return MemberResolver.javaToJvmName(this.lookupClassByName(aSTList).getName());
    }

    public String resolveJvmClassName(String string) throws CompileError {
        if (string == null) {
            return null;
        }
        return MemberResolver.javaToJvmName(this.lookupClassByJvmName(string).getName());
    }

    public static CtClass getSuperclass(CtClass ctClass) throws CompileError {
        try {
            CtClass ctClass2 = ctClass.getSuperclass();
            if (ctClass2 != null) {
                return ctClass2;
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        throw new CompileError("cannot find the super class of " + ctClass.getName());
    }

    public static CtClass getSuperInterface(CtClass ctClass, String string) throws CompileError {
        try {
            CtClass[] arrctClass = ctClass.getInterfaces();
            for (int k = 0; k < arrctClass.length; ++k) {
                if (!arrctClass[k].getName().equals(string)) continue;
                return arrctClass[k];
            }
        }
        catch (NotFoundException notFoundException) {
            // empty catch block
        }
        throw new CompileError("cannot find the super interface " + string + " of " + ctClass.getName());
    }

    public static String javaToJvmName(String string) {
        return string.replace('.', '/');
    }

    public static String jvmToJavaName(String string) {
        return string.replace('/', '.');
    }

    public static int descToType(char c3) throws CompileError {
        switch (c3) {
            case 'Z': {
                return 301;
            }
            case 'C': {
                return 306;
            }
            case 'B': {
                return 303;
            }
            case 'S': {
                return 334;
            }
            case 'I': {
                return 324;
            }
            case 'J': {
                return 326;
            }
            case 'F': {
                return 317;
            }
            case 'D': {
                return 312;
            }
            case 'V': {
                return 344;
            }
            case 'L': 
            case '[': {
                return 307;
            }
        }
        MemberResolver.fatal();
        return 344;
    }

    public static int getModifiers(ASTList aSTList) {
        int n6 = 0;
        while (aSTList != null) {
            Keyword keyword = (Keyword)aSTList.head();
            aSTList = aSTList.tail();
            switch (keyword.get()) {
                case 335: {
                    n6 |= 8;
                    break;
                }
                case 315: {
                    n6 |= 0x10;
                    break;
                }
                case 338: {
                    n6 |= 0x20;
                    break;
                }
                case 300: {
                    n6 |= 0x400;
                    break;
                }
                case 332: {
                    n6 |= 1;
                    break;
                }
                case 331: {
                    n6 |= 4;
                    break;
                }
                case 330: {
                    n6 |= 2;
                    break;
                }
                case 345: {
                    n6 |= 0x40;
                    break;
                }
                case 342: {
                    n6 |= 0x80;
                    break;
                }
                case 347: {
                    n6 |= 0x800;
                }
            }
        }
        return n6;
    }
}

