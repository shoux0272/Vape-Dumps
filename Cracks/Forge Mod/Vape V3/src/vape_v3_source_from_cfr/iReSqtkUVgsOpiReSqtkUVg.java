/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.Set;

public class iReSqtkUVgsOpiReSqtkUVg
implements iReSqtkUVgqECiReSqtkUVg {
    private final Set<Class> a;
    private final Color b;

    public iReSqtkUVgsOpiReSqtkUVg(Set<Class> set, Color color) {
        this.a = set;
        this.b = color;
    }

    public iReSqtkUVgsOpiReSqtkUVg(Set<Class> set) {
        this(set, new Color(255, 255, 255));
    }

    @Override
    public boolean a(iReSqtkUVgbUCiReSqtkUVg iReSqtkUVgbUCiReSqtkUVg2) {
        for (Class class_ : this.a) {
            if (!iReSqtkUVgbUCiReSqtkUVg2.a(class_)) continue;
            return true;
        }
        return false;
    }

    @Override
    public Color a(Object object) {
        return this.b;
    }
}

