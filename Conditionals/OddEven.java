import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.print(n + " is an Even Number");
        } else {
            System.out.print(n + " is an Odd number.");
        }
        in.close();
    }
}
