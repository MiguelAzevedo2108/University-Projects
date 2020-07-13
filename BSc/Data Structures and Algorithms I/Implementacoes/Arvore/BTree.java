package ABP;

public class BTree <T>
{
    BNode <T> root;

    public BTree()
    {
        this.root = new BNode<T>();
    }

    public BTree(T element)
    {
        this.root = new BNode<T>(element);
    }

    public BTree(T element, BNode<T> left, BNode<T> right)
    {
        this.root = new BNode <T> (element,left,right);
    }

    public void emOrdem(BNode <T> root)
    {
        if (root!=null)
        {
            emOrdem(root.getLeft());
            System.out.print(root.getElement() + " ");
            emOrdem(root.getRight());
        }
    }

    public void emOrder()
    {
        emOrdem(root);
    }

    public void preOrder(BNode <T> root)
    {
        if(root!=null)
        {
            System.out.print(root.getElement() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void preOrder()
    {
        preOrder(root);
    }

    public void postOrder(BNode <T> root)
    {
        if(root!=null)
        {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getElement() + " ");
        }
    }

    public void postOrder()
    {
        postOrder(root);
    }
}
