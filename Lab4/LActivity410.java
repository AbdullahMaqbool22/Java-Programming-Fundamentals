import java.util.Scanner;

public class LActivity410
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("books puirchased");
        int notbook = input.nextInt();
        int points = 0;
        if(notbook >= 4)
            points = 60;
        else if (notbook == 3) {
            points = 30;

        } else if (notbook==2) {
            points = 15;

        } else if (notbook == 1) {
            points = 5;

        }
        System.out.println("points earned " + points);
    }
}
