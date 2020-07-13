package Stack;

import java.io.*;
import java.util.StringTokenizer;

public class ParentMatchEsqueleto
{

    public static boolean isOpenParen(String s)
    {
        if(s.equals("(") || s.equals("{") || s.equals("["))
        {
            return true;
        }
        return false;
    }

    public static boolean isCloseParen(String s)
    {
        if(s.equals(")") || s.equals("}") || s.equals("]"))
        {
            return true;
        }
        return false;
    }

    public static boolean marrie(String s, String u){

        if(s.equals("(") && u.equals(")"))
        {
            return true;
        }
        else if(s.equals("{") && u.equals("}"))
        {
            return true;
        }
        else if(s.equals("[") && u.equals("]"))
        {
            return true;
        }
        return false;

    }

    public static void main(String[] args)
    {
        System.out.println("Digite a express�o:");

        Stack <String> stack = new Stack<String>(100);

        try
        {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st=new StringTokenizer(bf.readLine(),"(){}[]",true);

            while(st.hasMoreTokens())
            {
                String atual = st.nextToken();

                if(isOpenParen(atual) == true)
                {
                    stack.push(atual);
                }
                else if (isCloseParen(atual) == true)
                {
                    if(marrie(stack.top(),atual) == true)
                    {
                        stack.pop();
                    }
                    else
                    {
                        System.out.print("Nao esta balanceado");
                        System.exit(1);
                    }
                }
            }
            if(stack.empty() == true)
            {
                System.out.print("Balanceado");
            }
            else
            {
                System.out.print("Nao esta balanceado");
            }
        }
        catch(IOException e)
        {

        }
    }
}



