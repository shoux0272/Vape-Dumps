/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.SignatureAttribute$ArrayType;
import javassist.bytecode.SignatureAttribute$BaseType;
import javassist.bytecode.SignatureAttribute$ClassSignature;
import javassist.bytecode.SignatureAttribute$ClassType;
import javassist.bytecode.SignatureAttribute$Cursor;
import javassist.bytecode.SignatureAttribute$MethodSignature;
import javassist.bytecode.SignatureAttribute$ObjectType;
import javassist.bytecode.SignatureAttribute$Type;
import javassist.bytecode.SignatureAttribute$TypeArgument;
import javassist.bytecode.SignatureAttribute$TypeParameter;
import javassist.bytecode.SignatureAttribute$TypeVariable;

public class SignatureAttribute
extends AttributeInfo {
    public static final String tag = "Signature";

    SignatureAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public SignatureAttribute(ConstPool constPool, String string) {
        super(constPool, tag);
        int n6 = constPool.addUtf8Info(string);
        byte[] arrby = new byte[]{(byte)(n6 >>> 8), (byte)n6};
        this.set(arrby);
    }

    public String getSignature() {
        return this.getConstPool().getUtf8Info(ByteArray.readU16bit(this.get(), 0));
    }

    public void setSignature(String string) {
        int n6 = this.getConstPool().addUtf8Info(string);
        ByteArray.write16bit(n6, this.info, 0);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        return new SignatureAttribute(constPool, this.getSignature());
    }

    @Override
    void renameClass(String string, String string2) {
        String string3 = SignatureAttribute.renameClass(this.getSignature(), string, string2);
        this.setSignature(string3);
    }

    @Override
    void renameClass(Map<String, String> map) {
        String string = SignatureAttribute.renameClass(this.getSignature(), map);
        this.setSignature(string);
    }

    static String renameClass(String string, String string2, String string3) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string2, string3);
        return SignatureAttribute.renameClass(string, hashMap);
    }

    static String renameClass(String string, Map<String, String> map) {
        int n6;
        if (map == null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n10 = 0;
        int n11 = 0;
        while ((n6 = string.indexOf(76, n11)) >= 0) {
            char c3;
            StringBuilder stringBuilder2 = new StringBuilder();
            int n12 = n6;
            try {
                while ((c3 = string.charAt(++n12)) != ';') {
                    stringBuilder2.append(c3);
                    if (c3 != '<') continue;
                    while ((c3 = string.charAt(++n12)) != '>') {
                        stringBuilder2.append(c3);
                    }
                    stringBuilder2.append(c3);
                }
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                break;
            }
            n11 = n12 + 1;
            String string2 = stringBuilder2.toString();
            String string3 = map.get(string2);
            if (string3 == null) continue;
            stringBuilder.append(string.substring(n10, n6));
            stringBuilder.append('L');
            stringBuilder.append(string3);
            stringBuilder.append(c3);
            n10 = n11;
        }
        if (n10 == 0) {
            return string;
        }
        n6 = string.length();
        if (n10 < n6) {
            stringBuilder.append(string.substring(n10, n6));
        }
        return stringBuilder.toString();
    }

    private static boolean isNamePart(int n6) {
        return n6 != 59 && n6 != 60;
    }

    public static SignatureAttribute$ClassSignature toClassSignature(String string) throws BadBytecode {
        try {
            return SignatureAttribute.parseSig(string);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw SignatureAttribute.error(string);
        }
    }

    public static SignatureAttribute$MethodSignature toMethodSignature(String string) throws BadBytecode {
        try {
            return SignatureAttribute.parseMethodSig(string);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw SignatureAttribute.error(string);
        }
    }

    public static SignatureAttribute$ObjectType toFieldSignature(String string) throws BadBytecode {
        try {
            return SignatureAttribute.parseObjectType(string, new SignatureAttribute$Cursor(null), false);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw SignatureAttribute.error(string);
        }
    }

    public static SignatureAttribute$Type toTypeSignature(String string) throws BadBytecode {
        try {
            return SignatureAttribute.parseType(string, new SignatureAttribute$Cursor(null));
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw SignatureAttribute.error(string);
        }
    }

    private static SignatureAttribute$ClassSignature parseSig(String string) throws BadBytecode, IndexOutOfBoundsException {
        SignatureAttribute$Cursor signatureAttribute$Cursor = new SignatureAttribute$Cursor(null);
        SignatureAttribute$TypeParameter[] arrsignatureAttribute$TypeParameter = SignatureAttribute.parseTypeParams(string, signatureAttribute$Cursor);
        SignatureAttribute$ClassType signatureAttribute$ClassType = SignatureAttribute.parseClassType(string, signatureAttribute$Cursor);
        int n6 = string.length();
        ArrayList<SignatureAttribute$ClassType> arrayList = new ArrayList<SignatureAttribute$ClassType>();
        while (signatureAttribute$Cursor.position < n6 && string.charAt(signatureAttribute$Cursor.position) == 'L') {
            arrayList.add(SignatureAttribute.parseClassType(string, signatureAttribute$Cursor));
        }
        SignatureAttribute$ClassType[] arrsignatureAttribute$ClassType = arrayList.toArray(new SignatureAttribute$ClassType[arrayList.size()]);
        return new SignatureAttribute$ClassSignature(arrsignatureAttribute$TypeParameter, signatureAttribute$ClassType, arrsignatureAttribute$ClassType);
    }

    private static SignatureAttribute$MethodSignature parseMethodSig(String string) throws BadBytecode {
        Object object;
        SignatureAttribute$Type signatureAttribute$Type;
        SignatureAttribute$Cursor signatureAttribute$Cursor = new SignatureAttribute$Cursor(null);
        SignatureAttribute$TypeParameter[] arrsignatureAttribute$TypeParameter = SignatureAttribute.parseTypeParams(string, signatureAttribute$Cursor);
        if (string.charAt(signatureAttribute$Cursor.position++) != '(') {
            throw SignatureAttribute.error(string);
        }
        ArrayList<SignatureAttribute$Type> arrayList = new ArrayList<SignatureAttribute$Type>();
        while (string.charAt(signatureAttribute$Cursor.position) != ')') {
            signatureAttribute$Type = SignatureAttribute.parseType(string, signatureAttribute$Cursor);
            arrayList.add(signatureAttribute$Type);
        }
        ++signatureAttribute$Cursor.position;
        signatureAttribute$Type = SignatureAttribute.parseType(string, signatureAttribute$Cursor);
        int n6 = string.length();
        ArrayList<SignatureAttribute$Type[]> arrayList2 = new ArrayList<SignatureAttribute$Type[]>();
        while (signatureAttribute$Cursor.position < n6 && string.charAt(signatureAttribute$Cursor.position) == '^') {
            ++signatureAttribute$Cursor.position;
            object = SignatureAttribute.parseObjectType(string, signatureAttribute$Cursor, false);
            if (object instanceof SignatureAttribute$ArrayType) {
                throw SignatureAttribute.error(string);
            }
            arrayList2.add((SignatureAttribute$Type[])object);
        }
        object = arrayList.toArray(new SignatureAttribute$Type[arrayList.size()]);
        SignatureAttribute$ObjectType[] arrsignatureAttribute$ObjectType = arrayList2.toArray(new SignatureAttribute$ObjectType[arrayList2.size()]);
        return new SignatureAttribute$MethodSignature(arrsignatureAttribute$TypeParameter, (SignatureAttribute$Type[])object, signatureAttribute$Type, arrsignatureAttribute$ObjectType);
    }

    private static SignatureAttribute$TypeParameter[] parseTypeParams(String string, SignatureAttribute$Cursor signatureAttribute$Cursor) throws BadBytecode {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (string.charAt(signatureAttribute$Cursor.position) == '<') {
            ++signatureAttribute$Cursor.position;
            while (string.charAt(signatureAttribute$Cursor.position) != '>') {
                Object object;
                int n6 = signatureAttribute$Cursor.position;
                int n10 = signatureAttribute$Cursor.indexOf(string, 58);
                SignatureAttribute$ObjectType signatureAttribute$ObjectType = SignatureAttribute.parseObjectType(string, signatureAttribute$Cursor, true);
                ArrayList<SignatureAttribute$ObjectType> arrayList2 = new ArrayList<SignatureAttribute$ObjectType>();
                while (string.charAt(signatureAttribute$Cursor.position) == ':') {
                    ++signatureAttribute$Cursor.position;
                    object = SignatureAttribute.parseObjectType(string, signatureAttribute$Cursor, false);
                    arrayList2.add((SignatureAttribute$ObjectType)object);
                }
                object = new SignatureAttribute$TypeParameter(string, n6, n10, signatureAttribute$ObjectType, arrayList2.toArray(new SignatureAttribute$ObjectType[arrayList2.size()]));
                arrayList.add(object);
            }
            ++signatureAttribute$Cursor.position;
        }
        return arrayList.toArray(new SignatureAttribute$TypeParameter[arrayList.size()]);
    }

    private static SignatureAttribute$ObjectType parseObjectType(String string, SignatureAttribute$Cursor signatureAttribute$Cursor, boolean bl) throws BadBytecode {
        int n6 = signatureAttribute$Cursor.position;
        switch (string.charAt(n6)) {
            case 'L': {
                return SignatureAttribute.parseClassType2(string, signatureAttribute$Cursor, null);
            }
            case 'T': {
                int n10 = signatureAttribute$Cursor.indexOf(string, 59);
                return new SignatureAttribute$TypeVariable(string, n6 + 1, n10);
            }
            case '[': {
                return SignatureAttribute.parseArray(string, signatureAttribute$Cursor);
            }
        }
        if (bl) {
            return null;
        }
        throw SignatureAttribute.error(string);
    }

    private static SignatureAttribute$ClassType parseClassType(String string, SignatureAttribute$Cursor signatureAttribute$Cursor) throws BadBytecode {
        if (string.charAt(signatureAttribute$Cursor.position) == 'L') {
            return SignatureAttribute.parseClassType2(string, signatureAttribute$Cursor, null);
        }
        throw SignatureAttribute.error(string);
    }

    private static SignatureAttribute$ClassType parseClassType2(String string, SignatureAttribute$Cursor signatureAttribute$Cursor, SignatureAttribute$ClassType signatureAttribute$ClassType) throws BadBytecode {
        SignatureAttribute$TypeArgument[] arrsignatureAttribute$TypeArgument;
        char c3;
        int n6 = ++signatureAttribute$Cursor.position;
        while ((c3 = string.charAt(signatureAttribute$Cursor.position++)) != '$' && c3 != '<' && c3 != ';') {
        }
        int n10 = signatureAttribute$Cursor.position - 1;
        if (c3 == '<') {
            arrsignatureAttribute$TypeArgument = SignatureAttribute.parseTypeArgs(string, signatureAttribute$Cursor);
            c3 = string.charAt(signatureAttribute$Cursor.position++);
        } else {
            arrsignatureAttribute$TypeArgument = null;
        }
        SignatureAttribute$ClassType signatureAttribute$ClassType2 = SignatureAttribute$ClassType.make(string, n6, n10, arrsignatureAttribute$TypeArgument, signatureAttribute$ClassType);
        if (c3 == '$' || c3 == '.') {
            --signatureAttribute$Cursor.position;
            return SignatureAttribute.parseClassType2(string, signatureAttribute$Cursor, signatureAttribute$ClassType2);
        }
        return signatureAttribute$ClassType2;
    }

    private static SignatureAttribute$TypeArgument[] parseTypeArgs(String string, SignatureAttribute$Cursor signatureAttribute$Cursor) throws BadBytecode {
        char c3;
        ArrayList<SignatureAttribute$TypeArgument> arrayList = new ArrayList<SignatureAttribute$TypeArgument>();
        while ((c3 = string.charAt(signatureAttribute$Cursor.position++)) != '>') {
            SignatureAttribute$TypeArgument signatureAttribute$TypeArgument;
            if (c3 == '*') {
                signatureAttribute$TypeArgument = new SignatureAttribute$TypeArgument(null, '*');
            } else {
                if (c3 != '+' && c3 != '-') {
                    c3 = ' ';
                    --signatureAttribute$Cursor.position;
                }
                signatureAttribute$TypeArgument = new SignatureAttribute$TypeArgument(SignatureAttribute.parseObjectType(string, signatureAttribute$Cursor, false), c3);
            }
            arrayList.add(signatureAttribute$TypeArgument);
        }
        return arrayList.toArray(new SignatureAttribute$TypeArgument[arrayList.size()]);
    }

    private static SignatureAttribute$ObjectType parseArray(String string, SignatureAttribute$Cursor signatureAttribute$Cursor) throws BadBytecode {
        int n6 = 1;
        while (string.charAt(++signatureAttribute$Cursor.position) == '[') {
            ++n6;
        }
        return new SignatureAttribute$ArrayType(n6, SignatureAttribute.parseType(string, signatureAttribute$Cursor));
    }

    private static SignatureAttribute$Type parseType(String string, SignatureAttribute$Cursor signatureAttribute$Cursor) throws BadBytecode {
        SignatureAttribute$Type signatureAttribute$Type = SignatureAttribute.parseObjectType(string, signatureAttribute$Cursor, true);
        if (signatureAttribute$Type == null) {
            signatureAttribute$Type = new SignatureAttribute$BaseType(string.charAt(signatureAttribute$Cursor.position++));
        }
        return signatureAttribute$Type;
    }

    private static BadBytecode error(String string) {
        return new BadBytecode("bad signature: " + string);
    }

    static BadBytecode access$000(String string) {
        return SignatureAttribute.error(string);
    }
}

