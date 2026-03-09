class Outer1
{
    class Inner1
    {
        void display()
        {
            System.out.println("inner class method");
        }
    }
    public static void main()
    {
        Outer1.Inner1 o1=new Outer1().new Inner1();
        o1.display();
    }
}