import java.util.*;
import java.util.LinkedList;
class Arboris
{
  static class Node
  {
    int v;
    Node l,r;
    Node(int v)
    {
      this.v=v;
    }
  }
  static Node build(String a[])
  {
    if(a[0].equals("null"))
      return null;
    Node r=new Node(Integer.parseInt(a[0]));
    Queue<Node> q=new LinkedList<>();
    q.add(r);
    for(int i=1;!q.isEmpty()&&i<a.length;i++)
    {
      Node n=q.poll();
      if(!a[i].equals("null"))
        q.add(n.l=new Node(Integer.parseInt(a[i])));
      if(++i<a.length && !a[i].equals("null"))
        q.add(n.r=new Node(Integer.parseInt(a[i])));
    }
    return r;
  }
  static int d(Node n)
  {
    if(n==null)
      return 0;
    return 1+Math.max(d(n.l),d(n.r));
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println(d(build(in.nextLine().split(" "))));
  }
}