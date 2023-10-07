import java.util.Scanner;

public class LActivity533
{
    public static void main(String [] args)
    {
        int zero = 0, Num = -1, num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of numbers : ");
        Num = input.nextInt();
        while (Num != 0) {
            System.out.print("Enter the number : ");
            num = input.nextInt();
            if (num == 0)
                zero += 1;
            Num--;
        }
        System.out.println("Number of zero are : " + zero);
    }
}
