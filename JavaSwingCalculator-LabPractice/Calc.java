package swinglab;

import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame {
    private JPanel orangePanel, yellowPanel;
    private JComboBox<String> operation;
    private static final String Add_OP = "Addition";
    private static final String Sub_OP = "Subtraction";
    private static final String Mul_OP = "Multiplication";
    private static final String Div_OP = "Division";
    private JLabel letLable, answerLabel;
    private JTextField num1, num2;
    private JButton calculate, quit;

    public Calc() {
        super("My Calculator");
        setSize(500, 700);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setLocation(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panels with improved colors
        orangePanel = new JPanel();
        orangePanel.setBackground(new Color(255, 165, 0)); // Orange color

        yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 255, 204)); // Light yellow color

        // JComboBox for operations with improved background color
        operation = new JComboBox<>();
        operation.addItem(Add_OP);
        operation.addItem(Sub_OP);
        operation.addItem(Mul_OP);
        operation.addItem(Div_OP);
        operation.setBackground(Color.WHITE);

        // Labels with updated font size and color
        letLable = new JLabel("Let's calculate");
        letLable.setFont(new Font("Arial", Font.BOLD, 16));
        letLable.setForeground(new Color(0, 128, 0)); // Green color

        answerLabel = new JLabel("Answer:");
        answerLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        answerLabel.setForeground(Color.RED);

        // Text fields with better appearance
        num1 = new JTextField("1st number", 10);
        num1.setBackground(Color.LIGHT_GRAY);
        num1.setHorizontalAlignment(JTextField.CENTER);

        num2 = new JTextField("2nd number", 10);
        num2.setBackground(Color.LIGHT_GRAY);
        num2.setHorizontalAlignment(JTextField.CENTER);

        // Buttons with improved appearance
        CalcListener listener = new CalcListener(this);
        calculate = new JButton("Calculate");
        calculate.setBackground(new Color(0, 128, 255)); // Blue
        calculate.setFont(new Font("Arial", Font.BOLD, 14));
        calculate.addActionListener(listener);

        quit = new JButton("Quit");
        quit.setBackground(new Color(255, 99, 71)); // Tomato red
        quit.setFont(new Font("Arial", Font.BOLD, 14));
        quit.addActionListener(listener);

        // Improved Layout with GridBagLayout for a cleaner look
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        cp.setLayout(layout);

        gbc.insets = new Insets(10, 10, 10, 10);

        // Adding components to the layout
        gbc.gridx = 0; gbc.gridy = 0;
        cp.add(letLable, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        cp.add(operation, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        cp.add(num1, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        cp.add(num2, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        cp.add(answerLabel, gbc);

        gbc.gridx = 0; gbc.gridy = 5;
        cp.add(calculate, gbc);

        gbc.gridx = 0; gbc.gridy = 6;
        cp.add(quit, gbc);

        setVisible(true);
        pack();
    }

    public void calculatePressed() {
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            String op = operation.getSelectedItem().toString();
            double result = 0;
            switch (op) {
                case Add_OP -> result = n1 + n2;
                case Sub_OP -> result = n1 - n2;
                case Mul_OP -> result = n1 * n2;
                case Div_OP -> result = n1 / n2;
            }
            answerLabel.setText("Answer: " + result);
            pack();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        }
    }

    public void quitPressed() {
        System.exit(0);
    }

    public static void main(String[] args) {
        new Calc();
    }
}
//Key Changes:
//Panel Color: Orange and yellow colors for panels with a softer, modern look.
//Font Styling: Updated font size and style for readability, with bold labels.
//Layout: Used GridBagLayout for a more organized and flexible layout.
//Button Styling: Changed button colors to blue and red for better contrast.
//Text Field Alignment: Center-aligned text fields for a cleaner look.
//Window Placement: Set the window to open in a visually pleasing position.
//Screenshot Considerations:
//After making these changes, you can capture a screenshot of the calculator's output in action:
//
//For a simple screenshot: Make sure to show the calculator with input values and the result visible.
//For a more complete representation: You can also add a screenshot of the program running with a user input example and the result shown on the UI.
//This improved layout will make your project more visually appealing when inserted into a portfolio.