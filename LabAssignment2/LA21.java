import java.util.Scanner;

public class LA21
{
    public static void main(String [] args)
    {
        int num1, num2, sum, wish;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Enter the first value: ");
            num1 = input.nextInt();
            System.out.println("Enter the second value: ");
            num2 = input.nextInt();
            sum = num1 + num2;
            System.out.println("Your sum is: "+sum);
            System.out.println("If you want to proceed again enter 1 or to cancel enter 0: ");
            wish = input.nextInt();
        }
        while(wish == 1);
    }
}
