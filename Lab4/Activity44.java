import java.util.Scanner;

public class Activity44
{
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        int score;
        System.out.println("Enter score: ");
        score = input.nextInt();
        if (score >= 90)
            System.out.println("The grade is A");
        else if (score >= 80)
            System.out.println("The grade is B");
        else if (score >= 70)
            System.out.println("The grade is C");
        else if (score >= 60)
            System.out.println("The grade is D");
        else
            System.out.println("The grade is F");
    }
}
