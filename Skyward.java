import java.util.*;
class Skyward
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n<1||n>1000)
      return;
    Map<Integer,Integer> h=new HashMap<>();
    List<Integer> a=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      int x=in.nextInt();
      a.add(x);
      h.put(x,h.getOrDefault(x,0)+1);
    }
    a.sort((x,y)->h.get(y)!=h.get(x)?h.get(y)-h.get(x):x-y);
    for(int x:a)
      System.out.print(x+" ");
  }
}