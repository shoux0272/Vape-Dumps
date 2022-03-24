/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.compiler.KeywordTable;
import javassist.compiler.Token;
import javassist.compiler.TokenId;

public class Lex
implements TokenId {
    private int lastChar = -1;
    private StringBuffer textBuffer = new StringBuffer();
    private Token currentToken = new Token();
    private Token lookAheadTokens = null;
    private String input;
    private int position;
    private int maxlen;
    private int lineNumber;
    private static final int[] equalOps = new int[]{350, 0, 0, 0, 351, 352, 0, 0, 0, 353, 354, 0, 355, 0, 356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 357, 358, 359, 0};
    private static final KeywordTable ktable = new KeywordTable();

    public Lex(String string) {
        this.input = string;
        this.position = 0;
        this.maxlen = string.length();
        this.lineNumber = 0;
    }

    public int get() {
        Token token;
        if (this.lookAheadTokens == null) {
            return this.get(this.currentToken);
        }
        this.currentToken = token = this.lookAheadTokens;
        this.lookAheadTokens = this.lookAheadTokens.next;
        return token.tokenId;
    }

    public int lookAhead() {
        return this.lookAhead(0);
    }

    public int lookAhead(int n6) {
        Token token = this.lookAheadTokens;
        if (token == null) {
            this.lookAheadTokens = token = this.currentToken;
            token.next = null;
            this.get(token);
        }
        while (n6-- > 0) {
            if (token.next == null) {
                Token token2;
                token.next = token2 = new Token();
                this.get(token2);
            }
            token = token.next;
        }
        this.currentToken = token;
        return token.tokenId;
    }

    public String getString() {
        return this.currentToken.textValue;
    }

    public long getLong() {
        return this.currentToken.longValue;
    }

    public double getDouble() {
        return this.currentToken.doubleValue;
    }

    private int get(Token token) {
        int n6;
        while ((n6 = this.readLine(token)) == 10) {
        }
        token.tokenId = n6;
        return n6;
    }

    private int readLine(Token token) {
        int n6 = this.getNextNonWhiteChar();
        if (n6 < 0) {
            return n6;
        }
        if (n6 == 10) {
            ++this.lineNumber;
            return 10;
        }
        if (n6 == 39) {
            return this.readCharConst(token);
        }
        if (n6 == 34) {
            return this.readStringL(token);
        }
        if (48 <= n6 && n6 <= 57) {
            return this.readNumber(n6, token);
        }
        if (n6 == 46) {
            n6 = this.getc();
            if (48 <= n6 && n6 <= 57) {
                StringBuffer stringBuffer = this.textBuffer;
                stringBuffer.setLength(0);
                stringBuffer.append('.');
                return this.readDouble(stringBuffer, n6, token);
            }
            this.ungetc(n6);
            return this.readSeparator(46);
        }
        if (Character.isJavaIdentifierStart((char)n6)) {
            return this.readIdentifier(n6, token);
        }
        return this.readSeparator(n6);
    }

    private int getNextNonWhiteChar() {
        int n6;
        block0: do {
            if ((n6 = this.getc()) != 47) continue;
            n6 = this.getc();
            if (n6 == 47) {
                while ((n6 = this.getc()) != 10 && n6 != 13 && n6 != -1) {
                }
                continue;
            }
            if (n6 == 42) {
                while ((n6 = this.getc()) != -1) {
                    if (n6 != 42) continue;
                    n6 = this.getc();
                    if (n6 == 47) {
                        n6 = 32;
                        continue block0;
                    }
                    this.ungetc(n6);
                }
            } else {
                this.ungetc(n6);
                n6 = 47;
            }
        } while (Lex.isBlank(n6));
        return n6;
    }

    private int readCharConst(Token token) {
        int n6;
        int n10 = 0;
        while ((n6 = this.getc()) != 39) {
            if (n6 == 92) {
                n10 = this.readEscapeChar();
                continue;
            }
            if (n6 < 32) {
                if (n6 == 10) {
                    ++this.lineNumber;
                }
                return 500;
            }
            n10 = n6;
        }
        token.longValue = n10;
        return 401;
    }

    private int readEscapeChar() {
        int n6 = this.getc();
        if (n6 == 110) {
            n6 = 10;
        } else if (n6 == 116) {
            n6 = 9;
        } else if (n6 == 114) {
            n6 = 13;
        } else if (n6 == 102) {
            n6 = 12;
        } else if (n6 == 10) {
            ++this.lineNumber;
        }
        return n6;
    }

    private int readStringL(Token token) {
        int n6;
        StringBuffer stringBuffer = this.textBuffer;
        stringBuffer.setLength(0);
        while (true) {
            if ((n6 = this.getc()) != 34) {
                if (n6 == 92) {
                    n6 = this.readEscapeChar();
                } else if (n6 == 10 || n6 < 0) {
                    ++this.lineNumber;
                    return 500;
                }
                stringBuffer.append((char)n6);
                continue;
            }
            while (true) {
                if ((n6 = this.getc()) == 10) {
                    ++this.lineNumber;
                    continue;
                }
                if (!Lex.isBlank(n6)) break;
            }
            if (n6 != 34) break;
        }
        this.ungetc(n6);
        token.textValue = stringBuffer.toString();
        return 406;
    }

    private int readNumber(int n6, Token token) {
        long l = 0L;
        int n10 = this.getc();
        if (n6 == 48) {
            if (n10 == 88 || n10 == 120) {
                while (true) {
                    if (48 <= (n6 = this.getc()) && n6 <= 57) {
                        l = l * 16L + (long)(n6 - 48);
                        continue;
                    }
                    if (65 <= n6 && n6 <= 70) {
                        l = l * 16L + (long)(n6 - 65 + 10);
                        continue;
                    }
                    if (97 > n6 || n6 > 102) break;
                    l = l * 16L + (long)(n6 - 97 + 10);
                }
                token.longValue = l;
                if (n6 == 76 || n6 == 108) {
                    return 403;
                }
                this.ungetc(n6);
                return 402;
            }
            if (48 <= n10 && n10 <= 55) {
                l = n10 - 48;
                while (48 <= (n6 = this.getc()) && n6 <= 55) {
                    l = l * 8L + (long)(n6 - 48);
                }
                token.longValue = l;
                if (n6 == 76 || n6 == 108) {
                    return 403;
                }
                this.ungetc(n6);
                return 402;
            }
        }
        l = n6 - 48;
        while (48 <= n10 && n10 <= 57) {
            l = l * 10L + (long)n10 - 48L;
            n10 = this.getc();
        }
        token.longValue = l;
        if (n10 == 70 || n10 == 102) {
            token.doubleValue = l;
            return 404;
        }
        if (n10 == 69 || n10 == 101 || n10 == 68 || n10 == 100 || n10 == 46) {
            StringBuffer stringBuffer = this.textBuffer;
            stringBuffer.setLength(0);
            stringBuffer.append(l);
            return this.readDouble(stringBuffer, n10, token);
        }
        if (n10 == 76 || n10 == 108) {
            return 403;
        }
        this.ungetc(n10);
        return 402;
    }

    private int readDouble(StringBuffer stringBuffer, int n6, Token token) {
        if (n6 != 69 && n6 != 101 && n6 != 68 && n6 != 100) {
            stringBuffer.append((char)n6);
            while (48 <= (n6 = this.getc()) && n6 <= 57) {
                stringBuffer.append((char)n6);
            }
        }
        if (n6 == 69 || n6 == 101) {
            stringBuffer.append((char)n6);
            n6 = this.getc();
            if (n6 == 43 || n6 == 45) {
                stringBuffer.append((char)n6);
                n6 = this.getc();
            }
            while (48 <= n6 && n6 <= 57) {
                stringBuffer.append((char)n6);
                n6 = this.getc();
            }
        }
        try {
            token.doubleValue = Double.parseDouble(stringBuffer.toString());
        }
        catch (NumberFormatException numberFormatException) {
            return 500;
        }
        if (n6 == 70 || n6 == 102) {
            return 404;
        }
        if (n6 != 68 && n6 != 100) {
            this.ungetc(n6);
        }
        return 405;
    }

    private int readSeparator(int n6) {
        int n10;
        if (33 <= n6 && n6 <= 63) {
            int n11 = equalOps[n6 - 33];
            if (n11 == 0) {
                return n6;
            }
            n10 = this.getc();
            if (n6 == n10) {
                switch (n6) {
                    case 61: {
                        return 358;
                    }
                    case 43: {
                        return 362;
                    }
                    case 45: {
                        return 363;
                    }
                    case 38: {
                        return 369;
                    }
                    case 60: {
                        int n12 = this.getc();
                        if (n12 == 61) {
                            return 365;
                        }
                        this.ungetc(n12);
                        return 364;
                    }
                    case 62: {
                        int n13 = this.getc();
                        if (n13 == 61) {
                            return 367;
                        }
                        if (n13 == 62) {
                            n13 = this.getc();
                            if (n13 == 61) {
                                return 371;
                            }
                            this.ungetc(n13);
                            return 370;
                        }
                        this.ungetc(n13);
                        return 366;
                    }
                }
            } else if (n10 == 61) {
                return n11;
            }
        } else if (n6 == 94) {
            n10 = this.getc();
            if (n10 == 61) {
                return 360;
            }
        } else if (n6 == 124) {
            n10 = this.getc();
            if (n10 == 61) {
                return 361;
            }
            if (n10 == 124) {
                return 368;
            }
        } else {
            return n6;
        }
        this.ungetc(n10);
        return n6;
    }

    private int readIdentifier(int n6, Token token) {
        StringBuffer stringBuffer = this.textBuffer;
        stringBuffer.setLength(0);
        do {
            stringBuffer.append((char)n6);
        } while (Character.isJavaIdentifierPart((char)(n6 = this.getc())));
        this.ungetc(n6);
        String string = stringBuffer.toString();
        int n10 = ktable.lookup(string);
        if (n10 >= 0) {
            return n10;
        }
        token.textValue = string;
        return 400;
    }

    private static boolean isBlank(int n6) {
        return n6 == 32 || n6 == 9 || n6 == 12 || n6 == 13 || n6 == 10;
    }

    private static boolean isDigit(int n6) {
        return 48 <= n6 && n6 <= 57;
    }

    private void ungetc(int n6) {
        this.lastChar = n6;
    }

    public String getTextAround() {
        int n6;
        int n10 = this.position - 10;
        if (n10 < 0) {
            n10 = 0;
        }
        if ((n6 = this.position + 10) > this.maxlen) {
            n6 = this.maxlen;
        }
        return this.input.substring(n10, n6);
    }

    private int getc() {
        if (this.lastChar < 0) {
            if (this.position < this.maxlen) {
                return this.input.charAt(this.position++);
            }
            return -1;
        }
        int n6 = this.lastChar;
        this.lastChar = -1;
        return n6;
    }

    static {
        ktable.append("abstract", 300);
        ktable.append("boolean", 301);
        ktable.append("break", 302);
        ktable.append("byte", 303);
        ktable.append("case", 304);
        ktable.append("catch", 305);
        ktable.append("char", 306);
        ktable.append("class", 307);
        ktable.append("const", 308);
        ktable.append("continue", 309);
        ktable.append("default", 310);
        ktable.append("do", 311);
        ktable.append("double", 312);
        ktable.append("else", 313);
        ktable.append("extends", 314);
        ktable.append("false", 411);
        ktable.append("final", 315);
        ktable.append("finally", 316);
        ktable.append("float", 317);
        ktable.append("for", 318);
        ktable.append("goto", 319);
        ktable.append("if", 320);
        ktable.append("implements", 321);
        ktable.append("import", 322);
        ktable.append("instanceof", 323);
        ktable.append("int", 324);
        ktable.append("interface", 325);
        ktable.append("long", 326);
        ktable.append("native", 327);
        ktable.append("new", 328);
        ktable.append("null", 412);
        ktable.append("package", 329);
        ktable.append("private", 330);
        ktable.append("protected", 331);
        ktable.append("public", 332);
        ktable.append("return", 333);
        ktable.append("short", 334);
        ktable.append("static", 335);
        ktable.append("strictfp", 347);
        ktable.append("super", 336);
        ktable.append("switch", 337);
        ktable.append("synchronized", 338);
        ktable.append("this", 339);
        ktable.append("throw", 340);
        ktable.append("throws", 341);
        ktable.append("transient", 342);
        ktable.append("true", 410);
        ktable.append("try", 343);
        ktable.append("void", 344);
        ktable.append("volatile", 345);
        ktable.append("while", 346);
    }
}

