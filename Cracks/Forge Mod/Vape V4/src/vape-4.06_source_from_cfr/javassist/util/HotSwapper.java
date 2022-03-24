/*
 * Decompiled with CFR 0.150.
 */
package javassist.util;

import com.sun.jdi.Bootstrap;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector;
import com.sun.jdi.connect.IllegalConnectorArgumentsException;
import com.sun.jdi.event.EventQueue;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.MethodEntryRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javassist.util.HotSwapper$1;
import javassist.util.Trigger;

public class HotSwapper {
    private VirtualMachine jvm = null;
    private MethodEntryRequest request = null;
    private Map<ReferenceType, byte[]> newClassFiles = null;
    private Trigger trigger = new Trigger();
    private static final String HOST_NAME = "localhost";
    private static final String TRIGGER_NAME = Trigger.class.getName();
    private static String f;

    public HotSwapper(int n6) throws IOException, IllegalConnectorArgumentsException {
        this(Integer.toString(n6));
    }

    public HotSwapper(String string) throws IOException, IllegalConnectorArgumentsException {
        AttachingConnector attachingConnector = (AttachingConnector)this.findConnector("com.sun.jdi.SocketAttach");
        Map<String, Connector.Argument> map = attachingConnector.defaultArguments();
        map.get("hostname").setValue(HOST_NAME);
        map.get("port").setValue(string);
        this.jvm = attachingConnector.attach(map);
        EventRequestManager eventRequestManager = this.jvm.eventRequestManager();
        this.request = HotSwapper.methodEntryRequests(eventRequestManager, TRIGGER_NAME);
    }

    private Connector findConnector(String string) throws IOException {
        List<Connector> list = Bootstrap.virtualMachineManager().allConnectors();
        for (Connector connector : list) {
            if (!connector.name().equals(string)) continue;
            return connector;
        }
        throw new IOException("Not found: " + string);
    }

    private static MethodEntryRequest methodEntryRequests(EventRequestManager eventRequestManager, String string) {
        MethodEntryRequest methodEntryRequest = eventRequestManager.createMethodEntryRequest();
        methodEntryRequest.addClassFilter(string);
        methodEntryRequest.setSuspendPolicy(1);
        return methodEntryRequest;
    }

    private void deleteEventRequest(EventRequestManager eventRequestManager, MethodEntryRequest methodEntryRequest) {
        eventRequestManager.deleteEventRequest(methodEntryRequest);
    }

    public void reload(String string, byte[] arrby) {
        ReferenceType referenceType = this.toRefType(string);
        HashMap<ReferenceType, byte[]> hashMap = new HashMap<ReferenceType, byte[]>();
        hashMap.put(referenceType, arrby);
        this.reload2(hashMap, string);
    }

    public void reload(Map<String, byte[]> map) {
        HashMap<ReferenceType, byte[]> hashMap = new HashMap<ReferenceType, byte[]>();
        String string = null;
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            string = entry.getKey();
            hashMap.put(this.toRefType(string), entry.getValue());
        }
        if (string != null) {
            this.reload2(hashMap, string + " etc.");
        }
    }

    private ReferenceType toRefType(String string) {
        List<ReferenceType> list = this.jvm.classesByName(string);
        if (list == null || list.isEmpty()) {
            throw new RuntimeException("no such class: " + string);
        }
        return list.get(0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void reload2(Map<ReferenceType, byte[]> map, String string) {
        Trigger trigger = this.trigger;
        synchronized (trigger) {
            this.startDaemon();
            this.newClassFiles = map;
            this.request.enable();
            this.trigger.doSwap();
            this.request.disable();
            Map<ReferenceType, byte[]> map2 = this.newClassFiles;
            if (map2 != null) {
                this.newClassFiles = null;
                throw new RuntimeException("failed to reload: " + string);
            }
        }
    }

    private void startDaemon() {
        new HotSwapper$1(this).start();
    }

    EventSet waitEvent() throws InterruptedException {
        EventQueue eventQueue = this.jvm.eventQueue();
        return eventQueue.remove();
    }

    void hotswap() {
        Map<ReferenceType, byte[]> map = this.newClassFiles;
        this.jvm.redefineClasses(map);
        this.newClassFiles = null;
    }

    static {
        HotSwapper.b(null);
    }

    public static void b(String string) {
        f = string;
    }

    public static String d() {
        return f;
    }
}

