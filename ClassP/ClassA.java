import java.util.Scanner;
public class ClassA
{
    public static void main(String [] args)
    {
        int integer;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an Integer: ");
        integer = input.nextInt();
        if (integer%5==0)
            System.out.println("HiFive");
        if (integer%2==0)
            System.out.println("HiEven");
    }
}

