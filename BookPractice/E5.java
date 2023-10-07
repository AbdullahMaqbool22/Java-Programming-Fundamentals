import java.util.Scanner;

public class E5
{
    public static void main(String [] args)
    {
        double subtotal, gratuity, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuity = input.nextDouble();
        gratuity = gratuity / 10;
        total = gratuity + subtotal;
        System.out.println("The gratuity is " +gratuity+ " and total is " + total);


    }
}
