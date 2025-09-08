import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reversed = 0;
        int original = number;

        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10;      // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            number = number / 10;         // Remove last digit
        }

        // Output
        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);

        sc.close();
    }
}
