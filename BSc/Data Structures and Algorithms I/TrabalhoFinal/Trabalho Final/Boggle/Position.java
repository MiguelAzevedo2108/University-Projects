package Boggle;

public class Position
{
    private char letra;
    private boolean visitado;
    private int x;
    private int y;

    public Position (char letra, int x, int y)
    {
        this.letra = letra;
        this.visitado = false;
        this.x = x;
        this.y = y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY (int y)
    {
        this.y = y;
    }

    public int getX ()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public char getLetra()
    {
        return letra;
    }

    public boolean foiVisitado()
    {
        return visitado;
    }

    public void setVisitado(boolean visitado)
    {
        this.visitado = visitado;
    }
    
    public boolean equals(char c)
    {
    	return this.letra == c;
    }
    
    public String toString()
    {
    	return ""+this.letra;
    }
}
