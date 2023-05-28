package homewrok_week4;

import java.util.Scanner;

public class Program4_DigitSumChallenge {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter Number : ");
        int num = scanner.nextInt();
        System.out.println("Sum of "  +num+  " is = " + sumDigits(num));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sumDigits = 0;
        // Convert number to string
        String numberToString = Integer.toString(number);
        // Map through all char of the string
        for(char c : numberToString.toCharArray()) {
            // Convert the char to number again
            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }

}
