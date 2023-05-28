package homewrok_week4;

import java.util.Scanner;

public class Program1_ReadingUserInputChallenge {


    public static void main(String[] args) {
        userInputChallenge();
    }

    public static void userInputChallenge() {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count);

            boolean validateNumber = scanner.hasNextInt();
            if (validateNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            // Always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        scanner.close();
    }
}
