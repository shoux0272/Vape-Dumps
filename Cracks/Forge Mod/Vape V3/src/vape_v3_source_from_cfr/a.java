/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 */
import net.minecraft.client.gui.GuiScreen;

public class a
extends GuiScreen {
    private native void initGui0();

    private native void onGuiClosed0();

    private native void updateScreen0();

    private native void keyTyped0(char var1, int var2);

    private native void mouseClicked0(int var1, int var2, int var3);

    private native void mouseMovedOrUp0(int var1, int var2, int var3);

    private native void handleMouseInput0();

    private native void drawScreen0(int var1, int var2, float var3);

    public void func_73866_w_() {
        this.initGui0();
    }

    public void func_146281_b() {
        this.onGuiClosed0();
    }

    public void func_73876_c() {
        this.updateScreen0();
    }

    protected void func_73869_a(char p_73869_1_, int p_73869_2_) {
        this.keyTyped0(p_73869_1_, p_73869_2_);
    }

    protected void func_73864_a(int p_73864_1_, int p_73864_2_, int p_73864_3_) {
        this.mouseClicked0(p_73864_1_, p_73864_2_, p_73864_3_);
    }

    protected void func_146286_b(int p_146286_1_, int p_146286_2_, int p_146286_3_) {
        this.mouseMovedOrUp0(p_146286_1_, p_146286_2_, p_146286_3_);
    }

    public void func_146274_d() {
        this.handleMouseInput0();
    }

    public void func_73863_a(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        this.drawScreen0(p_73863_1_, p_73863_2_, p_73863_3_);
    }
}

