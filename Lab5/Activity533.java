import java.util.Scanner;

public class Activity533
{
    static Scanner input = new Scanner(System.in);
    static final int SENTINEL = -999;
    public static void main(String [] args)
    {
        int number, sum = 0, count = 0;
        System.out.println("Enter positive integers " + "ending with " + SENTINEL);
        number = input.nextInt();
        while (number != SENTINEL)
        {
            sum = sum + number;
            count++;
            number = input.nextInt();
        }
        System.out.printf("The sum of %d " + "numbers = %d%n", count, sum);
        if (count != 0)
            System.out.printf("The average = %d%n", (sum/count));
        else
            System.out.println("No input.");
    }
}
