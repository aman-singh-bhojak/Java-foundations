import java.util.Scanner;

public class StringPalindromeMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = in.nextLine();

        System.out.println("\"" + s + "\"" + (isPalindrome(s) ? " is a palindrome." : " is not a palindrome."));

        in.close();
    }
    
    static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();

        return clean.equals(rev);
    }

}
