package Boggle;

public abstract class HashTable <T> implements iHashTable <T>
{
    Element <T>[] hash;
    int numElementos;

    protected abstract int procPos(T s);

    public int ocupados()
    {
        return numElementos;
    }

    public float fatorCarga()
    {
        return (float)numElementos/hash.length;
    }

    public void alocarTabela(int dim)
    {
        hash = new Element[dim];
    }

    public void tornarVazia ()
    {
        numElementos = 0;

        for (int i = 0; i<hash.length;i++)
        {

            hash[i]= null;
        }
    }

    public void insere(T x)
    {
        int hashCode = procPos(x);

        if(hash[hashCode]!=null && hash[hashCode].isActive() && hash[hashCode].getElement().equals(x))
            return;

        hash[hashCode] = new Element<T>(x);
        numElementos++;

        if (fatorCarga()>=0.6)
            rehash();
    }

    public void remove(T x)
    {
        int hashCode = procPos(x);

        if(hash[hashCode].getElement().equals(x) && hash[hashCode].isActive())
        {
            hash[hashCode].setActive(false);
            numElementos--;
        }
    }

    public T procurar(T x)
    {
        int hashCode = procPos(x);

        if(hash[hashCode]==null)
            return null;
        if(hash[hashCode].getElement().equals(x) && hash[hashCode].isActive())
            return hash[hashCode].getElement();
        else
            return null;
    }

    public void rehash()
    {
        Element <T>[] velha = hash;

        int dim = getPrime(2*hash.length);

        alocarTabela(dim);
        tornarVazia();

        for (int i = 0; i<velha.length; i++)
        {
            if(velha[i] != null && velha[i].isActive())
            {
                insere(velha[i].getElement());
            }
        }
    }

    public String toString ()
    {
        String fim = "";

        for (int i = 0; i<hash.length;i++)
        {
            if (hash[i]!=null && hash[i].isActive())
              fim+=hash[i].getElement() + "\n";
        }
        return fim;
    }

    private int getPrime(int min)
    {
        while(true)
        {
            int c = 0;
            for(int i = 1; i <= min; i++)
            {
                if(c > 2)
                    break;
                if(min % i == 0)
                    c++;
            }
            if(c == 2)
                return min;
            min++;
        }
    }
}
