package Lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        while(true){
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Enter an integer value: ");
                int n = input.nextInt();
                System.out.println("Factorial = " + factorial(n) );
                break;
            }
            catch(InputMismatchException ex){
                System.out.println("You have entered an invalid input.");
                System.out.println("Try Again");
            }
        }
    }

    public static int factorial(int n) {
 int f = 1;
 for (int i = 1; i<=n; i++)
     f=f*i;
 return f;
    }
}
