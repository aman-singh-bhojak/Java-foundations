import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = in.nextDouble();
        
        System.out.print("Enter rate of interest (% per annum): ");
        double rate = in.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = in.nextDouble();
        
        // Formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;
        
        System.out.println("\nThe results are-");
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        
        in.close();
    }
}