
public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);

        }
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));

    }

}
