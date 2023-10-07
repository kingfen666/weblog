package org.kingfen;

import org.kingfen.html.*;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ReturnServer implements Runnable{
    Socket socket;
    public ReturnServer(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            String OldHead = bufferedReader.readLine();
            String head = OldHead.replace("GET /", "").replace(" HTTP/1.1", "");
            OutputStream outputStream = socket.getOutputStream();
            if (head.isEmpty()||head.equals("index.html")||head.equals("index")){
                outputStream.write("HTTP 200 OK\nAccess-Control-Allow-Origin: *\n\n".getBytes());
                outputStream.write(index.html);
                outputStream.flush();
            } else if (head.equals("log")||head.equals("index.html/log")||head.equals("index/log")) {
                outputStream.write("HTTP 200 OK\nAccess-Control-Allow-Origin: *\n\n".getBytes());
                socket.getOutputStream().write(ReturnLog.bytes());
                outputStream.flush();
            }else if (head.equals("index-344083e7.js")){
                outputStream.write("HTTP 200 OK\nAccess-Control-Allow-Origin: *\nContent-Type: application/javascript\n\n".getBytes());
                outputStream.write(index.js);
                outputStream.flush();
            }else if (head.equals("index-b9d25494.css")){
                outputStream.write("HTTP 200 OK\nAccess-Control-Allow-Origin: *\nContent-Type: text/css\n\n".getBytes());
                outputStream.write(index.css);
                outputStream.flush();
            }else if (head.equals("favicon.ico")){
                outputStream.write("HTTP 200 OK\nAccess-Control-Allow-Origin: *\n\n".getBytes());
                outputStream.write(index.favicon);
                outputStream.flush();
            }
            socket.close();


        } catch (Exception ignored) {
        }
    }
}
