import java.util.Scanner;

public class LA32
{
    public static void main(String [] args)
    {
        System.out.println("Enter a number to check Prime or Not");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2, count = 0;
        while (i <= number / 2)
        {
            if (number % i == 0)
            {
                count++;
            }
            i++;
        }
        if (count == 0)
        {
            System.out.println(number + " is prime number");
        }
        else
        {
            System.out.println(number + " is not a prime number");
        }
        }
    }




