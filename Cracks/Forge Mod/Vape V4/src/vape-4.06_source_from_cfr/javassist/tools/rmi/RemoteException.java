/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.rmi;

public class RemoteException
extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RemoteException(String string) {
        super(string);
    }

    public RemoteException(Exception exception) {
        super("by " + exception.toString());
    }
}

