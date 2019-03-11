package queue;


import queue.Queue;


public class MyQueue <E> implements Queue <E>
{
    private int QUEUEsize=99;
    public int front;
    public int rear;
    private E[] items;
    private int numItems;    

    public void create() 
    {
        items = ( E[]) new Object[QUEUEsize];
        numItems =0;
        front = 0;
        rear = -1;
    }

    public void add(E element) 
    {
        if(isFull())
        {
           System.out.println("Queue full");
        }
        
        else
        {
            rear = (rear+1)%QUEUEsize;
            items[rear] = element;
            numItems++;
        }
    }

    public void deque() 
    {
        if(isEmpty())
        {
            System.out.println("<Queue empty no need to dequeue>");
        }                                                                                                                                                                                                                                    
        else
        {
            for(int i=0; i<numItems; i++)
            {
                items[i] = items[i+1];
            }
            rear = rear-1;
            numItems--;
        }
    }

    public E top()
    {
        return items[rear];
    }

    public E first() 
    {
        return items[front];
    }

    public int size() 
    {
        return numItems;
    }

    public boolean isEmpty()
    {
        return numItems==0;
    }

    public boolean isFull()
    {
        return numItems==QUEUEsize;
    }
    
    public E get(int i)
    {
        return items[i];
    }
}
