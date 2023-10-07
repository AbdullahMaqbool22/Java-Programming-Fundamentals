import java.util.Scanner;

public class ClassJ
{
    public static void main(String [] args)
    {
        int year;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the year you were born: ");
        year = input.nextInt();
        switch (year%6) {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("rooster");
            break;
            case 2:
                System.out.println("dog");
            break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            default:
                System.out.println("Wrong");

        }
    }
}
