import java.util.Scanner;

public class FactorialMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of: ");
        int num = in.nextInt();

        long fact = Factorial(num);

        if (fact < 0) {
            System.out.print("Invalid Input.");
        } else {
            System.out.print("The factorial of " + num + "! is: " + fact);
        }

        in.close();
    }

    static long Factorial(int n) {
        if (n < 0) {
            return -1;
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
