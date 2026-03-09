public class Queues
{
    int q[]=new int[1000];
    int max;
    int front;
    int rear;
    Queues(int cap)
    {
        max=cap;
        front=0;
        rear=-1;
    }
    void enqueue(int n)
    {
        if(rear==max-1)
        System.out.println("Queue Overflow");
        else
        {
            rear++;
            q[rear]=n;
            System.out.println("Item inserted successfully");
        }
    }
    int dequeue()
    {
        if(rear==-1){
        System.out.println("Queue Underflow");
        return -9999;
        }
        else
        {
            int n=q[front];
            front++;
            return n;
        }
    }
    void display()
    {
        if(rear==-1)
        System.out.println("Queue Underflow");
        else
        {
            for(int i=rear;i>=front;i--)
            {
               System.out.print(q[i]);
            }
        }
    }
}