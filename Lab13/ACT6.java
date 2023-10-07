package Lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ACT6
{
    public static void main(String[] args) {
        try{
            File obj = new File("MyFile.txt");
            Scanner reader = new Scanner(obj);
            while(reader.hasNext()){
                int rno = reader.nextInt();
                System.out.println("R. No= " + rno);
                String name = reader.next();
                System.out.println("Name= " + name);
                int marks = reader.nextInt();
                System.out.println("Marks= " + marks);
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("An error has occurred.");
        }
    }
}
