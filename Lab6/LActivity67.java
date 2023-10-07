import java.util.Scanner;

public class LActivity67
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String word = input.nextLine();
        int index = word.indexOf('f');
        int index1 = word.lastIndexOf('f');
        System.out.println("The index: "+ index + " " + index1);

    }
}
