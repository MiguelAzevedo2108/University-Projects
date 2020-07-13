package Queue;

public class Queue <Q> implements iQueue <Q>
{
    Q [] queue;
    int header;
    int footer;
    int maxSize;
    int size;

    public Queue (int maxSize)
    {
        this.queue = (Q[])new Object[maxSize];
        this.maxSize = maxSize;
        header = 0;
        footer = 0;
        size = 0;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public int maxSize()
    {
        return maxSize;
    }

    @Override
    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(Q q)
    {
        if(footer < maxSize)
        {
            queue[footer] = q;
            footer++;
            size++;
        }
        else
        {
            footer = 0;
            queue[footer] = q;
            footer ++;
            size++;
        }
    }

    public Q front()
    {
        return queue[header];
    }

    public Q dequeue()
    {
        if(header < maxSize)
        {
            Q r = queue[header];
            header++;
            size--;
            return r;
        }
        else
        {
            Q r = queue[header];
            header = 0;
            size--;
            return r;
        }
    }

    @Override
    public String order()
    {
        String print = "";
        for (int i = 0; i < maxSize ; i++)
        {
            print = print + queue[i] + "\n";
        }
        return print;
    }
}