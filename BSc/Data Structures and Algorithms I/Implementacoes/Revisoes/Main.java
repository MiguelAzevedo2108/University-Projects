package Revisoes;

public class Main
{
    public static void main (String [] args )
    {

        Fraccao f1 = new Fraccao (3,6);

        Fraccao f2 = new Fraccao (2,6);

        Fraccao div = f1.div(f1, f2);

        System.out.println(div.tooString());

        div.reduce(div);
        System.out.print(div.tooString());
    }
}
