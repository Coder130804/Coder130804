import java.util.*;
class Expo
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    Map<Integer,Integer> m=new HashMap<>();
    for(int i=0;i<n;i++)
      m.put(in.nextInt(),m.getOrDefault(m.size(),0)+1);
    int c=0;
    for(int i:m.values())
      if(i>=2)
        c++;
    System.out.println(m.size()>=k*2||(m.size()>=k&&c>=k)?"YES":"NO");
  }
}