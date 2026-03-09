//WAP in Java to check weather a string is Palindrome or Not -> Example of String:- " MADAM"
import java.util.*;
public class Test_Elabs
{
    public static void main(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=in.nextLine();
    String r="";
    char ch;
    int l=s.length();
    String t=s;
    for(int i=s.length()-1;i>=0;i--) 
     r += s.charAt(i);
    if(r.equals(s)==true)
    System.out.println("Palindrome");
    else
    System.out.println("Not Palindrome");
}
}