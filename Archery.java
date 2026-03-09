import java.util.*;
public class Archery
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("No. of shots?");
    int n=in.nextInt();
    int shots[]=new int[n];
    System.out.println("Enter the score of each shot");
    for(int i=0;i<n;i++)
      shots[i]=in.nextInt();
    int c1=0,c2=0;
    for(int i=0;i<n;i++)
    {
      if(shots[i]>=7)
        c1++;
      else if(shots[i]>0 && shots[i]<7)
        c2++;
    }
    System.out.println(c1+"  "+c2);                     
  }
}