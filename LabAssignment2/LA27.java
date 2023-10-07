import java.util.Scanner;
public class LA27
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms of the sequence : ");
        int num = input.nextInt();
        int n;
        int zero = 0;
        int count = 0;
        while (count < num) {
            System.out.println("Enter a Number : ");
            n = input.nextInt();
            if (n == 0) {
                zero++;
            }
            count++;
        }
        System.out.println("The Number of Zeros are : " +zero);
    }
}



