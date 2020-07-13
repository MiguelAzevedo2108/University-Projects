package ABPP;

public class ABPNode <T extends Comparable<? super T>>
{
    T element;
    ABPNode <T> left;
    ABPNode <T> right;

    public ABPNode()
    {
        this.element = null;
        this.left = null;
        this.right = null;
    }

    public ABPNode (T e)
    {
        this.element = e;
        this.left = null;
        this.right = null;
    }

    public ABPNode (T e, ABPNode <T> left, ABPNode <T> right)
    {
        this.element = e;
        this.left = left;
        this.right = right;
    }

    public T element()
    {
        return element;
    }

    public ABPNode<T> left()
    {
        return left;
    }

    public ABPNode <T> right()
    {
        return right;
    }
}

