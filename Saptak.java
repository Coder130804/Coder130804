import java.util.*;
class Node7
{
  int data;
  Node7 next;
  Node7(int d)
  {
    data=d;
  }
}
public class Saptak
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String line1=in.nextLine();
    String line2=in.nextLine();
    line1=line1.replaceAll("]","").trim();
    line2=line2.replaceAll("]","").trim();
    if(line1.isEmpty() && line2.isEmpty()){
       System.out.println("[]");
       return;
       }
    String a[]=line1.isEmpty()? new String[0]:line1.split(",\\s*");
    String b[]=line2.isEmpty()? new String[0]:line2.split(",\\s*");
    Node7 h1=null,h2=null,t1=null,t2=null;
    for(String s:a)
    {
      if(s.equals("=")||s.isEmpty())
        continue;
      Node7 n=new Node7(Integer.parseInt(s));
      if(h1==null)
        h1=t1=n;
      else
        t1=t1.next=n;
    }
    for(String s:b)
    {
      if(s.equals("=")||s.isEmpty())
        continue;
      Node7 n=new Node7(Integer.parseInt(s));
      if(h2==null)
        h2=t2=n;
      else
        t2=t2.next=n;
    }
   Node7 d=new Node7(0), tail=d;
    while(h1!=null && h2!=null)
    {
      if(h1.data<=h2.data)
      {
        tail=tail.next=new Node7(h1.data);
        h1=h1.next;
      }
      else{
        tail=tail.next=new Node7(h2.data);
        h2=h2.next;
      }
    }
    while(h1!=null)
    {
      tail=tail.next=new Node7(h1.data);
      h1=h1.next;
    }
    while(h2!=null)
    {
      tail=tail.next=new Node7(h2.data);
      h2=h2.next;
    }
    Node7 out1=d.next;
    System.out.print("[");
    while(out1!=null)
    {
      System.out.print(out1.data);
      if(out1.next!=null)
        System.out.print(", ");
      out1=out1.next;
    }
    System.out.println("]");
  }
}