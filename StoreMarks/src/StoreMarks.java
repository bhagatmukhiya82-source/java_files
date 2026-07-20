import java.util.Scanner;

public class StoreMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("\nEntered marks");

        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        sc.close();
    }
}