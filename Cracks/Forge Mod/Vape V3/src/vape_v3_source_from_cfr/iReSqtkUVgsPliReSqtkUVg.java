/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class iReSqtkUVgsPliReSqtkUVg
implements Runnable {
    private List<iReSqtkUVgWjniReSqtkUVg> a;
    private List<iReSqtkUVgowliReSqtkUVg> b;
    private iReSqtkUVgkzHiReSqtkUVg c;
    private boolean d;
    private boolean e;
    private final int[][] f = new int[][]{{0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}};
    private final List<Integer> g = Arrays.asList(0, 8, 9, 30);

    public iReSqtkUVgsPliReSqtkUVg(List<iReSqtkUVgWjniReSqtkUVg> list, List<iReSqtkUVgowliReSqtkUVg> list2, iReSqtkUVgkzHiReSqtkUVg iReSqtkUVgkzHiReSqtkUVg2) {
        this.a = list;
        this.b = list2;
        this.c = iReSqtkUVgkzHiReSqtkUVg2;
    }

    public iReSqtkUVgWjniReSqtkUVg a(int n, int n2, int n3) {
        for (iReSqtkUVgWjniReSqtkUVg iReSqtkUVgWjniReSqtkUVg2 : this.a) {
            if (iReSqtkUVgWjniReSqtkUVg2.a != n || iReSqtkUVgWjniReSqtkUVg2.b != n2 || iReSqtkUVgWjniReSqtkUVg2.c != n3) continue;
            return iReSqtkUVgWjniReSqtkUVg2;
        }
        return null;
    }

    private boolean b(int n, int n2, int n3) {
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        for (int[] arrn : this.f) {
            iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVguqNiReSqtkUVg2.a(n + arrn[0], n2 + arrn[1], n3 + arrn[2]);
            int n4 = iReSqtkUVgGrkiReSqtkUVg.a(iReSqtkUVgGrkiReSqtkUVg2);
            if (!this.g.contains(n4)) continue;
            return true;
        }
        return false;
    }

    private Color a(int n, int n2) {
        for (iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2 : this.b) {
            if (!iReSqtkUVgowliReSqtkUVg2.a(n, n2)) continue;
            return iReSqtkUVgowliReSqtkUVg2.b();
        }
        return null;
    }

    @Override
    public void run() {
        block11: {
            try {
                block4: while (this.d) {
                    try {
                        Thread.sleep(50L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                    if (iReSqtkUVgeLLiReSqtkUVg.g().b() || iReSqtkUVgeLLiReSqtkUVg.e().b()) continue;
                    iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
                    iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
                    int n = this.c.i().intValue();
                    this.b(0, 0, 0);
                    for (int i = -n; i < n; ++i) {
                        for (int k = -n; k < n; ++k) {
                            for (int i2 = -n; i2 < n; ++i2) {
                                if (this.d) {
                                    boolean bl;
                                    if (iReSqtkUVgeLLiReSqtkUVg.g().b() || !iReSqtkUVgeLLiReSqtkUVg.g().equals(iReSqtkUVguqNiReSqtkUVg2) || iReSqtkUVgeLLiReSqtkUVg.e().b() || !iReSqtkUVgeLLiReSqtkUVg.e().equals(iReSqtkUVgtlXiReSqtkUVg2)) {
                                        this.a.clear();
                                        continue block4;
                                    }
                                    int n2 = (int)iReSqtkUVgtlXiReSqtkUVg2.z() + i;
                                    int n3 = (int)iReSqtkUVgtlXiReSqtkUVg2.A() + i2;
                                    int n4 = (int)iReSqtkUVgtlXiReSqtkUVg2.B() + k;
                                    iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVguqNiReSqtkUVg2.a(n2, n3, n4);
                                    int n5 = iReSqtkUVgGrkiReSqtkUVg.a(iReSqtkUVgGrkiReSqtkUVg2);
                                    int n6 = iReSqtkUVgGrkiReSqtkUVg2.a(n2, n3, n4);
                                    iReSqtkUVgWjniReSqtkUVg iReSqtkUVgWjniReSqtkUVg2 = this.a(n2, n3, n4);
                                    boolean bl2 = bl = iReSqtkUVgWjniReSqtkUVg2 != null;
                                    if (!bl) {
                                        Color color = this.a(n5, n6);
                                        if (color == null || this.e && !this.b(n2, n3, n4)) continue;
                                        this.a.add(new iReSqtkUVgWjniReSqtkUVg(n2, n3, n4, n5, color));
                                        continue;
                                    }
                                    if (n5 == iReSqtkUVgWjniReSqtkUVg2.d && !(iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgtlXiReSqtkUVg2, (double)n2, (double)n3, (double)n4) > 200.0)) continue;
                                    this.a.remove(iReSqtkUVgWjniReSqtkUVg2);
                                    continue;
                                }
                                break block11;
                            }
                        }
                    }
                }
            }
            catch (Exception exception) {
                iReSqtkUVgFuiiReSqtkUVg.a(exception);
            }
        }
    }

    public void a() {
        this.d = true;
        new Thread(this).start();
    }

    public void b() {
        this.d = false;
    }

    public void a(boolean bl) {
        this.e = bl;
    }
}

