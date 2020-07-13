package Revisoes;

public class Fraccao implements iFraccao <Fraccao>
{

    int numerador;
    int denominador;

    public Fraccao()
    {

    }

    public Fraccao(int numerador)
    {
        this.numerador = numerador;
    }

    public Fraccao(int numerador, int denominador)
    {
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public void setNumerador(int num)
    {
        numerador = num;
    }

    public void setDenominador(int num)
    {
        if(num == 0)
        {
            System.out.print("Cant be 0");
        }
        else
        {
            denominador = num;
        }
    }


    public int getNumerador()
    {
        return numerador;
    }

    public int getDenominador()
    {
        return denominador;
    }

    public String tooString ()
    {
        return numerador + "/" + denominador;
    }

    public int maior (int n1, int n2)
    {
        if(n1< n2)
        {
            return n2;
        }
        return n1;
    }

    public int mdc(int n1, int n2 )
    {
        int kappa = 0;

        if (maior(n1,n2) == n1 )
        {
            int x = 1;

            while(x<=n2)
            {
                if(n1%x == 0 && n2%x == 0)
                {
                    kappa = x;
                }
                x++;
            }
            return kappa;
        }
        else
        {
            int x = 1;

            while(x<=n1)
            {
                if(n1%x == 0 && n2%x == 0)
                {
                    kappa = x;
                }
                x++;
            }
            return kappa;
        }
    }

    public void reduce (Fraccao f1)
    {
        int mdc = mdc(f1.getNumerador(), f1.getDenominador());

        numerador = f1.getNumerador() /mdc;
        denominador = f1.getDenominador() / mdc ;
    }


    public Fraccao sum(Fraccao f1, Fraccao f2)
    {
        if(f1.getDenominador() == f2.getDenominador())
        {
            int numerador = f1.getNumerador()+f2.getNumerador();
            int denominador = f1.getDenominador();

            Fraccao f = new Fraccao (numerador, denominador);

            return f;
        }
        else
        {
            int numerador = f1.getNumerador() * f2.getDenominador() + f2.getNumerador() * f1.getDenominador();
            int denominador = f1.getDenominador() * f2.getDenominador();

            Fraccao f = new Fraccao (numerador, denominador);

            return f;
        }
    }

    public Fraccao product (Fraccao f1, Fraccao f2)
    {
        int numerador = f1.getNumerador() * f2.getNumerador();
        int denominador = f1.getDenominador() * f2.getDenominador();

        Fraccao f = new Fraccao (numerador, denominador);

        return f;

    }

    public Fraccao div (Fraccao f1, Fraccao f2)
    {
        int numerador = f1.getNumerador() * f2.getDenominador();
        int denominador = f1.getDenominador() * f2.getNumerador();

        Fraccao f = new Fraccao (numerador, denominador);

        return f;
    }
}
