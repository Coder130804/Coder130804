import java.util.*;
class Node8
{
  String data;
  Node8 next;
  Node8(String d)
  {
    data=d;
  }
}
public class Reverse
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String items[]=in.nextLine().split(",\\s*");
    int l=in.nextInt(),r=in.nextInt();
    Node8 d=new Node8(""),head=d;
    for(String item:items)
      head=head.next=new Node8(item);
    head=d.next;
    Node8 prev=d;
    for(int i=1;i<l;i++)
      prev=prev.next;
    Node8 curr=prev.next;
    for(int i=0;i<r-l;i++)
    {
      Node8 temp=curr.next;
      curr.next=temp.next;
      temp.next=prev.next;
      prev.next=temp;
    }
    List<String> res=new ArrayList<>();
    Node8 out1=d.next;
    while(out1!=null)
    {
      res.add("\""+out1.data+"\"");
      out1=out1.next;
    }
    System.out.println(res);
  }
}