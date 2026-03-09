import java.util.*;
class MT extends Thread
{
    String n;
    int lb;
    int ub;
    MT(String n,int lb,int ub)
    {
        this.n=n;
        this.lb=lb;
        this.ub=ub;
    }
    public void run()
    {
        System.out.println("Name:"+n);
        System.out.println("Counter:");
        for(int i=lb;i<=ub;i++)
        {
            System.out.print(i+" ");
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}