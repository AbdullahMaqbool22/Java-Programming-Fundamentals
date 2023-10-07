import java.util.Scanner;

public class Q26
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current cost of the item: ");
        double cost = input.nextDouble();

        System.out.print("Enter the number of years from now that the item will be purchased: ");
        int years = input.nextInt();

        System.out.print("Enter the rate of inflation (as a percentage): ");
        double IRate = input.nextDouble() / 100;

        for (int i = 0; i < years; i++) {
            cost = cost * (1 + IRate);
        }

        System.out.printf("The estimated cost of the item after %d years is $%.2f", years, cost);
    }

    }

