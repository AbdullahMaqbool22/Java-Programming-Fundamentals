import java.util.Scanner;

public class lact101
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] array = new int[3][4];
        for (int i = 0; i<3; i++){
            System.out.println("Enter array elements of row # " + (i + 1));
            for (int j = 0; j<4; j++){
                array[i][j]= input.nextInt();
            }

            }
            System.out.println("The given 2D array is...");
            for (int i = 0; i<3; i++)
            {
                for (int j = 0; j<4; j++)
                    System.out.print(array[i][j] + "\t");
                System.out.println();
        }
            int sum1=0, sum2=0, sum3=0;
            for (int i = 0; i<3; i++){
                for (int j = 0; j<4; j++){
                    sum1 += array[i][j];
                    sum2 += array[i][j];
                    sum3 += array[i][j];
                }
                System.out.println(" Sum of row " +(i+1)+ " is " + sum1 );
                System.out.println(" Sum of row " +(i+1)+ " is " + sum2 );
                System.out.println(" Sum of row " +(i+1)+ " is " + sum3 );

            }


    }

    public static int maxRow(int number1, int number2, int number3) {
        int largest = 0;
        for (int i = 0; i<3; i++){
            if (number1>number2){
                largest++;
            }
            if (number2>number3){
                largest++;
            }
        }
return largest;
    }
}
