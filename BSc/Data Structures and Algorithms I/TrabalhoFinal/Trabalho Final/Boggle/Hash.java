package Boggle;

public class Hash <T> extends HashTable<T>
{
    public Hash(int size)
    {
        this.hash = new Element[size];
        numElementos = 0;
    }

    protected int procPos(T s)             // Atraves do hashCode do Java geramos o index que ira ser inserido o Elemento na Tabela de Hash
    {
        int index = Math.abs(s.hashCode() % hash.length);

        while(hash[index]!=null && !(hash[index].getElement().equals(s)))       // Tratamento de colisoes linear
        {
            index++;
            if (index >= hash.length)
                index=0;
        }
        return index;
    }
}
