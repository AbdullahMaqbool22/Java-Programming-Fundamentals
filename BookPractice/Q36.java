import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        int randomNum = -1, prevRandomNum;
        for (int i = 0; i < 3; i++) {
            prevRandomNum = randomNum;
            randomNum = (int) (Math.random() * 30) + 1;
            while (randomNum == prevRandomNum) {
                randomNum = (int) (Math.random() * 30) + 1;
            }
            System.out.println("Finalist number is : " + randomNum);
        }

    }
}


