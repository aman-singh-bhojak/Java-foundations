import java.util.Scanner;

public class PalindromeMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to check palindrome: ");
        int n = in.nextInt();
        System.out.println(n + (Palindrome(n) ? " is a palindrome." : " is not a palindrome."));

        in.close();
    }
    
    static boolean Palindrome(int n) {
        int original = n;
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        
        return rev == original;
    }
}