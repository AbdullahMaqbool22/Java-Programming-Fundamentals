import java.util.Scanner;

public class Activity55
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            number = console.nextInt();
            sum += number;
        }
        System.out.print("Total Sum is : " + sum);
    }
}
