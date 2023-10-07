import java.util.Scanner;

public class F6
{
    public static void main(String [] args)
    {
        int val1, val2, val3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        val1 = input.nextInt();
        val2 = val1 % 10;
        val3 = val1 / 10;
        int val4 = val3 % 10;
        val3 = val3 / 10;
        int digit3 = val4 % 10;
        val3 = val3/10;
        int digit4 = val3 % 10;
        int sum = val1 + val2 + digit3 + digit4;
        System.out.println("The value of the digits is " + sum);

    }
}
