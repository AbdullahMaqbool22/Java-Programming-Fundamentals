public class Activity23 {
    public static void main(String [] args)
    {
        double regularWages, overtimeWages, totalWages;
        double basePay = 25;
        double regularHours = 40;
        double overtimePay = 37.5;
        double overtimeHours = 10;
        regularWages = basePay + regularHours;
        overtimeWages = overtimePay * overtimeHours;
        totalWages = regularWages + overtimeWages;
        System.out.println("Wages for this week are $" + totalWages);


    }
}
