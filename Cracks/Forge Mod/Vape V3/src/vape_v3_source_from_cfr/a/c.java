/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.IEventListener
 */
package a;

import java.lang.reflect.Method;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.IEventListener;

public class c
implements IEventListener {
    private static final Method call;
    private static final c listener;

    public static void reg(Class cls, int busId) throws Exception {
        ((Event)cls.newInstance()).getListenerList().register(busId, EventPriority.NORMAL, (IEventListener)listener);
    }

    public void invoke(Event event) {
        try {
            call.invoke(null, new Object[]{event});
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        listener = new c();
        try {
            call = Class.forName("Main").getDeclaredMethod("call", Object.class);
            call.setAccessible(true);
        }
        catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

