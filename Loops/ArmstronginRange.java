public class ArmstronginRange {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            int sum = 0, n = num;
            int digits = 3;

            while (n != 0) {
                sum += Math.pow(n % 10, digits);
                n /= 10;
            }

            if (sum == num) System.out.println(num);
        }
    }
}
