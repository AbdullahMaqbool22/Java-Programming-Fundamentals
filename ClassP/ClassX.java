import java.util.Scanner;

public class ClassX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start value: ");
        int a = input.nextInt();
        System.out.println("Enter end value: ");
        int b = input.nextInt();
        int sumValue = sum(a, b);
        System.out.println("The sum is :" + sumValue);
    }

    public static int sum(int startVal, int endVal) {
        int sum = 0;
        for (int i = startVal; i <= endVal; i++) {
            sum += i;
        }
        return sum;
    }
}
