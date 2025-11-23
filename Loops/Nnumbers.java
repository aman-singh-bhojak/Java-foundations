import java.util.Scanner;

public class Nnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range of numbers to be printed: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        in.close();
    }
}
