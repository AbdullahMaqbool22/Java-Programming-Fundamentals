import java.util.Scanner;

public class ClassA1
{
    public static void main(String[] args)
    {
        final int noq = 5;
        int coconut = 0;
        int count = 0;
        long STime = System.currentTimeMillis();
        StringBuilder otu = new StringBuilder(" ");
        Scanner input = new Scanner(System.in);
        while(count<noq){
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("What is " +number1+ " - " +number2+ " ?");
            int answer = input.nextInt();
            if (number1 - number2 == answer){
                System.out.println("You are correct!");
                coconut++;
            }
            else
                System.out.println("Your answer is wrong. \n" + number1 + " - " +number2+ " should be" + (number1- number2));
            count++;
            otu.append("\n").append(number1).append("-").append(number2).append("=").append(answer).append((number1 - number2 == answer) ? " correct" : " wrong");

        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - STime;
        System.out.println("Correct count is " + coconut + "\nTest time is " + testTime / 1000 + " seconds\n" + otu);


    }
}
