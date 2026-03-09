import java.util.*;
public class Segment
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the binary log");
    String s=in.next();
    int l=s.length();
    if(l<1 || l>100 ||!(s.matches("^[0-1]+$")))
      return;
    int c=0;
    boolean segment=false;
    for(int i=0;i<l;i++)
    {
      if(s.charAt(i)=='1')
      {
        if(segment==false){
          c++;
          segment=true;
        }
      }
      else
        segment=false;
    }
    System.out.println("Count="+c);
  }
}