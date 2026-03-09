import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
class Stopwatch extends JFrame implements ActionListener,Runnable 
{
    JFrame f;
    JLabel p;
    JButton b,b1;
    boolean running=false;
    int t=0;
    Thread t1;

    Stopwatch()
    {
        f=new JFrame("Stopwatch");
        JLabel l=new JLabel("STOPWATCH");
        f.setForeground(Color.BLUE);
        l.setBounds(180,50,200,40);
        p=new JLabel("Time-   00:00:00");
        p.setForeground(Color.RED);
        p.setBounds(180,100,200,30);
        f.setSize(400,300);
        b=new JButton("ON");
        b.setBounds(150,200,100,40);
        b1=new JButton("Reset");
        b1.setBounds(250,200,100,40);
        ButtonGroup g=new ButtonGroup();
        g.add(b);
        g.add(b1);
        f.setLayout(null);
        b.addActionListener(this);
        b1.addActionListener(this);
        f.add(l);
        f.add(p);
        f.add(b);
        f.add(b1);
        f.setVisible(true);   
    }
    private String Time(int totalsec)
    {
        int h=totalsec/3600;
        int min=(totalsec%3600)/60;
        int sec=totalsec%60;
        return String.format("Time-   %02d:%02d:%02d",h,min,sec);
    }
    public void run()
    {
        while(running)
        {
            try
            {
                Thread.sleep(1000);
                t++;
                p.setText(Time(t));
            }
            catch(Exception e)
            {
                System.out.println(e.getStackTrace());
            }
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            if(!running)
            {
                running=true;
                t1=new Thread(this);
                t1.start();
                b.setText("OFF");
            }
            else
            {
                running=false;
                b.setText("ON");
            }
        }
        else if(e.getSource()==b1)
        {
            running=false;
            t=0;
            p.setText("Time-   00:00:00");
            b.setText("ON");
        }
    }
    public static void main(String args[])
    {
        Stopwatch s=new Stopwatch();
    }
    
}