import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime"); //Ternary Operator
        in.close();
    }
}
