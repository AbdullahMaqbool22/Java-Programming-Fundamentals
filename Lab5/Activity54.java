import java.util.Scanner;

public class Activity54 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int num, guess;
        boolean done;
        num = (int) (Math.random() * 100);
        done = false;
        while (!done) {
            System.out.print("Enter a number greater than or equal to 0 and less than 100 :");
            guess = console.nextInt();
            if (guess == num) {
                System.out.println("You guessed the Number correct ^-^ ");
                done = true;
            } else if (guess < num) {
                System.out.println("Your guess is lower ");
            } else {
                System.out.println("Your guess is high");
            }
        }
    }
}

