import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class activvity43
{
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        double wages, rate, hours;
        System.out.println("Enter the working " + "hours: ");
        hours = input.nextDouble();
        System.out.println();
        System.out.println("Enter the pay " + "rate: ");
        rate = input.nextDouble();
        System.out.println();
        if (hours>40.0)
            wages = 40.0 * rate + 1.5 * rate * (hours - 40.0);
        else
            wages = hours * rate;
        System.out.printf("The wages are $%.2f %n", wages);
        System.out.println();
    }
}
