import java.util.*;
class Queue2
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String inp[]=in.nextLine().trim().split("\\s+");
    int n=inp.length;
    if(n<=0)
      return;
    int deck[]=new int[n];
    for(int i=0;i<n;i++)
      deck[i]=Integer.parseInt(inp[i]);
    Arrays.sort(deck);
    Deque<Integer> dq=new ArrayDeque<>();
    for(int i=n-1;i>=0;i--)
    {
      if(!dq.isEmpty())
        dq.addFirst(dq.removeLast());
      dq.addFirst(deck[i]);
    }
    while(!dq.isEmpty())
    {
      System.out.print(dq.pollFirst()+" ");
      if(!dq.isEmpty())
        dq.addLast(dq.pollFirst());
    }
  }
}