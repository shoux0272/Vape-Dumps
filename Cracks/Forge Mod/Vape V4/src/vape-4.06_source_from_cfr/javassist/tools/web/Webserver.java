/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.Translator;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import javassist.tools.web.BadHttpRequest;
import javassist.tools.web.ServiceThread;

public class Webserver {
    private ServerSocket socket;
    private ClassPool classPool;
    protected Translator translator;
    private static final byte[] endofline = new byte[]{13, 10};
    private static final int typeHtml = 1;
    private static final int typeClass = 2;
    private static final int typeGif = 3;
    private static final int typeJpeg = 4;
    private static final int typeText = 5;
    public String debugDir = null;
    public String htmlfileBase = null;
    private static int b;

    public static void main(String[] arrstring) throws IOException {
        if (arrstring.length == 1) {
            Webserver webserver = new Webserver(arrstring[0]);
            webserver.run();
        } else {
            System.err.println("Usage: java javassist.tools.web.Webserver <port number>");
        }
    }

    public Webserver(String string) throws IOException {
        this(Integer.parseInt(string));
    }

    public Webserver(int n6) throws IOException {
        this.socket = new ServerSocket(n6);
        this.classPool = null;
        this.translator = null;
    }

    public void setClassPool(ClassPool classPool) {
        this.classPool = classPool;
    }

    public void addTranslator(ClassPool classPool, Translator translator) throws NotFoundException, CannotCompileException {
        this.classPool = classPool;
        this.translator = translator;
        translator.start(this.classPool);
    }

    public void end() throws IOException {
        this.socket.close();
    }

    public void logging(String string) {
        System.out.println(string);
    }

    public void logging(String string, String string2) {
        System.out.print(string);
        System.out.print(" ");
        System.out.println(string2);
    }

    public void logging(String string, String string2, String string3) {
        System.out.print(string);
        System.out.print(" ");
        System.out.print(string2);
        System.out.print(" ");
        System.out.println(string3);
    }

    public void logging2(String string) {
        System.out.print("    ");
        System.out.println(string);
    }

    public void run() {
        System.err.println("ready to service...");
        while (true) {
            try {
                while (true) {
                    ServiceThread serviceThread = new ServiceThread(this, this.socket.accept());
                    serviceThread.start();
                }
            }
            catch (IOException iOException) {
                this.logging(iOException.toString());
                continue;
            }
            break;
        }
    }

    final void process(Socket socket) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        String string = this.readLine(bufferedInputStream);
        this.logging(socket.getInetAddress().getHostName(), new Date().toString(), string);
        while (this.skipLine(bufferedInputStream) > 0) {
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        try {
            this.doReply(bufferedInputStream, bufferedOutputStream, string);
        }
        catch (BadHttpRequest badHttpRequest) {
            this.replyError(bufferedOutputStream, badHttpRequest);
        }
        ((OutputStream)bufferedOutputStream).flush();
        ((InputStream)bufferedInputStream).close();
        ((OutputStream)bufferedOutputStream).close();
        socket.close();
    }

    private String readLine(InputStream inputStream) throws IOException {
        int n6;
        StringBuffer stringBuffer = new StringBuffer();
        while ((n6 = inputStream.read()) >= 0 && n6 != 13) {
            stringBuffer.append((char)n6);
        }
        inputStream.read();
        return stringBuffer.toString();
    }

    private int skipLine(InputStream inputStream) throws IOException {
        int n6;
        int n10 = 0;
        while ((n6 = inputStream.read()) >= 0 && n6 != 13) {
            ++n10;
        }
        inputStream.read();
        return n10;
    }

    public void doReply(InputStream inputStream, OutputStream outputStream, String string) throws IOException, BadHttpRequest {
        InputStream inputStream2;
        File file;
        String string2;
        if (!string.startsWith("GET /")) {
            throw new BadHttpRequest();
        }
        String string3 = string2 = string.substring(5, string.indexOf(32, 5));
        int n6 = string3.endsWith(".class") ? 2 : (string3.endsWith(".html") || string3.endsWith(".htm") ? 1 : (string3.endsWith(".gif") ? 3 : (string3.endsWith(".jpg") ? 4 : 5)));
        int n10 = string3.length();
        if (n6 == 2 && this.letUsersSendClassfile(outputStream, string3, n10)) {
            return;
        }
        this.checkFilename(string3, n10);
        if (this.htmlfileBase != null) {
            string3 = this.htmlfileBase + string3;
        }
        if (File.separatorChar != '/') {
            string3 = string3.replace('/', File.separatorChar);
        }
        if ((file = new File(string3)).canRead()) {
            this.sendHeader(outputStream, file.length(), n6);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] arrby = new byte[4096];
            while ((n10 = fileInputStream.read(arrby)) > 0) {
                outputStream.write(arrby, 0, n10);
            }
            fileInputStream.close();
            return;
        }
        if (n6 == 2 && (inputStream2 = this.getClass().getResourceAsStream("/" + string2)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] arrby = new byte[4096];
            while ((n10 = inputStream2.read(arrby)) > 0) {
                byteArrayOutputStream.write(arrby, 0, n10);
            }
            byte[] arrby2 = byteArrayOutputStream.toByteArray();
            this.sendHeader(outputStream, arrby2.length, 2);
            outputStream.write(arrby2);
            inputStream2.close();
            return;
        }
        throw new BadHttpRequest();
    }

    private void checkFilename(String string, int n6) throws BadHttpRequest {
        for (int k = 0; k < n6; ++k) {
            char c3 = string.charAt(k);
            if (Character.isJavaIdentifierPart(c3) || c3 == '.' || c3 == '/') continue;
            throw new BadHttpRequest();
        }
        if (string.indexOf("..") >= 0) {
            throw new BadHttpRequest();
        }
    }

    private boolean letUsersSendClassfile(OutputStream outputStream, String string, int n6) throws IOException, BadHttpRequest {
        byte[] arrby;
        if (this.classPool == null) {
            return false;
        }
        String string2 = string.substring(0, n6 - 6).replace('/', '.');
        try {
            if (this.translator != null) {
                this.translator.onLoad(this.classPool, string2);
            }
            CtClass ctClass = this.classPool.get(string2);
            arrby = ctClass.toBytecode();
            if (this.debugDir != null) {
                ctClass.writeFile(this.debugDir);
            }
        }
        catch (Exception exception) {
            throw new BadHttpRequest(exception);
        }
        this.sendHeader(outputStream, arrby.length, 2);
        outputStream.write(arrby);
        return true;
    }

    private void sendHeader(OutputStream outputStream, long l, int n6) throws IOException {
        outputStream.write("HTTP/1.0 200 OK".getBytes());
        outputStream.write(endofline);
        outputStream.write("Content-Length: ".getBytes());
        outputStream.write(Long.toString(l).getBytes());
        outputStream.write(endofline);
        if (n6 == 2) {
            outputStream.write("Content-Type: application/octet-stream".getBytes());
        } else if (n6 == 1) {
            outputStream.write("Content-Type: text/html".getBytes());
        } else if (n6 == 3) {
            outputStream.write("Content-Type: image/gif".getBytes());
        } else if (n6 == 4) {
            outputStream.write("Content-Type: image/jpg".getBytes());
        } else if (n6 == 5) {
            outputStream.write("Content-Type: text/plain".getBytes());
        }
        outputStream.write(endofline);
        outputStream.write(endofline);
    }

    private void replyError(OutputStream outputStream, BadHttpRequest badHttpRequest) throws IOException {
        this.logging2("bad request: " + badHttpRequest.toString());
        outputStream.write("HTTP/1.0 400 Bad Request".getBytes());
        outputStream.write(endofline);
        outputStream.write(endofline);
        outputStream.write("<H1>Bad Request</H1>".getBytes());
    }

    static {
        Webserver.b(51);
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int e() {
        return b;
    }

    public static int c() {
        int n6 = Webserver.e();
        if (n6 == 0) {
            return 49;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

