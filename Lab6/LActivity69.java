import java.util.Scanner;

public class LActivity69
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String word = input.nextLine();
        String rep = word.replace('h','H');
        System.out.println("The index: " + rep );
    }
}
