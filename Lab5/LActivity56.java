import java.util.Scanner;

public class LActivity56
{
    public static void main(String [] args)
    {
        int index = 1, num = -1, max = 0, maxIndex = -1;
        Scanner input = new Scanner(System.in);
        while (num != 0) {
            System.out.print("Enter the number : ");
            num = input.nextInt();
            if (num > max) {
                max = num;
                maxIndex = index;
            }
            index++;
        }
        System.out.println("Maximum Index of numbers are : " + maxIndex);
    }
}
