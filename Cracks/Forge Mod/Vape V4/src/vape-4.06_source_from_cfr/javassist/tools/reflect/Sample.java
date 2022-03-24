/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.reflect;

import javassist.tools.reflect.ClassMetaobject;
import javassist.tools.reflect.Metalevel;
import javassist.tools.reflect.Metaobject;

public class Sample {
    private Metaobject _metaobject;
    private static ClassMetaobject _classobject;

    public Object trap(Object[] arrobject, int n6) throws Throwable {
        Metaobject metaobject = this._metaobject;
        if (metaobject == null) {
            return ClassMetaobject.invoke(this, n6, arrobject);
        }
        return metaobject.trapMethodcall(n6, arrobject);
    }

    public static Object trapStatic(Object[] arrobject, int n6) throws Throwable {
        return _classobject.trapMethodcall(n6, arrobject);
    }

    public static Object trapRead(Object[] arrobject, String string) {
        if (arrobject[0] == null) {
            return _classobject.trapFieldRead(string);
        }
        return ((Metalevel)arrobject[0])._getMetaobject().trapFieldRead(string);
    }

    public static Object trapWrite(Object[] arrobject, String string) {
        Metalevel metalevel = (Metalevel)arrobject[0];
        if (metalevel == null) {
            _classobject.trapFieldWrite(string, arrobject[1]);
        } else {
            metalevel._getMetaobject().trapFieldWrite(string, arrobject[1]);
        }
        return null;
    }
}

