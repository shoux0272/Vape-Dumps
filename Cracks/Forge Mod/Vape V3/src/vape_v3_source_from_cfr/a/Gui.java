/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.client.ForgeHooksClient
 *  sun.reflect.Reflection
 */
package a;

import a.d;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.ForgeHooksClient;
import sun.reflect.Reflection;

public class Gui
extends GuiScreen {
    public void func_73866_w_() {
        if (Reflection.getCallerClass((int)2) == GuiScreen.class) {
            d.initGui((Object)this);
        }
    }

    public void func_146281_b() {
        if (Reflection.getCallerClass((int)2) == Minecraft.class) {
            d.onGuiClosed((Object)this);
        }
    }

    protected void func_73869_a(char c2, int i) throws IOException {
        if (Reflection.getCallerClass((int)2) == GuiScreen.class) {
            d.keyTyped((Object)this, c2, i);
        } else {
            super.func_73869_a(c2, i);
        }
    }

    protected void func_73864_a(int i, int i2, int i3) throws IOException {
        if (Reflection.getCallerClass((int)2) == GuiScreen.class) {
            d.mouseClicked((Object)this, i, i2, i3);
        } else {
            super.func_73864_a(i, i2, i3);
        }
    }

    protected void func_146286_b(int i, int i2, int i3) {
        if (Reflection.getCallerClass((int)2) == GuiScreen.class) {
            d.mouseMovedOrUp((Object)this, i, i2, i3);
        } else {
            super.func_146286_b(i, i2, i3);
        }
    }

    public void func_73863_a(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        if (Reflection.getCallerClass((int)2) == ForgeHooksClient.class) {
            d.drawScreen((Object)this, p_73863_1_, p_73863_2_, p_73863_3_);
        }
    }

    public boolean func_73868_f() {
        return false;
    }
}

