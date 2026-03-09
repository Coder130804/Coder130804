import java.util.*;
public class Emotion
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=in.nextLine();
    int l=s.length();
    if(l<1 || l>1000 || !(s.matches("^[a-z]+$"))){
      System.out.println("Inavlid");
      return;
    }
    int prev=0,not=0;
    for(int i=0;i<l;i++)
    {
      if(s.charAt(0)==s.charAt(i))
        prev++;
    }
    for(int i=1;i<l;i++)
    {
      int curr=0;
      for(int j=0;j<l;j++)
      {
        if(s.charAt(i)==s.charAt(j))
          curr++;
      }
      if(prev!=curr)
      {
        not++;
        break;
      }
    }
    if(not>=1)
      System.out.println("Aashriya wonders: These thoughts were scattered");
    else
      System.out.println("Aashriya smiles: Emotional balance found");
  }
}