import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        demo(1,2,3,4,5,6,7,8,9,10);
        fun(2,3,4,8,32,123,112,9);
    }

    static void fun (int a, int b, int ...v) {
        System.out.println("a: " + a + "\nb: " + b + "v: " + Arrays.toString(v));
    }

    static void demo (int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
