import java.util.Scanner;
public class excerpt {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the hourly rate: ");
            double hourlyRate = input.nextDouble();

            System.out.print("Enter the number of hours worked: ");
            double hoursWorked = input.nextDouble();

            double grossPay = calculateGrossPay(hourlyRate, hoursWorked);
            System.out.printf("Gross pay: $%.2f%n", grossPay);

            input.close();
        }

        public static double calculateGrossPay(double hourlyRate, double hoursWorked) {
            double regularPay = Math.min(hoursWorked, 40) * hourlyRate;
            double overtimePay = Math.max(0, hoursWorked - 40) * hourlyRate * 1.5;
            return regularPay + overtimePay;
        }


}
