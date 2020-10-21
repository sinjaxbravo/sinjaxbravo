
public class Fibonacci {
    public int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        } else {
            return this.fib(N - 1) + this.fib(N - 2);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
