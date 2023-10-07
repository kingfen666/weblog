package org.kingfen;

import org.kingfen.html.index;

public class LogBoot {
    public LogBoot(int port, String logfile) {
        new StartLogWindow(port).start();
        ReturnLog.logfile = logfile;
        index.boot();
    }

    public LogBoot(int port) {
        new StartLogWindow(port).start();
        index.boot();
    }

    public LogBoot(String logfile) {
        new StartLogWindow().start();
        ReturnLog.logfile = logfile;
        index.boot();
    }
    public LogBoot(){
        new StartLogWindow().start();
        index.boot();
    }


}
