package TechnoHackTasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Task_2 extends JFrame implements ActionListener {
    private JLabel titleLabel;
    private JTextField guessField;
    private JButton guessButton;
    private JLabel hintLabel;

    private int secretNumber;
    private int attempts;

    public Task_2() {
        setTitle("Number Guessing Game");
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);

        titleLabel = new JLabel("Welcome to the Number Guessing Game! I have chosen a number between 1 and 100. Try to guess it.");
        add(titleLabel);

        guessField = new JTextField(10);
        add(guessField);

        guessButton = new JButton("Guess");
        guessButton.addActionListener(this);
        add(guessButton);

        hintLabel = new JLabel();
        add(hintLabel);

        initializeGame();

        setVisible(true);
    }

    private void initializeGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        attempts = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guessButton) {
            try {
                int guess = Integer.parseInt(guessField.getText());
                attempts++;

                if (guess < secretNumber) {
                    hintLabel.setText("Too low! Try again.");
                } else if (guess > secretNumber) {
                    hintLabel.setText("Too high! Try again.");
                } else {
                    hintLabel.setText("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessButton.setEnabled(false);
                }
            } catch (NumberFormatException ex) {
                hintLabel.setText("Please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task_2::new);
    }
}
