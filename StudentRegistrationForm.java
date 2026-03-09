import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentRegistrationForm
{
    public static void main(String args[])
    {
        JFrame fr=new JFrame("Student Registration Form");
        fr.setSize(400,500);
        fr.setLayout(new BorderLayout());
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
         
        JLabel name= new JLabel("NAME:");
        JTextField nm=new JTextField();
        JLabel rn=new JLabel("Roll Number:");
        JTextField r=new JTextField();
        JLabel em= new JLabel("E-mail:");
        JTextField e=new JTextField();
        JLabel gd= new JLabel("Gender");
        String male="MALE";
        String female="FEMALE";
        JRadioButton g1=new JRadioButton(male);
        JRadioButton g2=new JRadioButton(female);
        JLabel add1= new JLabel("Address:");
        JTextField ad=new JTextField();
        
        JCheckBox con=new JCheckBox("I agree to all the Terms and Conditions");
        JButton sub=new JButton("SUBMIT");
        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String n=nm.getText();
                String roll=rn.getText();
                String email=em.getText();
                String addr=ad.getText();
            }
            
        });
        
        fr.add(name);
        fr.add(rn);
        fr.add(em);
        fr.add(gd);
        fr.add(g1);
        fr.add(g2);
        fr.add(add1);
        fr.add(con);
        fr.add(sub);
        fr.setVisible(true);
    }
    
}