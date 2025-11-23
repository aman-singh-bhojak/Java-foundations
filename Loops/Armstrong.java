import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int ognum = number;
        int arm = 0;
        // while (number != 0) {
        //     int rem = number%10;
        //     arm += (rem*rem*rem);
        //     number /= 10;
        // }
        // if (arm == ognum) {
        //     System.out.println("The given number " + ognum + " is a armstrong num.");
        // } else {
        //     System.out.println("Not armstrong.");
        // }

        //  Or another approach

        int digits = String.valueOf(number).length(); //It converts the number into text(String) then count how many character are there
        while (number != 0) {
            arm += Math.pow(number % 10, digits);
            number /= 10;
        }
        
        System.out.println(arm == ognum ? "Armstrong" : "Not Armstrong"); 
        in.close();
    }
}