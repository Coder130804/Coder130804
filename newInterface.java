import javax.swing.*;
import java.awt.event.*;
class newInterface
{
    public static void main(String args[])
    {
        JFrame fr=new JFrame("New Window");
        fr.setSize(500,400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lb=new JLabel("Click any one of them");
        lb.setBounds(100,50,200,30);
        JButton b1=new JButton();
        b1.setText("1st");
        b1.setBounds(20,90,100,30);
        JButton b2=new JButton();
        b2.setText("2nd");
        b2.setBounds(170,90,100,30);
        fr.add(lb);
        fr.add(b1);
        fr.add(b2);
        fr.setLayout(null);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fr.remove(b1);
                fr.remove(b2);
                fr.revalidate();
                fr.repaint();
                lb.setText("Hello");
            }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fr.remove(b1);
                fr.remove(b2);
                fr.revalidate();
                fr.repaint();
                lb.setText("GoodBye");
            }
        });
        fr.setVisible(true);
    }
}