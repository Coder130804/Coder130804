import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no.");
        int a=in.nextInt();
        int i=a;
        int d;
        int rev=0;
        while(i!=0)
        {
            d=i%10;
            rev=rev*10+d;
            i=i/10;
        }
        if(a==rev)
        System.out.println("No. is palindrome");
        else
        System.out.println("No. not palindrome");
    }
}