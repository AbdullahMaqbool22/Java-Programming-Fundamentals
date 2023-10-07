import java.util.Scanner;
public class LA26
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0/i;
        }
        System.out.println("Sum of the series is: " + sum);
    }
}
