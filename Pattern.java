import java.util.*;
public class Pattern
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a no.");
    int n=in.nextInt();
    if(n%2==0 || n<3 ||n>1000){
      System.out.println("No. must be odd and between 3-1000");
      return;
      }
    int c1=0, c2=n+1;
    int p[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i==j)
          p[i][j]=c1+1;
        else if(i+j==n-1)
          p[i][j]=c2-1;
      }
      c1++;
      c2--;
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i==j || i+j==n-1){
          if(j==n-1)
            System.out.print(p[i][j]);
          else
            System.out.print(p[i][j]+" ");
        }
        else{
          if(j==n-1)
            System.out.print("-");
          else
            System.out.print("- ");
        }
      }
      System.out.println();
    }
  }
}