import java.util.*;
import java.util.LinkedList;
class Node4
{
  int data;
  Node4 next;
  Node4(int d)
  {
    data=d;
  }
}
public class Doubled
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String inp[]=in.nextLine().split(",");
    Node4 head=null,tail=null;
    for(String s:inp)
    {
      int digit=Integer.parseInt(s.trim());
      Node4 node=new Node4(digit);
      if(head==null)
        head=tail=node;
      else{
        tail.next=node;
        tail=node;
      }
    }
    Stack<Integer> st=new Stack<>();
    while(head!=null)
    {
      st.push(head.data);
      head=head.next;
    }
    int c=0;
    LinkedList<Integer> res=new LinkedList<>();
    while(!st.isEmpty())
    {
      int s=st.pop()*2+c;
      res.addFirst(s%10);
      c=s/10;
    }
    if(c>0)
      res.addFirst(c);
    System.out.println(res);
    }
}