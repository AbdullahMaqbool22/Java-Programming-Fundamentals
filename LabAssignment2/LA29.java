import java.util.Scanner;

public class LA29
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        int max = 0;
        System.out.println("Enter a Number : ");
        num = input.nextInt();
        while (num != 0) {
            System.out.println("Enter a Number : ");
            num = input.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The Maximum Number is : " +max);
    }
}


