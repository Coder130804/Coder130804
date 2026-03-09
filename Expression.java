import java.util.*;
class Expression
{
  int max;
  int top;
  int st[];
  Expression(int m)
  {
    max=m;
    top=-1;
    st=new int[max];
  }
  void push(int s)
  {
    if(top==max-1){
      System.out.println("Stack Overflow");
      return;
     }
    else
      st[++top]=s;
  }
  int pop()
  {
    if(top==-1)
    {
      System.out.println("Stack Underflow");
      return 0;
    }
    else
      return st[top--];
  }
  boolean isEmpty()
  {
    if(top==-1)
      return true;
    return false;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String arr[]=in.nextLine().replaceAll("[\\[\\]\"]","").split(",\\s*");
    Expression obj=new Expression(arr.length);
    for(String t:arr)
    {
      if(t.matches("-?\\d+"))
        obj.push(Integer.parseInt(t));
      else
      {
        int b=obj.pop();
        int a=obj.pop();
        int res=0;
        switch(t){
          case "+": res=a+b;
                    break;
          case "-": res=a-b;
                    break;
          case "*": res=a*b;
                    break;
          case "/": res=a/b;
                    break;
        }
        obj.push(res);
      }
    }
    System.out.println(obj.pop());
  }
}