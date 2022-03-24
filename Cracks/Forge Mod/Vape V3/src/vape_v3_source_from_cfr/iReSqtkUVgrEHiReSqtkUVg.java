/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class iReSqtkUVgrEHiReSqtkUVg
extends iReSqtkUVgbBTiReSqtkUVg {
    public iReSqtkUVgrEHiReSqtkUVg(Object object) {
        super(object);
    }

    public List<iReSqtkUVgkoQiReSqtkUVg> d() {
        List list = iReSqtkUVgrEHiReSqtkUVg.a.c().bL.a(this.b);
        ArrayList<iReSqtkUVgkoQiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgkoQiReSqtkUVg>();
        for (Object e : list) {
            arrayList.add(new iReSqtkUVgkoQiReSqtkUVg(e));
        }
        return arrayList;
    }

    public List<iReSqtkUVgJCGiReSqtkUVg>[][] e() {
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            List[][] arrlist = iReSqtkUVgNWKiReSqtkUVg.a(iReSqtkUVgrEHiReSqtkUVg.a.c().bL, this.b);
            ArrayList[][] arrarrarrayList = new ArrayList[4][];
            int n = 0;
            for (List[] arrlist2 : arrlist) {
                ArrayList[] arrarrayList = new ArrayList[arrlist2.length];
                for (int i = 0; i < arrlist2.length; ++i) {
                    List list = arrlist2[i];
                    ArrayList<iReSqtkUVgJCGiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgJCGiReSqtkUVg>();
                    for (Object e : list) {
                        arrayList.add(new iReSqtkUVgJCGiReSqtkUVg(e));
                    }
                    arrarrayList[i] = arrayList;
                }
                arrarrarrayList[n] = arrarrayList;
                ++n;
            }
            return arrarrarrayList;
        }
        ArrayList[][] arrarrarrayList = new ArrayList[1][];
        List[] arrlist = iReSqtkUVgNWKiReSqtkUVg.b(iReSqtkUVgrEHiReSqtkUVg.a.c().bL, this.b);
        int n = 0;
        ArrayList[] arrarrayList = new ArrayList[4];
        for (int i = 0; i < arrlist.length; ++i) {
            List list = arrlist[i];
            ArrayList<iReSqtkUVgJCGiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgJCGiReSqtkUVg>();
            for (Object e : list) {
                arrayList.add(new iReSqtkUVgJCGiReSqtkUVg(e));
            }
            arrarrayList[i] = arrayList;
        }
        arrarrarrayList[n] = arrarrayList;
        return arrarrarrayList;
    }
}

