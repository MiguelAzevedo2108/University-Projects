package ABPP;

public class Contacto implements Comparable<Contacto>{
    String nome;
    int numero;

    public Contacto (String nome, int numero)
    {
        this.nome = nome;
        this.numero = numero;
    }

    public Contacto (String nome)
    {
        this.nome = nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setNumero(int num)
    {
        this.numero = numero;
    }

    public String getNome()
    {
        return nome;
    }

    public int getNumero()
    {
        return numero;
    }

    public String toString ()
    {
        return nome + "->" + numero;
    }

    public int compareTo(Contacto o)
    {
        return nome.compareTo(o.nome);
    }
}
