package ABP;

import java.util.StringTokenizer;

public class ArvExp
{
    private static boolean operator(String s)
    {
        return (s.length()==1) && s.equals("+")|| s.equals("-") || s.equals("*")|| s.equals("/");
    }

    private static boolean isNum(String s)
    {
        try
        {
            float f=Float.valueOf(s).floatValue();
            return true;
        }
        catch (Exception e)
        {

        }
        return false;
    }

    public static float avalia(BTree<String> x)
    {
        return avalia(x.root);
    }

    public static float avalia(BNode<String> n)
    {
        if(isNum(n.getElement()))
        {
            return Float.valueOf(n.getElement()).floatValue();
        }
        else
        {
            return operacao(n.getElement(),avalia(n.getLeft()),avalia(n.getRight()));
        }
    }

    public static float operacao(String op, float a, float b)
    {
        if(op.equals("+"))
        {
            return a+b;
        }
        else if(op.equals("-"))
        {
            return a-b;
        }
        else if(op.equals("*"))
        {
            return a*b;
        }
        else
        {
            return a/b;
        }
    }


    public static void main(String[] args)
    {
        //String postfix="2 8 - 9 / 7 * 67 7 5 * + 8 7 * / -";
        String postfix = "2 10 -";
      //String postfix="30 4 2- 5* 7 3+/+";

        Stack<BTree<String>> stack=new Stack<BTree<String>>(100);

        String token;
        StringTokenizer st=new StringTokenizer(postfix," *+-/",true);

        BTree <String> a;
        BTree <String> b;

        while (st.hasMoreTokens())
        {
            token =st.nextToken();
            System.out.println("lido:"+token);

            if(!token.equals(" "))
            {
                if(isNum(token))
                {
                    stack.push(new BTree<>(token));
                }
                else
                {
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(new BTree<>(token,a.root,b.root));
                }
            }
        }

        BTree<String> t= stack.top();

        System.out.println("Em ordem");
        t.emOrder();
        System.out.println("Pos ordem");
        t.postOrder();
        System.out.println("Pre ordem");
        t.preOrder();

        System.out.println(avalia(t));
    }

}