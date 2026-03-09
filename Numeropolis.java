import java.util.*;
class Numeropolis
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n<1||n>1000)
      return;
    String s[]=new String[n];
    for(int i=0;i<n;i++)
      s[i]=in.next();
    Arrays.sort(s,(x,y)->(y+x).compareTo(x+y));
    if(s[0].equals("0"))
      System.out.print("0");
    else
      for(String i:s)
        System.out.print(i);
  }
}