import java.util.Scanner;
public class Q106 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int inp = -1, max = inp, count = 1;
            System.out.println("Input positve integer or 0 to quit: ");
            while (inp != 0) {
                inp = input.nextInt();
                if (inp > max) {
                    max = inp;
                    count = 1;
                } else if (inp == max) {
                    count++;
                }
                System.out.println("Max is: " + max + " And it's count is: " + count);
            }
        }
    }

