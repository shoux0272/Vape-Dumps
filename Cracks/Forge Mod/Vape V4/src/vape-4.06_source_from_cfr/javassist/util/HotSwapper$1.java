/*
 * Decompiled with CFR 0.150.
 */
package javassist.util;

import com.sun.jdi.event.Event;
import com.sun.jdi.event.EventIterator;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.event.MethodEntryEvent;
import javassist.util.HotSwapper;

class HotSwapper$1
extends Thread {
    final HotSwapper this$0;

    HotSwapper$1(HotSwapper hotSwapper) {
        this.this$0 = hotSwapper;
    }

    private void errorMsg(Throwable throwable) {
        System.err.print("Exception in thread \"HotSwap\" ");
        throwable.printStackTrace(System.err);
    }

    @Override
    public void run() {
        EventSet eventSet = null;
        try {
            eventSet = this.this$0.waitEvent();
            EventIterator eventIterator = eventSet.eventIterator();
            while (eventIterator.hasNext()) {
                Event event = eventIterator.nextEvent();
                if (!(event instanceof MethodEntryEvent)) continue;
                this.this$0.hotswap();
                break;
            }
        }
        catch (Throwable throwable) {
            this.errorMsg(throwable);
        }
        try {
            if (eventSet != null) {
                eventSet.resume();
            }
        }
        catch (Throwable throwable) {
            this.errorMsg(throwable);
        }
    }
}

