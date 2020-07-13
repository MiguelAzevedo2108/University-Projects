package Shapee;

public class Square extends Shape
{
    double lado;
    double area;

    public Square (double lado)
    {
        this.lado = lado;
        setArea(lado);
    }

    public void setArea (double lado)
    {
        area = lado * lado;
    }

    public double getArea ()
    {
        return area;
    }
}

