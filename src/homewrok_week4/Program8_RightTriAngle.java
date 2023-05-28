package homewrok_week4;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 */
public class Program8_RightTriAngle {

    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        rightTriangle();
    }

    public static void rightTriangle(){

        System.out.println("Enter rows: ");
        int rows =sc.nextInt();

        int a, b;
        for(a = 0; a < rows; a++) {
            for(b = 0; b <= a; b++) {
                System.out.print("@");
            }
            System.out.println();
        }


    }
}
