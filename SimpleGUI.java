import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleGUI extends JFrame implements ActionListener {
    JTextField nameField;
    JButton submitBtn;
    JRadioButton male, female;
    JCheckBox java, python;
    JComboBox<String> cityBox;
    SimpleGUI() {
        // Frame settings
        setTitle("Simple Swing Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel with layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Label + TextField
        panel.add(new JLabel("Name:"));
        nameField = new JTextField(10);
        panel.add(nameField);

        // Radio Buttons
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        panel.add(male);
        panel.add(female);

        // Checkboxes
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        panel.add(java);
        panel.add(python);

        // ComboBox
        String[] cities = {"Delhi", "Mumbai", "Bangalore"};
        cityBox = new JComboBox<>(cities);
        panel.add(cityBox);

        // Button
        submitBtn = new JButton("Submit");
        panel.add(submitBtn);

        // Action Listener
        submitBtn.addActionListener(this);

        // Add panel to frame
        add(panel);
        setVisible(true);
    }
    // Button click logic
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String city = (String) cityBox.getSelectedItem();

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\nCity: " + city);
    }

    public static void main(String[] args) {
        new SimpleGUI();
    }
}