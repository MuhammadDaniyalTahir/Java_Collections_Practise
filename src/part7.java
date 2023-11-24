package com.mycompany.lab_3;

import java.util.LinkedList;

public class part7 {
    public static void main(String[] args){
        Queue q = new Queue<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        
        q.dequeue();
        q.dequeue();
        
        System.out.println("Queue's first element is(after two times dequeue): " + q.peek());
        
        System.out.println("Size of queue is: " + q.size());
        if(q.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
        
    }
}

class Queue<T>{
    private LinkedList<T> list;
    
    public Queue(){
        list = new LinkedList<T>();
    }
    void enqueue(T element){
        list.addLast(element);
    }
    void dequeue(){
        list.removeFirst();
    }
    T peek(){
        return list.getFirst();
    }
    boolean isEmpty(){
        return list.isEmpty();
    }
    int size(){
        return list.size();
    }
    
}
