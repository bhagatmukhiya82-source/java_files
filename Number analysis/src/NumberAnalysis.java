import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();


        if (num <= 0) {
            System.out.println("Please enter a valid positive integer greater than 0.");
        } else {
            int temp = num;
            int count = 0;
            int sum = 0;
            int largestDigit = 0;


            while (temp > 0) {
                int digit = temp % 10;
                count++;
                sum = sum + digit;

                if (digit > largestDigit) {
                    largestDigit = digit;
                }

                temp = temp / 10;
            }


            System.out.println("\n--- Analysis Results ---");
            System.out.println("Number of digits: " + count);
            System.out.println("Sum of its digits: " + sum);
            System.out.println("Largest digit present: " + largestDigit);
        }

        sc.close();
    }
}