public class Stacks
{
    String st[];
    int top;
    int cap;
    Stacks(int max)
    {
        cap=max;
        top=-1;
        st=new String[cap];
    }
    void push(String n)
    {
        if(top==cap-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        else
        {
            top++;
            st[top]=n;
            System.out.println("Item Inserted");
        }
    }
    String pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return "$$";
        }
        else
        {
            String n=st[top];
            top--;
            return n;
        }
    }
    void display()
    {
        if(top==-1)
            System.out.println("Stack Underflow");
        else
        {
            for(int i=top;i>=0;i--)
            System.out.println(st[i]);
        }
    }
}