package ABP;

public interface iStack <E>
{
    void push (E o);
    E top ();
    E pop();
    int size ();
    boolean empty();
    String printStack();
}
