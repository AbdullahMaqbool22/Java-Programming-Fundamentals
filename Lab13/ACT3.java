package Lab13;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ACT3{
    public static void main(String[] args) {
        int rno = 101;
        String name = "Muzaffar";
        int marks = 88;
        try{
            File file = new File("MyFile.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.println(rno);
            writer.println(name);
            writer.println(marks);
            System.out.println("Successfully written");
            writer.close();
        }
        catch(IOException e){
            System.out.println("An error has occurred");
        }
    }
}
