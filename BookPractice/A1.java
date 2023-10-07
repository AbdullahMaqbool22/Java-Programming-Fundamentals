import java.util.Scanner;

public class A1
{
    public static void main (String [] args)
    {
        double celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (9 / 5) * celsius + 32;
        System.out.println(celsius + " is " +fahrenheit+ " Fahrenheit");
    }
}
