package myinterface;


public interface Stack <E> {
    
    public E peek();
    public boolean full();
    public boolean empty();
    public void push(E item);
    public E pop();
}
