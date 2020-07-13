package ABPP;

public interface iStack <E>
{
    public void push (E o);
    public E top ();
    public E pop();
    public int size ();
    public boolean empty();
    public String printStack();
}
