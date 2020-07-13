package ABPP;

public interface iABP <T>
{
    public boolean contains (T x);
    public T findMin();
    public T findMax();
    public void insere (T x);
    public void remove (T x);
    public void printEmOrdem();
    public void printPosOrdem();
    public void printPreOrdem();

}
