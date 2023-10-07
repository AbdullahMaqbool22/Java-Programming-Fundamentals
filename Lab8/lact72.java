import java.util.Scanner;

public class lact72
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Enter array elements:");
        for (int i = 0; i< array.length; i++){
            array[i] = input.nextInt();
        }
        int [] answer = modify(array);
        for (int j : answer) {
            System.out.println(j);
        }
    }
    public static int [] modify(int [] array) {
        int [] multiply = new int[array.length];
        for (int i = 0; i < array.length; i++) {
           multiply [i] = array[i] * 3;
        }
        return multiply;
    }
}
