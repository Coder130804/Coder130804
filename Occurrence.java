import java.util.*;
class Occurrence
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,c;
        System.out.println("Enter n");        
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" nos.");   
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                c++;
            }
            System.out.println(arr[i]+" occurres "+c);
        }
    }
}