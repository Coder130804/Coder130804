import java.util.*;
class Rectangle
{
    int length,breadth;
    int area,perimeter;
    void read(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void calculate()
    {
        area=length*breadth;
        perimeter=2*(length+breadth);
    }
    void display()
    {
        System.out.println("Area="+area);
        System.out.println("Perimeter="+perimeter);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        int l=in.nextInt();
        int b=in.nextInt();
        Rectangle r1=new Rectangle();
        r1.read(l,b);
        r1.calculate();
        r1.display();
    }
}