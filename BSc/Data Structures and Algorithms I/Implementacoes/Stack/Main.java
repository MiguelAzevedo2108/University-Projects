package Stack;

public class Main
{
    public static void main (String [] args )
    {
        Stack <Integer> stack = new Stack <Integer>(3);

        System.out.println(stack.size());

        stack.push(3);

        System.out.print(stack.size());

    }
}
