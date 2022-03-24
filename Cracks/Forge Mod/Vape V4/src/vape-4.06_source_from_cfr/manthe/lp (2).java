/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package manthe;

import manthe.lY;
import org.lwjgl.opengl.GL20;

public class lp
extends lY {
    private static final String f = "#version 430 compatibility\nout vec2 f_Position;\nvoid main() {\nf_Position = gl_Vertex.xy;\ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\ngl_FrontColor = gl_Color;\n}\n";
    private static final String g = "#version 430 compatibility\nprecision highp float;\nlayout(location = 0) uniform float u_Radius;\nlayout(location = 1) uniform vec4 u_InnerRect;\nlayout(location = 2) uniform float u_Spread;\nin vec2 f_Position;\nout vec4 fragColor;\nvoid main() {\nvec2 tl = u_InnerRect.xy - f_Position;\nvec2 br = f_Position - u_InnerRect.zw;\nvec2 dis = max(br, tl);\nfloat v = length(max(vec2(0.0), dis)) - u_Radius;\nfloat a = 1.0 - smoothstep(0.0, u_Spread, v);\n\nfragColor = gl_Color * vec4(1.0, 1.0, 1.0, a);\n}\n";

    public lp() {
        super(f, g);
    }

    public void a(float f10) {
        GL20.glUniform1f((int)0, (float)f10);
    }

    public void a(float f10, float f11, float f12, float f13) {
        GL20.glUniform4f((int)1, (float)f10, (float)f11, (float)f12, (float)f13);
    }

    public void b(float f10) {
        GL20.glUniform1f((int)2, (float)f10);
    }
}

