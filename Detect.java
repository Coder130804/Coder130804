import java.util.*;
public class Detect
{
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data=d;
    }
  }
  static boolean Loop(Node head)
  {
    Node slow=head,fast=head;
    while(fast!=null && fast.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        Node start=head;
        while(start!=slow)
        {
          start=start.next;
          slow=slow.next;
        }
        Node ptr=start;
        while(ptr.next!=start)
          ptr=ptr.next;
        ptr.next=null;
        return true;
      }
    }
    return true;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n<=0||n>100000){
    System.out.println("Invalid node count");
    return;
    }
    Node head=new Node(in.nextInt());
    Node tail=head;
    List<Node> nodes=new ArrayList<>();
    nodes.add(head);
    for(int i=1;i<n;i++)
    {
      Node node=new Node(in.nextInt());
      tail.next=node;
      tail=node;
      nodes.add(node);
    }
    int pos=in.nextInt();
    if(pos>0)
      tail.next=nodes.get(pos-1);
    System.out.println("Output:"+Loop(head));
  }
}