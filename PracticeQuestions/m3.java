import java.util.Scanner;
public class m3 {
    public static void main(String[] args) {
        int counts = 0, number, count=0, pos=0, neg=0;
        double avg;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number:");
            number = input.nextInt();
            if(number>0){
                pos += number;
                count++;
            }
            else if (number<0) {
                neg += number;
                counts++;
            }
             avg = ((double)neg+pos)/(count + counts);
        } while(number!=0);
        System.out.println("The positive integers are: " + count);
        System.out.println("The negative integers are: " + counts);
        System.out.println("The average of the inputs are: " + avg);
    }

}
