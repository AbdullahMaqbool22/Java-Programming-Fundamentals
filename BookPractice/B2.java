import java.util.Scanner;

public class B2
{
    public static void main(String [] args)
    {
        double radius, length, area, volume;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();
        area = radius * radius * 3.14159;
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
