import java.util.*;
class Robot
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int s[]=new int[n];
    for(int i=0;i<n;i++)
      s[i]=in.nextInt();
    int c[]=s.clone();
    Arrays.sort(c);
    Map<Integer,String> hm=new HashMap<>();
    for(int i=0;i<n;i++)
    {
      int r=n-i;
      hm.put(c[i],r==1?"Gold Medal":r==2?"Silver Medal":r==3?"Bronze Medal":r+"");
    }
    for(int x:s)
      System.out.print("\""+hm.get(x)+"\" ");
  }
}