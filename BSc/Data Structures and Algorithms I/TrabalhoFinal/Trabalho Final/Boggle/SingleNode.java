package Boggle;

public class SingleNode <T>
{
    public T element;
    SingleNode<T> next;


    public SingleNode () 		//Construtores
    {
        element = null;
        next = null;
    }

    public SingleNode (T element) 		//Construtores
    {
        this.element = element;
        next = null;
    }

    public SingleNode (T element, SingleNode<T> next) 		// Construtores
    {
        this.element = element;
        this.next = next;
    }


    //	Metodos

    public T element () throws InvalidNodeException
    {
        if(element == null)
        {
            throw new InvalidNodeException("elemento vazio");
        }
        else
        {
            return element;
        }
    }

    public SingleNode <T> getNext()
    {
        return next;
    }

    public void setElement (T element)
    {
        this.element = element;
    }

    public void setNext (SingleNode <T> next)
    {
        this.next = next;
    }
}







