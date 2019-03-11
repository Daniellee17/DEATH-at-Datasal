package mystack;

import myinterface.Stack;

public class MyStack<E> implements Stack<E>{

    private int maxsize = 10;
    private E[] value;
    private int numItems = 0;
    public int tostack;
    
    public MyStack() {
        value = (E[]) new Object [maxsize];
        tostack=-1;
    }

    public E peek() {
        return value[tostack];  
    }


    public boolean full() {
     return (tostack == maxsize-1);
    }

    public boolean empty() {
     return (tostack == -1);
    }

    public void push(E item) {
    if (full()){
        System.out.println("MAXIMUM SIZE REACHED");
    }
    else{
        tostack++;
        value [tostack]= item; 
    }
    }
    @Override
    public E pop() {
       
        return (value [tostack--]); 
    }
}
    
    
    

