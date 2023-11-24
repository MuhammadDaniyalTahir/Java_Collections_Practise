package com.mycompany.lab_3;

import java.util.Stack;

public class part6 {
    public static void main(String[] args){
        Stack st = new Stack<String>();
        st.push("I");
        st.push("Read");
        st.push("in");
        st.push("Fast");
        
        System.out.println("Stack is: " + st);
        
        st.pop();
        System.out.println("After pop(), stack is: " + st);
        
        if(st.empty())
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");
        
        System.out.println("peek() function gives: " + st.peek());
        
        
    }
}
