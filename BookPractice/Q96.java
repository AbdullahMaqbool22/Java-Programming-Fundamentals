import java.util.Scanner;
public class Q96
{
    public static void main(String [] args){
                int remainder, decimal;
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a decimal integer: ");
                decimal = input.nextInt();
                String binary = " ";
                while (decimal > 0) {
                    remainder = decimal % 2;
                    binary = remainder + binary;
                    decimal = decimal / 2;
                }

                System.out.println("The binary value is: " + binary);
            }
        }
