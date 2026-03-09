import java.util.*;
class SecondLargest
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter no. of elements");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=(i+1);j<n;j++)
            if(a[j]<a[i])
            {
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+"  ");
        }
        System.out.println("Second Largest Element:"+a[n-2]);
    }
}