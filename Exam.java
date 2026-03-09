import java.util.*;
public class Exam
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a no.");
    int n=in.nextInt();
    if(n==1){
      System.out.println("1\nTotal students seated:1");
      return;
      }
    int arr[][]=new int[n][n];
    int count=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if((i+j)%2==0){
          arr[i][j]=1;
          count++;
         }
        else
          arr[i][j]=0;
      }
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(j==n-1)
          System.out.print(arr[i][j]);
        else
          System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("Total students seated:"+ count);
  }
}