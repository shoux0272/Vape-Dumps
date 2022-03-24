/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.rmi;

import javassist.tools.rmi.ObjectImporter;
import javassist.tools.rmi.RemoteException;

public class Sample {
    private ObjectImporter importer;
    private int objectId;

    public Object forward(Object[] arrobject, int n6) {
        return this.importer.call(this.objectId, n6, arrobject);
    }

    public static Object forwardStatic(Object[] arrobject, int n6) throws RemoteException {
        throw new RemoteException("cannot call a static method.");
    }
}

