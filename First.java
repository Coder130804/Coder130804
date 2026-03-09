import java.util.*;
import java.util.LinkedList;
class First
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine().trim();
    if(s.length()<1||s.length()>1e4||!s.matches("[a-z]+"))
      return;
    int freq[]=new int[26];
    Queue<Character> q=new LinkedList<>();
    StringBuilder sb=new StringBuilder();
    for(char c:s.toCharArray())
    {
      freq[c-'a']++;
      q.add(c);
      while(!q.isEmpty()&&freq[q.peek()-'a']>1)
        q.poll();
      sb.append(q.isEmpty()?'#':q.peek());
    }
    System.out.println(sb.toString());
  }
}