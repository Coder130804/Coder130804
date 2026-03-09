import java.util.*;
class Node3
{
  int data;
  Node3 prev,next;
  Node3(int d)
  {
    data=d;
  }
}
public class Splitting
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String inp[]=in.nextLine().split(",");
    Node3 head=null,tail=null;
    for(String s:inp)
    {
      int val=Integer.parseInt(s.trim());
      Node3 node=new Node3(val);
      if(head==null)
        head=tail=node;
      else{
        tail.next=node;
        tail=node;
      }
    }
    Node3 slow=head,fast=head;
    while(fast!=null && fast.next!=null)
    {
      fast=fast.next.next;
      if(fast!=null)
        slow=slow.next;
    }
   List<Integer> res=new ArrayList<>();
    while(slow!=null)
    {
      res.add(slow.data);
      slow=slow.next;
    }
    System.out.println(res);
  }
}