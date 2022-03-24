/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.df;
import manthe.ex;
import manthe.kS;
import manthe.si;

public class st
extends si {
    public st() {
        super("net/minecraftforge/event/entity/EntityJoinWorldEvent", 0);
    }

    @Override
    public void a(Object object) {
        df df2 = new df(object);
        kS kS2 = new kS(new ex(df2.g()));
        kS2.fire();
    }
}

