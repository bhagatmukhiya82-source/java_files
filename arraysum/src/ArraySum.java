import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] marks = new int[10];
        int sum = 0;

        System.out.println("Enter 10 marks:");


        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }


        System.out.println("\nThe sum of the 10 marks is: " + sum);

        sc.close();
    }
}
