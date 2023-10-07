import java.util.Scanner;
public class ClassD
{
    public static void main(String [] args)
    {
        double hourWorked, hourlyPayRate, grossPay, overtime;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hour's worker worked:");
        hourWorked = input.nextDouble();
        if (hourWorked>40)
        {
            System.out.println("Enter the (hourly) pay rate you want to give to the worker:");
            hourlyPayRate = input.nextDouble();
            grossPay = hourWorked * hourlyPayRate;
            overtime = grossPay * 1.5;
            overtime = hourlyPayRate - grossPay;
            System.out.println("The Pay for the worker is: " + overtime + "$");
        }
        else
        {
            System.out.println("Enter the (hourly) pay rate you want to give to : ");
            hourlyPayRate = input.nextDouble();
            grossPay = hourWorked * hourlyPayRate;
            System.out.println("The Pay for the worker is: " + grossPay + "$");
        }
    }
}
