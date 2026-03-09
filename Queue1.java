import java.util.*;
public class Queue1
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int tickets[]=Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int k=in.nextInt();
    if(tickets.length<1||tickets.length>100||k<0||k>=tickets.length){
      System.out.println(-1);
      return;
    }
    for(int t:tickets)
      if(t<1||t>100){
        System.out.println(-1);
        return;
      }
    int time=0;
    for(int i=0;i<tickets.length;i++)
      time=time+Math.min(tickets[i],i<=k? tickets[k]:tickets[k]-1);
    System.out.println(time);
  }
}