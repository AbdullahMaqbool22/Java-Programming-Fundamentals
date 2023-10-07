import java.util.Scanner;

public class act73 {
    public static void main(String[] args) {
        char [] characters = new char[10];
        int counter = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<10; i++){
            System.out.print("A[" + i + "] = ");
            characters[i] =input.next().charAt(0);
        }
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                if (characters[i] == characters[j]){
                    counter += 1;
                }
            }
            System.out.println(characters[i] + " occurs " + counter + " times");
            counter = 0;
        }
    }


}
