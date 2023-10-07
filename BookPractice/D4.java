import java.util.Scanner;

public class D4
{
    public static void main(String [] args)
    {
        double pounds, kilograms;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        pounds = input.nextDouble();
        kilograms = pounds * 0.454;
        System.out.println(pounds + " pound is " + kilograms + " kilograms" );
    }
}
