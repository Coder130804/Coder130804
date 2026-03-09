import java.util.*;
class Monk
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String a[]=new String[n];
    for(int i=0;i<n;i++)
      a[i]=in.next();
    for(int i=0;i<n;i++)
    {
      int c=0;
      for(int j=0;i<i;j++)
        if(a[j].compareTo(a[i])<0)
          c++;
      System.out.println(c);
    }
  }
}