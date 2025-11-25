import java.util.Scanner;

public class MaxOfThree {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Max = " + max(a, b, c));

        in.close();
    }

    static int max(int a, int b, int c) {
        int result = a;

        if (b > result) {
            result = b;
        } 

        if (c > result) {
            result = c;
        }

        return result;
    }
}
