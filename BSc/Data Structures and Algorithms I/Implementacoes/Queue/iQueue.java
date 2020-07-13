package Queue;

public interface iQueue <Q>
{
    int size();
    int maxSize();
    boolean isEmpty ();
    void enqueue(Q q);
    Q front ();
    Q dequeue ();
    String order ();
}