import java.util.*;
public class Reversing
{
  String st[];
  int top;
  int max;
  Reversing(int m)
  {
    max=m;
    top=-1;
    st=new String[max];
  }
  void push(String s)
  {
    if(top==max-1){
      System.out.println("Stack full");
      return;
    }
    else{
      top=top+1;
      st[top]=s;
    }
  }
    void display()
    {
      for(int i=top;i>=0;i--)
        System.out.print(st[i]);
    }
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      if(s.length()<1 || s.length()>100000)
      return;
      Reversing obj=new Reversing(s.length());
      String stack[]=s.split("");
      for(String i:stack)
      {
        obj.push(i);
      }
      obj.display();
    }
}