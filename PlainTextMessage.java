public class PlainTextMessage extends SecureMessage
{
    public String triming()
    {
        String s1=m.trim();
        String s2=s1.toUpperCase();
        return s2;
    }
    public int validation()
    {
        if(m==" ")
        return 1;
        else
        return 0;
    }
    public void recieving()
    {
        ;
    }
    public void sending()
    {
        ;
    }
}
