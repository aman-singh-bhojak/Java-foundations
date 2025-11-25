import java.util.Scanner;

public class ArmstrongMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check armstrong: ");
        int num = in.nextInt();

        boolean result = Armstrong(num);
        System.out.print(num + (Armstrong(num) ? " is a Armstrong Number." : " is not a Armstrong Number."));

        in.close();
    }

    static boolean Armstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(Math.abs(n)).length();

        while (n != 0) {
            int d = Math.abs(n % 10);
            sum += Math.pow(d, digits);
            n /= 10;
        }

        return sum == original;
    }
}
