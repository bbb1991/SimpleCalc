import javax.swing.*;

public class CalcOperations {

    private static float firstNumber = 0;
    private static float secondNumber = 0;
    private static int operationCode = 0;

    public static void setOperationCode(int operationCode) {
        CalcOperations.operationCode = operationCode;
    }

    public static void setSecondNumber(float secondNumber) {
        CalcOperations.secondNumber = secondNumber;
    }

    public static void setFirstNumber(float firstNumber) {
        CalcOperations.firstNumber = firstNumber;
    }

    private static double summ() {
        return firstNumber + secondNumber;
    }

    private static double sub()  {
        return firstNumber - secondNumber;
    }

    private static double mul() {
        return firstNumber * secondNumber;
    }

    private static double divide() {
        double result;
        try {
            result = firstNumber / secondNumber;
            if (result == Double.NaN | result == Double.NEGATIVE_INFINITY | result == Double.POSITIVE_INFINITY) {
                throw new ArithmeticException();
            }
            return result;
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Divide by zero!", "Invalid operation!", JOptionPane.ERROR_MESSAGE);
            return Double.parseDouble(null);
        }
    }
        public static double getResult() {
        double result = 0;
            switch (operationCode) {
                case 1:
                    result = sub();
                    break;
                case 2:
                    result = summ();
                    break;
                case 3:
                    result = mul();
                    break;
                case 4:
                    result = divide();
            }
            return result;

    }



}
