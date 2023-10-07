import java.util.Scanner;

public class L12
{
    public static void main(String [] args)
    {
        double a, v, length;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed and acceleration:");
        v = input.nextDouble();
        a = input.nextDouble();
        length = v * v/2*a;
        System.out.println("The minimum runway length for this airplane is: " + length);
    }
}
