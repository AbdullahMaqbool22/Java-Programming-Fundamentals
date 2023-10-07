import java.util.Scanner;
public class LActivity2
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        double length;
        double width;
        System.out.println("Enter the length of the rectangle: ");
        length = console.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = console.nextDouble();
        double area = length * width;
        double peri = 2 * (length + width);
        System.out.println("The area of Rectangle is: " + area);
        System.out.println("The perimeter of Rectangle is: " + peri);
    }

}
