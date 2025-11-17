import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        System.out.print("First number: ");
        int num1 = in.nextInt();
        System.out.print("Second number: ");
        int num2 = in.nextInt();
        System.out.print("Third number: ");
        int num3 = in.nextInt();
        
        int max;
        
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        
        System.out.println("The maximum number is: " + max);
        in.close();
    }
}