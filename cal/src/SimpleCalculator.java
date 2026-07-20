public class SimpleCalculator{
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 4


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
                // Safety check to prevent dividing by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    isValidOperator = false;
                }
                break;

            default:
                System.out.println("Error: '" + operator + "' is an invalid operator.");
                isValidOperator = false;
                break;
        }

        if (isValidOperator) {
            System.out.println("--- Calculation Result ---");
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}