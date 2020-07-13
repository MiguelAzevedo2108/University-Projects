package Boggle;

public interface iHashTable <T>
{
    int ocupados();
    float fatorCarga();
    void alocarTabela(int dim);
    void tornarVazia();
    void insere(T x);
    void remove(T x);
    T procurar(T x);
    void rehash();
    String toString ();
}
