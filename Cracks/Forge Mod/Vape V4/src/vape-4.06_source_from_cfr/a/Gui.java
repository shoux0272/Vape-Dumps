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

    protected void func_73869_a(char c3, int i10) throws IOException {
        if (Reflection.getCallerClass((int)2) == GuiScreen.class) {
            d.keyTyped((Object)this, c3, i10);
        } else {
            super.func_73869_a(c3, i10);
        }
    }

    protected void func_73864_a(int i10, int i22, int i32) throws IOException {
        if (Reflection.getCallerClass((int)2) == GuiScreen.class) {
            d.mouseClicked((Object)this, i10, i22, i32);
        } else {
            super.func_73864_a(i10, i22, i32);
        }
    }

    protected void func_146286_b(int i10, int i22, int i32) {
        if (Reflection.getCallerClass((int)2) == GuiScreen.class) {
            d.mouseMovedOrUp((Object)this, i10, i22, i32);
        } else {
            super.func_146286_b(i10, i22, i32);
        }
    }

    public void func_73863_a(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        if (Reflection.getCallerClass((int)2) == ForgeHooksClient.class) {
            d.drawScreen((Object)this, p_73863_1_, p_73863_2_, p_73863_3_);
            Minecraft.func_71410_x().field_71466_p.func_78276_b("Cracked for Nighbot", 8, this.field_146295_m - 20, -1);
        }
    }

    public boolean func_73868_f() {
        return false;
    }
}

