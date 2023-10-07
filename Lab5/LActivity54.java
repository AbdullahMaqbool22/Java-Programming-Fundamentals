import java.util.Scanner;

public class LActivity54
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args)
    {
        int length = 0, num = -1;
        Scanner input = new Scanner(System.in);

        while (num != 0) {
            System.out.print("Enter the number : ");
            num = input.nextInt();
            length++;
        }
        System.out.println("Number of numbers are : " + (length - 1));
    }
}
