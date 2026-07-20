import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long number = sc.nextLong();


        int[] counts = new int[10];
        long temp = number;


        while (temp > 0) {
            int digit = (int) (temp % 10);
            counts[digit]++;
            temp = temp / 10;
        }

        System.out.println("\nDigit frequencies:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurred " + counts[i] + " time(s)");
            }
        }

        sc.close();
    }
}