
public class TribonacciLeet {

    public static int tribonacci(int n) {
        if (n == 1) {
            return 1;
        } else {
            if (n >= 3) {
                return tribonacci(n - 1) + tribonacci(n - 2)
                        + tribonacci(n - 3);
            } else if (n >= 2) {
                return tribonacci(n - 1) + tribonacci(n - 2);
            } else if (n > 0) {
                return tribonacci(n - 1);

            }
            return 0;

        }
    }

    public static void main(String[] args) {
        int i = tribonacci(25);
        System.out.println(i);

    }

}
