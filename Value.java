import java.util.*;
public class Value
{
    public static boolean ProcessInput(int a)
    {
        if(a<0)
        return true;
        else
        return false;
    }
    public static void main(String args[])throws NegativeValueException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no.");
        int a=in.nextInt();
        try
        {
            if(ProcessInput(a))
            throw new NegativeValueException("Negative value");
            else
            System.out.println(a*a);
        }
        catch(NegativeValueException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println("Done!");
        }
    }
}