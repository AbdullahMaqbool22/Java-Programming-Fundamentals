import java.util.Scanner;

public class I9
{
    public static void main(String [] args)
    {
        double acc, v0, v1, t;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1 and t:");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();
        acc = (v1 - v0)/t;
        System.out.println("The average accelaration is " + acc );
    }
}
