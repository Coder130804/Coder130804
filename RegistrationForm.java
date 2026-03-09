import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel rollLabel = new JLabel("Roll No:");
        JTextField rollField = new JTextField();

        JLabel mobileLabel = new JLabel("Mobile No:");
        JTextField mobileField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel dobLabel = new JLabel("Date of Birth:");
        String[] dates = {"1 Jan 2000", "2 Jan 2000", "3 Jan 2000"};
        JComboBox<String> dobComboBox = new JComboBox<>(dates);

        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"Java", "Python", "C++", "Web Development"};
        JComboBox<String> courseComboBox = new JComboBox<>(courses);

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String roll = rollField.getText();
                String mobile = mobileField.getText();
                String email = emailField.getText();
                String dob = (String) dobComboBox.getSelectedItem();
                String course = (String) courseComboBox.getSelectedItem();

                if (course == null || course.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please select a course!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String message = "Name: " + name + "\nRoll No: " + roll + "\nMobile No: " + mobile + "\nEmail: " + email + "\nDOB: " + dob + "\nCourse: " + course;
                    JOptionPane.showMessageDialog(frame, message, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(rollLabel);
        frame.add(rollField);
        frame.add(mobileLabel);
        frame.add(mobileField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(dobLabel);
        frame.add(dobComboBox);
        frame.add(courseLabel);
        frame.add(courseComboBox);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
