import java.util.*;
class Banner
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    int f[]=new int[26];
    for(char c:s.toCharArray())
      f[c-'a']++;
    PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->y[1]-x[1]);
    for(int i=0;i<26;i++){
      if(f[i]>0)
      {
        if(f[i]>(s.length()+1)/2)
        {
          System.out.println("");
          return;
        }
        pq.add(new int[]{i,f[i]});
      }
    }
    StringBuilder res=new StringBuilder();
    while(pq.size()>1)
    {
      int a1[]=pq.poll();
      int a2[]=pq.poll();
      res.append((char)(a1[0]+'a')).append((char)(a2[0]+'a'));
      if(--a1[1]>0)
        pq.add(a1);
      if(--a2[1]>0)
        pq.add(a2);
    }
    if(!pq.isEmpty())
      res.append((char)(pq.poll()[0]+'a'));
    System.out.println(res.toString());
  }
}