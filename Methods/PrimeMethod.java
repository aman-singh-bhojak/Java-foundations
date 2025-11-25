import java.util.Scanner;

public class PrimeMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check prime: ");
        int num = in.nextInt();

        boolean result = PrimeCheck(num);
        System.out.print(num + (PrimeCheck(num) ? " is Prime." : " is not Prime." ));

        in.close();

        
    }

    static boolean PrimeCheck (int n) {

        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        } 

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
        
    }
}
