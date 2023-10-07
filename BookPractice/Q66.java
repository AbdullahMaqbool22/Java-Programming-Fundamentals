import java.util.Scanner;

public class Q66
{
    public static void main(String [] args){
                Scanner input = new Scanner(System.in);
                int divisor;
                System.out.print("Enter the first integer: ");
                int num1 = input.nextInt();

                System.out.print("Enter the second integer: ");
                int num2 = input.nextInt();
                if(num1>num2){
                    divisor = num2;
                }
                else
                    divisor = num1;

                while (divisor >= 1) {

                    if (num1 % divisor == 0 && num2 % divisor == 0) {
                        System.out.printf("The GCD of %d and %d is %d", num1, num2, divisor);
                        break;
                    }

                    divisor--;
                }
    }
}
