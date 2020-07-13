package Stack;

public class Stack <E> implements iStack <E>{

    private E[] stack;
    int pos = 0;

    public Stack (int size)
    {
        this.stack = (E[])new Object[size];
    }

    @Override
    public void push(E o)
    {
        if (pos<stack.length)
        {
            stack[pos] = o;
            pos++;
        }
    }

    @Override
    public E top(){
        return stack[pos-1];
    }

    @Override
    public E pop() {
        pos--;
        return stack[pos];
    }

    @Override
    public int size() {
        return pos;
    }

    @Override
    public boolean empty()
    {
        if (pos!=0)
        {
            return false;
        }
        return true;
    }

    public String printStack()
    {
        String print= "";

        for(int i = 0; i<pos;i++)
        {
            print = print + stack [i] + "\n";
        }
        return print;
    }
}
