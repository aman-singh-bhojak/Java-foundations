import java.util.Scanner;

public class GreetingsMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.next();

        greeting(name);

        in.close();
    }

    static void greeting(String naam){
        System.out.print("Hi there, " + naam + ".");
    }
}