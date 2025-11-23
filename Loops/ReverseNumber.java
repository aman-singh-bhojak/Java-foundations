import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int rev = 0;
        while(n != 0) {
            rev = rev * 10 + (n%10);
            n /= 10;
        }
        System.out.println("Number after reversal is: " + rev);
        in.close();
    }
}
