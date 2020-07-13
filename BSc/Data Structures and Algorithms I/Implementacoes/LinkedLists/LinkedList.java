package LinkedLists;

import java.util.Iterator;

public class LinkedList <T> implements Iterable<T>
{
    SingleNode<T> head = new SingleNode<T>();
    int size = 0;


    public Iterator<T> iterator()
    {
        return new LinkedListIterator<T>(head.getNext());
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if (size==0)
        {
            return true;
        }
        return false;
    }

    public SingleNode<T> header()
    {
        return head;
    }

    public void add (int i, T element)
    {
        int c = 0;
        SingleNode <T> node = head;

        while(c<i)
        {
            node = node.getNext();
            c++;
        }

        SingleNode <T> node1 = new SingleNode<T>(element);

        if(node.getNext()!=null)
        {
            SingleNode <T> keep = node.getNext();
            node1.setNext(keep);
        }
        node.setNext(node1);
        size++;
    }

    public void remove(int i)
    {
        int c = 0;
        SingleNode <T> node = head;

        while(c<i)
        {
            node = node.getNext();
            c++;
        }
        node.setNext(node.getNext().getNext());
        size--;
    }

    public String toString ()
    {
        SingleNode <T> node = head;

        String print = "";

        while(node.getNext()!=null)
        {
            print = print + node.element + "\n";
            node = node.getNext();
        }
        print = print + node.element + "\n";
        return print;
    }

    public T get (int i)
    {
        int c = 0;

        SingleNode<T> node = head;

        while(c<i)
        {
            node = node.getNext();
            c++;
        }
        T e = node.getNext().element;
        return e;
    }
}


