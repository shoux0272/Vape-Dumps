/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;

public class iReSqtkUVgfsSiReSqtkUVg {
    public static iReSqtkUVgLUhiReSqtkUVg a(String string) {
        Iterator iterator = iReSqtkUVgLUhiReSqtkUVg.f().d().iterator();
        String string2 = "";
        while (iterator.hasNext()) {
            iReSqtkUVgbBTiReSqtkUVg iReSqtkUVgbBTiReSqtkUVg2;
            Object object;
            if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
                string2 = (String)iterator.next();
                object = iReSqtkUVgLUhiReSqtkUVg.f().a(string2);
            } else {
                iReSqtkUVgbBTiReSqtkUVg2 = new iReSqtkUVgsXgiReSqtkUVg(iterator.next());
                string2 = iReSqtkUVgbBTiReSqtkUVg2.d();
                object = iReSqtkUVgLUhiReSqtkUVg.f().a(iReSqtkUVgbBTiReSqtkUVg2.a());
            }
            string2 = string2.replace("minecraft:", "");
            string2 = string2.toLowerCase();
            if (!iReSqtkUVgSzRiReSqtkUVg.w.isInstance(object)) continue;
            iReSqtkUVgbBTiReSqtkUVg2 = new iReSqtkUVgLUhiReSqtkUVg(object);
            if (!string2.equalsIgnoreCase(string)) continue;
            return iReSqtkUVgbBTiReSqtkUVg2;
        }
        return null;
    }
}

