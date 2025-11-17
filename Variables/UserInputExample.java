import java.util.Scanner;

public class UserInputExample {
   public static void main(String[] var0) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = in.nextLine();
      System.out.print("Enter your age: ");
      int age = in.nextInt();
      System.out.print("Enter your height in (cm): ");
      float height = in.nextFloat();
      System.out.print("Are you a geuine person?(true/false): ");
      boolean check = in.nextBoolean();
      System.out.println("Your data: \nName" + name + "Age: " + age + "height: " + height);
      System.out.print("You are a genuine person: " + check);
      in.close();
    }
}
