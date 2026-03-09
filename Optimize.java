import java.util.*;
class Optimize
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n<=0)
      return;
    int h[]=new int[n];
    int l[]=new int[n];
    int r[]=new int[n];
    for(int i=0;i<n;i++){
      h[i]=in.nextInt();
      if(h[i]<0)
         return;
     }
    l[0]=h[0];
    for(int i=1;i<n;i++)
      l[i]=Math.max(l[i-1],h[i]);
    r[n-1]=h[n-1];
    for(int i=n-2;i>=0;i--)
      r[i]=Math.max(r[i+1],h[i]);
    int w=0;
    for(int i=0;i<n;i++)
      w=w+Math.min(l[i],r[i])-h[i];
    System.out.println(w);
  }
}