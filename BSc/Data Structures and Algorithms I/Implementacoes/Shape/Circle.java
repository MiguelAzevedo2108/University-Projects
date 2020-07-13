package Shapee;

public class Circle extends Shape
{
    double area;
    double raio;

    public Circle (double raio)
    {
        this.raio = raio;
        setArea(raio);
    }

    public void setArea(double raio)
    {
        area = Math.PI * raio * raio;
    }

    public double getArea()
    {
        return area;
    }
}
