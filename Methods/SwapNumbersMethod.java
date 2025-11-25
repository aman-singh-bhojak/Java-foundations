public class SwapNumbersMethod {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping:\na: " + a + "\nb: " + b);

        swapPrimitive(a, b);

        System.out.println("After swapping (Remains Unchanged):\na: " + a + "\nb: " + b);
    }

    static void swapPrimitive(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
