import java.util.*;
class Galaxia
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=Integer.parseInt(in.nextLine());
    int v[]=Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int p[]=Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(v);
    Arrays.sort(p);
    for(int i=0;i<n;i++)
    {
      if(v[i]<=p[i])
      {
        System.out.println("no");
        return;
      }
    }
     System.out.println("yes");
  }
}