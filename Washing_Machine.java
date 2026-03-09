import java.util.*;
class Washing_Machine implements Motor
{
    public void run(int c)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter capacity of motor of the washing machine:");
        c=in.nextInt();
        consume(c);
    }
    public void consume(int c)
    {
        System.out.println("Capacity of motor is:"+ capacity);
        System.out.println("Capacity of washing machine "+c);
    }
    public static void main()
    {
        Motor obj=new Washing_Machine();
        int c=0;
        obj.run(c);
    }
}