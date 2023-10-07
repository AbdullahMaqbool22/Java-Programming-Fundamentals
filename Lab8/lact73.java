import java.util.Scanner;

public class lact73
{
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements");
        int i;
        for (i = 0; i<array.length; i++){
            array[i] = input.nextInt();
        }
        int [] rev = new int[10];
        int j= 0;
        for (i = array.length-1; i >= 0; i--){
            rev[j]= array[i];
            j++;
        }
        for (int k = 0; k<rev.length; k++){
            System.out.println(rev[k]);
        }
    }
}
