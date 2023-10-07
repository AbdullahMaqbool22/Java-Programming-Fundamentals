import java.util.Scanner;

public class LActivity45
{
    public static void main(String [] args)
    {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("First value");
        num1 = input.nextInt();
        System.out.println("Second Value");
        num2 = input.nextInt();
        System.out.println("Third Value");
        num3 = input.nextInt();
        if((num1 == num2) && (num3 == num2))
            System.out.println("3");
        else if ((num1==num2) || (num2 == num3) || (num3 == num1)) {
            System.out.println("2");
            
        } else if ((num1 != num2) && (num3 != num2)) {
            System.out.println("0");

        }
    }
}
