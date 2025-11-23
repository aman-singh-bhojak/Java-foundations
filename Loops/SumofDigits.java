import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        System.out.println("The sum of the digits of the number are: " + sum);
        in.close();
    }
}