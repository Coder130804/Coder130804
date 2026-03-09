import java.util.*;
class Node6
{
  int val;
  Node6 prev,next;
  Node6(int d)
  {
    val=d;
  }
}
public class Parth
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String inp[]=in.nextLine().trim().split(" ");
    int t=in.nextInt();
    Node6 head=null,tail=null;
    for(String s:inp)
    {
      if(s.equals("head")||s.equals(""))
        continue;
      Node6 n=new Node6(Integer.parseInt(s));
      if(head==null)
        head=tail=n;
      else{
        tail.next=n;
        n.prev=tail;
        tail=n;
      }
    }
    Node6 curr=head;
    while(curr!=null)
    {
      if(curr.val==t)
      {
        if(curr.prev!=null)
          curr.prev.next=curr.next;
        else
          head=curr.next;
        if(curr.next!=null)
          curr.next.prev=curr.prev;
      }
      curr=curr.next;
    }
    if(head==null)
      System.out.println("head->(empty list)");
    else{
      System.out.print("head-> ");
      Node6 p=head;
      while(p!=null)
      {
        System.out.print(p.val);
        if(p.next!=null)
          System.out.print(" -> ");
        p=p.next;
      }
      System.out.println();
    }
  }
}