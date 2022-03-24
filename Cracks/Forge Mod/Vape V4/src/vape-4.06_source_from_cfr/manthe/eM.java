/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.V;
import manthe.cy;
import manthe.eA;
import manthe.ed;
import manthe.hy;

public class eM
extends cy {
    public eM(Object object) {
        super(object);
    }

    public List<ed> g() {
        List list = eM.a.M().bm.c(this.b);
        ArrayList<ed> arrayList = new ArrayList<ed>();
        for (Object e10 : list) {
            arrayList.add(new ed(e10));
        }
        return arrayList;
    }

    public List<eA>[][] f() {
        if (V.c() > 13) {
            List[][] arrlist = hy.a(eM.a.M().bm, this.b);
            ArrayList[][] arrarrarrayList = new ArrayList[4][];
            int n6 = 0;
            for (List[] arrlist2 : arrlist) {
                ArrayList[] arrarrayList = new ArrayList[arrlist2.length];
                for (int k = 0; k < arrlist2.length; ++k) {
                    List list = arrlist2[k];
                    ArrayList<eA> arrayList = new ArrayList<eA>();
                    for (Object e10 : list) {
                        arrayList.add(new eA(e10));
                    }
                    arrarrayList[k] = arrayList;
                }
                arrarrarrayList[n6] = arrarrayList;
                ++n6;
            }
            return arrarrarrayList;
        }
        ArrayList[][] arrarrarrayList = new ArrayList[1][];
        List[] arrlist = hy.b(eM.a.M().bm, this.b);
        int n10 = 0;
        ArrayList[] arrarrayList = new ArrayList[4];
        for (int k = 0; k < arrlist.length; ++k) {
            List list = arrlist[k];
            ArrayList<eA> arrayList = new ArrayList<eA>();
            for (Object e11 : list) {
                arrayList.add(new eA(e11));
            }
            arrarrayList[k] = arrayList;
        }
        arrarrarrayList[n10] = arrarrayList;
        return arrarrarrayList;
    }
}

