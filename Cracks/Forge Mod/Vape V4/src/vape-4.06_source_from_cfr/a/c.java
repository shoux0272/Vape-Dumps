/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.IEventListener
 *  net.minecraftforge.fml.common.eventhandler.ListenerList
 */
package a;

import java.lang.reflect.Field;
import manthe.on;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.IEventListener;
import net.minecraftforge.fml.common.eventhandler.ListenerList;

public class c
implements IEventListener {
    static c listener = new c();
    static ListenerList listenerList;

    public static void call(Object object) {
        if (on.p == null) {
            return;
        }
        if (on.p.O() != null && !on.p.x()) {
            on.p.O().a(object);
        }
    }

    public static void reg(Class<? extends Event> cls, int busId) throws Exception {
        listenerList.register(busId, EventPriority.NORMAL, (IEventListener)listener);
    }

    public void invoke(Event event) {
        c.call((Object)event);
    }

    static {
        try {
            Field f10 = Event.class.getDeclaredField("listeners");
            f10.setAccessible(true);
            listenerList = (ListenerList)f10.get(null);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

