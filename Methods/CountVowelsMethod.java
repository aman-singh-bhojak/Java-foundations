import java.util.Scanner;

public class CountVowelsMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = in.nextLine();

        System.out.println("Vowel count = " + countVowels(s));

        in.close();
    }
    static int countVowels(String s) {

        if (s == null) {
            return 0;
        }

        int count = 0;
        String lower = s.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
    }

}
