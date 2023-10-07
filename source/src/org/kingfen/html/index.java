package org.kingfen.html;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;

public class index {
    public static byte[] html;
    public static byte[] css;
    public static byte[] js;
    public static byte[] favicon;

    public static void boot() {
        try {

            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("./html/index.html"));
            html = bufferedInputStream.readAllBytes();
            BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream("./html/index-344083e7.js"));
            js = bufferedInputStream1.readAllBytes();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream("./html/index-b9d25494.css"));
            css = bufferedInputStream2.readAllBytes();
            BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream("./html/favicon.ico"));
            favicon = bufferedInputStream3.readAllBytes();
            bufferedInputStream.close();
            bufferedInputStream1.close();
            bufferedInputStream2.close();
            bufferedInputStream3.close();
        } catch (Exception ignored) {
        }

    }

}
