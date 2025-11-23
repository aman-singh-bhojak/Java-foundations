import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range of rows: ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
