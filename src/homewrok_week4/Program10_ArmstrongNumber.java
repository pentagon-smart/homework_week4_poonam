package homewrok_week4;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */

public class Program10_ArmstrongNumber {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        armstrongNum();
    }

    public static void armstrongNum() {
            int temp, total = 0;
            System.out.print("Enter Number : ");
            int num = scanner.nextInt();
            int number = num;

            for (; number != 0; number /= 10) {
                temp = number % 10;
                total = total + temp * temp * temp;
            }

            if (total == num) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }
}
