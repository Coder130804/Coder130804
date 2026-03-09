import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,sum1=0,sum2=0;
        int a[][]=new int[3][3];
        System.out.println("Enter a 3x3 matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            a[i][j]=in.nextInt();
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                sum1+=a[i][j];
                if((i+j)==2)
                sum2+=a[i][j];
            }
        }
        System.out.println("Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of left diagonal= "+sum1);
        System.out.println("Sum of right diagonal= "+sum2);
        
    }
}