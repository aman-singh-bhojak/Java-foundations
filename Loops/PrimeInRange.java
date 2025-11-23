import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter to range in which you want to get prime numbers: ");
        int range = in.nextInt();
        System.out.println("The prime numbers between 1 and " + range + " are: ");
        for (int i = 2; i <= range; i++) {
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}