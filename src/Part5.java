package com.mycompany.lab_3;

import java.util.LinkedList;

public class Part5 {
    public static void main(String[] args){
        LinkedList l1 = new LinkedList<Integer>();
        l1.add(22);
        l1.add(23);
        l1.add(24);
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
        System.out.println("After adding at first and at last");
        l1.addFirst(1);
        l1.addLast(100);
        
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
        l1.removeFirstOccurrence(23);
        System.out.println("After removing 23");
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
        if(l1.contains(24))
            System.out.println("yes it contains 24");
        else
            System.out.println("it does'nt contains 24");
        
    }
    
}
