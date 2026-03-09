import java.util.*;
class Sumof3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,d1,d2,d3;
        System.out.println("Enter a no.");
        n=in.nextInt();;
        d1=n/100;
        d2=(n/10)%10;
        d3=(n%10);
        int s=d1+d2+d3;
        System.out.println("Sum of 3 digit no.="+s);
    }
}