import java.util.*;
abstract class Student
{
    int roll_no;
    int reg_no;
    void getinput()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Roll no. and Registration no.");
        roll_no=in.nextInt();
        reg_no=in.nextInt();    
    }
    abstract void course();
}