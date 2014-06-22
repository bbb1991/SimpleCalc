import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JButton buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix,
        buttonSeven, buttonEight, buttonNine, buttonZero, buttonOnClear,
        buttonDivide, buttonMultiply, buttonPlus, buttonMinus, buttonEquals;

    private JTextArea display;

    public GUI() {
        buttonOne = new JButton("1");
        buttonTwo = new JButton("2");
        buttonThree = new JButton("3");
        buttonFour = new JButton("4");
        buttonFive = new JButton("5");
        buttonSix = new JButton("6");
        buttonSeven = new JButton("7");
        buttonEight = new JButton("8");
        buttonNine = new JButton("9");
        buttonZero = new JButton("0");
        buttonOnClear = new JButton("ON/C");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton(" -");
        buttonEquals = new JButton("=");
    }

    public void go() {
        JFrame frame = new JFrame("SimpleCalc", null);
        JPanel mainPanel = new JPanel();
        JPanel displayPanel = new JPanel();
        JPanel controlPanel = new JPanel();
        display = new JTextArea(1, 15);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        display.setEditable(false);
        display.setEnabled(false);

        frame.getContentPane().add(BorderLayout.NORTH, displayPanel);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, controlPanel);

        displayPanel.add(display);
        controlPanel.add(buttonOnClear);

        mainPanel.add(buttonOne);
        mainPanel.add(buttonTwo);
        mainPanel.add(buttonThree);
        mainPanel.add(buttonFour);
        mainPanel.add(buttonFive);
        mainPanel.add(buttonSix);
        mainPanel.add(buttonSeven);
        mainPanel.add(buttonEight);
        mainPanel.add(buttonNine);
        mainPanel.add(buttonPlus);
        mainPanel.add(buttonZero);
        mainPanel.add(buttonMinus);
        mainPanel.add(buttonDivide);
        mainPanel.add(buttonEquals);
        mainPanel.add(buttonMultiply);


        frame.setVisible(true);
        frame.setSize(180, 250);

        buttonOnClear.addActionListener(new OnActionListener());

        buttonOne.addActionListener(numActionListener);
        buttonTwo.addActionListener(numActionListener);
        buttonThree.addActionListener(numActionListener);
        buttonFour.addActionListener(numActionListener);
        buttonFive.addActionListener(numActionListener);
        buttonSix.addActionListener(numActionListener);
        buttonSeven.addActionListener(numActionListener);
        buttonEight.addActionListener(numActionListener);
        buttonNine.addActionListener(numActionListener);
        buttonZero.addActionListener(numActionListener);

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    ActionListener numActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setNumberText(e.getActionCommand());
        }
    };

    public void setNumberText(String inputNumber) {
        String lastDit = this.display.getText();
        if ((lastDit.equals("")) && (inputNumber.equals("."))){
            inputNumber = "";
        }
        this.display.setText(lastDit+inputNumber);
    }

    class OnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText("0");
        }
    }
}
