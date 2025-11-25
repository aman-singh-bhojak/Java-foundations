import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int result = sum(num1, num2);
        System.out.print("The sum of " + num1 + " and " + num2 + " is: " + result);

        in.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
