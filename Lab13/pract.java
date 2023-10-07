package Lab12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class pract
{
    public static void main(String[] args) {
        try {
            File file =new File("name1.txt");
            PrintWriter output = new PrintWriter(file);
            output.println("My name is Abdullah");
            output.println("18");
            output.println("COMSATS University Islamabad");
            output.println("29/05/2023");
            output.close();
        }
        catch (IOException e) {
            System.out.println("File cannot be written");
        }
        try{
            File file = new File("name1.txt");
            Scanner input = new Scanner (file);
            while(input.hasNext()){
                String name1 = input.nextLine();
                String age = input.nextLine();
                String name2 = input.nextLine();
                String date = input.nextLine();

                System.out.println(name1);
                System.out.println(age);
                System.out.println(name2);
                System.out.println(date);


            }
            input.close();
        }
        catch (IOException e){
            System.out.println("File cannot be read");
        }

    }


}

