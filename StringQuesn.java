import java.util.*;
class StringQuesn
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=in.nextLine();
        System.out.println("After changing case:");
        System.out.println(s1.toUpperCase());
        String r="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            r=r+s1.charAt(i);
        }
        System.out.println("Reverse:"+r);
        System.out.println("Enter another string to be compared");
        String s2=in.nextLine();
        System.out.println(s2.compareTo(s1));
        System.out.println("Enter a string");
        String s3=in.nextLine();
        s1=s1+" ";
        String s4=s1.concat(s3);
        System.out.println(s4);
        System.out.println("Changing case:");
        System.out.println("Uppercase:"+s4.toUpperCase());
        System.out.println("Lowercase:"+s4.toLowerCase());
        System.out.println("Enter a character");
        char ch1=in.next().charAt(0);
        int i;
        for(i=0;i<s4.length();i++)
        {
            if(s4.charAt(i)==ch1){
                System.out.println("found at:"+(i+1));
                break;
            }
        }
        if(i==s4.length())
        System.out.println("Character not found");
        
        System.out.println("Enter a string");
        String s5=in.next();
        String r2="";
        for(int j=s5.length()-1;j>=0;j--)
        {
            r2=r2+s5.charAt(j);
        }
        if(s5.equals(r2))
        System.out.println("Palindrome string");
        else
        System.out.println("Not Palindrome");
        in.nextLine();
        System.out.println("Enter a string");
        String s6=in.nextLine();
        int d=1,v=0,c=0;
        for(i=0;i<s6.length();i++)
        {
            char ch=s6.charAt(i);
            if(ch==' ')
            d++;
            else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            v++;
            else if(ch=='.')
            c++;
        }
        System.out.println("No. of words:"+d);
        System.out.println("No. of vowels:"+v);
        System.out.println("No. of consonants:"+(s6.length()-d-v-c));
    }
}
