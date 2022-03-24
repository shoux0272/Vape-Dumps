/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

public class Descriptor$Iterator {
    private String desc;
    private int index;
    private int curPos;
    private boolean param;

    public Descriptor$Iterator(String string) {
        this.desc = string;
        this.curPos = 0;
        this.index = 0;
        this.param = false;
    }

    public boolean hasNext() {
        return this.index < this.desc.length();
    }

    public boolean isParameter() {
        return this.param;
    }

    public char currentChar() {
        return this.desc.charAt(this.curPos);
    }

    public boolean is2byte() {
        char c3 = this.currentChar();
        return c3 == 'D' || c3 == 'J';
    }

    public int next() {
        int n6;
        char c3;
        if ((c3 = this.desc.charAt(n6 = this.index++)) == '(') {
            c3 = this.desc.charAt(++n6);
            this.param = true;
        }
        if (c3 == ')') {
            ++this.index;
            c3 = this.desc.charAt(++n6);
            this.param = false;
        }
        while (c3 == '[') {
            c3 = this.desc.charAt(++n6);
        }
        if (c3 == 'L') {
            if ((n6 = this.desc.indexOf(59, n6) + 1) <= 0) {
                throw new IndexOutOfBoundsException("bad descriptor");
            }
        } else {
            ++n6;
        }
        this.curPos = this.index;
        this.index = n6;
        return this.curPos;
    }
}

