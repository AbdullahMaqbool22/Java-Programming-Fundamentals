package Lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lact1 {
    public static void main(String[] args) {
        int val1 = 0;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter your first value:");
                int num1 = input.nextInt();
                System.out.println("Enter your second value:");
                int num2 = input.nextInt();
                val1 = num1 + num2;
                System.out.println("It is a right input: " + val1);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Entered a wrong input only integers are allowed");

            }


        }


    }
}
