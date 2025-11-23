import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        System.out.println("The total count of the given number is: " + count);
        in.close();
    }
}
