package org.kingfen;

import java.net.ServerSocket;

public class StartLogWindow extends Thread {
    int port;
    ServerSocket serverSocket;

    public StartLogWindow(int port) {
        boolean portChange = false;
        this.port = port;
        while (true) {
            try {

                serverSocket = new ServerSocket(this.port);
                break;
            } catch (Exception e) {
                this.port++;//端口被占用，加1；
                portChange = true;//记录端口已被改变
            }
        }
        if (portChange) {
            System.out.println("输入端口已被占用，现在正在使用" + this.port + "端口");
        }
        System.out.println("访问地址: http://localhost:" + this.port + "/index.html");
    }

    public StartLogWindow() {
        this.port = 80;
        while (true) {
            try {

                serverSocket = new ServerSocket(this.port);
                break;
            } catch (Exception e) {
                this.port++;//端口被占用，加1；

            }
        }
        System.out.println("访问地址: http://localhost:" + this.port + "/index.html");
    }

    public void run() {
        try {
            while (true) {
                new Thread(new ReturnServer(serverSocket.accept())).start();
            }
        } catch (Exception ignored) {}
    }
}
