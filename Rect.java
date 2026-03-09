import java.util.*;
class Rect
{
    int length,breadth;
    Rect()
    {
        length=0;
        breadth=0;
    }
    Rect(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void calculate()
    {
        System.out.println("Area of Rectangle:"+(length*breadth));
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int l=in.nextInt();
        int b=in.nextInt();
        Rect obj=new Rect(l,b);
        obj.calculate();
    }
}