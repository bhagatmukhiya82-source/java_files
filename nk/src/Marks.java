import java.util.Scanner;

class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }


        int greatestMarks = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > greatestMarks) {
                greatestMarks = marks[i];
            }
        }
        System.out.println("Highest marks: " + greatestMarks);


        int lowestMarks = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < lowestMarks) {
                lowestMarks = marks[i];
            }
        }
        System.out.println("Lowest marks: " + lowestMarks);


        float average = sum / 5.0f;
        System.out.println("Average marks: " + average);


        if (average > 90) {
            System.out.println("Grade: A+");
        } else if (average > 80) {
            System.out.println("Grade: A");
        } else if (average > 70) {
            System.out.println("Grade: B");
        } else if (average > 60) {
            System.out.println("Grade: C");
        } else if (average > 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }


        sc.close();
    }
}