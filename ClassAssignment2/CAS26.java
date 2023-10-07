import java.util.Scanner;
public class CAS26
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String u_input = input.next();
        String result = reverse(u_input);
        boolean check = isPalindrome(u_input, result);
        System.out.println("The reversed word is:" + result);
        System.out.println("The status of palindrome is " + check);
    }
    public static String reverse(String u_input) {
        String rev = "";
        for (int i = 0; i < u_input.length(); i++){
            rev = u_input.charAt(i) + rev;
        }
        return rev;
    }
    public static boolean isPalindrome(String u_input, String result) {
        if(u_input.equals(result))
            return true;
        else
            return false;
    }
}
