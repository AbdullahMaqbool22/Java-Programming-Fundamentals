import java.util.Scanner;

public class ClassC {
    public static void main(String [] args )
    {
        double pay, perf;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the performance of cand. : ");
        perf = input.nextDouble();
        System.out.println("Enter the pay of the cand. : ");
        pay = input.nextDouble();
        if (perf>=90)
        {
            double payi = pay*0.03;
            pay = payi + pay;
            System.out.println("The pay is increased by 3%: " + pay);
        }
        else
        {
            double payr = pay*0.01;
            pay = payr + pay;
            System.out.println("The pay is increased by 1%: " + pay);
        }

    }
}
