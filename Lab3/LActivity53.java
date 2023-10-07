import java.util.Scanner;

public class LActivity53
{
    public static void main(String [] args)
    {
        double car, lit;
        System.out.println("Enter the total of milk produced in the morning: ");
        Scanner console = new Scanner(System.in);
        lit = console.nextDouble();
        double milk =Math.ceil(lit / 3.78);
        System.out.println(milk);
        double cmilk = milk * 0.38;
        System.out.println(cmilk);
        double pmilk =  cmilk * 0.27;
        System.out.println(pmilk);


    }
}
