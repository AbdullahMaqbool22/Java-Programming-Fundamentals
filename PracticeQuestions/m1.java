import java.util.Scanner;

public class m1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer of three digits:");
        int number = input.nextInt();
        System.out.println("The reverse is " + reverse(number) + " and the palindrome state is " + isPalindrome(number));
    }

    public static int reverse(int number) {
        int reverse = 0, n;
        while (number > 0) {
            n = number % 10;
            reverse = reverse * 10 + n;
            number = number / 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }
}
