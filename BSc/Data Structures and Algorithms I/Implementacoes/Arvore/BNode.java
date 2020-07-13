package ABP;

public class BNode <T>
{
    T element;
    BNode <T> left;
    BNode <T> right;

    public BNode()
    {
        this.element = null;
        this.left = null;
        this.right = null;
    }

    public BNode(T element)
    {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public BNode(T element, BNode<T> left, BNode <T> right)
    {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public void setElement(T element)
    {
        this.element = element;
    }

    public T getElement()
    {
        return element;
    }

    public void setLeft(BNode <T> left)
    {
        this.left = left;
    }

    public BNode<T> getLeft()
    {
        return left;
    }

    public void setRight(BNode <T> right)
    {
        this.right = right;
    }

    public BNode <T> getRight()
    {
        return right;
    }
}
