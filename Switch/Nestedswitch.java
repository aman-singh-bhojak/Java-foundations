import java.util.Scanner;
public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter department (IT / CS / ECE): ");
        String dept = in.next().trim().toUpperCase();

        System.out.print("Enter year (1-4): ");
        int year = in.nextInt();

        switch (dept) {
            case "IT" -> {
                switch (year) {
                    case 1 -> System.out.println("Subjects: Math, Physics, Programming Basics");
                    case 2 -> System.out.println("Subjects: DBMS, OOP, OS");
                    case 3 -> System.out.println("Subjects: Networks, Web Tech, Java");
                    case 4 -> System.out.println("Subjects: ML, Cloud Computing");
                    default -> System.out.println("Invalid year.");
                }
            }
            case "CS" -> {
                switch (year) {
                    case 1 -> System.out.println("Subjects: Math, Physics, C Programming");
                    case 2 -> System.out.println("Subjects: DSA, COA, Algorithms");
                    case 3 -> System.out.println("Subjects: OS, DBMS, Theory of Computation");
                    case 4 -> System.out.println("Subjects: AI, Big Data, Security");
                    default -> System.out.println("Invalid year.");
                }
            }
            case "ECE" -> {
                switch (year) {
                    case 1 -> System.out.println("Subjects: Math, Chemistry, Electronics Basics");
                    case 2 -> System.out.println("Subjects: Signals, Devices, Circuits");
                    case 3 -> System.out.println("Subjects: Communication, Microprocessors");
                    case 4 -> System.out.println("Subjects: VLSI, Wireless Networks");
                    default -> System.out.println("Invalid year.");
                }
            }
            default -> System.out.println("Invalid department.");
        }
        in.close();
    }
}

