import java.util.Scanner;
public class LActivity3
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        int secret = 11;
        double rate = 12.50;
        int num1, num2, newNum;
        String name;
        double hourw, wages;
        System.out.println("Enter the first value: ");
        num1 = console.nextInt();
        System.out.println("Enter the second value: ");
        num2 = console.nextInt();
        System.out.println("Your first value was:\n" + num1);
        System.out.println("Your second value was:\n" + num2);
        newNum = (2*num1) + num2;
        int ivory = newNum + secret;
        System.out.println("The total value is:\n" + ivory);
        System.out.println("Enter the last name: ");
        name = console.next();
        System.out.println("Your last name is:\n" + name);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Enter the hours you have worked in decimal form (0 - 70): ");
        hourw = console.nextDouble();
        System.out.println("The hours you worked:\n" + hourw);
        wages = hourw * rate;
        System.out.println("Your salary is:\n" + wages);
    }
}
