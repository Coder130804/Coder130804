import java.util.*;
class Avirup
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    if(n<1 || n>1e5)
      return;
    Stack<String> st=new Stack<>();
    Map<String,Integer> f=new HashMap<>();
    List<String> out=new ArrayList<>();
    while(n-->0)
    {
      String parts[]=in.nextLine().split(" ");
      String c=parts[0];
      if(c.equals("PUSH") && parts.length==2)
      {
        String g=parts[1];
        if(g.length()>20||!g.matches("[a-zA-Z0-9]+"))
          continue;
        st.push(g);
        f.put(g,f.getOrDefault(g,0)+1);
      }
      else if(c.equals("POP"))
      {
        if(!st.isEmpty())
        {
          String top=st.pop();
          f.put(top,f.get(top)-1);
          if(f.get(top)==0)
            f.remove(top);
        }
      }
      else if(c.equals("COUNT"))
      {
        if(st.isEmpty())
          out.add("EMPTY");
        else
          out.add(f.get(st.peek())+"");
      }
    }
    out.forEach(System.out::println);
  }
}