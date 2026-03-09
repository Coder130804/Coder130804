import java.io.*;
class Squares
{
    public static void main(String args[]) throws IOException,CheckArgument
    {
        if(args.length>0)
        {
        try
        {
            if(args.length<4)
            throw new CheckArgument("Exception Occured");
            else
            {
                int s=0;
                for(int i=0;i<args.length;i++)
                {
                    int a=Integer.parseInt(args[i]);
                    s=s+(a*a);
                }
                System.out.println("Sum:"+s);
            }
        }
        catch(CheckArgument e)
        {
            System.out.println(e.toString());
        }
    }
    else
    System.out.println("Enter min 4 nos.");
}
}