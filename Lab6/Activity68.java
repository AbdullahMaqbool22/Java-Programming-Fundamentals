import java.util.Scanner;

public class Activity68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String word = input.nextLine();
        String rep = word.replace('h',' ');
        System.out.println("The index: " + rep );
    }
}
