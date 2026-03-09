import java.util.*;
class Time
{
    public static int hours;
    public static int minutes;
    public static int seconds;
    public static void TakeTime() throws HrsException,MinException,SecException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter hours:");
        hours=in.nextInt();
        System.out.println("Enter minutes:");
        minutes=in.nextInt();
        System.out.println("Enter seconds:");
        seconds=in.nextInt();
        if(hours>24 || hours<0)
        throw new HrsException("InvalidHourException:hour is not greater than 24 or lesser than 0");
        if(minutes>60 || minutes<0)
        throw new MinException("InvalidMinutesException:Minutes is not greater than 60 or lesser than 0");
        if(seconds>60 || seconds<0)
        throw new SecException("InvalidSecondsException:Seconds is not greater than 60 or lesser than 0");
        System.out.println(hours+":"+minutes+":"+seconds);
    }
    public static void main(String args[])
    {
        try
        {
            TakeTime();
        }
        catch(HrsException|MinException|SecException e)
        {
            System.out.println("Exception Caught:");
            System.out.println(e.toString());
        }
        
        finally
        {
            System.out.println("Code Executed");
            
        }
     }
}