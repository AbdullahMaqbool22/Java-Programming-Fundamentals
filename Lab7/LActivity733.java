package Lab7;

public class LActivity733
{
    public static void main(String[] args) {
            displaySortedNumbers(123, 231231, 4312);
        }

        public static void displaySortedNumbers(
                double num1,
                double num2,
                double num3
        ) {
            if (num1 <= num2 && num2 <= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else if (num1 < num3 && num3 < num2) {
                System.out.println(num1 + " " + num3 + " " + num2);
            } else if (num2 < num1 && num1 < num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else if (num2 < num3 && num3 < num1) {
                System.out.println(num2 + " " + num3 + " " + num1);
            } else if (num3 < num2 && num2 < num1) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else if (num3 < num1 && num1 < num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        }
    }

