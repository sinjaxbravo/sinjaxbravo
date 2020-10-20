import java.util.Scanner;

public class RecursiveMultiply {

    public static int multiply(int n, int m) {
        if (m == 1) {
            return n;
        } else {
            return multiply(n, m - 1) + n;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers to multiply: ");
        //multiply(in.nextInt(), in.nextInt());
        System.out.println(multiply(in.nextInt(), in.nextInt()));

    }

}
