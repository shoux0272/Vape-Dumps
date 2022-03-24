/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.expr.ExprEditor;
import javassist.expr.FieldAccess;
import manthe.on;
import manthe.t4;

class yh
extends ExprEditor {
    final boolean a;
    final CtClass b;
    final String d;
    final t4 c;

    yh(t4 t42, boolean bl, CtClass ctClass, String string) {
        this.c = t42;
        this.a = bl;
        this.b = ctClass;
        this.d = string;
    }

    @Override
    public void edit(FieldAccess fieldAccess) throws CannotCompileException {
        try {
            if (fieldAccess.s().equals(t4.e(this.c)) && fieldAccess.u().equals("F") && (!this.a || fieldAccess.getField().getDeclaringClass().equals(this.b))) {
                String string = "$_ = " + this.d + "#getRotationYaw();";
                fieldAccess.replace(string);
                return;
            }
            if (fieldAccess.s().equals(t4.f(this.c)) && fieldAccess.u().equals("F") && (!this.a || fieldAccess.getField().getDeclaringClass().equals(this.b))) {
                String string = "$_ = " + this.d + "#getRotationPitch();";
                fieldAccess.replace(string);
                return;
            }
            if (fieldAccess.s().equals(t4.d(this.c)) && fieldAccess.u().equals("Z") && (!this.a || fieldAccess.getField().getDeclaringClass().equals(this.b))) {
                String string = "$_ = " + this.d + "#isOnGround();";
                fieldAccess.replace(string);
                return;
            }
            if (fieldAccess.s().equals(t4.c(this.c)) && fieldAccess.u().equals(t4.a(this.c)) && (!this.a || fieldAccess.getField().getDeclaringClass().equals(t4.b(this.c)))) {
                String string = "$_ = " + this.d + "#getY();";
                fieldAccess.replace(string);
                return;
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }
}

