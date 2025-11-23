import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check whether palindrome or not: ");
        int num = in.nextInt();
        int rev = 0;
        int original = num;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        if (rev == original) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println("It is not a palindrome number.");
        }
        in.close();
    }
}