package org.kingfen.util;

public class ListJson {
    StringBuilder stringBuilder=new StringBuilder("{\"list\":[{");
    public void add(String name,String value){
        stringBuilder.append("\"").append(name).append("\":").append("\"").append(value).append("\",");
    }
    public void end(){
        stringBuilder.deleteCharAt(stringBuilder.length()-1).append("},{");
    }

    public String toString(){
        return stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length()).append("]}").toString();
    }


}
