import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number(Only upto 50):");
        int n = in.nextInt();
        if (n <= 1) {
            System.out.println("Not prime");
        } else if (n % 2 == 0 && n != 2) {
            System.out.println("Not prime");
        } else if (n % 3 == 0 && n != 3) {
            System.out.println("Not prime");
        } else if (n % 5 == 0 && n != 5) {
            System.out.println("Not prime");
        } else if (n % 7 == 0 && n != 7) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");
        }
        in.close();
    }
}
