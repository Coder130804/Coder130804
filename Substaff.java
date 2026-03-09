import java.util.*;
class Substaff extends Manager implements Basic
{
   public void bonus(int b)
   {
       System.out.println("Bonus:"+(0.50*b));
   }
   public static void main(String args[])
   {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter basic salary of Substaff:");
       int b=in.nextInt();
       Basic obj=new Substaff();
       System.out.println("Basic Salary:"+b);
       obj.earnings(b);
       obj.deductions(b);
       obj.bonus(b);
   }
}