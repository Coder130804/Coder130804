import java.util.*;
public class Keypad
{
  static Map<Character,String> map=new HashMap<>();
  static List<String> res=new ArrayList<>();
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter digits");
    String s=in.next();
    int l1=s.length();
    if(l1<-1 || l1>4 || !(s.matches("^[2-9]+$")))
      return;
    if(l1==0){
      System.out.println(res);
      return;
    }
    map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");
    backtrack(s,0,"");
    System.out.println(res);
  }
  public static void backtrack(String d,int i,String c)
  {
    if(i==d.length()){
      res.add(c);
      return;
    }
    String l=map.get(d.charAt(i));
    for(char j:l.toCharArray())
      backtrack(d,i+1,c+j);
  }
}
