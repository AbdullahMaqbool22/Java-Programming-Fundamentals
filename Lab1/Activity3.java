import java.util.Scanner;

public class Activity3 {
    static Scanner console = new Scanner(System.in);
    public static void main (String [] args)
    {
        String fname;
        String lname;
        int age;
        double weight;
        System.out.println("Enter first name, last name, age and weight separated by spaces.");
        fname=console.next();
        lname= console.next();
        age= console.nextInt();
        weight = console.nextDouble();
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);




    }
}
