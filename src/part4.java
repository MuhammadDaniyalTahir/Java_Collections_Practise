package com.mycompany.lab_3;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class part4 {
    public static void main(String[] args){
        Map<Number, String> map = new HashMap<Number, String>();
        map.put(101, "BlockChain");
        map.put(102, "Development");
        map.put(103, "SQA");
        
        System.out.println(map.get(102));
        
        if(map.containsKey(104)){
            System.out.println("yes this key exists");
        }
        else{
            System.out.println("does'nt exists");
        }
        Iterator<Map.Entry<Number, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Number, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
    }
}