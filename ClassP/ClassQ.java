import java.util.Scanner;

public class ClassQ
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int numbers, count=0, fact=1;
        System.out.println("Enter a number: ");
        numbers = input.nextInt();
        while(numbers>=1)
        {
            fact *= numbers;
            numbers--;
        }
        System.out.println("The factorial is: " + fact);
    }
}
