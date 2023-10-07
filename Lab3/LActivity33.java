import java.util.Scanner;
import java.lang.Math;
public class LActivity33 {
    public static void main(String [] args)
    {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first class:");
        a = input.nextInt();
        double val1 =Math.ceil(a/2);
        System.out.println("Enter second class:");
        b = input.nextInt();
        double val2 =Math.ceil(b/2);
        System.out.println("Enter third class:");
        c= input.nextInt();
        double val3 =Math.ceil(c/2);
        double sum = (val1 + val2 + val3);
        System.out.println(sum);
    }
}
