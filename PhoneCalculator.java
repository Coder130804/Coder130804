import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhoneCalculator {
    private JFrame frame;
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subButton, mulButton, divButton, resetButton, resultButton;
    private String lastOperation = "";

    public PhoneCalculator() {
        // Creating JFrame
        frame = new JFrame("Phone Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        // Panel 1: Labels
        JPanel labelPanel = new JPanel(new GridLayout(1, 2));
        labelPanel.add(new JLabel("Add Number 1"));
        labelPanel.add(new JLabel("Add Number 2"));
        frame.add(labelPanel);

        // Panel 2: Text Fields
        JPanel inputPanel = new JPanel(new GridLayout(1, 2));
        num1Field = new JTextField();
        num2Field = new JTextField();
        inputPanel.add(num1Field);
        inputPanel.add(num2Field);
        frame.add(inputPanel);

        // Panel 3: Result Field
        resultField = new JTextField();
        resultField.setEditable(false);
        frame.add(resultField);

        // Panel 4: Buttons (3x2 Grid)
        JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        resetButton = new JButton("Reset");
        resultButton = new JButton("Result");

        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(resultButton);
        frame.add(buttonPanel);

        // Panel 5: Event Handling
        ActionListener operationListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                lastOperation = clickedButton.getText();
            }
        };

        addButton.addActionListener(operationListener);
        subButton.addActionListener(operationListener);
        mulButton.addActionListener(operationListener);
        divButton.addActionListener(operationListener);

        // Reset button functionality
        resetButton.addActionListener(e -> {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
            lastOperation = "";
        });

        // Result button functionality
        resultButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = 0;

                switch (lastOperation) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": 
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(frame, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(frame, "Please select an operation first!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                }
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input! Please enter numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PhoneCalculator();
    }
}
