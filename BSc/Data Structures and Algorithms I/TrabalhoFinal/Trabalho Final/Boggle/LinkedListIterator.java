package Boggle;

public class LinkedListIterator <T> implements java.util.Iterator<T>
{
    SingleNode <T> atual;

    public LinkedListIterator(SingleNode<T> node)
    {
        atual = node;
    }

    public boolean hasNext()
    {
        return atual != null;
    }

    public T next()
    {
        if(hasNext())
        {
            T e = atual.element;
            atual = atual.getNext();
            return e;
        }
        return null;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("nao suportado");
    }
}
