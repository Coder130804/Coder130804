import java.util.*;
class Radius
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int house[]=Arrays.stream(in.nextLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    int heater[]=Arrays.stream(in.nextLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(heater);
    int max=0;
    for(int h:house)
    {
      int id=Arrays.binarySearch(heater,h);
      if(id<0)
        id=-id-1;
      int l=id>0? h-heater[id-1]:Integer.MAX_VALUE;
      int r=id<heater.length? heater[id]-h:Integer.MAX_VALUE;
      max=Math.max(max,Math.min(l,r));
    }
    System.out.println(max);
  }
}