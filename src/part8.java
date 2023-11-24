package com.mycompany.lab_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class part8 {
    public static void main(String[] args){
        List l1 = new ArrayList<Integer>();
        l1.add(3);
        l1.add(2);
        l1.add(43);
        l1.add(28);
        l1.add(101);
        Collections.sort(l1);
        System.out.println(l1);
    }
    
    
}
