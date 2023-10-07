package Lab7;

public class LActivity74
{
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.println("The number of days in year " + i + " are : " + numberOfDaysInYear(i));
        }
    }
    public static int numberOfDaysInYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return 366;
        else
            return 365;
    }

}
