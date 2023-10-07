package org.kingfen;

import org.kingfen.util.ListJson;

import java.io.*;

public class ReturnLog {
    static String logfile="./src/main/resources/main.log";
    public static byte[] bytes()  {
        BufferedReader bufferedReader = null;
        ListJson listJson = new ListJson();
        try {
             bufferedReader=new BufferedReader(new FileReader(logfile));
            String s;


            while((s=bufferedReader.readLine())!=null){
                s=s.replace("\\","\\\\");
                s=s.replace("\"","\\\"");
                String[] split = s.split(" {4}");
                listJson.add("time",split[0]);
                listJson.add("grade",split[1]);
                listJson.add("address",split[2]);

                StringBuilder temp = new StringBuilder();
                for (int i = 3; i < split.length; i++) {
                    temp.append(split[i]);
                }
                listJson.add("message",temp.toString());
                listJson.end();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listJson.toString().getBytes();
    }
}
