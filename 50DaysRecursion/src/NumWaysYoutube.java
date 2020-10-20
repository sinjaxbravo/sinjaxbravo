import java.util.Scanner;

public class NumWaysYoutube {

    public static int numWays(int n) {
        if (n < 2) {
            return 1;
        } else {
            return numWays(n - 1) + numWays(n - 2);

        }

    }

    public static int numWaysVariation(int n) {
        if (n < 5) {
            if (n > 2) {
                return (n > 2) ? numWays(n - 1)
                        : numWays(n - 1) + numWays(n - 3);
            } else {
                return 1;
            }
        } else {
            return numWays(n - 1) + numWays(n - 3) + numWays(n - 5);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of steps: ");

        int i = numWays(in.nextInt());

        System.out.println(i);

    }

}
