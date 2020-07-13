package Shapee;

import java.util.Collection;

public abstract class Shape implements Comparable<Shape>
{
    abstract double getArea();

    public Shape ()
    {

    }

    public int compareTo(Shape shape)
    {
        if(this.getArea() == shape.getArea())
        {
            return 0;
        }
        else if(this.getArea() < shape.getArea())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

    public String toString ()
    {
        String print = "I am a " + this.getClass().getSimpleName() + ", my area is : " + this.getArea();
        return print;
    }

    public static double totalShape(Shape arrayShape[])
    {
        double totalArea = 0;

        for(int i = 0; i<arrayShape.length;i++)
        {
            totalArea += arrayShape[i].getArea();
        }
        return totalArea;
    }

    public static double totalShape2(Collection <?extends Shape> collection)
    {
        double totalArea = 0;

        for(Shape shape : collection)
        {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
