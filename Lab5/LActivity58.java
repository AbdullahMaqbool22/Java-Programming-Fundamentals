import java.util.Scanner;

public class LActivity58
{
    public static void main(String [] args)
    {
        int greater = 0, num = -1, prevNum;
        Scanner input = new Scanner(System.in);
        while (num != 0) {
            System.out.print("Enter the number : ");
            prevNum = num;
            num = input.nextInt();
            if (num > prevNum) {
                greater++;
            }
        }
        System.out.println(
                "Number of numbers that are greater than previous are : " + (greater - 1)
        );
    }
}
