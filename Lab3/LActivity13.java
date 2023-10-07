import java.util.Scanner;

public class LActivity13
{
    public static void main(String [] args)
    {
        double value;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total amount in dollars $ you have:");
        value = input.nextDouble();
        double cents = value * 100;
        double dollar = cents / 100;
        System.out.println("Dollars: " + dollar);
        double quarters = dollar / 25;
        System.out.println("Quarters: " + quarters);
        double dimes = quarters / 10;
        System.out.println("dimes: " + dimes);
        double nickels = dimes / 5;
        System.out.println("nickels: " + nickels);
    }
}
