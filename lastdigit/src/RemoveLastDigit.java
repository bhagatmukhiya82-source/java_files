public class RemoveLastDigit {
    public static void main(String[] args) {
        int number = 2478;
        int shorterNumber = number / 10;
        System.out.println("Original: " + number);
        System.out.println("After removing last digit: " + shorterNumber);
    }
}