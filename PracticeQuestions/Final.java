package PracticeQuestions;

import java.util.Scanner;
public class Final {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting the number of students to determine the rows of array
        // 2 is set for the columns as they will present the name and gpa of student

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        String [][] record = new String[students][2];
        double totalMarks = 0;
        double creditHours = 0;

        // The StudentRecord is called here
        String [][] record1 = StoreRecord(record, totalMarks, creditHours);

        // We iterate it over the rows only, as if it is iterated over the columns, then it will result in more iterations than expected
        // suppose I iterate it over the columns as well, then it will complete the 2 iterations of column with the 1st row, and then 2 more iterations
        for (int i = 0; i < record1.length; i++) {
            System.out.println("The name of the student" + (i + 1) + " is: " + record[i][0]);
            System.out.println("The GPA of the student" + (i + 1) + " is: " + record[i][1]);
        }
    }
    public static String[][] StoreRecord(String [][] record, double totalMarks, double creditHours) {
        Scanner input = new Scanner(System.in);

        //again we iterate over the rows only, as I tried using the columns, but it didn't work the way it was supposed to :(
        for (int i = 0; i < record.length; i++) {
            System.out.print("Enter the name of the student: ");

            // the name of the student is stored in the 1st row, at the 1st column
            record[i][0] = input.nextLine();

            // the gpa function is called, and it works on the 1st row, 2nd column
            record[i][1] = String.valueOf(cgpa(totalMarks, creditHours));
        }
        return record;
    }
    public static double cgpa(double totalMarks, double creditHours) {
        Scanner input = new Scanner(System.in);

        // asking for the total subjects of the students
        System.out.print("Enter the total subjects: ");
        int subjects = input.nextInt();
        String subjectName;
        double hours;
        char Grade;
        double totalPoints = 0;
        double gpa;
        double totalHours;
        double gradePoints = 0;

        //Getting the credit hours of all the subjects
        System.out.print("Enter the credit hours for all the subjects: ");
        totalHours = input.nextDouble();
        input.nextLine(); // using input.nextLine() cz without it, the string value on the second iteration, wasn't taking input

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the subject: ");
            subjectName = input.nextLine();

            System.out.print("Enter the number of credit hours of the subject: ");
            hours = input.nextDouble();
            input.nextLine();

            System.out.print("Enter the garde: ");
            Grade = input.next().charAt(0);
            if (Grade == 'A') {
                gradePoints = 4;
            } else if (Grade == 'B') {
                gradePoints = 3;
            } else if (Grade == 'C') {
                gradePoints = 2;
            } else if (Grade == 'D') {
                gradePoints = 1;
            } else if (Grade == 'F') {
                gradePoints = 0;
            } else {
                System.out.print("Invalid!");
            }
            input.nextLine();

            totalPoints += hours * gradePoints; // determining all the points of the student

        }
        gpa = totalPoints / totalHours; // dividing the total points with the total credit hours
        return gpa;
    }
}