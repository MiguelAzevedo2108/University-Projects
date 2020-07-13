package Boggle;

public class Element <T> implements iElement<T>
{
    private T element;
    private boolean active;

    public Element(T element)
    {
        this.element=element;
        this.active=true;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
