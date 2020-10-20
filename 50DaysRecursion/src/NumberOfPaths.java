
public class NumberOfPaths {

    public static int numberOfPaths(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        } else {
            return numberOfPaths(n - 1, m) + numberOfPaths(n, m - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfPaths(7, 5));

    }

}
