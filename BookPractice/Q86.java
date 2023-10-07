import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        double loanA, AIRate = 5.0, MIRate, MPay, TPay;
        int lPeriod, NPay;
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        loanA = input.nextDouble();
        System.out.print("Number of Years: ");
        lPeriod = input.nextInt();
        System.out.printf("Interest Rate\t Monthly Payment \t Total Payment \n");
        while (AIRate <= 8.0) {
            MIRate = AIRate / 1200;
            NPay = lPeriod * 12;
            MPay = (loanA * MIRate) / (1 - Math.pow(1 + MIRate, - NPay));
            TPay = MPay * NPay;
            System.out.printf("%.3f%% \t\t\t %.2f \t\t\t\t %.2f\n", AIRate, MPay, TPay);

            AIRate = AIRate + 0.125;

        }
    }
}
