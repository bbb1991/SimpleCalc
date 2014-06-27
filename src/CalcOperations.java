import javax.swing.*;

public class CalcOperations {

    private static float firstNumber = 0;
    private static float secondNumber = 0;
    private static OperationCodes operationCode;

    public static void setOperationCode(OperationCodes operationCode) {
        CalcOperations.operationCode = operationCode;
    }

    public static void setSecondNumber(float secondNumber) {
        CalcOperations.secondNumber = secondNumber;
    }

    public static void setFirstNumber(float firstNumber) {
        CalcOperations.firstNumber = firstNumber;
    }

    private static double sum() {
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
            if (result == Double.NaN || result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY) {
                throw new ArithmeticException();
            }
            return result;
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Деление на ноль!!!111", "Invalid operation!", JOptionPane.ERROR_MESSAGE);
            return Double.parseDouble(null);
        }
    }
        public static double getResult() {
        double result = 0;
            switch (operationCode) {
                case MINUS:
                    result = sub();
                    break;
                case PLUS:
                    result = sum();
                    break;
                case MULTIPLY:
                    result = mul();
                    break;
                case DIVIDE:
                    result = divide();
            }
            return result;
    }



}
