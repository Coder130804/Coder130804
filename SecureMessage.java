abstract class SecureMessage implements Message
{
    String m;
    public SecureMessage(String m)
    {
        this.m=m;
    }
    abstract int validation();
    public void display(String m)
    {
        System.out.println("message:"+m);
    }
}