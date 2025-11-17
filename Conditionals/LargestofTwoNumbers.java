import java.util.Scanner;

public class LargestofTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        if (a>b) {
            System.out.println(a + " is larger than " + b);
        } else {
            System.out.println(b + " is larger than " + a);
        }
        in.close();
    }
}

