public class Cat implements Animal
{
    public void sound()
    {
        System.out.println("Meow");
    }
    public static void main(String args[])
    {
        Cat obj=new Cat();
        obj.sound();
    }
    
}
