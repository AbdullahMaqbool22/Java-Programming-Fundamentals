import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        int num1, binary = 0;
        while (n > 0) {
            num1 = n % 2;
            binary = binary + num1;
            n = n / 2;
        }
        System.out.println("The binary is: " + binary);
    }
}