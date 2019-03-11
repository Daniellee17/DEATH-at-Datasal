package myinterface;


public interface Queue<E> 
{
    public void create();
    public E first();
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public E get(int i);
    public void add(E elem);
    public void deque();
    public E top();
}
