package TechnoHackTasks;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task_1 extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "DEL" // Added "C" for clear and "DEL" for delete
    };
    private Font font = new Font("Arial", Font.PLAIN, 20);
    private double num1 = 0;
    private double num2 = 0;
    private char operator;

    public Task_1() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(font);
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4)); // Increased rows for the buttons

        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(font);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: Division by zero", "Error", JOptionPane.ERROR_MESSAGE);
                        clear();
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        } else if (command.equals("C")) {
            clear();
        } else if (command.equals("DEL")) { // Added functionality for delete button
            String currentText = textField.getText();
            if (!currentText.isEmpty()) {
                textField.setText(currentText.substring(0, currentText.length() - 1));
            }
        } else {
            operator = command.charAt(0);
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        }
    }

    private void clear() {
        textField.setText("");
        num1 = 0;
        num2 = 0;
        operator = '\u0000';
    }

    public static void main(String[] args) {
        new Task_1();
    }
}

