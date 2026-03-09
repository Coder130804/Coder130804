import java.util.*;
public class LinkedList
{
  static class Node
  {
    int data;
    Node next;
    Node(int val){
      data=val;
    }
  }
  static Node remDup(Node head)
  {
    Node curr=head;
    while(curr!=null && curr.next!=null)
    {
      if(curr.data==curr.next.data)
        curr.next=curr.next.next;
      else
        curr=curr.next;
    }
    return head;
  }
  static void print(Node head)
  {
    while(head!=null)
    {
      System.out.print(head.data+" ");
      head=head.next;
    }
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String inp[]=in.nextLine().trim().split(" ");
    if(inp.length==0||inp[0].equals(""))
    {
      System.out.println("Empty list");
      return;
    }
    Node head=new Node(Integer.parseInt(inp[0]));
    Node curr=head;
    for(int i=1;i<inp.length;i++){
      curr.next=new Node(Integer.parseInt(inp[i]));
      curr=curr.next;
    }
    head=remDup(head);
    print(head);
  }
}