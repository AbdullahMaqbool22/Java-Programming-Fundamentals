import java.util.Scanner;

public class ClassR
{
    public static void main(String [] args)
    {
        int N, num=1, sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth value: ");
        N = input.nextInt();
        while(N>=1)
        {
            sum = sum +  (N*N*N);
            N--;

        }
        System.out.println(sum);
    }
}
