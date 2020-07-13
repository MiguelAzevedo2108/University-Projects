package Boggle;

public interface iLinkedList <T>
{
    void add (int i, T element);
    void remove(int i);
    T get (int i);
    boolean isEmpty();
    String toString ();
    int size();
}
