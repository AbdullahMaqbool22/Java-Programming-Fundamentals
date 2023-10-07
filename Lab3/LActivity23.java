import java.util.Scanner;
public class LActivity23 {
    public static void main(String [] args)
    {
        int k, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount of Apples:");
        k = input.nextInt();
        System.out.println("Enter the Amount of Students:");
        n = input.nextInt();
        int val1 = n / k;
        System.out.println(val1);
        int val2 = n % k;
        System.out.println(val2);
    }
}
