import java.util.*;
class SBI extends Banks
{
    void interest()
    {
        Scanner in=new Scanner(System.in);
        double r;
        System.out.println("Enter interest of sbi");
        r=in.nextDouble();
        System.out.println("SBI interest:"+r);
    }
}