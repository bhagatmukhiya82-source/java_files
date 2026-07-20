public class DisplayDigits {
    public static void main(String[] args) {
        int number = 2478;
        System.out.println("The digits of the number are:");
        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
    }
}