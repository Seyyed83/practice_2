package org.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.controller.Constants.Strings;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class JsonConfigController {
    private static JSONObject jsonObject = new JSONObject();
    private static final ObjectMapper objectMapper=new ObjectMapper();


//    public static void defaultJsonSetting() {
//        int[] a={0,1,2,3,4,5,6,7,0,8};
//        int[] b={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,0,15};
//        jsonObject.put("n",3);
//        jsonObject.put("isCli",false);
//        jsonObject.put("defaultBoard3",a);
//        jsonObject.put("defaultBoard4",b);
//        jsonObject.put("diagonal",false);
//        try {
//            objectMapper.writeValue(new File(Constant.BASE_OF_ADDRESS.concat("myData.json")), jsonObject);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public static Object  simpleGet(String s){
        return jsonObject.get(s);
    }
    public static int arrayGet(String s,int i){
        return (int) (((long) ((JSONArray) jsonObject.get(s)).get(i))%20);
    }
    public static void setJsonFile(String[] strings,Object[] objects){
        if (strings.length!=objects.length) System.out.println("not valid set");
        for (int i=0;i<strings.length;i++) jsonObject.put(strings[i],objects[i]);
        try {
            objectMapper.writeValue(new File(Strings.BASE_OF_ADDRESS.getValue()+"myData.json"), jsonObject);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setJsonObject(){
        try {
            jsonObject=(JSONObject) new JSONParser().parse(new FileReader(Strings.BASE_OF_ADDRESS.getValue()+"myData.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
