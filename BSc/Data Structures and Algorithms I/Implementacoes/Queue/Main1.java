package Queue;

public class Main1
{
    public static void main(String [] args )
    {
        F(8);
    }

    public static void F(int n)
    {
        Queue <Integer> queue = new Queue <Integer>(20);

        queue.enqueue(0);
        queue.enqueue(1);

        for(int i = 0; i<n;i++)
        {
            int t = queue.dequeue();
            System.out.print(t + " ");
            queue.enqueue(t+queue.front());
        }
    }
}
