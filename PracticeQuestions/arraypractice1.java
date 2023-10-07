import java.util.Scanner;

public class arraypractice1 {
    public static void main(String[] args) {
        int temp;
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 number between 10 and 100: ");
        for (int i = 0; i < array.length; i++) {
            temp = input.nextInt();
            for (int j = 0; j<i; j++){
                if (array[j] == temp){
                    flag = true;
                    break;
                }
            }
            if (flag){
                flag = false;
                i--;
            }
            else
                array[i] = temp;
        }
       for (int j = 0; j< array.length; j++){
           System.out.println(array[j]);
       }


    }
}
