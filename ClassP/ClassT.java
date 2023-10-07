import java.util.Scanner;

public class ClassT {
    public static void main(String [] args){
        int pnum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        pnum = input.nextInt();
        boolean flag = true;
        for(int i = 0; i < pnum; i ++)
        {
            flag = false;
            break;
        }
        if(flag == true)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
