import java.io.*;
class PrimeCL
{
    public static void main(String args[]) throws IOException 
    {
        int p=0;
        if(args.length>0)
        {
            for(int i=0;i<args.length;i++)
            {
                int c=0;
                for(int j=1;j<=Integer.parseInt(args[i]);j++)
                {
                    if(Integer.parseInt(args[i])%j==0)
                    c++;
                }
                if(c==2)
                p++;
            }
            System.out.println("Prime nos.="+p);
        }
        else
        System.out.println("Enter 5 integer nos.");
    }
}