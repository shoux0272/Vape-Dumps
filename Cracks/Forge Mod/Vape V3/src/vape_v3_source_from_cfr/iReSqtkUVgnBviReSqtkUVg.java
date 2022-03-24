/*
 * Decompiled with CFR 0.150.
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.Inflater;

public class iReSqtkUVgnBviReSqtkUVg {
    private final byte[] a = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    private final int b = 1229472850;
    private final int c = 1347179589;
    private final int d = 1951551059;
    private final int e = 1229209940;
    private final int f = 1229278788;
    private final byte g = 0;
    private final byte h = (byte)2;
    private final byte i = (byte)3;
    private final byte j = (byte)4;
    private final byte k = (byte)6;
    private final InputStream l;
    private final byte[] m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private byte[] v;
    private byte[] w;
    private byte[] x;

    /*
     * Enabled aggressive block sorting
     */
    public iReSqtkUVgnBviReSqtkUVg(InputStream inputStream) {
        this.l = inputStream;
        this.m = new byte[4096];
        this.b(this.m, 0, this.a.length);
        if (!this.b(this.m)) {
            throw new IOException("Not a valid PNG file");
        }
        this.a(1229472850);
        this.f();
        this.i();
        block5: while (true) {
            this.j();
            switch (this.o) {
                case 1229209940: {
                    break block5;
                }
                case 1347179589: {
                    this.g();
                    break;
                }
                case 1951551059: {
                    this.h();
                }
            }
            this.i();
        }
        if (this.t == 3 && this.v == null) {
            throw new IOException("Missing PLTE chunk");
        }
    }

    public int a() {
        return this.r;
    }

    public int b() {
        return this.q;
    }

    public boolean c() {
        return this.t == 6 || this.t == 4;
    }

    public boolean d() {
        return this.c() || this.w != null || this.x != null;
    }

    public boolean e() {
        return this.t == 6 || this.t == 2 || this.t == 3;
    }

    public void a(byte by, byte by2, byte by3) {
        if (this.c()) {
            throw new UnsupportedOperationException("image has an alpha channel");
        }
        byte[] arrby = this.v;
        if (arrby == null) {
            this.x = new byte[]{0, by, 0, by2, 0, by3};
        } else {
            this.w = new byte[arrby.length / 3];
            int n = 0;
            int n2 = 0;
            while (n < arrby.length) {
                if (arrby[n] != by || arrby[n + 1] != by2 || arrby[n + 2] != by3) {
                    this.w[n2] = -1;
                }
                n += 3;
                ++n2;
            }
        }
    }

    public iReSqtkUVgwJYiReSqtkUVg a(iReSqtkUVgwJYiReSqtkUVg iReSqtkUVgwJYiReSqtkUVg2) {
        switch (this.t) {
            case 2: {
                switch (iReSqtkUVgwJYiReSqtkUVg2) {
                    case g: 
                    case e: 
                    case f: 
                    case d: {
                        return iReSqtkUVgwJYiReSqtkUVg2;
                    }
                }
                return iReSqtkUVgwJYiReSqtkUVg.d;
            }
            case 6: {
                switch (iReSqtkUVgwJYiReSqtkUVg2) {
                    case g: 
                    case e: 
                    case f: 
                    case d: {
                        return iReSqtkUVgwJYiReSqtkUVg2;
                    }
                }
                return iReSqtkUVgwJYiReSqtkUVg.e;
            }
            case 0: {
                switch (iReSqtkUVgwJYiReSqtkUVg2) {
                    case b: 
                    case a: {
                        return iReSqtkUVgwJYiReSqtkUVg2;
                    }
                }
                return iReSqtkUVgwJYiReSqtkUVg.b;
            }
            case 4: {
                return iReSqtkUVgwJYiReSqtkUVg.c;
            }
            case 3: {
                switch (iReSqtkUVgwJYiReSqtkUVg2) {
                    case g: 
                    case e: 
                    case f: {
                        return iReSqtkUVgwJYiReSqtkUVg2;
                    }
                }
                return iReSqtkUVgwJYiReSqtkUVg.e;
            }
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ByteBuffer byteBuffer, int n, iReSqtkUVgwJYiReSqtkUVg iReSqtkUVgwJYiReSqtkUVg2) {
        int n2 = byteBuffer.position();
        int n3 = (this.q * this.s + 7) / 8 * this.u;
        byte[] arrby = new byte[n3 + 1];
        byte[] arrby2 = new byte[n3 + 1];
        byte[] arrby3 = this.s < 8 ? new byte[this.q + 1] : null;
        Inflater inflater = new Inflater();
        try {
            for (int i = 0; i < this.r; ++i) {
                this.a(inflater, arrby, 0, arrby.length);
                this.d(arrby, arrby2);
                byteBuffer.position(n2 + i * n);
                block1 : switch (this.t) {
                    case 2: {
                        switch (iReSqtkUVgwJYiReSqtkUVg2) {
                            case g: {
                                this.b(byteBuffer, arrby);
                                break block1;
                            }
                            case e: {
                                this.c(byteBuffer, arrby);
                                break block1;
                            }
                            case f: {
                                this.d(byteBuffer, arrby);
                                break block1;
                            }
                            case d: {
                                this.a(byteBuffer, arrby);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 6: {
                        switch (iReSqtkUVgwJYiReSqtkUVg2) {
                            case g: {
                                this.e(byteBuffer, arrby);
                                break block1;
                            }
                            case e: {
                                this.a(byteBuffer, arrby);
                                break block1;
                            }
                            case f: {
                                this.f(byteBuffer, arrby);
                                break block1;
                            }
                            case d: {
                                this.g(byteBuffer, arrby);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 0: {
                        switch (iReSqtkUVgwJYiReSqtkUVg2) {
                            case b: 
                            case a: {
                                this.a(byteBuffer, arrby);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 4: {
                        switch (iReSqtkUVgwJYiReSqtkUVg2) {
                            case c: {
                                this.a(byteBuffer, arrby);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 3: {
                        switch (this.s) {
                            case 8: {
                                arrby3 = arrby;
                                break;
                            }
                            case 4: {
                                this.a(arrby, arrby3);
                                break;
                            }
                            case 2: {
                                this.b(arrby, arrby3);
                                break;
                            }
                            case 1: {
                                this.c(arrby, arrby3);
                                break;
                            }
                            default: {
                                throw new UnsupportedOperationException("Unsupported bitdepth for this image");
                            }
                        }
                        switch (iReSqtkUVgwJYiReSqtkUVg2) {
                            case g: {
                                this.h(byteBuffer, arrby3);
                                break block1;
                            }
                            case e: {
                                this.i(byteBuffer, arrby3);
                                break block1;
                            }
                            case f: {
                                this.j(byteBuffer, arrby3);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    default: {
                        throw new UnsupportedOperationException("Not yet implemented");
                    }
                }
                byte[] arrby4 = arrby;
                arrby = arrby2;
                arrby2 = arrby4;
            }
        }
        finally {
            inflater.end();
        }
    }

    public void b(ByteBuffer byteBuffer, int n, iReSqtkUVgwJYiReSqtkUVg iReSqtkUVgwJYiReSqtkUVg2) {
        if (n <= 0) {
            throw new IllegalArgumentException("stride");
        }
        int n2 = byteBuffer.position();
        int n3 = (this.r - 1) * n;
        byteBuffer.position(n2 + n3);
        this.a(byteBuffer, -n, iReSqtkUVgwJYiReSqtkUVg2);
        byteBuffer.position(byteBuffer.position() + n3);
    }

    private void a(ByteBuffer byteBuffer, byte[] arrby) {
        byteBuffer.put(arrby, 1, arrby.length - 1);
    }

    private void b(ByteBuffer byteBuffer, byte[] arrby) {
        if (this.x != null) {
            byte by = this.x[1];
            byte by2 = this.x[3];
            byte by3 = this.x[5];
            int n = arrby.length;
            for (int i = 1; i < n; i += 3) {
                byte by4 = arrby[i];
                byte by5 = arrby[i + 1];
                byte by6 = arrby[i + 2];
                byte by7 = -1;
                if (by4 == by && by5 == by2 && by6 == by3) {
                    by7 = 0;
                }
                byteBuffer.put(by7).put(by6).put(by5).put(by4);
            }
        } else {
            int n = arrby.length;
            for (int i = 1; i < n; i += 3) {
                byteBuffer.put((byte)-1).put(arrby[i + 2]).put(arrby[i + 1]).put(arrby[i]);
            }
        }
    }

    private void c(ByteBuffer byteBuffer, byte[] arrby) {
        if (this.x != null) {
            byte by = this.x[1];
            byte by2 = this.x[3];
            byte by3 = this.x[5];
            int n = arrby.length;
            for (int i = 1; i < n; i += 3) {
                byte by4 = arrby[i];
                byte by5 = arrby[i + 1];
                byte by6 = arrby[i + 2];
                byte by7 = -1;
                if (by4 == by && by5 == by2 && by6 == by3) {
                    by7 = 0;
                }
                byteBuffer.put(by4).put(by5).put(by6).put(by7);
            }
        } else {
            int n = arrby.length;
            for (int i = 1; i < n; i += 3) {
                byteBuffer.put(arrby[i]).put(arrby[i + 1]).put(arrby[i + 2]).put((byte)-1);
            }
        }
    }

    private void d(ByteBuffer byteBuffer, byte[] arrby) {
        if (this.x != null) {
            byte by = this.x[1];
            byte by2 = this.x[3];
            byte by3 = this.x[5];
            int n = arrby.length;
            for (int i = 1; i < n; i += 3) {
                byte by4 = arrby[i];
                byte by5 = arrby[i + 1];
                byte by6 = arrby[i + 2];
                byte by7 = -1;
                if (by4 == by && by5 == by2 && by6 == by3) {
                    by7 = 0;
                }
                byteBuffer.put(by6).put(by5).put(by4).put(by7);
            }
        } else {
            int n = arrby.length;
            for (int i = 1; i < n; i += 3) {
                byteBuffer.put(arrby[i + 2]).put(arrby[i + 1]).put(arrby[i]).put((byte)-1);
            }
        }
    }

    private void e(ByteBuffer byteBuffer, byte[] arrby) {
        int n = arrby.length;
        for (int i = 1; i < n; i += 4) {
            byteBuffer.put(arrby[i + 3]).put(arrby[i + 2]).put(arrby[i + 1]).put(arrby[i]);
        }
    }

    private void f(ByteBuffer byteBuffer, byte[] arrby) {
        int n = arrby.length;
        for (int i = 1; i < n; i += 4) {
            byteBuffer.put(arrby[i + 2]).put(arrby[i + 1]).put(arrby[i]).put(arrby[i + 3]);
        }
    }

    private void g(ByteBuffer byteBuffer, byte[] arrby) {
        int n = arrby.length;
        for (int i = 1; i < n; i += 4) {
            byteBuffer.put(arrby[i]).put(arrby[i + 1]).put(arrby[i + 2]);
        }
    }

    private void h(ByteBuffer byteBuffer, byte[] arrby) {
        if (this.w != null) {
            int n = arrby.length;
            for (int i = 1; i < n; ++i) {
                int n2 = arrby[i] & 0xFF;
                byte by = this.v[n2 * 3 + 0];
                byte by2 = this.v[n2 * 3 + 1];
                byte by3 = this.v[n2 * 3 + 2];
                byte by4 = this.w[n2];
                byteBuffer.put(by4).put(by3).put(by2).put(by);
            }
        } else {
            int n = arrby.length;
            for (int i = 1; i < n; ++i) {
                int n3 = arrby[i] & 0xFF;
                byte by = this.v[n3 * 3 + 0];
                byte by5 = this.v[n3 * 3 + 1];
                byte by6 = this.v[n3 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by7).put(by6).put(by5).put(by);
            }
        }
    }

    private void i(ByteBuffer byteBuffer, byte[] arrby) {
        if (this.w != null) {
            int n = arrby.length;
            for (int i = 1; i < n; ++i) {
                int n2 = arrby[i] & 0xFF;
                byte by = this.v[n2 * 3 + 0];
                byte by2 = this.v[n2 * 3 + 1];
                byte by3 = this.v[n2 * 3 + 2];
                byte by4 = this.w[n2];
                byteBuffer.put(by).put(by2).put(by3).put(by4);
            }
        } else {
            int n = arrby.length;
            for (int i = 1; i < n; ++i) {
                int n3 = arrby[i] & 0xFF;
                byte by = this.v[n3 * 3 + 0];
                byte by5 = this.v[n3 * 3 + 1];
                byte by6 = this.v[n3 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by).put(by5).put(by6).put(by7);
            }
        }
    }

    private void j(ByteBuffer byteBuffer, byte[] arrby) {
        if (this.w != null) {
            int n = arrby.length;
            for (int i = 1; i < n; ++i) {
                int n2 = arrby[i] & 0xFF;
                byte by = this.v[n2 * 3 + 0];
                byte by2 = this.v[n2 * 3 + 1];
                byte by3 = this.v[n2 * 3 + 2];
                byte by4 = this.w[n2];
                byteBuffer.put(by3).put(by2).put(by).put(by4);
            }
        } else {
            int n = arrby.length;
            for (int i = 1; i < n; ++i) {
                int n3 = arrby[i] & 0xFF;
                byte by = this.v[n3 * 3 + 0];
                byte by5 = this.v[n3 * 3 + 1];
                byte by6 = this.v[n3 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by6).put(by5).put(by).put(by7);
            }
        }
    }

    private void a(byte[] arrby, byte[] arrby2) {
        int n = arrby2.length;
        for (int i = 1; i < n; i += 2) {
            int n2 = arrby[1 + (i >> 1)] & 0xFF;
            switch (n - i) {
                default: {
                    arrby2[i + 1] = (byte)(n2 & 0xF);
                }
                case 1: 
            }
            arrby2[i] = (byte)(n2 >> 4);
        }
    }

    private void b(byte[] arrby, byte[] arrby2) {
        int n = arrby2.length;
        for (int i = 1; i < n; i += 4) {
            int n2 = arrby[1 + (i >> 2)] & 0xFF;
            switch (n - i) {
                default: {
                    arrby2[i + 3] = (byte)(n2 & 3);
                }
                case 3: {
                    arrby2[i + 2] = (byte)(n2 >> 2 & 3);
                }
                case 2: {
                    arrby2[i + 1] = (byte)(n2 >> 4 & 3);
                }
                case 1: 
            }
            arrby2[i] = (byte)(n2 >> 6);
        }
    }

    private void c(byte[] arrby, byte[] arrby2) {
        int n = arrby2.length;
        for (int i = 1; i < n; i += 8) {
            int n2 = arrby[1 + (i >> 3)] & 0xFF;
            switch (n - i) {
                default: {
                    arrby2[i + 7] = (byte)(n2 & 1);
                }
                case 7: {
                    arrby2[i + 6] = (byte)(n2 >> 1 & 1);
                }
                case 6: {
                    arrby2[i + 5] = (byte)(n2 >> 2 & 1);
                }
                case 5: {
                    arrby2[i + 4] = (byte)(n2 >> 3 & 1);
                }
                case 4: {
                    arrby2[i + 3] = (byte)(n2 >> 4 & 1);
                }
                case 3: {
                    arrby2[i + 2] = (byte)(n2 >> 5 & 1);
                }
                case 2: {
                    arrby2[i + 1] = (byte)(n2 >> 6 & 1);
                }
                case 1: 
            }
            arrby2[i] = (byte)(n2 >> 7);
        }
    }

    private void d(byte[] arrby, byte[] arrby2) {
        switch (arrby[0]) {
            case 0: {
                break;
            }
            case 1: {
                this.a(arrby);
                break;
            }
            case 2: {
                this.e(arrby, arrby2);
                break;
            }
            case 3: {
                this.f(arrby, arrby2);
                break;
            }
            case 4: {
                this.g(arrby, arrby2);
                break;
            }
            default: {
                throw new IOException("invalide filter type in scanline: " + arrby[0]);
            }
        }
    }

    private void a(byte[] arrby) {
        int n = this.u;
        int n2 = arrby.length;
        for (int i = n + 1; i < n2; ++i) {
            int n3 = i;
            arrby[n3] = (byte)(arrby[n3] + arrby[i - n]);
        }
    }

    private void e(byte[] arrby, byte[] arrby2) {
        int n = this.u;
        int n2 = arrby.length;
        for (int i = 1; i < n2; ++i) {
            int n3 = i;
            arrby[n3] = (byte)(arrby[n3] + arrby2[i]);
        }
    }

    private void f(byte[] arrby, byte[] arrby2) {
        int n;
        int n2 = this.u;
        for (n = 1; n <= n2; ++n) {
            int n3 = n;
            arrby[n3] = (byte)(arrby[n3] + (byte)((arrby2[n] & 0xFF) >>> 1));
        }
        int n4 = arrby.length;
        while (n < n4) {
            int n5 = n;
            arrby[n5] = (byte)(arrby[n5] + (byte)((arrby2[n] & 0xFF) + (arrby[n - n2] & 0xFF) >>> 1));
            ++n;
        }
    }

    private void g(byte[] arrby, byte[] arrby2) {
        int n;
        int n2 = this.u;
        for (n = 1; n <= n2; ++n) {
            int n3 = n;
            arrby[n3] = (byte)(arrby[n3] + arrby2[n]);
        }
        int n4 = arrby.length;
        while (n < n4) {
            int n5;
            int n6;
            int n7 = arrby[n - n2] & 0xFF;
            int n8 = arrby2[n] & 0xFF;
            int n9 = arrby2[n - n2] & 0xFF;
            int n10 = n7 + n8 - n9;
            int n11 = n10 - n7;
            if (n11 < 0) {
                n11 = -n11;
            }
            if ((n6 = n10 - n8) < 0) {
                n6 = -n6;
            }
            if ((n5 = n10 - n9) < 0) {
                n5 = -n5;
            }
            if (n11 <= n6 && n11 <= n5) {
                n9 = n7;
            } else if (n6 <= n5) {
                n9 = n8;
            }
            int n12 = n++;
            arrby[n12] = (byte)(arrby[n12] + (byte)n9);
        }
    }

    private void f() {
        this.b(13);
        this.a(this.m, 0, 13);
        this.q = this.a(this.m, 0);
        this.r = this.a(this.m, 4);
        this.s = this.m[8] & 0xFF;
        this.t = this.m[9] & 0xFF;
        block0 : switch (this.t) {
            case 0: {
                if (this.s != 8) {
                    throw new IOException("Unsupported bit depth: " + this.s);
                }
                this.u = 1;
                break;
            }
            case 4: {
                if (this.s != 8) {
                    throw new IOException("Unsupported bit depth: " + this.s);
                }
                this.u = 2;
                break;
            }
            case 2: {
                if (this.s != 8) {
                    throw new IOException("Unsupported bit depth: " + this.s);
                }
                this.u = 3;
                break;
            }
            case 6: {
                if (this.s != 8) {
                    throw new IOException("Unsupported bit depth: " + this.s);
                }
                this.u = 4;
                break;
            }
            case 3: {
                switch (this.s) {
                    case 1: 
                    case 2: 
                    case 4: 
                    case 8: {
                        this.u = 1;
                        break block0;
                    }
                }
                throw new IOException("Unsupported bit depth: " + this.s);
            }
            default: {
                throw new IOException("unsupported color format: " + this.t);
            }
        }
        if (this.m[10] != 0) {
            throw new IOException("unsupported compression method");
        }
        if (this.m[11] != 0) {
            throw new IOException("unsupported filtering method");
        }
        if (this.m[12] != 0) {
            throw new IOException("unsupported interlace method");
        }
    }

    private void g() {
        int n = this.n / 3;
        if (n < 1 || n > 256 || this.n % 3 != 0) {
            throw new IOException("PLTE chunk has wrong length");
        }
        this.v = new byte[n * 3];
        this.a(this.v, 0, this.v.length);
    }

    private void h() {
        switch (this.t) {
            case 0: {
                this.b(2);
                this.x = new byte[2];
                this.a(this.x, 0, 2);
                break;
            }
            case 2: {
                this.b(6);
                this.x = new byte[6];
                this.a(this.x, 0, 6);
                break;
            }
            case 3: {
                if (this.v == null) {
                    throw new IOException("tRNS chunk without PLTE chunk");
                }
                this.w = new byte[this.v.length / 3];
                Arrays.fill(this.w, (byte)-1);
                this.a(this.w, 0, this.w.length);
                break;
            }
        }
    }

    private void i() {
        if (this.p > 0) {
            this.a((long)(this.p + 4));
        } else {
            this.b(this.m, 0, 4);
        }
        this.p = 0;
        this.n = 0;
        this.o = 0;
    }

    private void j() {
        this.b(this.m, 0, 8);
        this.n = this.a(this.m, 0);
        this.o = this.a(this.m, 4);
        this.p = this.n;
    }

    private void a(int n) {
        this.j();
        if (this.o != n) {
            throw new IOException("Expected chunk: " + Integer.toHexString(n));
        }
    }

    private void b(int n) {
        if (this.n != n) {
            throw new IOException("Chunk has wrong size");
        }
    }

    private int a(byte[] arrby, int n, int n2) {
        if (n2 > this.p) {
            n2 = this.p;
        }
        this.b(arrby, n, n2);
        this.p -= n2;
        return n2;
    }

    private void a(Inflater inflater) {
        while (this.p == 0) {
            this.i();
            this.a(1229209940);
        }
        int n = this.a(this.m, 0, this.m.length);
        inflater.setInput(this.m, 0, n);
    }

    private void a(Inflater inflater, byte[] arrby, int n, int n2) {
        try {
            do {
                int n3;
                if ((n3 = inflater.inflate(arrby, n, n2)) <= 0) {
                    if (inflater.finished()) {
                        throw new EOFException();
                    }
                    if (inflater.needsInput()) {
                        this.a(inflater);
                        continue;
                    }
                    throw new IOException("Can't inflate " + n2 + " bytes");
                }
                n += n3;
                n2 -= n3;
            } while (n2 > 0);
        }
        catch (Exception exception) {
            throw (IOException)new IOException("inflate error").initCause(exception);
        }
    }

    private void b(byte[] arrby, int n, int n2) {
        int n3;
        do {
            if ((n3 = this.l.read(arrby, n, n2)) < 0) {
                throw new EOFException();
            }
            n += n3;
        } while ((n2 -= n3) > 0);
    }

    private int a(byte[] arrby, int n) {
        return arrby[n] << 24 | (arrby[n + 1] & 0xFF) << 16 | (arrby[n + 2] & 0xFF) << 8 | arrby[n + 3] & 0xFF;
    }

    private void a(long l) {
        while (l > 0L) {
            long l2 = this.l.skip(l);
            if (l2 < 0L) {
                throw new EOFException();
            }
            l -= l2;
        }
    }

    private boolean b(byte[] arrby) {
        for (int i = 0; i < this.a.length; ++i) {
            if (arrby[i] == this.a[i]) continue;
            return false;
        }
        return true;
    }
}

