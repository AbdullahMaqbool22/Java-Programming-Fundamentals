import java.util.Scanner;
public class Activity5
{
        public static void main(String [] args)
        {
            final double PI = 3.14159;
            Scanner Input = new Scanner(System.in);
            System.out.println("Enter a number for radius: ");
            double radius = Input.nextDouble();
            double area = radius * radius * PI;
            System.out.println("The area for the circle of Radius " + radius + " is " + area);
        }
}
