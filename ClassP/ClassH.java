import java.util.Scanner;

public class ClassH
{
    public static void main(String [] args)
    {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first value:");
        num1 = input.nextInt();
        System.out.println("Enter your second number:");
        num2 = input.nextInt();
        System.out.println("Enter your third number:");
        num3 = input.nextInt();
        if (num1>num2 && num1>num3)
        {
            System.out.println(num1);
        }
        else if (num2>num1 && num2>num3)
        {
            System.out.println(num2);
        }
        else if (num3>num1 && num3>num2)
        {
            System.out.println(num3);
        }

    }
}
