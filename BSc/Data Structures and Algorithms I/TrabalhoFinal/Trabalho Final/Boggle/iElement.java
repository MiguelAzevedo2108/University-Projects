package Boggle;

public interface iElement <T>
{
    public void setElement(T element);
    public T getElement();
    public void setActive(boolean active);
    public boolean isActive();
}
