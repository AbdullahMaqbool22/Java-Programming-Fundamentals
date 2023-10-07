package FinalSemesterProject.SourceCode;
import java.io.*;
import java.util.Scanner;

public class KBH
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int log_out = 0;
            String[] email_array = new String[6];

            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\email.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    email_array[index] = line;
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Email file not found. Starting with an empty list.");
            }

            String[][] em_pa_array = new String[5][2];

            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\name.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    for (int i = 0; i < em_pa_array.length; i++) {
                        for (int j = 0; j < em_pa_array[0].length; j++) {
                            em_pa_array[i][j] = line;
                        }
                    }
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Name file not found. Starting with an empty list.");
            }

            String[] roll_array = new String[10];


            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\rollNumber.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    roll_array[index] = line;
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Roll number file not found. Starting with an empty list.");
            }

            String[] name_array = new String[10];

            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\name.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    name_array[index] = line;
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Name file not found. Starting with an empty list.");
            }

            String[][] ro_pa_array = new String[10][2];
            String[] fees_array = new String[11];

            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\fees.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    fees_array[index] = line;
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Fees file not found. Starting with an empty list.");
            }

            String[] att_array = new String[50];

            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\attendance.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    att_array[index] = line;
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Attendance file not found. Starting with an empty list.");
            }

            int[] marks_array = new int[50];

            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\marks.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    marks_array[index] = Integer.parseInt(line);
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Marks file not found. Starting with an empty list.");
            }

            String[] teacher_array = new String[10];

            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\teacher.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    teacher_array[index] = line;
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Teacher file not found. Starting with an empty list.");
            }


            String[] chal_array = new String[10];

            try (Scanner fileScanner = new Scanner(new File("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\challan.txt"))) {
                int index = 0;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    chal_array[index] = line;
                    index++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Challan file not found. Starting with an empty list.");
            }

            do {
                System.out.println("\n\t\tMenu");
                System.out.println("1. Add New Student");
                System.out.println("2. View All Students");
                System.out.println("3. Search Student");
                System.out.println("4. Edit Student Record");
                System.out.println("5. Delete Student Record");
                System.out.println("6. Exit\n");

                System.out.print("Enter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        int j;
                        for (j = 0; j < 10; j++) {
                            if (roll_array[j] == null) {
                                break;
                            }
                        }

                        input.nextLine();

                        System.out.print("\nEnter the Name of the Student: ");
                        String name = input.nextLine();
                        name_array[j] = name;

                        System.out.print("\nEnter the Roll Number of the Student: ");
                        String roll_number = input.nextLine();
                        roll_array[j] = roll_number;

                        System.out.print("\nEnter the Email of the Student: ");
                        String email = input.nextLine();
                        email_array[j] = email;

                        System.out.print("\nEnter the Fees of the Student: ");
                        String fees = input.nextLine();
                        fees_array[j] = fees;

                        System.out.print("\nEnter the Attendance of the Student: ");
                        String attendance = input.nextLine();
                        att_array[j] = attendance;

                        System.out.print("\nEnter the Marks of the Student: ");
                        int marks = input.nextInt();
                        marks_array[j] = marks;

                        input.nextLine();

                        System.out.print("\nEnter the Teacher's Name: ");
                        String teacher = input.nextLine();
                        teacher_array[j] = teacher;

                        System.out.print("\nEnter the Challan Number: ");
                        String challan = input.nextLine();
                        chal_array[j] = challan;

                        System.out.println("\nStudent Added Successfully!");

                        break;

                    case 2:
                        System.out.println("\n\t\tAll Students");
                        System.out.println("\nRoll No.\tName\t\tEmail");
                        for (int i = 0; i < 10; i++) {
                            if (roll_array[i] != null) {
                                System.out.println(roll_array[i] + "\t" + name_array[i] + "\t\t" + email_array[i]);
                            }
                        }
                        break;

                    case 3:
                        System.out.print("\nEnter the Roll Number of the Student: ");
                        String search_roll = input.next();

                        int found = 0;
                        for (int i = 0; i < 10; i++) {
                            if (roll_array[i] != null && roll_array[i].equals(search_roll)) {
                                System.out.println("\n\t\tStudent Details");
                                System.out.println("Roll Number: " + roll_array[i]);
                                System.out.println("Name: " + name_array[i]);
                                System.out.println("Email: " + email_array[i]);
                                System.out.println("Fees: " + fees_array[i]);
                                System.out.println("Attendance: " + att_array[i]);
                                System.out.println("Marks: " + marks_array[i]);
                                System.out.println("Teacher: " + teacher_array[i]);
                                System.out.println("Challan: " + chal_array[i]);
                                found = 1;
                                break;
                            }
                        }
                        if (found == 0) {
                            System.out.println("\nStudent Not Found!");
                        }
                        break;

                    case 4:
                        System.out.print("\nEnter the Roll Number of the Student: ");
                        String edit_roll = input.next();

                        int edit_found = 0;
                        for (int i = 0; i < 10; i++) {
                            if (roll_array[i] != null && roll_array[i].equals(edit_roll)) {
                                System.out.println("\n\t\tEdit Student Details");
                                System.out.println("Roll Number: " + roll_array[i]);
                                System.out.println("Name: " + name_array[i]);
                                System.out.println("Email: " + email_array[i]);
                                System.out.println("Fees: " + fees_array[i]);
                                System.out.println("Attendance: " + att_array[i]);
                                System.out.println("Marks: " + marks_array[i]);
                                System.out.println("Teacher: " + teacher_array[i]);
                                System.out.println("Challan: " + chal_array[i]);

                                input.nextLine();

                                System.out.print("\nEnter the Name of the Student: ");
                                String edit_name = input.nextLine();
                                name_array[i] = edit_name;

                                System.out.print("\nEnter the Email of the Student: ");
                                String edit_email = input.nextLine();
                                email_array[i] = edit_email;

                                System.out.print("\nEnter the Fees of the Student: ");
                                String edit_fees = input.nextLine();
                                fees_array[i] = edit_fees;

                                System.out.print("\nEnter the Attendance of the Student: ");
                                String edit_attendance = input.nextLine();
                                att_array[i] = edit_attendance;

                                System.out.print("\nEnter the Marks of the Student: ");
                                int edit_marks = input.nextInt();
                                marks_array[i] = edit_marks;

                                input.nextLine();

                                System.out.print("\nEnter the Teacher's Name: ");
                                String edit_teacher = input.nextLine();
                                teacher_array[i] = edit_teacher;

                                System.out.print("\nEnter the Challan Number: ");
                                String edit_challan = input.nextLine();
                                chal_array[i] = edit_challan;

                                System.out.println("\nStudent Record Updated Successfully!");
                                edit_found = 1;
                                break;
                            }
                        }
                        if (edit_found == 0) {
                            System.out.println("\nStudent Not Found!");
                        }
                        break;

                    case 5:
                        System.out.print("\nEnter the Roll Number of the Student: ");
                        String delete_roll = input.next();

                        int delete_found = 0;
                        for (int i = 0; i < 10; i++) {
                            if (roll_array[i] != null && roll_array[i].equals(delete_roll)) {
                                roll_array[i] = null;
                                name_array[i] = null;
                                email_array[i] = null;
                                fees_array[i] = null;
                                att_array[i] = null;
                                marks_array[i] = 0;
                                teacher_array[i] = null;
                                chal_array[i] = null;

                                System.out.println("\nStudent Record Deleted Successfully!");
                                delete_found = 1;
                                break;
                            }
                        }
                        if (delete_found == 0) {
                            System.out.println("\nStudent Not Found!");
                        }
                        break;

                    case 6:
                        log_out = 1;
                        break;

                    default:
                        System.out.println("\nInvalid Choice!");
                        break;
                }
            } while (log_out == 0);

            saveStudentToFile(roll_array, name_array, email_array, fees_array, att_array, marks_array, teacher_array, chal_array);
        }

        public static void saveStudentToFile(String[] roll_array, String[] name_array, String[] email_array, String[] fees_array, String[] att_array, int[] marks_array, String[] teacher_array, String[] chal_array) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\student.txt"))) {
                for (int i = 0; i < 10; i++) {
                    if (roll_array[i] != null) {
                        writer.println(roll_array[i]);
                        writer.println(name_array[i]);
                        writer.println(email_array[i]);
                        writer.println(fees_array[i]);
                        writer.println(att_array[i]);
                        writer.println(marks_array[i]);
                        writer.println(teacher_array[i]);
                        writer.println(chal_array[i]);
                    }
                }
            } catch (IOException e) {
                System.out.println("An error occurred while saving the student file.");
            }
        }

        public static void saveRollToFile(String[] roll_array) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\Abdullah University\\PF\\LAB\\Program\\FinalSemesterProject\\StudentFile\\rollNumber.txt"))) {
                for (int i = 0; i < 10; i++) {
                    writer.println(roll_array[i]);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while saving the roll number file.");
            }
        }
    }


