import java.util.*;
class Codeword
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=0;
    String w[]=new String[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
      w[i]=in.next();
      for(char c:w[i].toCharArray())
        b[i]|=1<<(c-'a');
    }
    for(int i=0;i<n;i++)
      for(int j=i+1;j<n;j++)
        if((b[i]&b[j])==0)
          m=Math.max(m,w[i].length()*w[j].length());
    System.out.println(m);
  }
}