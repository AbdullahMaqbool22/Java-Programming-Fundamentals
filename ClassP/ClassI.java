import java.util.Scanner;

public class ClassI
{
    public static void main(String [] args)
    {
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A number:");
        num1 = input.nextInt();
        if (num1%2==0)
        {
            System.out.println("The number is divisible be 2");
        }  if (num1%3==0)
        {
            System.out.println("the number is divisible by 3");
        }  if (num1%5==0)
        {
            System.out.println("The number is divisible by 5");

        }  if (num1%10==0)
        {
            System.out.println("The number is divisible by 10");

        }
    }
}
