/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package manthe;

import java.awt.Color;
import manthe.lY;
import org.lwjgl.opengl.GL20;

public class mg
extends lY {
    private static final String g = "#version 430 compatibility\nout vec2 f_Position;\nvoid main() {\nf_Position = gl_Vertex.xy;\ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\ngl_FrontColor = gl_Color;\n}\n";
    private static final String h = "#version 430 compatibility\nprecision highp float;\nlayout(location = 0) uniform vec4 u_InnerRect;\nlayout(location = 1) uniform float u_Spread;\nlayout(location = 2) uniform vec4 u_Color;\n// blend two color by alpha\nvec4 blend(vec4 src, vec4 append) {\n  \treturn vec4(src.rgb + append.rgb,\n              1.0 - (1.0 - (src.a)) * (1.0 - append.a));\n}\n\n// approximation to the gaussian integral [x, infty)\nfloat gi(float x) {\n\tfloat i6 = 1.0 / 6.0;\n\tfloat i4 = 1.0 / 4.0;\n\tfloat i3 = 1.0 / 3.0;\n\n    if (x > 1.5) return 0.0;\n    if (x < -1.5) return 1.0;\n\n    float x2 = x * x;\n    float x3 = x2 * x;\n    \n    if (x >  0.5) return .5625  - ( x3 * i6 - 3. * x2 * i4 + 1.125 * x);\n    if (x > -0.5) return 0.5    - (0.75 * x - x3 * i3);\n    return 0.4375 + (-x3 * i6 - 3. * x2 * i4 - 1.125 * x);\n}\n\n// create a line shadow mask\nfloat lineShadow(vec2 border, float pos , float sigma) {\n    float t = (border.y - border.x) / sigma;\n    \n    float pos1 = ((border.x - pos) / sigma) * 1.5;\n    float pos2 = ((pos - border.y) / sigma) * 1.5;\n    \n  \treturn 1.0 - abs(gi(pos1) - gi(pos2));\n}\n\n// create a rect shadow by two line shadow\nfloat rectShadow(vec4 rect, vec2 point, float sigma) {\n    \n    float lineV = lineShadow(vec2(rect.x, rect.x + rect.z), point.x, sigma);\n    float lineH = lineShadow(vec2(rect.y, rect.y + rect.w), point.y, sigma);\n    \n  \treturn lineV * lineH;\n}\n\n// draw shadow\nvec4 drawRectShadow(vec2 pos, vec4 rect, vec4 color, float sigma) {\n    vec4 result = color;\n    \n    float shadowMask = rectShadow(rect, pos, sigma);\n    \n    result.a *= shadowMask;\n    \n\treturn result;\n}\n\nin vec2 f_Position;\nout vec4 fragColor;\nvoid main() {\n    float sigma = u_Spread;\n    \n    vec4 rect = u_InnerRect;\n    vec4 shadowRect = vec4(vec2(rect.x , rect.y), vec2(rect.z, rect.w));\n    vec4 shadowColor = u_Color;\n    \n  \tvec4 result = drawRectShadow(f_Position, shadowRect, shadowColor, sigma);\n    fragColor = result;\n}\n";
    private static String[] f;

    public mg() {
        super(g, h);
    }

    public void a(float f10, float f11, float f12, float f13) {
        GL20.glUniform4f((int)0, (float)f10, (float)f11, (float)f12, (float)f13);
    }

    public void a(float f10) {
        GL20.glUniform1f((int)1, (float)f10);
    }

    public void a(Color color) {
        GL20.glUniform4f((int)2, (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static void b(String[] arrstring) {
        f = arrstring;
    }

    public static String[] e() {
        return f;
    }

    static {
        if (mg.e() == null) {
            mg.b(new String[2]);
        }
    }
}

