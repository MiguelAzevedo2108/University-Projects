package Shapee;

import java.util.ArrayList;
import java.util.Collection;

public class Main2
{
    public static void main(String [] args)
    {
        Shape [] arrayShape = new Shape[2];
        //Circle [] arrayCircle = new Circle[2];
        //Square [] arraySquare = new Square[2];

        Square square1 = new Square (2.0);
        Square square2 = new Square (1.0);

        arrayShape[0] = square1;
        arrayShape[1] = square2;


        Collection <Shape> col1 = new ArrayList<>();
        //Collection <Square> col2 = new ArrayList <>();
        //Collection <Circle> col3 = new ArrayList <>();

        String [] array = {"ola","pc"};

        col1.add(square1);
        col1.add(square2);

        System.out.print(maior2(arrayShape));

    }

    public static Comparable maior(Comparable [] a)
    {
        Comparable maior = a [0];

        for(int i = 0;i<a.length;i++)
        {
            if(maior.compareTo(a[i]) < 0)
            {
                maior = a[i];
            }
        }
        return maior;
    }


    public static <AnyType extends Comparable<? super AnyType>> AnyType maior2(AnyType[] a)
    {
        AnyType maior = a[0];

        for(AnyType i : a)
        {
            if(i.compareTo(maior)>0)
            {
                maior = i;
            }
        }
        return maior;
    }

}
