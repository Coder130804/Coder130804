import java.util.*;
class Sortland
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str[]=in.nextLine().split(" ");
    int num[]=Arrays.stream(str).filter(s->!s.isEmpty()).mapToInt(Integer::parseInt).toArray();
    int t=in.nextInt();
    int l=0,r=num.length;
    while(l<r)
    {
      int m=(l+r)/2;
      if(num[m]<t)
        l=m+1;
      else
        r=m;
    }
    System.out.println(l);
  }
}