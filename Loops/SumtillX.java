import java.util.Scanner;

public class SumtillX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter number(x to terminate): ");
            String c = in.next();
            if (c.equalsIgnoreCase("x")) { //to ignore the case of 'x'
                break;
            }
            sum += Integer.parseInt(c); //Conert String into integer
        }
        in.close();
    }
}
