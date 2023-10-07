import java.util.Scanner;

public class LActivity57
{
    public static  void main(String [] args)
    {
        int even = 0, num = -1;
        Scanner input = new Scanner(System.in);
        while (num != 0) {
            System.out.print("Enter the number : ");
            num = input.nextInt();
            if (num % 2 == 0) {
                even++;
            }
        }
        System.out.println("Number of even numbers are : " + (even - 1));
    }
}
