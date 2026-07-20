import java.util.Scanner;

public class EvenOddChecker {
    // Constructor that takes an integer and checks if it's even or odd
    public EvenOddChecker(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Creating the object triggers the constructor and runs the logic
        EvenOddChecker checker = new EvenOddChecker(userInput);

        scanner.close();
    }
}