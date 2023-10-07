import java.util.Scanner;

public class ClassB
{
    public static void main(String [] args)
    {
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = input.nextDouble();
        if (radius>=0)
        {
            area = 3.14159*radius*radius;
            System.out.println("The area is : " + area);
        }
        else
        {
            System.out.println("Enter a value that is greater than 0.");
        }
    }
}
