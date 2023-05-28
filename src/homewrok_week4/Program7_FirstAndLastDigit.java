package homewrok_week4;

import java.util.Scanner;

public class Program7_FirstAndLastDigit {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = scanner.nextInt();
        System.out.println(sumFirstAndLastDigit(num));


    }


    public static int sumFirstAndLastDigit (int number) {
        int lastDigit = number % 10;
        int sum = 0;

        if (number >= 10) {

            while ((number / 10) >= 10){

                number = number / 10;
            }

            number = number / 10;
            sum = lastDigit + number;
            return sum;

        } else if (number < 0) {

            return -1;
        }

        sum = number *= 2;
        return sum;
    }

}
