import java.util.*;
class Node5
{
  int val;
  Node5 next;
  Node5(int d)
  {
    val=d;
  }
}
public class Rimi
{
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
  String a[]=in.nextLine().split(" ");
  String b[]=in.nextLine().split(" ");
  Node5 l1=null,t1=null,l2=null,t2=null;
  for(String s:a)
  {
    Node5 n=new Node5(Integer.parseInt(s.trim()));
    if(l1==null)
      l1=t1=n;
    else
      t1=t1.next=n;
  }
  for(String s:b)
  {
    Node5 n=new Node5(Integer.parseInt(s.trim()));
    if(l2==null)
      l2=t2=n;
    else
      t2=t2.next=n;
  }
  Node5 d=new Node5(0),curr=d;
  int carry=0;
  while(l1!=null||l2!=null||carry>0)
  {
    if(l1!=null)
    {
      carry+=l1.val;
      l1=l1.next;
    }
    if(l2!=null)
    {
      carry+=l2.val;
      l2=l2.next;
    }
    curr=curr.next=new Node5(carry%10);
    carry=carry/10;
  }
  List<Integer> res=new ArrayList<>();
  for(Node5 p=d.next;p!=null;p=p.next)
    res.add(p.val);
  System.out.println(res);
  }
}