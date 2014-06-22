import javax.swing.*;

public class CalcOperations {

    private float firstNumber = 0;
    private float secondNumber = 0;

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    private double summ() {
        return firstNumber + secondNumber;
    }

    private double sub()  {
        return firstNumber - secondNumber;
    }

    private double mul() {
        return firstNumber * secondNumber;
    }

    private  double divide() {
        try {
            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Divide by zero!", "Invalid operation!", JOptionPane.ERROR_MESSAGE);
            return Double.parseDouble(null);
        }
    }
    //    public static double getResult() {
//        //switch ()
//    }

}
