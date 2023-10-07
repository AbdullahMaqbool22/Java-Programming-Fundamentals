package Lab13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LACT2
{
    public static void main(String[] args) {
        int count = 0;
        int [] array = new int[10];
        Scanner input = new Scanner(System.in);
        try {
            File file = new File("number.txt");
            PrintWriter reader = new PrintWriter(file);
            while(input.hasNext()){
                array[count]=input.nextInt();
                count++;
                reader.println(array);
            }
            
            reader.close();
        }
        catch(IOException e)
        {
            System.out.println("error");
        }
    }
}
