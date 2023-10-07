import java.util.Scanner;
public class CAS24
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal Number: ");
        int decimal = input.nextInt();
        binary(decimal);
    }
    public static void binary(int decimal)
    {
        if(decimal == 0)
            System.out.println("0000");
        else if (decimal == 1)
        {
            System.out.println("0001");

        }
        else if (decimal == 2)
        {
            System.out.println("0010");

        }
        else if (decimal == 3)
        {
            System.out.println("0011");

        }
        else if (decimal == 4)
        {
            System.out.println("0100");

        }
        else if (decimal == 5)
        {
            System.out.println("0101");

        }
        else if (decimal == 6)
        {
            System.out.println("0110");

        }
        else if (decimal == 7)
        {
            System.out.println("0111");

        }
        else if (decimal == 8)
        {
            System.out.println("1000");

        }
        else if (decimal == 9)
        {
            System.out.println("1001");

        }
        else if (decimal == 10)
        {
            System.out.println("1010");

        }

    }
}
