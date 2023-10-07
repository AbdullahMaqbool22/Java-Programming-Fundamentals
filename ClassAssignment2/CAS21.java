import java.util.Scanner;
public class CAS21
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN separated with spaces (DDD DD DDDD):");
        String u_ssn1 = input.next();
        String u_ssn2 = input.next();
        String u_ssn3 = input.next();
        String u_ssnT = u_ssn1+"-"+u_ssn2+"-"+u_ssn3;
        boolean result = judge(u_ssn1, u_ssn2, u_ssn3);
        if (result)
            System.out.println(u_ssnT+ " is a valid social security number!");
        else
            System.out.println(u_ssnT+ " is an invalid social security number!");
    }
    public static boolean judge(String u_ssn1, String u_ssn2, String u_ssn3) {
        int u_ssnL1 = u_ssn1.length();
        int u_ssnL2 = u_ssn2.length();
        int u_ssnL3 = u_ssn3.length();
        return u_ssnL1 == 3 && u_ssnL2 == 2 && u_ssnL3 == 4;
    }
}



