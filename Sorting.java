import java.util.*;
class Node
  {
    int data;
    Node next;
    Node(int data)
    {
      this.data=data;
      this.next=null;
    }
  }
public class Sorting
{ 
  public static Node sort(Node head)
  {
    int c[]=new int[3];
    Node temp=head;
    while(temp!=null)
    {
      c[temp.data]++;
      temp=temp.next;
    }
    temp=head;
    int i=0;
    while(temp!=null)
    {
      if(c[i]==0)
        i++;
      else
      {
        temp.data=i;
        c[i]--;
        temp=temp.next;
      }
    }
    return head;
  }
  public static void print(Node head)
  {
    while(head!=null)
    {
      System.out.print(head.data);
      if(head.next!=null)
        System.out.print(" -> ");
      head=head.next;
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter linked list"); //press enter-> ctrl+d-> enter after entering input values
    Node head=null,tail=null;
    while(in.hasNextInt())
    {
      int val=in.nextInt();
      if(val<0||val>2)
        return;
    
    Node new_node=new Node(val);
    if(head==null)
      head=tail=new_node;
    else{
      tail.next=new_node;
      tail=new_node;
    }
   }
    System.out.println("Original List:");
    print(head);
    head=sort(head);
    System.out.println("Sorted List:");
    print(head);
  }
}