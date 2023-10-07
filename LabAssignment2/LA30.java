import java.util.Scanner;

public class LA30
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int even = 0;
        System.out.println("Enter a Number : ");
        int num = input.nextInt();
        while (num != 0) {
            System.out.println("Enter a Number : ");
            num = input.nextInt();
            if (num % 2 == 0 && num != 0) {
                even += 1;
            }
        }
        System.out.println("The Number of Even Numbers in the Sequence are : " +even);
    }
}

