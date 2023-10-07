import java.util.Scanner;
public class CAS27
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your new Password: ");
        String u_pass = input.next();
        boolean result1 = checkLength(u_pass);
        if(result1)
            System.out.println("Length is correct");
        else
            System.out.println("Wrong length your password must be of 8 characters");
        boolean result2 = checkDi(u_pass);
        if (result2)
            System.out.println("Good to go by digits");
        else
            System.out.println("No only digits and letters are allowed");
        boolean result3 = checkCh(u_pass);
        if (result3)
            System.out.println("Good to go by letters");
        else
            System.out.println("No only digits and letters are allowed");
        boolean result4 = checkDT(u_pass);
        if (result4)
            System.out.println("Good to Go");
        else
            System.out.println("Must have 2 or more than 2 digits");

    }
    public static boolean checkLength(String u_pass) {
        int u_passL=u_pass.length();
        return u_passL == 8;
    }
    public static boolean checkDi(String u_pass) {
        for (int i = 0; i < u_pass.length(); i++) {
            if (!Character.isDigit(u_pass.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkCh(String u_pass){
        for (int j = 0; j<u_pass.length(); j++){
            if(!Character.isLetter(u_pass.charAt(j))){
                return true;
            }
        }
        return false;
    }
    public static boolean checkDT(String u_pass){
        return Character.isDigit(u_pass.charAt(1));
    }

}
