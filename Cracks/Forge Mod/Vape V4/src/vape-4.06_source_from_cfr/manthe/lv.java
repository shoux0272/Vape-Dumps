/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package manthe;

import manthe.lY;
import org.lwjgl.opengl.GL20;

public class lv
extends lY {
    private static final String f = "#version 430 compatibility\nout vec2 f_Position;\nvoid main() {\nf_Position = gl_Vertex.xy;\ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\ngl_FrontColor = gl_Color;\n}\n";
    private static final String g = "#version 430 compatibility\nprecision highp float;\nlayout(location = 0) uniform float u_Radius;\nlayout(location = 1) uniform float u_Feather;\nlayout(location = 2) uniform vec2 u_CenterPos;\nin vec2 f_Position;\nout vec4 fragColor;\nvoid main() {\nfloat v = length(f_Position - u_CenterPos);\nfloat a = 1.0 - smoothstep(u_Radius - u_Feather, u_Radius, v);\nfragColor = gl_Color * vec4(1.0, 1.0, 1.0, a);\n}\n";

    public lv() {
        super(f, g);
    }

    public void b(float f10) {
        GL20.glUniform1f((int)0, (float)f10);
    }

    public void a(float f10) {
        GL20.glUniform1f((int)1, (float)f10);
    }

    public void a(float f10, float f11) {
        GL20.glUniform2f((int)2, (float)f10, (float)f11);
    }
}

