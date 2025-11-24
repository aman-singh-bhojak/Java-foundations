import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number (0-7): ");
        int day = in.nextInt();
    //     switch (day) {
    //         case 1:
    //         case 2:
    //         case 3:
    //         case 4:
    //         case 5:
    //             System.out.println("Weekday");
    //            break;
    //        case 6:
    //        case 7:
    //            System.out.println("Weekend");
    //            break;
    //    }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
        in.close();
    }
}
