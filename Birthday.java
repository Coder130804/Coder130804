import java.util.*;
class Birthday
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    Set<String> set=new HashSet<>();
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(a[i]>a[j])
          set.add(a[i]+" "+a[j]);
      }
    }
    System.out.println(set.size());
  }
}