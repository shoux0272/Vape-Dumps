/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public abstract class iReSqtkUVgewJiReSqtkUVg {
    private String a;
    private List<Integer> b = new CopyOnWriteArrayList<Integer>();

    public abstract void t();

    public List<Integer> I() {
        return this.b;
    }

    public void a(List<Integer> list) {
        this.b.clear();
        this.b.addAll(list);
        if (this instanceof iReSqtkUVgypOiReSqtkUVg && !this.K()) {
            this.a(Collections.singletonList(54));
        }
    }

    public boolean d(int n) {
        if (this.I().isEmpty()) {
            return false;
        }
        if (this.I().size() == 1) {
            if (this.I().contains(n)) {
                this.t();
                return true;
            }
        } else {
            int n2 = 0;
            for (int n3 : this.I()) {
                if (n3 == n) {
                    ++n2;
                    continue;
                }
                if (n3 < 0) {
                    if (!Mouse.isButtonDown((int)(100 + n3))) continue;
                    ++n2;
                    continue;
                }
                if (!Keyboard.isKeyDown((int)n3)) continue;
                ++n2;
            }
            if (n2 == this.I().size()) {
                this.t();
                return true;
            }
        }
        return false;
    }

    public String J() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.b.size(); ++i) {
            int n = this.b.get(i);
            if (n == 0) continue;
            stringBuilder.append(this.e(n));
            if (i == this.b.size() - 1) continue;
            stringBuilder.append("+");
        }
        return stringBuilder.toString();
    }

    public boolean K() {
        boolean bl = !this.b.isEmpty();
        for (Integer n : this.b) {
            if (n != 0) continue;
            bl = false;
            break;
        }
        return bl;
    }

    public String L() {
        return this.a;
    }

    public String e(int n) {
        if (n >= 0) {
            return Keyboard.getKeyName((int)n);
        }
        return "M" + (101 + n);
    }

    public void f(int n) {
        if (this instanceof iReSqtkUVgypOiReSqtkUVg && n == 0) {
            n = 54;
        }
        this.a = n >= 0 ? Keyboard.getKeyName((int)n) : "M" + (101 + n);
    }

    protected JsonArray M() {
        JsonArray jsonArray = new JsonArray();
        for (Integer n : this.I()) {
            jsonArray.add(new Gson().toJsonTree((Object)n));
        }
        return jsonArray;
    }

    protected void a(JsonArray jsonArray) {
        this.I().clear();
        for (JsonElement jsonElement : jsonArray) {
            int n = jsonElement.getAsInt();
            if (n == 0) continue;
            this.I().add(n);
        }
    }

    public abstract String s();
}

