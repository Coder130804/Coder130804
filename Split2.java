import java.util.*;
class Node2
{
  int data;
  Node2 prev;
  Node2 next;
  Node2(int d)
  {
    data=d;
  }
}
public class Split2
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++)
      list.add(in.nextInt());
    Collections.sort(list);
    Node2 head=null,tail=null;
    for(int val:list)
    {
      Node2 node=new Node2(val);
      if(head==null)
        head=tail=node;
      else{
        tail.next=node;
        node.prev=tail;
        tail=node;
      }
    }
    for(Node2 t=head;t!=null;t=t.next)
      System.out.print(t.data+(t.next!=null?" <-> ":""));
  }
}