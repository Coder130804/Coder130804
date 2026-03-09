import java.util.*;
class Queues
{
  int q[];
  int max;
  int front;
  int rear;
  Queues(int m)
  {
    max=m;
    q=new int[max];
    front=0;
    rear=-1;
  }
  void enqueue(int n)
  {
    if(rear==max-1)
      System.out.println("Queue Overflow");
    else
      q[++rear]=n;
  }
  int dequeue()
  {
    if(rear==-1){
      System.out.println("Queue Underflow");
      return -9999;
     }
    else
      return q[front++];
  }
  void display()
  {
    if(rear==-1)
      System.out.println("Queue Underflow");
    else{
      for(int i=rear;i>=front;i--){
        if(i!=front)
        System.out.print(q[i]+" ");
        else
          System.out.print(q[i]);
      }
    }
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    if(n<=0 || n>1e5)
      return;
    Queues obj=new Queues(n);
    String inp[]=in.nextLine().split(" ");
    if(inp.length!=n)
      return;
    for(int i=0;i<n;i++)
      obj.enqueue(Integer.parseInt(inp[i]));
    obj.display();
  }
}