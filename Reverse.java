import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,d1,d2,d3,r;
        System.out.println("Enter a no.");
        n=in.nextInt();;
        d1=n/100;
        d2=(n/10)%10;
        d3=(n%10);
        r=(d3*100)+(d2*10)+d1;
        if((d3==0 && d2==0) || (d3==0 && d2==0 && d1==0))
        {
           System.out.println("Reverse="+"00"+r);
           return;
        }
        else if(d3==0)
        {
           System.out.println("Reverse="+"0"+r);
           return;
        }
        System.out.println("Reverse="+r);
    }
}