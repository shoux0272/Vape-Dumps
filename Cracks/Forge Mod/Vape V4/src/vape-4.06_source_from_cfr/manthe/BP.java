/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package manthe;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import manthe.Dw;
import manthe.on;
import manthe.p2;

public class BP {
    private final Gson a = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    HttpsURLConnection b;

    public <T extends Dw> T a(String string, p2 p22, Class<T> class_) {
        try {
            String string2;
            URL uRL = new URL("https://authserver." + on.p.e().d().a() + ".com/" + string);
            String string3 = this.a.toJson((Object)p22);
            this.b = (HttpsURLConnection)uRL.openConnection();
            this.b.setRequestMethod("POST");
            this.b.setRequestProperty("Content-Type", "application/json");
            this.b.setRequestProperty("Content-Length", "" + string3.getBytes().length);
            this.b.setRequestProperty("Content-Language", "en-US");
            this.b.setUseCaches(false);
            this.b.setDoInput(true);
            this.b.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(this.b.getOutputStream());
            dataOutputStream.writeBytes(string3);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2);
                stringBuffer.append('\r');
            }
            bufferedReader.close();
            return (T)((Dw)this.a.fromJson(stringBuffer.toString(), class_));
        }
        catch (Exception exception) {
            try {
                if (this.b.getResponseCode() == 403) {
                    Scanner scanner = new Scanner(this.b.getErrorStream());
                    return (T)((Dw)this.a.fromJson(scanner.nextLine(), class_));
                }
                System.out.println("Unhandled error code: " + this.b.getResponseCode());
            }
            catch (IOException iOException) {
                on.a(iOException);
            }
            on.a(exception);
            return null;
        }
    }
}

