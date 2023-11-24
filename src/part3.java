package com.mycompany.lab_3;
import java.util.ArrayList;

public class part3 {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(100);
        
        
        list.remove(1);
        System.out.println("After removing");
        for(Number n : list){
            System.out.println(n.intValue());
        }
        if(list.contains(789)){
            System.out.println("yes it contains 789");
        }
        else{
            System.out.println("not contains 789");
        }
        
        System.out.println("Size of arraylist is: " + list.size());
        
        
        for(Number n : list){  //iterate through the list
            System.out.println(n.intValue());
        }
        
    }
    
}
