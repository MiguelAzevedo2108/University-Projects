package ABPP;

public class ABP <T extends Comparable <?super T>> implements iABP<T>
{
    ABPNode <T> root;

    public T findMin(ABPNode<T> n)
    {
        if(n.left == null)
        {
            return n.element;
        }
        return findMin(n.left);
    }

    public T findMin()
    {
        return findMin(root);
    }

    public T findMax(ABPNode<T> n)
    {
        if (n.right == null)
        {
            return n.element;
        }
        return findMax(n.right);
    }

    public T findMax()
    {
        return findMax(root);
    }

    public boolean contains(T x, ABPNode <T> n)
    {
        if (n==null)
        {
            return false;
        }
        else
            if(n.element.compareTo(x)<0)
            {
                return contains(x,n.right);
            }
            else if(n.element.compareTo(x)>0)
            {
                return contains(x,n.left);
            }
            return true;
    }

    public boolean contains (T x)
    {
        return contains(x,root);
    }


    private ABPNode<T> insere(T x, ABPNode <T> n)
    {
        if (n == null)
        {
            n = new ABPNode<T>(x);
        }
        else if ((n.element).compareTo(x)>0)
        {
            n.left = insere(x,n.left);
        }
        else if((n.element).compareTo(x)<0)
        {
            n.right = insere(x,n.right);
        }
        return n;
    }

    public void insere (T x)
    {
        root = insere(x,root);
    }

    public ABPNode<T> remove(T x, ABPNode <T> n)
    {
        if(n == null)
        {
            return n;
        }

        if(n.element.compareTo(x)<0)
        {
            n.right = remove(x,n.right);
        }
        else if (n.element.compareTo(x)>0)
        {
            n.left = remove(x,n.left);
        }
        else if(n.left != null && n.right != null)
        {
            T min = findMin(n.right);
            n.element = min;
            n.right = remove(min,n.right);
        }
        else if(n.left == null)
        {
            n = n.right;
        }
        else {
            n = n.left;
        }
        return n;
    }

    public void remove (T x)
    {
        root = remove (x,root);
    }

    public void printEmOrdem(ABPNode <T> root)
    {
        if (root!=null)
        {
            printEmOrdem(root.left);
            System.out.print(root.element + " ");
            printEmOrdem(root.right);
        }
    }

    public void printEmOrdem()
    {
        printEmOrdem(root);
    }

    public void printPosOrdem(ABPNode <T> root)
    {
        if (root!=null)
        {
            printPosOrdem(root.left);
            printPosOrdem(root.right);
            System.out.print(root.element + " ");
        }
    }

    public void printPosOrdem()
    {
        System.out.println();
        printPosOrdem(root);
    }

    public void printPreOrdem(ABPNode <T> root)
    {
        if (root!=null)
        {
            System.out.print(root.element + " ");
            printPreOrdem(root.left);
            printPreOrdem(root.right);
        }
    }

    public void printPreOrdem()
    {
        printPreOrdem(root);
    }
}