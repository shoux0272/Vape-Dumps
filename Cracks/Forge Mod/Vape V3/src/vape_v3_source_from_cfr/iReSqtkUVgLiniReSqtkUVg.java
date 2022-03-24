/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
import a.a;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.io.StringReader;

class iReSqtkUVgLiniReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgKLIiReSqtkUVg a;

    iReSqtkUVgLiniReSqtkUVg(iReSqtkUVgKLIiReSqtkUVg iReSqtkUVgKLIiReSqtkUVg2) {
        this.a = iReSqtkUVgKLIiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.k().a(iReSqtkUVgKLIiReSqtkUVg.a(this.a).f());
        String string = new String(a.a.sp("/config/pub/get.individual.php", "profile_id=" + iReSqtkUVgKLIiReSqtkUVg.a(this.a).f().toString() + "&owns=" + (iReSqtkUVgnWNiReSqtkUVg2 != null ? "1" : "0")));
        if (string.length() == 0) {
            return;
        }
        try {
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(true);
            JsonElement jsonElement = (JsonElement)new Gson().fromJson(jsonReader, JsonElement.class);
            if (jsonElement == null || jsonElement.isJsonNull() || !jsonElement.isJsonArray()) {
                return;
            }
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            if (jsonArray.size() == 0) {
                return;
            }
            JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
            if (iReSqtkUVgnWNiReSqtkUVg2 != null) {
                iReSqtkUVgnWNiReSqtkUVg2.b(jsonObject);
            } else {
                iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2 = new iReSqtkUVgntKiReSqtkUVg("", "");
                iReSqtkUVgntKiReSqtkUVg2.b(jsonObject);
                iReSqtkUVgFuiiReSqtkUVg.e.k().b(iReSqtkUVgntKiReSqtkUVg2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

