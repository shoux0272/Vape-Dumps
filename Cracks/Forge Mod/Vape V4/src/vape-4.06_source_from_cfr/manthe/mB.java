/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.FileDialog;
import java.awt.Frame;
import manthe.rs;
import manthe.vK;

class mB
implements vK {
    final rs a;

    mB(rs rs2) {
        this.a = rs2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        FileDialog fileDialog = new FileDialog((Frame)null);
        fileDialog.setFile("*.txt");
        fileDialog.setVisible(true);
        fileDialog.setMode(1);
        if (fileDialog.getFile() != null) {
            String string = fileDialog.getDirectory() + fileDialog.getFile();
            rs.a(this.a, string);
        }
    }
}

