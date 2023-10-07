import java.util.Scanner;

public class practice1
{
    public static void main(String[] args) {
        //        int[] marks = {97, 98, 95};
//        for (int i = 0; i<3; i++){
//            System.out.println(marks[i]);
//        }
       Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] numbers = new int[size];
//        for (int i = 0; i<size;i++){
//            numbers[i] = input.nextInt();
//        }
//        int x = input.nextInt();
//        for (int i = 0; i<numbers.length; i++){
//            if (numbers[i] == x){
//                System.out.println("x found at index: " i);
//            }
//            System.out.println(numbers[i]);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int [] [] numbers = new int[rows][cols];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                numbers[i][j]=input.nextInt();
            }
        }
        int x = input.nextInt();
        for (int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if (numbers[i][j]==x){
                    System.out.println("x found at location (" +i+" , " +j+")");
                }
            }
        }


//        for (int i = 0; i<rows; i++){
//            for (int j = 0 ; j < cols; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

}
