import java.util.*;
class Split_Array
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,n,s1=0,s2=0,t=0;
        System.out.println("Enter n");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" nos.");
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        if(n%2==0)
        {
            for(i=0;i<n/2;i++)
            s1=s1+arr[i];
            for(i=n/2;i<n;i++)
            s2=s2+arr[i];
            if(s1==s2){
            System.out.println("True");
            t++;
            }
        }
        else
        {
            for(i=0;i<(n/2)+1;i++)
            s1=s1+arr[i];
            for(i=(n/2)+1;i<n;i++)
            s2=s2+arr[i];
            if(s1==s2){
            System.out.println("True");
            t++;
            }
        }
        if(t==0)
        System.out.println("False");
    }
}