package Lab13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LACT1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no;
        int i = 0;
        try {

            File file = new File("number.txt");
            PrintWriter writer = new PrintWriter(file);
            while (i<=10) {
                System.out.println("Enter 10 numbers:");
                no = input.nextInt();
                i++;
                writer.println("You entered number: " + no);
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println("Wrong");
        }
    }
}
