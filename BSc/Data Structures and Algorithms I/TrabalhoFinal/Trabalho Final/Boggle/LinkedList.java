package Boggle;

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

    public LinkedList<T> copy(LinkedList<T> newlink) throws InvalidNodeException{
    	int c=0;
    	SingleNode<T> node= head.getNext();
    	
    	while(c < size) {
    		newlink.add(node.element());
    		c++;
    		node=node.getNext();
    	}
    	
    	return newlink;
    }
    
    public void add (int i, T element) throws InvalidNodeException
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
    
    void add(T x) throws InvalidNodeException 
    {
		add(size, x);
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
        SingleNode <T> node = head.getNext();

        String print = "";
        
        while(node.getNext()!=null)
        {
            print = print + node.element;
            node = node.getNext();
        }
        print = print + node.element;
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

    public String outPutCorreto (LinkedList <Position> ll)
    {
        SingleNode <Position> node = ll.header().getNext();

        String print = "";

        while(node.getNext() != null)
        {
            Character letra = node.element.getLetra();
            print = print + "(" + Character.toUpperCase(letra)  +  ":("   + (node.element.getX()-1)    + "," + (node.element.getY()-1) + ")->";
            node = node.getNext();
        }
        Character letra = node.element.getLetra();
        print = print + "(" + Character.toUpperCase(letra)   +  ":("   + (node.element.getX()-1) + ","+ (node.element.getY()-1) + "))";
        return print;
    }
}


