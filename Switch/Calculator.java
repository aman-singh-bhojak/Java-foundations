import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = in.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println("Result: " + (a + b));
            case '-' -> System.out.println("Result: " + (a - b));
            case '*' -> System.out.println("Result: " + (a * b));
            case '/' -> {
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (a / b));
                }
            }
            default -> System.out.println("Invalid operator.");
        }
        in.close();
    }
}
