import java.util.*;
public class Elara
{
  static String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
  static String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
  static String f(int n)
  {
    if(n==0)
      return "";
    if(n<20)
      return ones[n];
    if(n<100)
      return tens[n/10]+" "+f(n%10);
    if(n<1000)
      return f(n/100)+" Hundred "+f(n%100);
    if(n<1e6)
      return f(n/1000)+" Thousand "+f(n%1000);
    if(n<1e9)
      return f(n/1000000)+" Million "+f(n%1000000);
    return f(n/1000000000)+" Billion "+f(n%1000000000);
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n<0 || n>((2e31)-1))
    {
      System.out.println("Invalid");
      return;
    }
    System.out.println(n==0?"Zero":f(n).trim().replaceAll(" +"," "));
  }
}