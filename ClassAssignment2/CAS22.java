import java.util.Scanner;
public class CAS22
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the assigned Alphabet and the code:");
        String alpha = input.next();
        int num = input.nextInt();
        switch (alpha) {
            case "M":
                System.out.println("Mathematics");
                break;
            case "C":
                System.out.println("Computer Science");
                break;
            case "I":
                System.out.println("Information Technology");
                break;
            default:
                System.out.println("Invalid Input");
        }
        if (num == 1)
        {
            System.out.println("Freshman");
        }
        else if (num == 2)
        {
            System.out.println("Sophomore");
        }
        else if (num == 3)
        {
            System.out.println("Junior");

        }
        else if (num==4)
        {
            System.out.println("Senior");
        }
        else
            System.out.println("Invalid Input");
    }
}
