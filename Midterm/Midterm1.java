import java.util.Scanner;
public class Midterm1
{
    public static void main(String [] args) {
        String u_input;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        u_input = input.next();
        System.out.println("The number of non vowels in the words are: " + vowelCheck(u_input));
    }

    public static int vowelCheck(String user_input) {
        int count = 0, countp = 0;
        for(int i = 0; i<user_input.length(); i++){
            if (user_input.charAt(i)=='a')
                count++;
            if (user_input.charAt(i)=='e') {
                count++;

            }
            if (user_input.charAt(i)=='i') {
                count++;

            }
            if (user_input.charAt(i)=='o') {
                count++;

            }
            if (user_input.charAt(i)=='u') {
                count++;

            }
            else if (user_input.charAt(i) != 'a' && user_input.charAt(i) != 'e' && user_input.charAt(i) != 'i' && user_input.charAt(i) != 'o' && user_input.charAt(i) != 'u' ) {
                countp++;

            }
        }
        return countp;
    }
}


