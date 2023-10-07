import java.util.Scanner;

public class J10
{
    public static void main (String [] args)
    {
        double M, It, Ft, Q;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kg:");
        M  = input.nextDouble();
        System.out.println("Enter the initial temprature: ");
        It = input.nextDouble();
        System.out.println("Enter the final temprature: ");
        Ft = input.nextDouble();
        Q = M * (Ft - It) * 4184;
        System.out.println("The energy  needed is " + Q);
    }
}
