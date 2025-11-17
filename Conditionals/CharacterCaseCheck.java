import java.util.Scanner;

public class CharacterCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("'" + ch + "' is an UPPERCASE letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("'" + ch + "' is a lowercase letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("'" + ch + "' is a digit.");
        } else {
            System.out.println("'" + ch + "' is a special character.");
        }
        
        in.close();
    }
}