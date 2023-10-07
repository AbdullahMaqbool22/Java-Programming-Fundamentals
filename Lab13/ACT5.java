package Lab13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ACT5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rno;
        String name;
        int marks;
        try{
            File file = new File("MyFile.txt");
            PrintWriter writer = new PrintWriter(file);
            while(true){
                System.out.println("Enter Roll Number: ");
                rno = input.nextInt();
                if (rno==0)
                    break;
                System.out.println("Name ");
                name = input.next();
                System.out.println("Enter marks");
                marks = input.nextInt();
                writer.println(rno);
                writer.println(name);
                writer.println(marks);
            }
            System.out.println("Successfully written.");
            writer.close();
        }
        catch (IOException e){
            System.out.println("An error has occurred");
        }
    }
}
