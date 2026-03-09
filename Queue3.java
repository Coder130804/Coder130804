import java.util.*;
import java.util.LinkedList;
class Queue3
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<n;i++)
    {
      int x=in.nextInt();
      if(x<0||x>1)
        return;
      q.add(x);
    }
    int s[]=new int[n];
    for(int i=0;i<n;i++)
    {
      s[i]=in.nextInt();
      if(s[i]<0||s[i]>1)
        return;
    }
    int i=0,tri=0;
    while(!q.isEmpty() && tri<q.size())
    {
      if(q.peek()==s[i])
      {
        q.poll();
        i++;
        tri=0;
      }
      else
      {
        q.add(q.poll());
        tri++;
      }
    }
    System.out.println(q.size());
  }
}