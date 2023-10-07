import java.util.Scanner;

public class LActivity63
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the amount you have worked:");
        double worked = console.nextDouble();
        double totalPay = worked*15.50;
        System.out.println(totalPay);
        double tax = totalPay*0.14;
        totalPay = totalPay-tax;
        System.out.println("Your salary after tax: " + tax);
        double clothe = totalPay*0.1;
        System.out.println("Spent on clothe" + clothe);
        double ss = totalPay*0.01;
        System.out.println("Spent on accesory: " + ss);
        double sb = totalPay*0.25;
        System.out.println("Spent on saving bonds" + sb);
        double asb = totalPay*0.50;
        System.out.println("spent on additional saving bond: " + asb);


    }
}
